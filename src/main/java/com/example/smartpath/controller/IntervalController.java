package com.example.smartpath.controller;

import com.example.smartpath.model.Interval;
import com.example.smartpath.model.TimeRequest;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/api")
public class IntervalController {

    @Value("${interval.length}")
    private int intervalLength;

    @Value("${interval.number}")
    private int intervalNumber;

    private final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

    @PostMapping("/getIntervals")
    public List<Interval> getIntervals(@RequestBody TimeRequest timeRequest) throws ParseException {
        String timeStr = timeRequest.getTime();
        Date receivedTime = dateFormat.parse(timeStr);

        return calculateIntervals(receivedTime, intervalLength, intervalNumber);
    }

    private List<Interval> calculateIntervals(Date startTime, int intervalLength, int numIntervals) {
        List<Interval> intervals = new ArrayList<>();

        for (int i = 0; i < numIntervals; i++) {
            Date start = new Date(startTime.getTime() + i * (intervalLength * 60000L));
            Date end = new Date(start.getTime() + intervalLength * 60000L);
            intervals.add(new Interval(dateFormat.format(start), dateFormat.format(end)));
        }

        return intervals;
    }
}
