# Taxi Service Project

This is a Java web application for a taxi service. The project allows users to manage cars, drivers, and manufacturers through a web interface.

## Table of Contents

-   [Getting Started]()
-   [Usage]()
-   [Features]()
-   [Technologies]()
-   [Contributing]()
-   [License]()

## Getting Started

To get started with the project, you can clone the repository to your local machine and run it on a local web server.

### Prerequisites

-   Java Development Kit (JDK) 8 or higher
-   Apache Tomcat 9.0.50
-   Maven

### Installing

1.  Clone the repository to your local machine using the following command:

```
git clone https://github.com/<username>/taxi-service.git
```

2.  Open the project in your favorite IDE.
    
3.  Build the project using Maven:

```
mvn clean package
```

4.  Deploy the WAR file to your local Tomcat server.
    
5.  Start the Tomcat server and go to [http://localhost:8080/taxi-service](http://localhost:8080/taxi-service) in your web browser.
    

## Usage

Once you have the project running, you can use the web interface to manage cars, drivers, and manufacturers.

### Register

-   After installing and launching the application, you need to click on the login page the link "Don't have an account? Register now".
-   Next, you will need to fill out the form and click "confirm".
-   Then you will need to go back to the login page and enter the login-password fields that you specified when adding the driver.

### Cars

-   Add a new car: Click the "Create new Car" button. Fill out the form and click "Submit".
-   Add driver to car: Click the "Add Driver to Car" button. Select a driver and car from the selector, and click "Submit".
-   View your cars: Click the "Display my Cars" button.
-   View all cars: Click the "Display All Cars" button.
-   Delete a car: Go to the "My cars" or "All cars" page and click the "Delete" button next to the car you want to delete.

### Drivers

-   Add a new driver: Click the "Create new Driver" button. Fill out the form and click "Submit".
-   View all drivers: Click the "Display All Drivers" button.
-   Delete a driver: Go to the "Display All Drivers" page and click the "Delete" button next to the driver you want to delete.

### Manufacturers

-   Add a new manufacturer: Click the "Create new Manufacturer" button. Fill out the form and click "Submit".
-   View all manufacturers: Click the "Display All Manufacturers" button.
-   Delete a manufacturer: Go to the "Display All Manufacturers" page and click the "Delete" button next to the manufacturer you want to delete.

## Features

-   Add, delete, and view cars, drivers, and manufacturers.
-   Authentication ~~and authorization~~ (in progress) using session management.
-   Password hashing and salting.
-   Connection pooling and error handling.
-   Custom exception handling.

## Technologies

-   Java Servlet API
-   JavaServer Pages (JSP)
-   Java Database Connectivity (JDBC)
-   Apache Tomcat
-   Maven

## Contributing

Contributions to the project are welcome. You can fork the repository, make changes, and submit a pull request.

## License

This project is licensed under the MIT License - see the [LICENSE](https://github.com/Iskamele/taxi-service/blob/main/LICENSE) file for details.
