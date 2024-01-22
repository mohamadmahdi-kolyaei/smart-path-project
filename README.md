# Simple Authentication Service Java Test

Welcome to the Simple Authentication Service Java Test project! This project is designed to assess your technical skills in Java programming using Spring Boot, MySQL database, Git, and Docker.

## Table of Contents
1. [Introduction](#introduction)
2. [Technologies](#technologies)
3. [Scope](#scope)
   - [Phase One](#phase-one)
   - [Phase Two](#phase-two)
4. [Dimensioning](#dimensioning)
5. [Rules](#rules)
6. [Usage](#usage)
   - [Building and Running](#building-and-running)
   - [API Documentation](#api-documentation)
   - [Testing](#testing)
7. [Contributing](#contributing)
8. [License](#license)

## Introduction
Dear candidate, congratulations on qualifying for the next level of our assessment. This project evaluates your skills in Java, Spring Boot, MySQL, Git, and Docker. Please read the instructions carefully and follow all the requirements outlined in this document.

## Technologies
- Java
- Spring Boot
- MySQL database
- Git
- Docker

## Scope

### Phase One
- Register
- Authenticate (Login)
- Simple API: Receive an integer and respond with the corresponding Fibonacci sentence. Cache the data for 10 minutes. This API is accessible only for authenticated users.
- Enable or disable the cache service with another API (feature toggle)
- Logout

### Phase Two
- Register
- Authenticate (Login)
- Simple API: Receive time and respond with the next N intervals. Consider the upper bound of intervals calculable with Cron. Length of intervals is L; L and N should be read from a configuration file. Responding intervals would be in string format and should contain exact start time and end time.
- Logout

Please implement this in one project with the Spring Boot framework.

## Dimensioning
Let the service operators (e.g., devops staff) know what resources should be used for running the project, available for responding to 1000 TPS for the simple API in two different modes:
- Enabled cache
- Disabled cache

## Rules
1. Services should be Restful.
2. Resource naming and verbs can be customized.
3. Provide Docker file and compose for running the project.

## Usage

### Building and Running
- Clone this repository.
- Use the provided Docker file and Docker Compose for easy setup.

### API Documentation
Please refer to the API documentation included in the project for details on how to invoke the APIs.

### Testing
Make sure to run unit tests to ensure the correctness of your implementation.

## Contributing
We welcome contributions! Feel free to open issues or submit pull requests.

## License
This project is licensed under the [Your License Name] - see the [LICENSE.md](LICENSE.md) file for details.
