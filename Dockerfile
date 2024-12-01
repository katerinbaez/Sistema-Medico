FROM openjdk:17 
COPY "./target/SistemaMedico-1.jar" "app.jar"
EXPOSE 8013
ENTRYPOINT [ "java","-jar","app.jar" ]



