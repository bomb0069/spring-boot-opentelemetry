# Observability

## How to Run

```
docker-compose up -d
```

## API

- Product Service - Success Case
  - [Product 1](http://localhost:8080/product/1)
  - [Product 2](http://localhost:8080/product/2)
  - [Product 3](http://localhost:8080/product/3)
- Product Service - Failed Case
  - [Product 4 - 7 Price Not Found](http://localhost:8080/product/4)
- [Price Service](http://localhost:8081/price/1)
- [Message Service](http://localhost:5000/message/send)

## Tracing by jaeger

[Jaeger URL](http://localhost:16686)
