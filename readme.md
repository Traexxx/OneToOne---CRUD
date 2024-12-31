
# 🏥 Cadastro de Pessoas - Sistema de Cadastro de Pessoas

Este projeto é um sistema simples de cadastros, que utiliza **Java** com **Spring Boot** e **H2** como banco de dados em memória. Ele permite o cadastro e gerenciamento, armazenando suas informações como nome, idade e endereço. O sistema foi desenvolvido com uma interface web usando **Thymeleaf**, e utiliza **Lombok** para reduzir o código boilerplate.

## 🎯 Funcionalidades

- Persistência de dados em banco de dados em memória (H2).

- Cadastro de pessoas com nome, idade, e endereço completo.
<img src="/Assets/demo_cadastro.gif" alt="Cadastro de Pessoa" width="400">


- Listagem de pessoas cadastradas.

- Atualização e remoção pessoas.
<img src="/Assets/demo_atualizacao.gif" alt="Atualização de Pessoa" width="400">


<img src="/Assets/demo_excluir.gif" alt="Remoção de Pessoa" width="400">



## 📋 Diagrama de Classes

<img src="/Assets/floxograma" alt="diagrama" width="400">



## 🚀 Tecnologias Utilizadas

As principais tecnologias usadas no desenvolvimento deste projeto incluem:

- **Java 21**: Linguagem principal do projeto.
- **Spring Boot**: Framework para criação do backend com suporte a REST APIs e injeção de dependências.
- **H2 Database**: Banco de dados em memória utilizado para armazenar as informações dos pessoas.
- **SQL**: Linguagem para manipulação dos dados no banco de dados H2.
- **Lombok**: Biblioteca que ajuda a reduzir o código repetitivo, como getters, setters e construtores.
- **Thymeleaf**: Template engine utilizada para renderização da interface web.

## 📦 Instalação e Configuração

### 1. Pré-requisitos

Certifique-se de ter instalado em seu ambiente de desenvolvimento:

- **Java 21** ou versão superior.
- **Maven** para gerenciamento de dependências.
- **Git** para controle de versão.

### 2. Clonando o Repositório

Clone o projeto em sua máquina local utilizando o comando:

```bash
git clone https://github.com/Traexxx/OneToOne---CRUD.git
```

### 3. Rodando o Projeto

Navegue até o diretório do projeto e execute os seguintes comandos para rodar a aplicação:

```bash
cd OneToone
mvn spring-boot:run
```

O sistema estará disponível em `http://localhost:8080`.

## 💻 Interface Web

A interface web do sistema permite o cadastro e gerenciamento. A aplicação usa **Thymeleaf** para renderizar o frontend.

## 🗃️ Banco de Dados H2

Este projeto utiliza o banco de dados H2, que é embutido e executado em memória. Para acessar o console web do H2, basta acessar a URL:

```
http://localhost:8080/h2-console
```

As configurações de conexão estão no arquivo `application.properties`:

```properties
spring.datasource.url=jdbc:h2:mem:pessoasdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=
spring.h2.console.enabled=true

spring.jpa.hibernate.ddl-auto=update

server.port= 8080
```

## 🤝 Contribuições

Contribuições são sempre bem-vindas! Sinta-se à vontade para abrir *issues* e *pull requests*.

## 📄 Licença

Este projeto está licenciado sob a [MIT License](LICENSE).