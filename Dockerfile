#https://dev.mysql.com/doc/mysql-linuxunix-excerpt/8.0/en/docker-mysql-getting-started.html
#copies necessary sources.sql into container for autorup on start
FROM mysql:8.0
ADD initialize_db.sql /docker-entrypoint-initdb.d

FROM openjdk:8-jdk-alpine
RUN addgroup -S spring && adduser -S spring -G spring
USER spring:spring
ARG DEPENDENCY=target/dependency
COPY ${DEPENDENCY}/BOOT-INF/lib /app/lib
COPY ${DEPENDENCY}/META-INF /app/META-INF
COPY ${DEPENDENCY}/BOOT-INF/classes /app
EXPOSE 8080
ENTRYPOINT ["java","-cp","app:app/lib/*","com.companyx.widget.MainApplicationClass"]
