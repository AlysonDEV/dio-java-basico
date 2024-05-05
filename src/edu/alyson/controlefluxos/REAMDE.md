# Controle de Fluxos

Essa parte dos estudos é para praticar e aprofundar o conhecimentos em:

- [ ] Estruturas condicionais: ```if-else, switch-case.```

- [ ] Estruturas de repetição: ```for, while, do-while.```

- [ ] Estruturas de exceções: ```try-catch-finally, throw.```


## Estruturas condicionais

Para praticar foi criado o projeto simples para simular uma aplicação de saque:

```mermaid
flowchart LR
    A[Caixa Eletrônico] --> I(Início):::secundaria --> B[Sacar]:::caixa
    B --> C{Saldo}
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

