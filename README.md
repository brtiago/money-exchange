# Money-Exchange
Uma REST API que faz conversão de moedas.

## Especifícações:

    A URL da requisição deve seguir o seguinte formato:
        http://localhost:8080/exchange/{amount}/{from}/{to}/{rate}
        http://localhost:8080/exchange/10/BRL/USD/4.50
    A resposta deve seguir o seguinte formato:

```bash
    {
      "valorConvertido": 45,
      "simboloMoeda": "$"
    }
```

## Conversões:
* De Real para Dólar;
* De Dólar para Real;
* De Real para Euro;
* De Euro para Real;

Serão executados testes para validação das conversões:


## Estrutura do Projeto
A estrutura do projeto será parecida com esta:
```bash
src
├── main
│   ├── java
│   │   └── edu
│   │       └── tiago
│   │           └── coin_exchange
│   │               └── controller
|   |                   ├── ExchangeController.java
│   │               └── CoinExchangeApplication.java
│   └── resources
│       └── application.properties
└── test
    └── java
        └── edu
            └── tiago
                └── coin_exchange
                    └── CoinExchangeApplicationTests.java
```

## Rodar o Projeto

Para rodar a aplicação, você pode usar o comando:

```bash
./mvnw spring-boot:run
```

ou, se estiver usando uma IDE como IntelliJ IDEA ou Eclipse, pode rodar a classe CurrencyConverterApplication diretamente.

## Testar a API

Com a aplicação rodando, você pode testar a API usando um navegador web, cURL, ou ferramentas como Postman.

Exemplo de requisição:

```bash
GET http://localhost:8000/exchange/10/BRL/USD/4.50
```

Resposta esperada:

json
```json
{
"valorConvertido": 45.0,
"simboloMoeda": "$"
}
```