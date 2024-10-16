
# Employees CRUD REST API

This project is a Spring Boot application that provides a RESTful API for managing employee records. It allows users to create, retrieve, update, and delete employee details through HTTP requests.

## Features

- **Create Employee**: Add a new employee record.
- **Retrieve Employees**: Fetch details of all employees or a specific employee by ID.
- **Update Employee**: Modify details of an existing employee.
- **Delete Employee**: Remove an employee from the database.

## Technologies Used

- Java
- Spring Boot
- Spring Data JPA
- Hibernate
- MySQL (or any other RDBMS)
- Maven

## Prerequisites

- Java 11 or higher
- Maven 3.6+
- MySQL or other preferred database

## Getting Started

### 1. Clone the Repository

```bash
git clone https://github.com/YOUR_USERNAME/employee-crud-api.git
cd employee-crud-api
```

### 2. Configure the Database

Update the `application.properties` file in `src/main/resources` with your database connection details.

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/your-database-name
spring.datasource.username=your-username
spring.datasource.password=your-password

spring.jpa.hibernate.ddl-auto=update
```

### 3. Build and Run the Application

```bash
mvn clean install
mvn spring-boot:run
```

The application will start on `http://localhost:8080`.

## API Endpoints

### Create a New Employee

- **URL**: `/api/employees`
- **Method**: `POST`
- **Request Body**:
  ```json
  {
    "firstName": "John",
    "lastName": "Doe",
    "email": "john.doe@example.com",
    "department": "IT"
  }
  ```
- **Response**:
  - **201 Created**: Employee created successfully.

### Retrieve All Employees

- **URL**: `/api/employees`
- **Method**: `GET`
- **Response**:
  - **200 OK**: Returns a list of all employees.

### Retrieve Employee by ID

- **URL**: `/api/employees/{id}`
- **Method**: `GET`
- **Response**:
  - **200 OK**: Returns the employee details.
  - **404 Not Found**: Employee not found.

### Update an Employee

- **URL**: `/api/employees/{id}`
- **Method**: `PUT`
- **Request Body**:
  ```json
  {
    "firstName": "Jane",
    "lastName": "Doe",
    "email": "jane.doe@example.com",
    "department": "HR"
  }
  ```
- **Response**:
  - **200 OK**: Employee updated successfully.
  - **404 Not Found**: Employee not found.

### Delete an Employee

- **URL**: `/api/employees/{id}`
- **Method**: `DELETE`
- **Response**:
  - **200 OK**: Employee deleted successfully.
  - **404 Not Found**: Employee not found.

## Database Schema

The `Employee` entity contains the following fields:

| Field      | Type    | Description                     |
|------------|---------|---------------------------------|
| id         | Long    | Unique identifier for the employee |
| firstName  | String  | First name of the employee      |
| lastName   | String  | Last name of the employee       |
| email      | String  | Email address of the employee   |
| department | String  | Department of the employee      |

## License

This project is open-source and available under the [MIT License](LICENSE).

## Contact

For any questions or feedback, please contact:

- **Name**: Yash Shirsath
- **Email**: yshirsath467@gmail.com
- **LinkedIn**: [Yash Shirsath](https://www.linkedin.com/in/yash-shirsath-933056288/)
