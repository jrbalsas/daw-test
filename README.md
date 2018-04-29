dawClub using JSF
==========

Sample Maven Netbeans project with JSF CRUD Web App

Features:
-------------
- Simple DAOList for testing purpose
- Sample DAOJDBC implementation
- Sample DAOJPA implementation
- Uses CDI annotations with qualifiers for DAO selection in Controller
- Resource injection for JNDI connetion pool
- EntityManagerFactory CDI Producer method for EntityManager Injection in Servlet containers, i.e. Tomcat...
- Bean Validation with customized messages on ValidationMessages.properties
- Simple Entity CRUD views
- DataTable row editing view
- Sample view modification using AJAX
- Maven runtime dependencies for using JSF, Bean validation (hibernate) and CDI (weld) for Tomcat deployment
- Optional Authentication/Authorization rules and Logout button
- Persistence.xml configuration with JNDI datasource

Requeriments:
--------------
- Tomcat or JEE compliance server >=7 (p.e. Glassfish +4)
- For DAOJdbc testing a JDBC database connection required, i.e. DerbyDB (edit context.xml to adapt connection pool for your database)
- WEB-INF/DBInitScript.sql can be used to create required table and insert sample data into database
- In Tomcat, for enabling Authentication form, uncomment <Auth-constraint> section in web.xml and add users on tomcat-users.xml

