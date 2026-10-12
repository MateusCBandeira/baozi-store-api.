# Baozi Store - API REST

API REST simples para controle de clientes, produtos e pedidos de uma loja de pãozinho chinês.

**Tecnologias:** Java 17, Spring Boot 3, Spring Data JPA, H2 (padrão) ou MySQL, Postman.

## Como executar
1. Instale o JDK 17 ou superior.
2. Abra a pasta no IntelliJ IDEA (File > Open > pom.xml > Open as Project) e rode a classe `StoreApplication`.
   Ou, com Maven instalado: `mvn spring-boot:run`
3. A API sobe em `http://localhost:8080`.

### Usando MySQL (opcional)
1. Crie o banco: `CREATE DATABASE baozi_store;`
2. Ajuste usuário e senha em `src/main/resources/application-mysql.properties`.
3. Rode com o perfil mysql: `mvn spring-boot:run -Dspring-boot.run.profiles=mysql`
   (no IntelliJ: Run > Edit Configurations > Active profiles: `mysql`).

## Estrutura
- `model` - entidades JPA (Cliente, Produto, Pedido)
- `repository` - interfaces Spring Data JPA
- `controller` - endpoints REST
- `dto` - objeto de entrada do pedido

## Endpoints
| Método | Rota | Descrição |
|---|---|---|
| POST | /clientes, /produtos, /pedidos | Criar |
| GET | /clientes, /produtos, /pedidos | Listar todos |
| GET | /clientes/{id}, /produtos/{id}, /pedidos/{id} | Consultar por ID |
| DELETE | /clientes/{id}, /produtos/{id}, /pedidos/{id} | Apagar |
| PUT | /clientes/{id}, /produtos/{id} | Atualizar (opcional) |

Body do pedido: `{"clienteId": 1, "produtoId": 1, "quantidade": 3}`

A pasta `docs/` contém a coleção do Postman e o diagrama de caso de uso (PlantUML).
