# Controle de Fluxos

Essa parte dos estudos é para praticar e aprofundar o conhecimentos em:

- [ ] Estruturas condicionais: ```if-else, switch-case.```

- [ ] Estruturas de repetição: ```for, while, do-while.```

- [ ] Estruturas de exceções: ```try-catch-finally, throw.```


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



