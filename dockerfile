# Etapa 1: Compilar o projeto
FROM ubuntu:latest AS build

# Instala Java e Maven
RUN apt-get update && apt-get install -y openjdk-17-jdk maven

# Cria pasta de trabalho
WORKDIR /app

# Copia os arquivos do projeto
COPY . .

# Faz o build do projeto
RUN mvn clean install -DskipTests

# Etapa 2: Imagem leve apenas para execução
FROM openjdk:17-jdk-slim

# Define a porta (importante para Render)
EXPOSE 8080

# Cria diretório de trabalho
WORKDIR /app

# Copia o .jar gerado da imagem de build
COPY --from=build /app/target/morhinga-0.0.1-SNAPSHOT.jar app.jar

# Comando de execução
ENTRYPOINT ["java", "-jar", "app.jar"]
