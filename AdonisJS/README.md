# AdonisJS

## Dependências

As seguintes dependências são necessárias:

- [Node.js](https://nodejs.org/) (versão 8.0.0 ou maior)
- NPM (versão 3.0.0 ou maior)
- [AdonisJs Cli](https://github.com/adonisjs/adonis-cli)
- Docker
- Docker-compose

## Configuração

#### Download das dependências

```bash
npm install
```

#### Criação da chave da aplicação

```bash
adonis key:generate
```

#### Geração do container com o banco de dados

```bash
docker-compose up
```

#### Criação da tabela através de migrations

```bash
adonis migration:run
```

#### Inserção de dados iniciais

```bash
adonis seed --files='InterestPointSeeder.js'
```

#### Subindo a aplicação

```bash
adonis serve --dev
```

Após isso será possível testar a aplicação em http://localhost:3333 .