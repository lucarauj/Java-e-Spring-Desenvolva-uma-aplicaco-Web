[![NPM](https://img.shields.io/npm/l/react)](https://github.com/lucarauj/Java-e-Spring-Desenvolva-uma-aplicaco-Web/blob/main/LICENSE)

<h1 align="center">Java e Spring:</h1>
<h2 align="center">Desenvolva sua primeira aplicação Web</h2>

<p align="center"><img width="200px" src="https://github.com/lucarauj/assets/blob/main/ApiJavaSpring.png" /></p>

<br>

## Abordagens:

- CRUD
- Maven
- Spring
- Thymeleaf
- JPA
- PostgreSQL

<br>

## Dependências:

- Spring Boot DevTools
- Spring Web
- Thymeleaf
- Thymeleaf Layout Dialect
- PostgreSQL Driver
- Spring Data JPA

<br>

## Layout:

### Cadastro de Filmes

<img width="800px" src="https://github.com/lucarauj/Java-e-Spring-Desenvolva-uma-aplicaco-Web/blob/main/images/cadastro%20de%20filmes.png"/>

<br>

### Lista de Filmes

<img width="800px" src="https://github.com/lucarauj/Java-e-Spring-Desenvolva-uma-aplicaco-Web/blob/main/images/lista%20de%20filmes.png"/>

<br>

## Maven:

- Padroniza a estrutura do projeto;
- Realiza o download de dependências;

<br>

## Spring x Spring Boot:

- Spring é um framework de desenvolvimento de aplicações Java que oferece suporte a uma ampla variedade de recursos e funcionalidades;
- Spring Boot é uma extensão do Spring que visa facilitar a configuração e o desenvolvimento de aplicações Spring;

<br>

## Model View Controller:

- MVC: Modelo - Visualização - Controlador
- Padrão de arquitetura de software comumente usado em projetos Java e em frameworks como o Spring. 
- Visa separar a lógica de negócios da interface do usuário, promovendo uma melhor organização e manutenção do código.

<br>

## Localização do arquivo HTML no Projeto:

- srs -> main -> resources -> templates

<br>

## Localização do arquivo CSS no Projeto:

- srs -> main -> resources -> static

<br>

## Record:

- Representa uma classe imutável, contendo apenas atributos, construtor e métodos de leitura;

<br>

## Binding | Vinculação de dados:

- Técnica em que os valores fornecidos pelos usuários em um formulário HTML são automaticamente mapeados para objetos Java no lado do servidor;

<br>

## @GeneratedValue:

- GenerationType.AUTO: estratégia padrão. A JPA escolhe a estratégia de geração mais apropriada com base no banco de dados configurado para a aplicação;
- GenerationType.IDENTITY: usada quando o banco de dados suporta colunas autoincrementais, como AUTO_INCREMENT no MySQL ou IDENTITY no SQL Server;
- GenerationType.SEQUENCE: usa uma sequência no banco de dados para gerar os valores dos identificadores. Pode ser necessário adicionar outra anotação: @SequenceGenerator(name = "nomeSequencia", sequenceName = "nome_sequencia", allocationSize = 1);
- GenerationType.TABLE: utiliza uma tabela especial de banco de dados para gerar os valores dos identificadores. A JPA cria uma tabela exclusiva no banco de dados para armazenar e gerenciar esses valores. Essa estratégia pode ser útil quando o banco de dados não suporta sequências ou identificadores automáticos, sendo necessário adicionar a seguinte anotação: @TableGenerator(name = "nomeGerador", table = "nome_tabela", pkColumnName = "chave", valueColumnName = "valor", allocationSize = 1);

<br>

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

<br>

### spring.mvc.hiddenmethod.filter:

- Intercepta as requisições e examina o corpo da requisição em busca desse parâmetro oculto, que normalmente é chamado "_method";
- Útil em uma requisição que não seja GET ou POST, que são as padrões suportadas no html ao utilizar a tag form method;

<br>

## Anotações:

- @Autowired: delega ao Spring Boot a inicialização do objeto;
- @Controller: usada para marcar classes como Spring MVC Controller;
- @DeleteMapping: usada para mapear solicitações HTTP DELETE em métodos manipuladores específicos;
- @Entity: utilizada para informar que uma classe também é uma entidade;
- @GetMapping: usada para mapear solicitações HTTP GET em métodos manipuladores específicos;
- @GeneratedValue(strategy = GenerationType.IDENTITY): informama ao provedor de persistência que os valores a serem atribuídos ao identificador único serão gerados pela coluna de auto incremento do banco de dados;
- @Id: especifica o identificador da entidade, que é usado ao carregar a entidade em um determinado contexto de persistência;
- @PostMapping: usada para mapear solicitações HTTP POST em métodos específicos de manipulador;
- @PutMapping: usada para mapear solicitações HTTP PUT em métodos manipuladores específicos;
- @RequestMapping: usada para mapear solicitações da web para classes manipuladoras específicas e métodos manipuladores;
- @Transactional: utilizada nos métodos que executam uma transação, como salvar, editar, excluir;
- @Table: usada para especificar a tabela principal da entidade atualmente anotada;

<br>

## 👨‍🎓 Aluno

#### Lucas Araujo

<a href="https://www.linkedin.com/in/lucarauj"><img alt="lucarauj | LinkdeIN" width="40px" src="https://user-images.githubusercontent.com/43545812/144035037-0f415fc7-9f96-4517-a370-ccc6e78a714b.png" /></a>
