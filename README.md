# Spring/Swagger API

Here's an example implementation of Swagger within a Spring API. This example also implements a mySQL database, so this must be installed to run the project unless another datasource is implemented. I've added instructions on installing mySQL in the usage section below. I created a repo because I will be updating the source code with documentation for each method and annotation in hopes of establishing a firm understading of the aforementioned technologies.

# Installation

This project was tested using [Spring Tool Suite](https://spring.io/tools3/sts/all). To import this project, navigate to the menu bar and click File > Import > Maven > Existing Maven Projects. Select the root directory of the project (it should contain the pom.xml file) and continue through the prompts to finish importing the project.

Unless you're using a different data source, a mySQL instance must also be created before this project can be run. Download [mySQL Server](https://dev.mysql.com/downloads/mysql/) and [mySQL workbench](https://dev.mysql.com/downloads/workbench/) (optional).

# Usage

To setup the mySQL database and table using mySQL Workbench, navigate to the menu bar and click File > New Query Tab. Type the following to create a database called mydb and a table called employees with the objects created in the Employee model of the Spring project.

```sql
create database mydb;

CREATE TABLE employees (
id int,
first_name varchar(255),
last_name varchar(255),
email_address varchar(255));
```

Run the code above by clicking Query > Execute (All or Selection). The Action Output table below should populate with two items with a green circle indicating the table and database creation was successful.

Next open the Application.properties file located in src/main/resources and update the `spring.datasource.password` field with the password that was set in the mySQL setup or the password for the custom datasource that was used. The user for mySQL should be "root", but this should be pre-populated.

After completing this process run the Spring project. To do this using Spring Tool Suite, right click Springboot2Swagger2Application.java, rollover Run As, and click Spring Boot App. After running the project, navigate to [http://localhost:8080/swagger-ui.html](http://localhost:8080/swagger-ui.html) to access Swagger UI. From here you can access the API documentation and invoke its endpoints.

Run `SELECT * FROM employees;` in mySQL Workbench to see all of the values in the employees table after invoking the add employee POST method. Do this by highlighting this line and selecting Query > Execute (All or Selection) in the menu bar.

If you get this error: `Error Code: 1046. No database selected Select the default DB to be used by double-clicking its name in the SCHEMAS list in the sidebar.`, run `use mydb;` and try again

# Jenkins

Using ngrok to tunnel local ip. This makes it possible to setup a webhook that triggers a build when code changes are comitted.

# Contact

Email me at Cornelio_Brandon@bah.com for assistance running this project.

# Credit

**springboot2-jpa-swagger2**  
https://github.com/RameshMF/spring-boot-tutorial
