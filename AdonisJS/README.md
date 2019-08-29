# AdonisJS #

## Configuração

```bash
npm install

docker-compose up

adonis key:generate
```

#### Criação da tabela

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