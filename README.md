# 🛒 Product Service API – Spring Boot REST Application

A simple and extensible Spring Boot application demonstrating CRUD operations on products using REST APIs. The current implementation fetches product data from [FakeStoreAPI](https://fakestoreapi.com), with a design ready to integrate with databases or cloud-based backends.

---

## 🚀 Features

- RESTful CRUD API endpoints
- Layered architecture: Controller → Service → Model
- Interface-based service layer (swappable backends: Fake API / DB)
- DTOs for clean data transfer
- External API integration using `RestTemplate`
- Spring `@Configuration` for dependency management
- Ready for integration with real-time databases

---

## 🧰 Tech Stack

- **Java 17**
- **Spring Boot**
  - Spring Web
  - Spring Core
- **Maven** for dependency management
- **FakeStoreAPI** (temporary product data source)

---

## 🏗️ Project Structure

```text
src/
├── controller/       → API Endpoints
├── service/          → Business logic (interface + implementation)
├── model/            → Product data structures
├── dto/              → Data Transfer Objects
├── config/           → Configuration classes (e.g., RestTemplate Bean)
└── application.yml   → Application configuration
```

---

## 📦 How to Run

1. **Clone the Repository**
   ```bash
   git clone https://github.com/your-username/product-service-api.git
   cd product-service-api
   ```

2. **Run the App**
   ```bash
   ./mvnw spring-boot:run
   ```

3. **Test Endpoints**  
   Visit: `http://localhost:8080/products`  
   Use Postman or any REST client to test the API.

---

## 📌 Sample Endpoints

| Method | Endpoint                | Description          |
|--------|-------------------------|----------------------|
| GET    | `/products`             | List all products    |
| GET    | `/products/{id}`        | Get product by ID    |
| POST   | `/products`             | Add a new product    |
| PUT    | `/products/{id}`        | Update a product     |
| DELETE | `/products/{id}`        | Delete a product     |

---

## 🛠️ Future Enhancements

- ✅ Replace FakeStoreAPI with a real database (MySQL/PostgreSQL)
- ✅ Containerize the app using Docker
- ✅ **Deploy on AWS EC2** with auto-restart and monitoring enabled

---

## ☁️ Planned Deployment Architecture

```text
[ Client ] ---> [ Spring Boot REST API on AWS EC2 ]
                     |
                     v
         [ Database / External API Integration ]
```
