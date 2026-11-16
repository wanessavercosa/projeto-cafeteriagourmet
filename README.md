# Chouchou Gourmet

Projeto acadêmico de uma cafeteria temática inspirada em café, anime e mangá. O sistema reúne uma vitrine de produtos e uma API para operações de clientes, catálogo e pedidos. A finalização da compra é demonstrativa: não há cobrança real.

## Funcionalidades

- Consulta, busca e filtragem de produtos por categoria.
- Carrinho, favoritos e aplicação de cupom na interface.
- Cadastro e login de clientes.
- Cadastro de endereço e simulação de finalização de pedido.
- API REST para produtos, categorias, clientes, endereços, kits, carrinhos e pedidos.

O carrinho, os favoritos e outros dados da experiência demonstrativa são armazenados no localStorage do navegador. A interface também consulta a API para carregar produtos e realizar operações do sistema.

## Tecnologias e ferramentas

- *Backend:* Java, Spring Boot, Spring Web, Spring Data JPA, Hibernate, Spring Security, Jakarta Validation e Lombok.
- *Banco de dados:* MySQL, com conexão via MySQL Connector/J.
- *Frontend:* HTML, CSS e JavaScript sem framework.
- *Persistência no navegador:* localStorage.
- *IDE:* IntelliJ IDEA.
- *Fontes da interface:* DM Sans e Playfair Display, carregadas do Google Fonts.

A configuração do IntelliJ incluída no repositório aponta para o JDK 25. As versões das dependências do backend não estão especificadas em um manifesto de build.

## Estrutura do projeto

- controller/: endpoints REST.
- service/: regras de negócio.
- repository/: acesso a dados.
- model/entity/: entidades persistidas.
- model/enums/: enumerações de domínio.
- dto/: objetos de entrada e saída da API.
- config/: configurações de segurança e codificação de senhas.
- exception/: tratamento global de erros.
- index.html, style.css e app.js: interface web.
- application.yml: configuração da aplicação e do banco de dados.

## Requisitos para desenvolvimento

- JDK 25, conforme a configuração do projeto no IntelliJ.
- MySQL.
- IntelliJ IDEA ou outra IDE compatível com Java.
- Navegador moderno.

## Configuração do banco de dados

A aplicação espera um banco chamado chouchou_gourmet. Crie-o no MySQL:

```sql
CREATE DATABASE chouchou_gourmet;
