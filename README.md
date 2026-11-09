```markdown
# Task 01 — First REST Controller

## Description
This repository contains a Spring Boot RESTful web service developed for **Task 01** of the Spring Boot Development Internship at UpStartInterns[cite: 1, 2]. 

The application exposes custom REST API endpoints that handle incoming HTTP requests and return Data Transfer Objects (DTOs) serialized into JSON format[cite: 2].

## Key Features & Task Requirements
- **`@RestController`:** Exposes mapped API routes returning JSON responses instead of HTML views[cite: 2].
- **DTO Layer:** Uses a custom `MessageDto` class to encapsulate response payloads, ensuring entity separation[cite: 2].
- **Single Command Run:** Easily executed from the root terminal using the included Maven Wrapper (`mvnw`)[cite: 2].

---

## API Documentation

### Available Endpoints

| HTTP Method | Endpoint | Query Parameters | Description |
| :--- | :--- | :--- | :--- |
| `GET` | `/health` | None | Checks the API service status and returns a status DTO. |
| `GET` | `/greet` | `name` *(optional)* | Accepts a name parameter and returns a personalized welcome DTO. |

---

### Sample Responses

#### 1. Service Health Check (`GET /health`)
```json
{
  "message": "This REST API is working perfectly",
  "status": "Good"
}

```

#### 2. User Greeting (`GET /greet?name=Aakash`)

```json
{
  "message": "Hello Aakash! Welcome to Spring Boots",
  "status": "Successfull"
}

```

---

## Tech Stack

* **Language:** Java 21 / 17
* **Framework:** Spring Boot 3.x
* **Build Tool:** Maven

---

## How to Run

Ensure Java JDK 17 or higher is installed and configured on your machine.

1. Clone or download this repository:
```bash
git clone [https://github.com/AakashP-Dev/springboot-task01.git](https://github.com/AakashP-Dev/springboot-task01.git)

```


2. Navigate into the project folder:
```bash
cd springboot-task01
```


3. Run the application using the Maven Wrapper single command:
* **Windows (Command Prompt / PowerShell):**
```cmd
.\mvnw.cmd spring-boot:run
```

* **Linux / macOS / Git Bash:**
```bash
./mvnw spring-boot:run
```


4. Access the API endpoints in Postman or your web browser at:
* `http://localhost:8080/health`
* `http://localhost:8080/greet?name=Aakash`
