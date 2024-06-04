# Grocery Delivery Application

This repository contains the source code for a comprehensive grocery delivery application, designed to provide customers with a seamless shopping experience for their daily needs. The application features separate roles for customers and stores, allowing for a robust user management system, extensive product management capabilities, efficient order management processes, and more. Built using Spring Boot, JPA, and other modern technologies, this project aims to deliver a scalable and maintainable solution for online grocery shopping.

## Features

### User Management
- **Customer & Store Roles**: Separate functionalities for customers and stores. Customers can browse products, manage their carts, place orders, and track deliveries. Stores can manage their product catalogs, update inventory, and handle orders.
- **Registration & Login**: Secure registration and login for both customers and stores.
- **Customer Profiles**: Store delivery addresses, preferred payment methods, and order history for easy access and management.
- **Store Profiles**: Include location details, opening hours, delivery areas, and minimum order amount.

### Product Management
- **Product Catalog**: A comprehensive catalog with detailed descriptions, images, categories, and pricing information.
- **Inventory Management**: Real-time tracking of product inventory to prevent overselling and ensure accurate order fulfillment.
- **Promotions & Discounts**: Features for applying promotions, discounts, and coupons to attract customers and boost sales.

### Order Management
- **Shopping Cart**: Allows customers to add products to their carts, modify quantities, and proceed to checkout.
- **Order Placement & Confirmation**: A seamless checkout process with secure payment options and order confirmation including estimated delivery time.
- **Order Tracking**: Real-time order tracking to provide customers with the status and estimated delivery date of their orders.

## Modules

### Data Model Completion
- Definition of JPA entities with appropriate attributes and relationships (one-to-many, many-to-many).
- Proper database mapping using JPA annotations (@Entity, @Id, @ManyToOne, etc.).

### REST API Design
- Clear and well-documented API endpoints for CRUD operations.
- Use of appropriate HTTP methods (POST, GET, PUT, DELETE) and JSON format for communication.

### Functionality Implementation
- Separation of concerns using Controllers, Services, and DAO/Repository layers.
- Integration with a database for data persistence using JPA repositories.

### AOP and Unit Testing
- Application of cross-cutting concerns like logging or security using Aspect-Oriented Programming (AOP).
- Unit tests for JPA repositories to ensure data persistence functionality.

### Deployment and Testing
- Deployment to a local server (e.g., Tomcat) for testing the REST API.
- Verification of endpoint functionalities and data retrieval from the database using tools like Postman.

## Getting Started

### Prerequisites
- Java 11 or higher
- Maven or Gradle
- A relational database (e.g., MySQL, PostgreSQL)
- IDE (e.g., IntelliJ IDEA, Eclipse)

### Installation
1. Clone the repository:
   ```
   git clone https://github.com/yourusername/grocery-delivery-application.git
   ```
2. Navigate to the project directory:
   ```
   cd grocery-delivery-application
   ```
3. Build the project using Maven or Gradle:
   ```
   mvn clean install
   ```
4. Run the application:
   ```
   mvn spring-boot:run
   ```

### Testing
- Use Postman or similar tools to test the REST API endpoints.
- Verify functionalities and data retrieval from the database.

## Contributing
We welcome contributions! Please fork the repository and submit pull requests for review.


