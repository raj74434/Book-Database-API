# Book-Database-API


<p>
  Book Management REST API
This project is a RESTful API for managing book entries. The API allows you to create, read, update, and delete book entries. It uses Java, Spring Boot, MySQL, Hibernate, and Swagger for documentation.

<h1>Tech Stack</h1>
<ul>
<li>Java</li>
<li>Spring Boot</li>
<li>MySQL</li>
<li>Hibernate</li>
<li>Swagger</li>
  </ul>
Endpoints
Base URL
bash
Copy code
http://localhost:8080/books
BookController
Create a Book Entry

bash
Copy code
POST /books/
Request Body:
json
Copy code
{
  "title": "Book Title",
  "author": "Author Name",
  "isbn": "1234567890123",
  "publicationDate": "2023-01-01"
}
Response:
json
Copy code
{
  "id": 1,
  "title": "Book Title",
  "author": "Author Name",
  "isbn": "1234567890123",
  "publicationDate": "2023-01-01"
}
Get a Book Entry by ID

bash
Copy code
GET /books/{bookId}
Response:
json
Copy code
{
  "id": 1,
  "title": "Book Title",
  "author": "Author Name",
  "isbn": "1234567890123",
  "publicationDate": "2023-01-01"
}
Get All Book Entries

bash
Copy code
GET /books/
Response:
json
Copy code
[
  {
    "id": 1,
    "title": "Book Title",
    "author": "Author Name",
    "isbn": "1234567890123",
    "publicationDate": "2023-01-01"
  },
  ...
]
Update a Book Entry

bash
Copy code
PUT /books/{bookId}
Request Body:
json
Copy code
{
  "title": "Updated Book Title",
  "author": "Updated Author Name",
  "isbn": "1234567890123",
  "publicationDate": "2023-01-01"
}
Response:
json
Copy code
{
  "id": 1,
  "title": "Updated Book Title",
  "author": "Updated Author Name",
  "isbn": "1234567890123",
  "publicationDate": "2023-01-01"
}
Delete a Book Entry

bash
Copy code
DELETE /books/{bookId}
Response:
json
Copy code
{
  "message": "Book entry deleted successfully"
}
Data Validation
Data validation is implemented to ensure that all book entries have the required fields and correct data types. The following fields are validated:

title: must not be blank
author: must not be blank
isbn: must be a 13-digit number
publicationDate: must not be null
Running Locally
Clone the Repository:

bash
Copy code
git clone https://github.com/yourusername/book-management-api.git
cd book-management-api
Update Application Properties:
Edit the src/main/resources/application.properties file to update your MySQL database connection settings.

properties
Copy code
spring.datasource.url=jdbc:mysql://localhost:3306/booksManage
spring.datasource.username=yourUsername
spring.datasource.password=yourPassword
spring.jpa.hibernate.ddl-auto=update
Run the Application:

bash
Copy code
./mvnw spring-boot:run
The application will run on http://localhost:8080.

Database Setup
Make sure you have MySQL installed and running. Create a database named booksManage or update the database name in the application.properties file to match your configuration.

sql
Copy code
CREATE DATABASE booksManage;
Swagger Documentation
Swagger is integrated for API documentation. Once the application is running, you can access the Swagger UI at:

bash
Copy code
http://localhost:8080/swagger-ui.html
</p>

<h2> Please ensure that you enabled annotation based processing</h2>
