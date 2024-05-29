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
<li>LomBok</li>
</ul>

<h1>Endpoints</h1>
<br/>
Base URL :- http://localhost:8080/books
<br/>

BookController
<br/>
<br/>
Create a Book Entry
<br/>
POST :- base URL /

<br/>
Request Body:
<br/>
{
<br/>
  "title": "Book Title",
  <br/>
  "author": "Author Name",
  <br/>
  "isbn": "1234567890123",
  <br/>
  "publicationDate": "2023-01-01"
  <br/>
}
<br/>
<br/>
Response:
<br/>

{
<br/>
  "id": 1,
  <br/>
  "title": "Book Title",
  <br/>
  "author": "Author Name",
  <br/>
  "isbn": "1234567890123",
  <br/>
  "publicationDate": "2023-01-01"
  <br/>
}
<br/>
<hr/>

Get a Book Entry by ID
<br/>
GET :- base Url/{bookId}
<br/>
Response:
<br/>
{
<br/>
  "id": 1,
  <br/>
  "title": "Book Title",
  <br/>
  "author": "Author Name",
  <br/>
  "isbn": "1234567890123",
  <br/>
  "publicationDate": "2023-01-01"
  <br/>
}
<br/>
<br/>
<hr/>
Get All Book Entries
<br/>

GET :- base Url /
<br/>
Response:
<br/>

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

<br/>
<br/>
<hr/>
Update a Book Entry
<br/>

PUT :- base Url/{bookId}
<br/>
Request Body:
<br/>

{
<br/>
  "title": "Updated Book Title",
  <br/>
  "author": "Updated Author Name",
  <br/>
  "isbn": "1234567890123",
  <br/>
  "publicationDate": "2023-01-01"
  <br/>
}
<br/>

Response:
<br/>
{
<br/>
  "id": 1,
  <br/>
  "title": "Updated Book Title",
  <br/>
  "author": "Updated Author Name",
  <br/>
  "isbn": "1234567890123",
  <br/>
  "publicationDate": "2023-01-01"
  <br/>
}
<br/>
<br/>
<hr/>
Delete a Book Entry
<br/>

DELETE :- /{bookId}
<br/>
Response:
<br/>


  <h3>"message": "Book entry deleted successfully"</h3>

<h1>Data Validation</h1>
Data validation is implemented to ensure that all book entries have the required fields and correct data types. The following fields are validated:
<br/>
title: must not be blank or null
<br/>
author: must not be blank  or null
<br/>
isbn: must be a 13-digit number  or null
<br/>
publicationDate: must not be null  or null
<br/>


# Running Locally
<br/>

<ul>
<li>Clone the Repository</li>
<li>cd book-management-api</li>
<li>Update Application Properties </li>
<li>Edit the src/main/resources/application.properties file to update your MySQL database connection settings.</li>
<li>Run the Application: </li>
</ul>
<br/>
The application will run on http://localhost:8080.

# Database Setup
Make sure you have MySQL installed and running. Create a database named booksManage or update the database name in the application.properties file to match your configuration.


# Swagger Documentation

Swagger is integrated for API documentation. Once the application is running, you can access the Swagger UI at:
<br/>
[
http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui/index.html#/)
</p>
#Note
<h2> Please ensure that you enabled annotation-based processing because LomBok is used in this project</h2>
