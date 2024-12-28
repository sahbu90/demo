FROM openjdk:17

WORKDIR /app
COPY ./target/demo.jar /app

EXPOSE 9091

CMD ["java", "jar", "demo.jar" ]