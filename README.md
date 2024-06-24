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