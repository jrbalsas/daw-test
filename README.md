dawClub using JSF [![Build Status](https://travis-ci.com/jrbalsas/dawClubJSF.svg?branch=master)](https://travis-ci.com/jrbalsas/dawClubJSF)
==========

Sample Maven Netbeans project with JSF CRUD Web App

Features:
-------------
- Simple DAOMap for testing purpose
- Sample DAOJPA implementation
- Uses CDI annotations with qualifiers for DAO selection in Controller
- Bean Validation with customized messages on ValidationMessages.properties
- Simple Entity CRUD views
- DataTable row editing view
- Sample view modification using AJAX
- H2 database connection
- Standard JNDI connection pool definition in web.xml
- Persistence.xml configuration with JNDI datasource
- Optional access control rules
- JEE Security API options :
    - IdentityStores: Embedded, Database, Custom
    - HttpAuthenticationMethods: Basic, Form, CustomJSF Form/controller

## Requeriments

- Jakarta EE 8 Application Server, e.g. Payara

## Usage
- Compile and deploy in a JEE Application Server

### DB Access:
1. Configure JEE Datasource in web.xml
2. resources/META-INF/sql/schema.sql can be used to create tables not manated by JPA
3. resources/META-INF/sql/sampledata.sql used to insert sample data into database
4. Select Map or JPA DAOs implementation in controller

### Access control:
1. Uncomment access-restriction section in access control rules (web.xml)
2. Uncomment required IdentityStore/s in AppConfig class. Custom ClubIdentityStore available by default
3. Uncomment required HttpAuthenticationMechanism in AppConfig class. Standard Form by default
