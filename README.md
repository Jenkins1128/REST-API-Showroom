# REST API - Showroom

The Showroom REST API creates brands and adds products to those brands with resource urls.

Isaiah Jenkins
## Technologies

* Java (Server-side language)
* Hibernate (ORM)
* MySQL (Server)
* MySQL Workbench (visual database design tool for MySQL database)
* Jersey (JAX-RS)
* Tomcat (Web server)
* Postman (REST Client)
* Maven (Dependency Injection)
* Eclispe (IDE, Jave EE version 2020-12)

## Set up MySQL Server

1. If you don't have the latest MySQL Community Server downloaded, [click here](https://dev.mysql.com/downloads/mysql/).
2. If you don't have the latest MySQL Workbench downloaded, [click here](https://dev.mysql.com/downloads/workbench/).
3. I'll add images below for you to create the schema and tables.

Schema - showroom

<img width="250" alt="Screen Shot 2021-03-10 at 1 57 38 PM" src="https://user-images.githubusercontent.com/35716724/110703404-976e2900-81a8-11eb-835b-38f7d6451301.png">

Tables - brands, products

<img width="632" alt="Screen Shot 2021-03-10 at 2 01 21 PM" src="https://user-images.githubusercontent.com/35716724/110703836-1b281580-81a9-11eb-9e0c-5a4a40c6e498.png">

<img width="645" alt="Screen Shot 2021-03-10 at 2 02 17 PM" src="https://user-images.githubusercontent.com/35716724/110703946-3d219800-81a9-11eb-9f0a-46d18f08aece.png">

In the products table, set up a foreign key for brand id referenced to the brands table in showroom schema. Each product is tagged to a brand with the brand's id.

<img width="799" alt="Screen Shot 2021-03-10 at 2 10 10 PM" src="https://user-images.githubusercontent.com/35716724/110704813-57a84100-81aa-11eb-87c4-d6583ff25abb.png">


## How to run project

1. Open Eclispe.
2. Right click on "restapi" project folder.
3. Click Run As -> Run on Server.
4. Make sure the web server is the latest Tomcat for v9.x.x.
5. Hit Finish.


### Use Postman to test application

Important: Make sure Content-type header is set to application/json for the requests except for DELETE operation.

#### Create a brand
```
POST http://localhost:8080/restapp/showroom/brands 

In BODY, send raw JSON object

Ex:
{
    "brandName": "my brand"
}
```
#### Get all brands
```
Ex: 

GET http://localhost:8080/restapp/showroom/brands

No body
```
#### Get brand by brand id
```
Ex: 

GET http://localhost:8080/restapp/showroom/brands/4

No body
```
#### Get products by brand id 
```
Ex: 

GET http://localhost:8080/restapp/showroom/brands/4/products

No body
```
#### Get products by brand id and category
```
Ex: 

GET http://localhost:8080/restapp/showroom/brands/4/products?category=clothing

No body
```
#### Update brand name by brand id
```
Ex: 

PUT http://localhost:8080/restapp/showroom/brands/16

In BODY, send raw JSON object like below

{
    "brandId": 16,
    "brandName": "brand18"
}
```
#### Delete brand by id
```
Ex: 

DELETE http://localhost:8080/restapp/showroom/brands/16

No body
```




