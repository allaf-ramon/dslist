# DSList

DSList é uma aplicação backend desenvolvida em Java utilizando o framework Spring Boot. O objetivo deste projeto é gerenciar listas de jogos, permitindo a criação, leitura e reorganização dos jogos na lista.

## Tecnologias Utilizadas

- Java 21
- Spring Boot 3.4.1
- JPA / Hibernate
- Banco de Dados H2 (para testes) e PostgreSQL (para produção)
- Maven

## Estrutura do Projeto

O projeto está estruturado da seguinte forma:

- `src/main/java/com/intensivaojava/dslist`: Contém os arquivos de código fonte da aplicação.
    - `config`: Configurações da aplicação.
    - `controllers`: Controladores REST.
    - `dto`: Data Transfer Objects.
    - `entities`: Entidades JPA.
    - `repositories`: Repositórios JPA.
    - `services`: Serviços da aplicação.
    - `projections`: Projeções para consultas específicas.
- `src/main/resources`: Contém os arquivos de configuração da aplicação.

## Configuração

### Banco de Dados

A aplicação utiliza o banco de dados H2 para testes e PostgreSQL para produção. As configurações de banco de dados estão nos arquivos `application-dev.properties`, `application-prod.properties` e `application-test.properties`.

### Maven

Para compilar e executar o projeto, é necessário ter o Maven instalado. Utilize o comando abaixo para compilar o projeto:

```sh
./mvnw clean install
```

## Executando a Aplicação

Para executar a aplicação, utilize o comando abaixo:

```sh
./mvnw spring-boot:run
```

A aplicação estará disponível em `http://localhost:8080`.

## Endpoints

### Jogos

- `GET /games`: Retorna a lista de jogos.
- `GET /games/{id}`: Retorna os detalhes de um jogo específico.

### Listas de Jogos

- `GET /lists`: Retorna a lista de listas de jogos.
- `GET /lists/{listId}/games`: Retorna os jogos de uma lista específica.
- `POST /lists/{listId}/replacement`: Move um jogo dentro de uma lista.

## Importação de Dados

A aplicação possui um script SQL (`import.sql`) para importar dados iniciais no banco de dados.

## Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues e pull requests.