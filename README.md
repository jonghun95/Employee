# Employee management system
This application provides CRUD services to manage employees

## Building and Running on a local machine 
1. Download source codes from https://github.com/jonghun95/Employee
2. Run Spring boot with the Maven: ./mvnw spring-boot:run 
3. The application is now running

## End points
### Read (GET)
1. To get all employees - http://localhost:8080/employees
2. To get a specific employee - http://localhost:8080/employees/{id}
### Create (POST)
http://localhost:8080/employees

SAMPLE JSON

<pre><code>
{
    "name" : "Jong Lee",
    "office" : "100A",
    "email" : "jong.lee@test.com",
    "phone" : "111-222-3333",
    "role" : "Engineer"
}
</code></pre>
NOTE: The format of the phone number should be xxx-xxx-xxxx

### Update (PUT)
http://localhost:8080/employees/{id}

SAMPLE JSON

<pre><code>
{
    "id": 1,
    "name" : "Jong Lee",
    "office" : "100A",
    "email" : "jong.lee@test.com",
    "phone" : "111-222-3333",
    "role" : "Engineer"
}
</code></pre>

### Delete (DELETE)
http://localhost:8080/employees/{id}

## Actuator
Actuator is running with a default setting
Thus, the only two available by default are /health and /info

http://localhost:8080/actuator/health
<br/>http://localhost:8080/actuator/info


