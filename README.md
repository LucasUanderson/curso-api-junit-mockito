#Objetivo
O objetivo deste projeto é fornecer uma API REST para consulta de endereço a partir do CEP, utilizando a API ViaCEP, e também realizar o cálculo do frete para as diferentes regiões do Brasil.

##Tecnologias
Este projeto foi desenvolvido utilizando as seguintes tecnologias:

Java 11
Spring Boot
API REST Template
Documentação Swagger
Testes unitários JUnit 5
Testes automatizados utilizando Cucumber
Funcionalidades
A API REST do projeto possui as seguintes funcionalidades:

##Consulta de endereço a partir do CEP, utilizando a API ViaCEP.
Cálculo de frete fixo para diferentes regiões do Brasil, de acordo com a tabela de valores estabelecida.
Tratamento de erros caso o CEP não seja encontrado ou esteja em formato inválido.
Endpoints
A API REST do projeto possui os seguintes endpoints:

##POST /endereco: consulta o endereço a partir do CEP fornecido no corpo da requisição.
POST /frete: calcula o valor do frete para o CEP fornecido no corpo da requisição.
Documentação
A documentação da API REST pode ser acessada através da interface Swagger, disponível no endpoint /swagger-ui.html.

##Testes
O projeto conta com testes unitários utilizando o framework JUnit 5, bem como testes automatizados utilizando o framework Cucumber.

##Conclusão
O projeto "Consulta Frete API" foi desenvolvido utilizando tecnologias modernas e boas práticas de desenvolvimento de software. A API REST é simples e objetiva, fornecendo as funcionalidades de consulta de endereço e cálculo de frete de forma eficiente e confiável. Além disso, a documentação Swagger e os testes automatizados garantem a qualidade e a facilidade de uso da API.
