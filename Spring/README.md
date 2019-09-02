# Spring

## Dependências

Certifique-se de que possui as seguintes dependências instaladas:

- Java Development Kit (versão 11)
- Maven (versão >= 3.6.0)
- Docker
- Docker-compose

## Geração do container com o banco de dados

```bash
docker-compose up
```

## Inicialização da aplicação

Acesse alguma CLI e digite o seguinte comando:

```bash
mvn spring-boot:run
```

Nesse momento o banco de dados já será populado automaticamente com os dados iniciais.

Ao final do carregamento será possível testar a aplicação na URL http://localhost:8080.