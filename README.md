#API Spec


## Create com.example.demoKot.entity.Product

Request :
- Method : POST
- Endpoint : 'api/v1/products'
- Header :
    - Content-Type: application/json
    - Accept: application/json
- Body :

```json
{
  "id": "long, unique",
  "name": "string",
  "price": "long",
  "quantity": "integer"
}
```

Response:

```json
{
  "code" : "number",
  "status": "string",
  "data": {
    "id": "long, unique",
    "name": "string",
    "price": "long",
    "quantity": "integer"
  }
}
```
##Get com.example.demoKot.entity.Product

Request :
- Method : GET
- Endpoint : 'api/v1/products/{id_product}'
- Header:
    - Accept: application/json
- Body :

Response:

```json
{
  "code" : "number",
  "status": "string",
  "data": {
    "id": "long, unique",
    "name": "string",
    "price": "long",
    "quantity": "integer"
  }
}
```

##Update com.example.demoKot.entity.Product
- Method : PUT
- Endpoint: 'api/v1/products/{id_product}'
- Header:
    - Content-Type: application/json
    - Accept: application/json
- Body :

```json
{
  "name": "string",
  "price": "long",
  "quantity": "integer"
}
```
Response:

```json
{
  "code" : "number",
  "status": "string",
  "data": {
    "id": "long, unique",
    "name": "string",
    "price": "long",
    "quantity": "integer"
  }
}
```

## List com.example.demoKot.entity.Product
- Method : GET
- Endpoint : `api/v1/products`
- Header :
    - Accept: application/json
- Query Param :
    - size : number,
    - page : number

Response:

```json
{
  "code" : "number",
  "status": "string",
  "data" : [
    {
      "id": "long, unique",
      "name": "string",
      "price": "long",
      "quantity": "integer"
    },
    {
      "id": "long, unique",
      "name": "string",
      "price": "long",
      "quantity": "integer"
    }
  ]
}
```

## Delete com.example.demoKot.entity.Product
- Method : DELETE
- Endpoint: `api/v1/products/{id_product}`
- Header:
    - Accept: application/json

Response:

```json
{
  "code" : "number",
  "status": "string"
}
```# Kotlin-SpringFrameWork-Api
