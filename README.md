# e-commerce-
e-commerce project using springboot

A mini e-commerce backend system built using Spring Boot, with modules for product and category management. The goal is to simulate an e-commerce platform like Amazon, Myntra, or Ajio, focusing on backend logic and APIs.

Features Completed
Product Module
-Add product
-Get all products
-Delete product (work in progress)
-REST APIs tested using Postman
-Product linked to category using proper entity relationships
-Uses service layer logic to separate business and controller code

Category Module
-Add new category
-Fetch all categories
-REST APIs tested using Postman
-Category connected to products using ManyToOne
-Maintains clean hierarchy and avoids data duplication

Project Structure
-Proper use of layers: Controller, Service, Repository
-MySQL integration via Spring Data JPA
-application.properties configured for local database connection
-Maven used for dependency management
-Clean project organization with separate packages for each module

Features In Progress
-User Module
-User signup and login functionality
-Planning to implement Spring Security or JWT for authentication
-Role-based access control for admin and regular users
-Post-Login Product Display
-Display products by category once user is logged in
-Filter or paginate products based on price or popularity
-Endpoint protection for authenticated users only

Wishlist Module
-Users can add products to their personal wishlist
-API to add or remove products from wishlist
-User and Product linked through ManyToMany relationship
-Feature planned to fetch user-specific wishlist items
-Cart and Checkout (Planned)
-Add products to cart
-View cart details and order summary
-Proceed to checkout functionality
-Frontend Integration
-Planned UI with HTML, CSS, JavaScript or React
-Frontend will consume backend REST APIs

Goal is to give a seamless e-commerce experience post-login

Technologies Used
-Java
-Spring Boot
-Spring Data JPA
-MySQL
-Postman
-Maven
-Lombok

Final Target (Main Goal)
-Build a functional backend for an e-commerce platform where:
-Users can sign up and log in securely
-Products can be viewed by category after login
-Admin can manage products and categories
-Users can manage their wishlist and cart
-Backend supports easy integration with frontend via REST APIs

Project Structure
src
└── com.e_commerce.E_Commerce.website.using.SpringBoot
  ├── Product
  │  ├── Product.java
  │  ├── ProductController.java
  │  ├── ProductService.java
  │  └── ProductRepository.java
  ├── Category
  │  ├── Category.java
  │  ├── CategoryController.java
  │  ├── CategoryService.java
  │  └── CategoryRepository.java
  ├── Wishlist
  │  ├── Wishlist.java
  │  ├── WishlistController.java
  │  ├── WishlistService.java
  │  └── WishlistRepository.java
  └── ECommerceWebsiteUsingSpringBootApplication.java
