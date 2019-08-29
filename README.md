# XY Inc | Desafio #

A XY Inc. é uma empresa especializada na produção de excelentes receptores GPS (Global
Positioning System). A diretoria está empenhada em lançar um dispositivo inovador que
promete auxiliar pessoas na localização de ponto de interesse (POIs), e precisa muito de sua
ajuda.

Você foi contratado para desenvolver a plataforma que fornecerá toda a inteligência ao
dispositivo. Esta plataforma deve ser baseada em serviços, de forma a flexibilizar a integração.

## Resolução ##

O problema está sendo resolvido usando dois frameworks diferentes, porém os dois se compartarão de formas idênticas.

- AdonisJS (Node.js): resolução completa.
- Spring (Java): resolução em andamento.

## Lista de rotas disponíveis ##

URL              | Verbo | Descrição
---------------- | ----- | -------------
/interest_points | GET   | Lista todos os pontos de interesse cadastrados no banco de dados.
/interest_points | POST  | Recebe um novo ponto de interesse através do Request Body, em formato JSON, com os seguintes atributos: name, x_coordinate e y_coordinate. Cadastra o objeto e o retorna.
/interest_points?x={x}&y={y}&max_distance={max_distance} | GET | Busca pontos de interesse baseado em uma localização `x`, `y` e uma distância máxima (`max_distance`).