# Facebook Poster
Java Microservice to post to Facebook

This microservice will be used as an microservice example in this event: https://www.eventbrite.com.br/e/minicurso-microservicos-do-conceito-ao-codigo-tickets-37631005350

## Usage

```shell
curl -i -XPOST -H 'X-Auth: accessToken' -H 'Content-Type: application/json' -d '{ "message":"Teste4" }' 'http://localhost:8080/users/123/posts'
```
