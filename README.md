# Spring Boot Employee Management System (EMS)

A complete Employee Management System (EMS) built using Spring Boot, Spring Data JPA, Hibernate, and MySQL. This project demonstrates REST API development following industry-standard layered architecture using Controller, Service, Repository, DTO, Mapper, and Exception Handling layers.

---

## Features

* Create Employee
* Get Employee By ID
* Get All Employees
* Update Employee
* Delete Employee
* DTO Pattern Implementation
* Mapper Pattern Implementation
* Custom Exception Handling
* RESTful API Design
* MySQL Database Integration
* Spring Data JPA & Hibernate

---

## Tech Stack

### Backend

* Java 17+
* Spring Boot
* Spring Data JPA
* Hibernate
* Lombok

### Database

* MySQL

### Build Tool

* Maven

### API Testing

* Postman

---

## Project Structure

```text
src/main/java
│
├── controller
│   └── EmployeeController
│
├── dto
│   └── EmployeeDto
│
├── entity
│   └── Employee
│
├── exception
│   └── ResourceNotFoundException
│
├── mapper
│   └── EmployeeMapper
│
├── repository
│   └── EmployeeRepository
│
├── service
│   └── EmployeeService
│
├── service/impl
│   └── EmployeeServiceImpl
│
└── EmsApplication
```

---

## Architecture

```text
Client
   |
   v
Controller
   |
   v
Service
   |
   v
Mapper
   |
   v
Repository
   |
   v
MySQL Database
```

---

## Database Configuration

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/ems
spring.datasource.username=root
spring.datasource.password=admin

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

---

# API Endpoints

## Create Employee

### Request

```http
POST /api/employees
```

### Request Body

```json
{
  "firstName": "Raj",
  "lastName": "Sah",
  "email": "raj@gmail.com"
}
```

### Response

```json
{
  "id": 1,
  "firstName": "Raj",
  "lastName": "Sah",
  "email": "raj@gmail.com"
}
```

---

## Get Employee By ID

### Request

```http
GET /api/employees/{id}
```

### Example

```http
GET /api/employees/1
```

---

## Get All Employees

### Request

```http
GET /api/employees
```

---

## Update Employee

### Request

```http
PUT /api/employees/{id}
```

### Request Body

```json
{
  "firstName": "Raj Kumar",
  "lastName": "Sah",
  "email": "raj@gmail.com"
}
```

---

## Delete Employee

### Request

```http
DELETE /api/employees/{id}
```

---

# DTO Workflow

```text
Client JSON
     |
     v
EmployeeDto
     |
     v
EmployeeMapper
     |
     v
Employee Entity
     |
     v
Repository
     |
     v
Database
```

---

# Exception Handling

The project uses a custom exception:

```java
ResourceNotFoundException
```

Whenever an employee is not found, the application returns:

```http
404 NOT FOUND
```

Example:

```json
{
  "message": "Employee not found with id: 10"
}
```

---

# Key Concepts Implemented

* Spring Boot
* REST APIs
* Layered Architecture
* DTO Pattern
* Mapper Pattern
* Dependency Injection
* Exception Handling
* Hibernate ORM
* Spring Data JPA
* MySQL Integration
* Stream API

---

# Future Improvements

* Bean Validation
* Global Exception Handling
* Pagination & Sorting
* Spring Security
* JWT Authentication
* Swagger/OpenAPI
* Docker Support
* Deployment

---

# Learning Outcomes

This project helped in understanding:

* Spring Boot Fundamentals
* CRUD Operations
* JPA & Hibernate
* DTO Mapping
* Service Layer Architecture
* Repository Pattern
* Exception Handling
* REST API Development

---

## Author

Raj Kumar Sah

B.Tech CSE | Java Backend Developer

GitHub: Raajj-Kumar-Sah

