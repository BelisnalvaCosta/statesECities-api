# statesECities-api
Pondo em prática os meus projetos em Java[^1].

Este projeto  foi feito na IDE  Intellij.

#  Tecnologia  utilizadas:
##  Back-end
-  Java  
-  Jpa/Hibernate
-  Maven
-  Spring Boot
-  Postgresql
-  H2

-  ##  Dependências acrescentadas:
-  flywaydb/flyway-maven-plugin
-  vladmihalcea/hibernate-types-52

For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.0.4/maven-plugin/reference/) 
* [Spring Web](https://docs.spring.io/spring-boot/docs/3.0.4/reference/htmlsingle/#web)
* [Spring Configuration Processor](https://docs.spring.io/spring-boot/docs/3.0.4/reference/htmlsingle/#appendix.configuration-metadata.annotation-processor)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)

###  Observação: para executar e visualizar o Get, Post, Put and Delet.
1. Postman
2. Heroku

### Preencher

* [dados] (https://github.com/...)

'''Shell script
cd ~/workspace/sql-paises-estados-cidades/PostgreSQL
docker run -it --rm --net=host -v $PWD:/tmp postgres /bin/bash
psql -h localhost -U postgres_user_city cidades -f /tmp/pais.sql
psql -h localhost -U postgres_user_city cidades -f /tmp/estado.sql
psql -h localhost -U postgres_user_city cidades -f /tmp/cidade.sql
psql -h localhost -U postgres_user_city cidades

CRIAR CUBO DE EXTENSÃO; 
CRIAR EXTENSÃO TERRADISTÂNCIA;
```

###   Port

```
$  jdbc:postgresql://localhost:5432/statesECitiesapidb

```
###  Agora  é só jogar  o  Projeto  no  github
$  git add .   
```
 
```
$  git  commit -m  "Commit  all  files  for github"
```

[^1]: Este projeto foi feito com a orientação do Expert e professor André L. Gomes(DIO.me).
