# Projeto-API-Rest-CRUD


### Etapas:

1 - Criação de projeto Spring Boot do Zero ☑ 

2 - Conexão com banco de dados em memoria H2 ☑ 

3 - Adição da estrutura de API Spring Boot ☑ 

4 - Desenvolvimentos:   

 4.1 - Entidade / Entity ☑     

4.2 - Repositório / Repository ☑    

4.3 - Controle / Controller ☑    

5 - Testes das Rotas / Endpoints ☑

No estilo arquitetural REST, a manipulação dos recursos disponibilizados para o cliente é realizada através de métodos do protocolo HTTP.

Os métodos HTTP indicam os diferentes tipos de operações que o cliente pode realizar para manipular os dados através de requisições para cada contrato oferecido.

Em geral, os contratos representam as operações CRUD, porém há outros métodos HTTP que podem ser oferecidos para o cliente consumir. 

É importante considerar que os métodos HTTP precisam identificar suas rotas e ações de forma clara e entendível, vejamos os exemplos a seguir:

Maneira correta:
POST  https://meusite.com.br/items
PUT https://meusite.com.br/items
GET https://meusite.com.br/items

Maneira errada:
POST  https://meusite.com.br/items/cadastrar
PUT    https://meusite.com.br/items/atualizar
GET https://meusite.com.br/items/listar
