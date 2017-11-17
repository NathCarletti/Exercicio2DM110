# Exercicio2DM110
Java EE, entity JPA, serviço REST, session beans


Banco de Dados:

CREATE DATABASE "postgres";

create table Client (
id integer not null,
name varchar(50) not null,
email varchar(50) not null
);
create sequence seq_client;

Links:
http://localhost:8081/dm110/hello
http://localhost:8081/dm110/api/client/addClient
http://localhost:8081/dm110/api/client/listAll

Exemplo de addClient:
{
        "name": "nath",

"email": "ncs@gmail.com"
    
}