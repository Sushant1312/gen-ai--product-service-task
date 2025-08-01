1] prompt for full context

I want you to create a full backend using Spring Boot for a product-based web application. It should have user registration and login features using JWT tokens. Public access should be allowed only for login and registration, and all other API routes should be protected. The app should let users perform Create, Read, Update, and Delete (CRUD) operations on products. Use a MySQL database. Add a User and a Product entity, their repositories, and services. Include JWT utility classes to generate and validate tokens, and apply a JWT filter to check tokens in every request. Also, create unit tests for authentication and product features using JUnit and MockMvc. Add all necessary configuration files like SecurityConfig.java, application.properties, and the required annotations.

2]prompt for each java class

Product.java: Make a product class with id, name, description, and price.

ProductRepository.java: Create a repository to save and get products.

ProductService.java: Add service methods to create, update, get, and delete products.

ProductController.java: Write a controller to handle product APIs like add, update, get, and delete.

User.java: Create a user class with fields like username, password, and role.

UserRepository.java: Add a repository to find users by username.

UserService.java: Write service methods to register users and check login.

AuthController.java: Make a controller with two endpoints – one for register and one for login.

SecurityConfig.java: Set up basic security so login and register work without a token, and all other parts need a token.

JwtTokenUtil.java: Make a helper class to create and check JWT tokens.

JwtRequestFilter.java: Add a filter that checks every request for a token and sets the user details.

ProductControllerTest.java: Write tests to check product APIs like add and get are working.
