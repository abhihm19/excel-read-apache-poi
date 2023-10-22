# Spring Boot Excel Reader Using Apache POI

## Description

This Spring Boot project demonstrates how to read employee details from an Excel spreadsheet using the Apache POI library in Java. The Apache POI library provides a set of Java APIs for manipulating Microsoft Office files, including Excel spreadsheets.

In this project, we provide a Spring Boot application that reads an Excel file containing employee details and returns the data in a structured format. You can use this project as a reference for reading Excel files in your own Spring Boot applications.

## Prerequisites

Before using this project, make sure you have the following prerequisites:

- Java Development Kit (JDK)
- Maven
- Excel file containing employee details

## Usage

1. Clone this repository to your local machine:
    ```
   git clone https://github.com/abhihm19/excel-read-apache-poi.git
    ```
3. Navigate to the project directory:
   cd excel-read-apache-poi
4. Build and run the Spring Boot application using the following command:
   ./mvnw spring-boot:run
5. API Endpoint:
   GET localhost:8080/read
In the above endpoint submit the excel file by the name "file". The format of the excel file is described below. Once the API endpoint is hit, you will recieve list of employees data.

## Excel File Format
Make sure that your Excel file follows a specific format with the following columns:

Employee ID (int)
Name (String)
Email (String)
Date of Joining (Date)
PunchTime (DateTime)



