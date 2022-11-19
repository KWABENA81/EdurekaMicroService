#   Microservices Certification Training
#   Dockerfile for Module 7 - Docker with Microservices using Springboot -I

FROM openjdk:8

COPY . /var/www/java

WORKDIR /var/www/java

RUN javac Hello.java

CMD [ "java", "Hello" ]
