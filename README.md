# Employee management system
This application provides CRUD services to manage employees

## Building and Running on local machine 
1. Download source codes from https://github.com/jonghun95/Employee
2. Running Maven Spring boot plugin from root directory:  mvn spring-boot:run 
3. Now the application is running

## End points
### Read (GET)
1. To get all employees - http://localhost:8080/employees
2. To get a specific employee - http://localhost:8080/employees/{id}
### Create (POST)
http://localhost:8080/employees

SAMPLE JSON

{
    "name" : "Jong Lee",
    "office" : "100A",
    "email" : "jong.lee@test.com",
    "phone" : "111-222-3333",
    "role" : "Engineer"
}

### Update (PUT)
http://localhost:8080/employees/{id}

SAMPLE JSON

{
    "id": 1,
    "name" : "Jong Lee",
    "office" : "100A",
    "email" : "jong.lee@test.com",
    "phone" : "111-222-3333",
    "role" : "Engineer"
}

### Delete (DELETE)
http://localhost:8080/employees/{id}


