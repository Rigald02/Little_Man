FROM maven:3.3-jdk-8

WORKDIR /usr/src/mymaven

RUN "$(pwd)":/usr/src/mymaven

CMD mvn clean install

EXPOSE 8080

