# saucedemo

The automation of the sauce application that is responsible for the delivery of products is carried out, through the url [https://automation-wappi.vercel.app/login](https://www.saucedemo.com/). you want to validate and verify the correct functioning of the functionalities.

 1.Login

 Project description 🥉
 In the Repository we have the following branches
 1. Login -> Here are the automated Login tests
 2. Documentation -> Here is the documentation of the automated tests.

Beginning ✒️

With this project we want to make a WEB automation based on SOLID and FIRST principles, for a better understanding in the reports we use BDD, Cucumber and serenity with the dependency manager Maven.

Prerequisites 📋

In order to execute this project we must have the java JDK and the environment variables installed, which are:

JAVA_HOME: Download the Java JDK and attach the path where the folder is located, in my case I have it at C:\Program Files (x86)\Java\jdk1.8.0_251

MAVEN_HOME: Download Apache Maven and attach the path where the folder is located, in my case I have it at C:\Program Files\apache-maven-3.6.3-bin\apache-maven-3.6.3
Have an IDE installed for observing or modifying the code.

In the project root we must have 3 files, which are:

serenity.properties
sonar-project.properties
chromedriver.exe : Este archivo debe ser compatible con la versiòn que se tenga en la maquina; en este caso es ChromeDriver 84.0.4147.30

Running the tests ⚙️

For the execution of the project it must be taken into account that the environment variables are well configured, additionally it must have the dependencies downloaded which is in the pom.xml file.

The test can be executed by means of the package runners, which is located in srctest, or by means of the console of the project with the command

mvn clean verify

Report 📋

To view the evidence of the tests we must go to the path Reporte "Site Serenity" and search for the Index file located in the folder.

Analyze code with Sonarqube ⌨️️

In the root of the project we must put the sonar-project.properties, to be able to make the analysis of the code.

The steps to follow are:

In the cmd of the project folder we execute the command.

 starSonar
Open the cmd and execute the command

StartSonar
Open in the browser the URL http://localhost:9000/about

In the project folder proceed to open the cmd and execute the command.

sonar -scanner 
In another window of the same project I execute the cmd the command

sonar-scanner
Note: The windows of the cmd should not be closed.

We proceed to enter the URL http://localhost:9000/about to analyze the result.


Note🎤

To make the data consumption by means of excel, we took the following repository https://github.com/maalben/Automatizacion-full-services-restapi-Screenplay/tree/main 
