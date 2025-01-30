# Parking System

Parking System é uma aplicação back-end em Java usando Spring Boot que tem por objetivo gerenciar um estacionamento.

## Tecnologias

- Java 17 ✅
- Spring Boot ✅
- Maven ✅
- Banco de dados PostgreSQL e H2 ✅
- Swagger UI ✅
- Docker ✅

## Funcionalidades

- Listar, cadastrar, deletar e atualizar veículos previamente cadastrados.
- Geração de tickets.
- Gestão de tabela de preço, aplicando taxa de acordo com a variação da hora e dia da semana.

## Endpoints

### **Veículos**

- **PUT** `/api/v1/car/update/{id}`
- **POST** `/api/v1/car/create`
- **GET** `/api/v1/car`
- **GET** `/api/v1/car/{id}`
- **DELETE** `/api/v1/car/{id}`

## Como Rodar a Aplicação

### 1. Clonar o repositório
```sh
git clone https://github.com/seu-usuario/parking-system.git
cd parking-system
```

### 2. Compilar o projeto
```sh
mvn clean package -DskipTests
```

### 3. Executar a aplicação
```sh
java -jar target/Parking-System-0.0.1-SNAPSHOT.jar
```

## Como Rodar com Docker

### 1. Criar a imagem Docker
Crie um arquivo `Dockerfile` na raiz do projeto com o seguinte conteúdo:

```dockerfile
# Step 1: Compilation
FROM maven:3.9.5-eclipse-temurin-17 AS build
WORKDIR /app
COPY . .
RUN mvn clean package -DskipTests

# Step 2: Execution
FROM eclipse-temurin:17-jdk
WORKDIR /app
COPY --from=build /app/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "app.jar"]
```

### 2. Construir a imagem Docker
```sh
docker build -t parking-system .
```

### 3. Rodar o container
```sh
docker run -p 8080:8080 parking-system
```

Agora a aplicação estará disponível em `http://localhost:8080`. 🚀

