# E-commerce API (Spring Boot + JWT Authentication)

This project is an **E-commerce REST API** built with **Spring Boot**.  
It includes **user registration, login, and JWT-based authentication** flow.  

---

## Features
- **Register** endpoint for user signup
- **Login** endpoint with JWT token generation
- Password hashing with **BCryptPasswordEncoder**
- **JWT (JSON Web Token)** for authentication
- Spring Security configuration for securing endpoints

---

## Project Structure
```
src/main/java/com/ecommerce/ecommerce/
├─ controller/ # AuthController (register & login)
├─ dto/ # RegisterRequest, LoginRequest DTOs
├─ model/ # User, Role entities
├─ repository/ # UserRepository, RoleRepository
├─ security/ # JwtProvider
└─ EcommerceApplication.java # Main application entry point

```

---

## Authentication Flow
```
1. **Register** → `/api/auth/register`  
   - Creates a new user with username, email, and password.  

2. **Login** → `/api/auth/login`  
   - Verifies credentials and returns a **JWT token**.  

3. **Using JWT**  
   - Send the token in the `Authorization` header to access secured endpoints:
     ```
     Authorization: Bearer <JWT_TOKEN>
     ```



