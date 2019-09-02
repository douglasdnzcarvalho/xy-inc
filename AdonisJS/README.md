# AdonisJS

## Dependências

Certifique-se de que possui as seguintes dependências instaladas:

- [Node.js](https://nodejs.org/) (versão 8.0.0 ou maior)
- NPM (versão 3.0.0 ou maior)
- [AdonisJs Cli](https://github.com/adonisjs/adonis-cli)
- Docker
- Docker-compose

## Download das dependências

```bash
npm install
```

## Configuração do ambiente

Faça uma cópia do arquivo *.env.example*, e o nomeie como *.env* . Neste arquivo é onde deve ser feita a configuração do projeto.

## Criação da chave da aplicação

```bash
adonis key:generate
```

## Geração do container com o banco de dados

```bash
docker-compose up
```

## Criação da tabela através de migrations

```bash
adonis migration:run
```

## Populando o banco de dados com os registros iniciais

```bash
adonis seed --files='InterestPointSeeder.js'
```

## Subindo a aplicação

```bash
adonis serve --dev
```

Ao final do carregamento será possível testar a aplicação na URL http://localhost:3333.