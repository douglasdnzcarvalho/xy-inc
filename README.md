# Desafio - XY Inc

A XY Inc. é uma empresa especializada na produção de excelentes receptores GPS (Global
Positioning System). A diretoria está empenhada em lançar um dispositivo inovador que
promete auxiliar pessoas na localização de ponto de interesse (POIs), e precisa muito de sua
ajuda.

Você foi contratado para desenvolver a plataforma que fornecerá toda a inteligência ao
dispositivo. Esta plataforma deve ser baseada em serviços, de forma a flexibilizar a integração.

## Requisitos

1. Serviço para cadastrar pontos de interesse, com 3 atributos: Nome do POI, coordenada X
(inteiro não negativo) e coordenada Y (inteiro não negativo). Os POIs devem ser armazenados
em uma base de dados.

2. Serviço para listar todos os POIs cadastrados.

3. Serviço para listar POIs por proximidade. Este serviço receberá uma coordenada X e uma coordenada Y, especificando um ponto de referência, bem como uma distância máxima (max-distance) em metros. O serviço deverá retornar todos os POIs da base de dados que estejam a uma distância menor ou igual a *max-distance* a partir do ponto de referência.

# Resolução

Foi adotado o padrão de nomeclatura em inglês americano em todo o projeto (tabela do banco de dados, rotas da API, código fonte, etc).

O problema foi resolvido usando dois frameworks diferentes, porém os dois se comportam de formas idênticas.

- AdonisJS : resolução do problema utilizando um framework Node.js.
- Spring: resolução do problema utilizando um framework Java.

Cada projeto possui um arquivo README.md com os passos específicos que são necessários para a inicialização da aplicação.

## Lista de rotas disponíveis

URL              | Verbo | Descrição
---------------- | ----- | -------------
/interest_points | POST  | Recebe um JSON com os atributos: *name*, *x_coordinate* e *y_coordinate*. Cadastra o objeto na tabela *interest_points* e retorna o objeto salvo em JSON.
/interest_points | GET   | Lista todos os pontos de interesse cadastrados no banco de dados.
/interest_points?x={x}&y={y}&max_distance={max_distance} | GET | Lista os pontos de interesse que estão a até `max_distance` metros da localização `x`, `y`. Caso algum dos parâmetros não estiver presente ou não for um inteiro positivo, será retornada a lista completa de pontos de interesse.