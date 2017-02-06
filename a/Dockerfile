FROM java:8
RUN mkdir /usr/src/myapp
COPY Test.java /usr/src/myapp
COPY A.class /usr/src/myapp
COPY S.class /usr/src/myapp
WORKDIR /usr/src/myapp
RUN ["javac", "Test.java"]
ENTRYPOINT ["java", "-cp", ".:/temp", "Test"]
CMD [""]

