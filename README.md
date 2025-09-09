# Product Management API

Este projeto é uma API REST para gerenciamento de produtos, construída com Spring Boot e documentada com OpenAPI/Swagger.

## Requisitos

- Java 21
- Maven
- Node.js (para Husky)

## Configuração do Ambiente

1. Clone o repositório:
```bash
git clone https://github.com/josercf/FIAP-2025-MS-1S.git
cd FIAP-2025-MS-1S
```

2. Instale as dependências do Node.js (para Husky):
```bash
npm install
```

3. Compile o projeto:
```bash
./mvnw clean install
```

## Executando o Projeto

1. Inicie a aplicação:
```bash
./mvnw spring-boot:run
```

2. Acesse a documentação Swagger:
- [Swagger UI](http://localhost:8080/swagger-ui.html)
- [OpenAPI Docs](http://localhost:8080/api-docs)

## Endpoints Disponíveis

- `GET /api/products` - Lista todos os produtos
- `GET /api/products/{id}` - Obtém um produto específico
- `POST /api/products` - Cria um novo produto
- `PUT /api/products/{id}` - Atualiza um produto existente
- `PATCH /api/products/{id}` - Atualiza parcialmente um produto
- `DELETE /api/products/{id}` - Remove um produto

## Exemplo de Produto (JSON)

```json
{
  "name": "Exemplo de Produto",
  "price": 99.99,
  "description": "Descrição do produto"
}
```

## Qualidade de Código

O projeto utiliza várias ferramentas para garantir a qualidade do código:

- Checkstyle: Verifica o estilo do código
- PMD: Analisa o código em busca de possíveis problemas
- Spotless: Formata o código automaticamente
- Husky: Executa verificações antes dos commits

## Monitoramento

A aplicação inclui o Spring Boot Actuator para monitoramento:
- Health Check: http://localhost:8080/actuator/health
- Métricas: http://localhost:8080/actuator/metrics