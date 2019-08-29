# XY Inc | Pontos de Interesse (POIs) #

A XY Inc. é uma empresa especializada na produção de excelentes receptores GPS (Global
Positioning System). A diretoria está empenhada em lançar um dispositivo inovador que
promete auxiliar pessoas na localização de ponto de interesse (POIs), e precisa muito de sua
ajuda.
Você foi contratado para desenvolver a plataforma que fornecerá toda a inteligência ao
dispositivo. Esta plataforma deve ser baseada em serviços, de forma a flexibilizar a integração.

#### API REST ####

A API REST do servidor expõe o seguinte serviço:

#### Pontos de Interesse ####

URL              | Verbo | Descrição
---------------- | ----- | -------------
/interest_points | GET   | Lista todos os pontos de interesse cadastrados no banco de dados.
/interest_points | POST  | Cadastra um novo ponto de interesse.
/interest_points?x={x}&y={y}&max_distance={max_distance} | GET | Busca pontos de interesse baseado em uma localização `x`, `y` e uma distância máxima (`max_distance`).