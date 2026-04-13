# FAT_146289 - Attendance Management Application

## Overview
This project demonstrates Continuous Integration (CI/CD) for an Attendance Management Application using Jenkins and GitHub.

## Features
- Display student attendance details
- Calculate attendance percentage
- Show attendance status based on percentage
- Display current date
- Integration with Jenkins for automated builds

## Student Details
- **Student Name:** John Doe
- **Register Number:** 146289
- **Course:** Java Programming
- **Department:** Computer Science

## Build Instructions

### Prerequisites
- Java 8 or higher
- Jenkins server
- Git

### Compile
```bash
javac AttendanceManagement.java
```

### Run
```bash
java AttendanceManagement
```

## Expected Output
```
===================================
ATTENDANCE MANAGEMENT SYSTEM
===================================
Student Name: John Doe
Register Number: 146289
Course Name: Java Programming
Department: Computer Science
Classes Conducted: 50
Classes Attended: 40
Attendance Percentage: 80.00%
Attendance Status: Present
Date: 2026-04-13
===================================
Message: Attendance Build Successful
===================================
```

## CI/CD Pipeline
This repository is connected to Jenkins for continuous integration. Every push triggers an automatic build and test.

## Author
Hem729

## Date
2026-04-13
