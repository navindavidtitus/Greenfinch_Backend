# Greenfinch_Backend
Spring service implementation

1. Create a folder in the local machine.

2. Open CLI/GitBash inside the created folder.

3. Use the below command and URL to clone the respository:
git clone https://github.com/navindavidtitus/Greenfinch_Backend.git

4. Open Eclipse IDE and import the project as an existing maven project.

5. Configure a maven build with clean and install as the profile in the build configuration.

6. Run the build and on a successful build, a .WAR file is generated in the Target folder of the project source(Not in IDE), which is a deployable file in the Tomcat server.

7. After a successful build, a connection is established between the created Database and the service, which is consumed by the angular frontend.

8. Run the DemoApplication.java file 

9. When a data is submitted through the UI, the data entered in the form is stored in the Database via REST API calls.

10. A success message is rendered in the UI, on successful Sign Up.


# Database Creation

1. Create a database "test" with the following query:
CREATE DATABASE test;

2. Create a table "user", as this name has been configured as table name in the code, with the following query:
CREATE TABLE user (id INT AUTO_INCREMENT, name VARCHAR(150) NOT NULL, username VARCHAR(150) NOT NULL, password VARCHAR(150) NOT NULL, PRIMARY KEY(id));

3. Insert a test data into the "user" table with the following query:
INSERT INTO user VALUES (1,'NavinDavidTitus','Navin1308','Awerqfa@1939')
