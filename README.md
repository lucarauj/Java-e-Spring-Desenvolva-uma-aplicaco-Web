Java e Spring: desenvolva sua primeira aplicação Web

- CRUD
- Maven
- Spring
- Thymeleaf
- JPA
- MySQL 👉 PostgreSQL

## Dependências:

- Spring Boot DevTools
- Spring Web
- Thymeleaf
- Thymeleaf Layout Dialect
- PostgreSQL Driver
- Spring Data JPA

## Maven:

- Padroniza a estrutura do projeto;
- Realiza o download de dependências;

## Spring x Spring Boot:

- Spring é um framework de desenvolvimento de aplicações Java que oferece suporte a uma ampla variedade de recursos e funcionalidades;
- Spring Boot é uma extensão do Spring que visa facilitar a configuração e o desenvolvimento de aplicações Spring;

## Model View Controller:

- MVC: Modelo - Visualização - Controlador
- Padrão de arquitetura de software comumente usado em projetos Java e em frameworks como o Spring. 
- Visa separar a lógica de negócios da interface do usuário, promovendo uma melhor organização e manutenção do código.

## Localização do arquivo HTML no Projeto:

- srs -> main -> resources -> templates

## Localização do arquivo CSS no Projeto:

- srs -> main -> resources -> static  

## Record:

- Representa uma classe imutável, contendo apenas atributos, construtor e métodos de leitura;

## Binding | Vinculação de dados:

- Técnica em que os valores fornecidos pelos usuários em um formulário HTML são automaticamente mapeados para objetos Java no lado do servidor;

## @GeneratedValue:

- GenerationType.AUTO: estratégia padrão. A JPA escolhe a estratégia de geração mais apropriada com base no banco de dados configurado para a aplicação;
- GenerationType.IDENTITY: usada quando o banco de dados suporta colunas autoincrementais, como AUTO_INCREMENT no MySQL ou IDENTITY no SQL Server;
- GenerationType.SEQUENCE: usa uma sequência no banco de dados para gerar os valores dos identificadores. Pode ser necessário adicionar outra anotação: @SequenceGenerator(name = "nomeSequencia", sequenceName = "nome_sequencia", allocationSize = 1);
- GenerationType.TABLE: utiliza uma tabela especial de banco de dados para gerar os valores dos identificadores. A JPA cria uma tabela exclusiva no banco de dados para armazenar e gerenciar esses valores. Essa estratégia pode ser útil quando o banco de dados não suporta sequências ou identificadores automáticos, sendo necessário adicionar a seguinte anotação: @TableGenerator(name = "nomeGerador", table = "nome_tabela", pkColumnName = "chave", valueColumnName = "valor", allocationSize = 1);

## Criando uma tabela:

```
create table filmes(
  id bigserial primary key,
  nome varchar(100) not null,
  duracao_em_minutos integer not null,
  ano_lancamento integer not null,
  genero varchar(100)
);
```

### spring.mvc.hiddenmethod.filter:

- Intercepta as requisições e examina o corpo da requisição em busca desse parâmetro oculto, que normalmente é chamado "_method";
- Útil em uma requisição que não seja GET ou POST, que são as padrões suportadas no html ao utilizar a tag form method;





## Anotações:

- @Controller
- @RequestMapping
- @GetMapping
- @PostMapping
- @Entity
- @Table
- @Id
- @GeneratedValue(strategy = GenerationType.IDENTITY)
- @Autowired
- @DeleteMapping


- @Service
- @RequestParam
- @PathVariable

- @PutMapping
- @Service

