FROM java:8

RUN dpkg-reconfigure -f noninteractive tzdata

COPY target/facebook*.jar /facebook/app.jar

EXPOSE 8080

ENTRYPOINT java -jar /facebook/app.jar
