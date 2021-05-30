## Projeto Marvel API

Este projeto é uma pequena reimplementação da api da Marvel disponível em: [Marvel Developer Portal](https://developer.marvel.com/docs).

#### Stack
- Java 11;
- Spring Boot 2.5.0;
- Maven 3.6.3.

#### Rotas implementadas:

* `/v1/public/characters`
* `/v1/public/characters/{characterId}`
* `/v1/public/characters/{characterId}/comics`
* `/v1/public/characters/{characterId}/events`
* `/v1/public/characters/{characterId}/series`
* `/v1/public/characters/{characterId}/stories`

#### Como executar
* 1º Clone este projeto em sua máquina e importe-o na sua IDE de preferência. Os dados de resposta da API estão mockados, portanto, não é necessário banco de dados ou acesso à api externa;
* 2º Importe a collection do Postman disponível na pasta PostmanCollection;
* 3º Agora basta fazer as chamadas e verificar os resultados.