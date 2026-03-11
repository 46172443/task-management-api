# Task Management REST API

## Project Description

The Task Management REST API is a backend application built using Spring Boot that allows users to manage tasks efficiently.
It provides RESTful endpoints to create, read, update, and delete tasks.

This project demonstrates core backend development concepts such as REST APIs, Spring Boot architecture, database integration, and CRUD operations.

---

## Technologies Used

* Java
* Spring Boot
* Spring Data JPA
* MySQL
* Maven
* REST APIs

---

## Features

* Create a new task
* View all tasks
* View a specific task by ID
* Update task details
* Delete a task

---

## API Endpoints

| Method | Endpoint    | Description             |
| ------ | ----------- | ----------------------- |
| GET    | /tasks      | Retrieve all tasks      |
| GET    | /tasks/{id} | Retrieve task by ID     |
| POST   | /tasks      | Create a new task       |
| PUT    | /tasks/{id} | Update an existing task |
| DELETE | /tasks/{id} | Delete a task           |

---

## Example Request

POST /tasks

{
"title": "Learn Spring Boot",
"description": "Practice REST API development",
"status": "Pending"
}

---

## Example Response

{
"id": 1,
"title": "Learn Spring Boot",
"description": "Practice REST API development",
"status": "Pending"
}

---

## How to Run the Project

1. Clone the repository

git clone https://github.com/46172443/task-management-api.git

2. Open the project in an IDE such as IntelliJ IDEA or Eclipse.

3. Configure your database in `application.properties`.

4. Run the Spring Boot application.

5. Use **Postman** to test the REST API endpoints.

---

## Tools Used

* Postman for API testing
* Maven for dependency management

---

## Author

Vyshnavi Sankati
Java Backend Developer
