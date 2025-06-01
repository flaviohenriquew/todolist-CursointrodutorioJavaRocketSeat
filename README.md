# 📋 To-Do List API – Java com Spring Boot

Este projeto foi desenvolvido como parte do curso [Java com Spring Boot - Curso Introdutório](https://app.rocketseat.com.br/journey/java-com-spring-boot-curso-introdutorio) da Rocketseat.

## 🧠 Objetivo

Criar uma API REST para gerenciamento de tarefas (To-Do List) usando o ecossistema Spring, com foco em boas práticas de desenvolvimento, organização do código, segurança e deploy.

## 📚 Conteúdos Abordados

Durante o curso, foram ensinados os seguintes tópicos:

- Desenvolvimento de uma aplicação back-end em Java
- Estruturação do projeto com Maven
- Criação de API REST com Spring Boot
- Utilização do Lombok para reduzir boilerplate
- Integração com banco de dados H2 (in-memory)
- Implementação de segurança com autenticação básica (Basic Auth)
- Tratamento global de exceções
- Deploy do back-end em ambiente de produção (Render)

## 🚀 Tecnologias Utilizadas

- Java 17
- Spring Boot
- Spring Web
- Spring Data JPA
- Spring Security (com Basic Auth)
- H2 Database
- Lombok
- Maven
- Render (Deploy)

## ⚙️ Como Executar o Projeto Localmente

### Pré-requisitos

- Java 17+
- Maven (ou use o wrapper `./mvnw`)

### Passos

```bash
# Clone o repositório
git clone https://github.com/seu-usuario/nome-do-repositorio.git
cd nome-do-repositorio

# Execute a aplicação
./mvnw spring-boot:run
```

Acesse a aplicação via:

```
http://localhost:8080
```

## 🔐 Autenticação

A API utiliza autenticação HTTP Basic. Para testar os endpoints protegidos usando Basic Auth no Postman:

- Vá até a aba **Authorization**
- Selecione o tipo **Basic Auth**
- Preencha seu **Username** e **Password**

## 🔄 Endpoints da API

### 📌 Criar Usuário

- `POST /users`

```json
{
  "name": "Flávio Henrique",
  "username": "flaviohenriquew",
  "password": "12345"
}
```

### 📌 Cadastrar Tarefa

- `POST /tasks` _(requer autenticação)_

```json
{
  "title": "Gravação de aula",
  "description": "Tarefa para aula de Tasks do curso de Spring Boot",
  "priority": "ALTA",
  "startAt": "2025-10-06T12:30:00",
  "endAt": "2025-10-06T15:35:00",
  "idUser": "c7a1c90f-bbe1-4670-8c25-c2646a699f52"
}
```

### 📌 Listar Tarefas do Usuário

- `GET /tasks` _(requer autenticação)_

### 📌 Editar Tarefa pelo ID

- `PUT /tasks/{id}` _(requer autenticação)_

```json
{
  "description": "Nova descrição da tarefa"
}
```

> 🔒 A edição de tarefas é permitida **apenas para o usuário dono da tarefa**.

## 🧪 Banco de Dados H2

Acesse:

```
http://localhost:8080/h2-console
```

JDBC URL: `jdbc:h2:mem:testdb`  
Usuário: `admin`  
Senha: `admin`

## ☁️ Deploy na Render

- Conecte o repositório Git
- Build Command: `./mvnw clean install`
- Start Command: `java -jar target/*.jar`
- Acesse o projeto em produção: [https://todolist-cursointrodutoriojavarocketseat.onrender.com](https://todolist-cursointrodutoriojavarocketseat.onrender.com)

## 📝 Licença

MIT © 2025
