# 💰 Financial API

API RESTful desenvolvida com **Java + Spring Boot** para gerenciamento financeiro.

Este projeto foi criado com fins de estudo e tem como objetivo demonstrar boas práticas de desenvolvimento backend, organização de código e construção de APIs, sendo utilizado como portfólio para entrevistas.

---

## 🚀 Tecnologias utilizadas

* Java 17
* Spring Boot
* Spring Data JPA
* PostgreSQL
* Docker
* Maven

---

## 🧠 Conceitos aplicados

* Arquitetura em camadas (Controller, Service, Repository)
* Tratamento global de exceções
* Validação de dados com Bean Validation
* Boas práticas REST
* Injeção de dependência
* Uso de DTOs
* Containerização com Docker

---

## ⚙️ Como rodar o projeto

### 🔹 Com Docker (recomendado)

```bash
docker-compose up --build
```

A aplicação estará disponível em:
http://localhost:8080

---

### 🔹 Rodando localmente

1. Configure o PostgreSQL
2. Ajuste as credenciais no `application.properties`
3. Execute o projeto:

```bash
mvn spring-boot:run
```

---

## 📡 Endpoints principais

* **POST /transactions** → Criar uma nova transação
* **GET /transactions** → Listar todas as transações
* **GET /transactions/{id}** → Buscar transação por ID
* **DELETE /transactions/{id}** → Remover uma transação

---

## 🎯 Objetivo do projeto

Este projeto foi desenvolvido com o objetivo de praticar e demonstrar:

* Construção de APIs RESTful
* Integração com banco de dados relacional
* Organização de um projeto backend real
* Uso de Docker para padronização de ambiente

---

## 👨‍💻 Autor

Renato

LinkedIn: https://www.linkedin.com/in/renato-dario-guanabara/
