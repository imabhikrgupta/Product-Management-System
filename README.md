# 🛒 Product Management System

A **Java Spring Boot application** for managing products with full CRUD functionality (Add, View, Update, Delete).  
This project demonstrates **clean architecture (MVC + DAO)**, **database connectivity (Oracle DB + HikariCP)**, and **console-driven interaction**.  
Future versions will include **web UI, authentication, and role-based security**.

---

## 🚀 Technologies & Frameworks
- **Java 21** (Core language)
- **Spring Boot 4.0.6** (Framework for application setup & dependency injection)
- **Spring MVC** (Controller-Service-Repository layered architecture)
- **Spring Scheduling** (for background tasks)
- **Oracle Database XE** (Data persistence)
- **JDBC + HikariCP** (Efficient database connection pooling)
- **Maven** (Build & dependency management)

---

## 🛠 Tools Used
- **Eclipse IDE** (Development environment)
- **Git & GitHub** (Version control & portfolio hosting)
- **Oracle SQL Developer** (Database management)
- **Command Line / Console** (User interaction)

---

## 📋 Features / Tasks Implemented
1. **Add Product** → Insert product details into Oracle DB.  
2. **View Products** → Display all products with ID, Name, Price, and Info.  
3. **Update Product** → Modify existing product details.  
4. **Delete Product** → Remove product by ID.  
5. **Exit** → Gracefully terminate the application.  

---

## 🏆 Achievements
- Built a **fully functional CRUD system** with Oracle DB integration.  
- Implemented **clean separation of concerns** (Controller, Service, DAO, Model).  
- Successfully deployed project to **GitHub** for portfolio showcase.  
- Demonstrated **real-world database connectivity** using HikariCP.  

---

## 🔒 Future Goals
- Add **Web UI** (Thymeleaf/JSP) for product management.  
- Implement **Authentication & Authorization** (Admin/Owner login).  
- Create **Dashboard** for role-based operations.  
- Add **Search, Pagination, and Sorting** features.  
- Deploy project on **Heroku/Render** for live demo.  
- Write **JUnit tests** for service and repository layers.  

---

src/main/java/com/sb
├── ProductManagementSystemApplication.java   # Main entry point
├── controller/ProductController.java         # Handles user requests
├── service/ProductService.java               # Business logic
├── repository/ProductDAO.java                # Database operations
└── model/Product.java                        # Product entity

src/main/resources
└── application.properties                    # DB configuration

---

## 📖 How to Run
1. Clone the repository:
   ```bash
   git clone https://github.com/imabhikrgupta/Product-Management-System.git
spring.datasource.url=jdbc:oracle:thin:@localhost:1521:xe
spring.datasource.username=YOUR_USERNAME
spring.datasource.password=YOUR_PASSWORD

mvn spring-boot:run

👨‍💻 Author
Abhishek Gupta

Fresher IT aspirant | Java Developer

Actively seeking software engineering roles (Backend, Frontend, Full Stack, System Design)

Location: Hyderabad / Ameerpet


---
 📂 Project Structure
