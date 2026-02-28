# 📘 Projeto de Aprendizado: JPA com Hibernate e MySQL

Este repositório foi criado como parte do meu **aprendizado** na **Seção 21 do curso de Java EE - Mapeamento objeto-relacional com JPA/Hibernate**.  
O objetivo é praticar conceitos de **Java SE**, **Maven**, **JPA/Hibernate** e integração com **MySQL**.

---

## 🎯 Objetivo
- Criar uma aplicação simples em Java para instanciar objetos e exibir dados.
- Evoluir o projeto para utilizar **JPA/Hibernate** e persistir os objetos em banco de dados.
- Consolidar o conhecimento adquirido na seção do curso.

---

## 🚀 Estrutura do Projeto

- **dominio/Pessoa.java** → Classe de entidade mapeada com JPA.  
- **aplicacao/Programa.java** → Classe principal para instanciar objetos e realizar testes.  
- **resources/META-INF/persistence.xml** → Configuração do JPA/Hibernate.  

---

## 📝 Passos Realizados

### 1. Projeto Inicial
- Criação da classe `Pessoa` com atributos `id`, `nome`, `email`.
- Criação da classe `Programa` para instanciar e imprimir objetos.

### 2. Banco de Dados
- Instalação do **XAMPP**.  
- Criação da base de dados `aulajpa` no **PhpMyAdmin**.

### 3. Projeto Maven
- Criação de projeto Maven (`aulajpamaven`).  
- Configuração para Java 17 no `pom.xml`.  
- Inclusão das dependências:
  - Hibernate Core  
  - Hibernate EntityManager  
  - MySQL Connector  

### 4. Configuração JPA
- Criação do arquivo `persistence.xml` com as propriedades de conexão.  
- Mapeamento da entidade `Pessoa` com anotações JPA (`@Entity`, `@Id`, `@GeneratedValue`).  

---

## 📂 Tecnologias Utilizadas
- Java 17  
- Maven  
- Hibernate / JPA  
- MySQL  
- XAMPP  

