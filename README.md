 estudos-java
Exercícios de fixação do curso Java COMPLETO (Udemy - Nelio Alves)

 Conteúdo
- Estruturas condicionais e repetitivas
- Programação Orientada a Objetos (construtores, encapsulamento, herança)
- Arrays e Listas
- Manipulação de datas em Java



  Estudos Java

Repositório com exercícios do curso "Java COMPLETO: Programação Orientada a Objetos + Projetos" (Udemy - Nelio Alves). Aqui tô guardando todos os exercícios de fixação que resolvo conforme avanço no curso.



 Seção 4 - Estrutura Sequencial

 CalculoRectangulo.java

Exercício simples que lê as dimensões de um retângulo e calcula área, perímetro e diagonal. Pratiquei variáveis, operadores aritméticos básicos e formatação de saída com printf.



 Seção 5 - Estrutura Condicional

 ComparadorNumeros.java

Lê três números e identifica qual é o maior usando if-else. Nada muito complexo, mas foi bom praticar a lógica de comparação e operadores lógicos.



 Seção 6 - Estruturas Repetitivas

 SomaNumeros.java

Pede quantos números o usuário quer somar, depois lê cada um em um laço for e calcula a soma total e a média. Pratiquei for loop e acumuladores aqui.



 Seção 7 - Outros Tópicos Básicos

 OperacoesString.java

Trabalha com métodos de String: comprimento, maiúsculas, minúsculas, busca de caractere e extração de substring. Útil pra pegar a mão com a classe String mesmo.



 Seção 8 - Introdução à POO

 ContaBancaria.java

Primeira classe que fiz com responsabilidade real. Tem atributos privados (number, holder, balance, withdrawLimit) e métodos de saque/depósito com validações. Trata exceções quando o saque é inválido.

 Produto.java

Gerencia um produto com estoque. Permite adicionar e remover quantidade, mas valida pra não deixar remover mais do que tem. Pratiquei encapsulamento e métodos simples mas úteis.



  Seção 9 - Construtores e Encapsulamento

  Pessoa.java

Cria uma pessoa com nome, data de nascimento e CPF. O legal aqui é que tem dois construtores (um completo e outro que deixa o CPF padrão) e um método getAge() que calcula a idade automaticamente usando LocalDate.



  Seção 10 - Arrays e Listas

  GerenciadorNotas.java

Usa ArrayList pra guardar notas de um aluno e calcula média, maior nota, menor nota e se foi aprovado ou não. Pratiquei forEach loop e ArrayList.



  Seção 11 - Tópicos Especiais: Data-Hora

  CalculadoraIdade.java

Lê a data de nascimento e calcula a idade em anos, meses e dias usando Period. Mostra também a data e hora atual. Foi útil pra aprender LocalDate e formatação de datas.



   Executar

Cada arquivo tem um método main, então é só compilar e rodar:


  Seção 12 - Pastas e Arquivos



# 📦 Product Summary Generator

Programa em Java que lê um arquivo `.csv` contendo uma lista de produtos (nome, preço e quantidade), calcula o valor total de cada item e gera um novo arquivo `.csv` com o resumo.

## 🧠 Como funciona

1. O usuário informa o caminho do arquivo CSV de entrada.
2. O programa lê o arquivo linha por linha, separando os campos por vírgula.
3. Cada linha é convertida em um objeto da classe `Product`.
4. É criada automaticamente uma pasta `out` na mesma pasta do arquivo de entrada.
5. Um novo arquivo `summary.csv` é gerado dentro dessa pasta, contendo o nome de cada produto e seu valor total (`preço x quantidade`).

## 📄 Formato esperado do CSV de entrada

```
Notebook,3500.00,2
Mouse,89.90,5
Teclado,150.00,3
```

## 📤 Exemplo de saída (summary.csv)

```
Notebook,7000.00
Mouse,449.50
Teclado,450.00
```

## 🛠️ Tecnologias e conceitos aplicados

- Leitura e escrita de arquivos (`BufferedReader`, `BufferedWriter`)
- Tratamento de exceções (`try-with-resources`, `IOException`)
- Manipulação de Strings e conversão de tipos (`split`, `parseDouble`, `parseInt`)
- Orientação a Objetos (classe `Product` em pacote separado)
- Formatação de números com `Locale` e `String.format`

## 📁 Estrutura

```
src/
├── application/
│   └── Program.java
└── entities/
    └── Product.java
```

## ▶️ Como executar

1. Clone o repositório
2. Compile e execute a classe `Program`
3. Informe o caminho completo do arquivo CSV quando solicitado

---

> 💡 Este projeto foi desenvolvido durante meus estudos de Java (curso de Nélio Alves, Udemy). A documentação deste README foi organizada com apoio de IA, mas o código e o aprendizado por trás dele são meus.