FROM java:8
ADD jdbc_lams-0.0.1-SNAPSHOT.jar jdbc_lams-0.0.1-SNAPSHOT.jar
ENV DB_HOST=127.0.0.1\
    DB_PORT=5432\
    DB_NAME=lams\
    DB_USER=postgres\
    DB_PASSWORD=postgres

ENTRYPOINT ["java","-jar","jdbc_lams-0.0.1-SNAPSHOT.jar"]
