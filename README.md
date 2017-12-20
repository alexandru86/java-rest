# RESTful Web Service

## Introduction

Exposes 2 endpoints:
/greeting
/hello - returns environment details depending on active spring profile  

Build: 

mvn clean package

Run:
java -jar app-name.jar -Dspring.profiles.active=dev (default)
java -jar app-name.jar -Dspring.profiles.active=test
ava -jar app-name.jar -Dspring.profiles.active=production
