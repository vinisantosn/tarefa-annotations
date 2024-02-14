# Prática de Annotations em Java

Este projeto é uma tarefa para praticar conceitos de anotações em Java, especificamente a anotação `@Tabela`, que é utilizada para marcar métodos responsáveis por criar tabelas em um banco de dados.

## Contexto

Neste projeto, o pacote `edu.ebac` contém classes relacionadas à manipulação do banco de dados. A classe principal é `BancoDeDados`, que possui métodos para criar tabelas no banco de dados.

## Como Funciona

### Classe `BancoDeDados`

A classe `BancoDeDados` contém métodos relacionados à manipulação do banco de dados. Um exemplo é o método `criarTabelaAlunos`, que é anotado com `@Tabela` para indicar que é responsável por criar a tabela de alunos no banco de dados.

### Anotação `@Tabela`

A anotação `@Tabela` é uma anotação personalizada que pode ser aplicada a métodos. Ela possui um atributo `nome` que especifica o nome da tabela que o método está criando.

### Exemplo de Uso

Para criar uma tabela de alunos, basta chamar o método `criarTabelaAlunos` da classe `BancoDeDados`. Este método é anotado com `@Tabela`, indicando o nome da tabela a ser criada.

```java
BancoDeDados.criarTabelaAlunos();
```

Isso imprimirá "CRIANDO TABELA DE ALUNOS ..." no console.

