# Controle de Fluxos

Essa parte dos estudos é para praticar e aprofundar o conhecimentos em:

- [x] Estruturas condicionais: ```if-else, switch-case.```

- [x] Estruturas de repetição: ```for, while, do-while.```

- [x] Estruturas de exceções: ```try-catch-finally, throw.```


## Estruturas condicionais

### Simples

Para praticar foi criado o projeto simples aonde temos um caminho caso a condicional seja verdadeiro. 
Para simular uma aplicação de saque:

```mermaid
flowchart LR
    A[Caixa Eletrônico] --> I(Início):::secundaria --> B[Sacar]:::caixa
    B --> C{Saldo > 0}
    C -->|Sim| D[Atualizar Saldo]
    C -->|Não| E(Fim)
    D --> E:::secundaria
    subgraph Fluxo
        I
        B
        C
        D:::caixa
        E
        end
    
    classDef secundaria fill:#E8833A,color:#000
    classDef caixa fill:#788896,color:#000
```

### Compostas

O processo condicinal composto é quando pode acontecer duas ou mais ações diferentes dependo do resultado.

O fluxo diagrama abaixo mostra a nota dependo se é maior que 6 para o resultado ser aprovado :

```mermaid
flowchart LR
    A[Resultado Escolar] --> I 
    I --> C{Nota >= 7}
    C --> |Sim| D[Imprime Aprovado]
    C --> |Não| E[Imprime Reprovado]
    D --> F
    E --> F
    subgraph Fluxo
        I(Início):::secundaria
        C
        D:::caixa
        E:::caixa
        F(Final):::secundaria
        end
    
    classDef secundaria fill:#E8833A,color:#000
    classDef caixa fill:#788896,color:#000
```

### Encadeadas

O processo de fluxo pode conter mais de uma condicional dentro de outra.

```mermaid
flowchart LR
    RE[Resultado Escolar] --> I 
    I --> V1
    V1 --> |Sim| APROVADO --> F
    V1 --> |Não| V2 
    V2 --> |Sim| RECUPERAÇÃO --> F
    V2 --> |Não| REPROVADO --> F

    subgraph Fluxo
        I(Início):::secundaria
        V1{Nota >= 7}
        V2{Nota >= 5 e < 7> ?}
        APROVADO[Imprime Aprovado]:::caixa
        REPROVADO[Imprime Reprovado]:::caixa-vermelha
        RECUPERAÇÃO[Imprime Recuperação]:::caixa-laranga
        F(Final):::secundaria
        end
    
    classDef secundaria fill:#E8833A,color:#000
    classDef caixa fill:#788896,color:#000
    classDef caixa-vermelha fill:red
    classDef caixa-laranga fill:orange,color:#000
``` 

### Ternária

Server para reduzir o tamanho de uma condicional, quando ela dever fazer apenas uma ação exemplo trazer o resultado se o alunos está aprovado.

### Switch Case

Quando eu tenho uma variávei e posso ter varias rotas caso o tenha um valor definido com verdadeiro.
Esse modo é menos "verboso" do que o procedimento do ```if e else if```.

## Estrutura de repetição

Laços de repetição, também conhecidos como laços de iteração ou simplesmente loops, são comandos que permitem iteração de código, ou seja, que comandos presentes no bloco sejam repetidos diversas vezes.

- [Documentação de repetições](https://diegomariano.com/lacos-de-repeticao-2/)


### FOR (para)


### WHILE (enquanto)

### DO WHILE (faça enquanto)