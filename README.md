# Sistema de Controle de Estoque

# API REST em Java com Spring Boot, persistência em SQLite através do Hibernate (Unidade 2).

## 1. Identificação
* **Nome do projeto:** Sistema de Controle de Estoque
* **Participantes:** Artur Barreto, Guilherme Luiz, Jose Lucas, Isadora Maria, Bruno Serpa, Jesiane Vitoria, Vitoria Gabriele.
* **Instituição:** Universidade Tiradentes (UNIT)
* **Turma:** GP0159MAT03B / TURMA ADS 3° PERIODO
* **Disciplina:** DESENVOLVIMENTO BACK-END
* **Avaliação:** Projeto de Avaliação da Unidade 2 (API REST, SQLite e Hibernate)

---
 
## 2. Descrição
 
* **O problema:** empresas têm dificuldade de acompanhar a entrada, a saída e o saldo atual dos seus produtos, o que gera inconsistências, perdas ou falta de mercadoria.
* **Quem utiliza:** administradores, gerentes de estoque e funcionários responsáveis pelo controle de inventário.
* **Objetivo:** 

---
 
## 3. Funcionalidades
 
* **Categorias:** cadastrar, listar, buscar por id e **remover**.
* **Produtos:** cadastrar (vinculado a uma categoria), listar, buscar por id, **remover** e listar produtos com estoque baixo.
* **Movimentações (operação de fluxo):** registrar entrada, registrar saída e listar.
* **Remoção protegida:** categoria com produtos e produto com movimentações não podem ser removidos (ver regras).
* **Respostas coerentes:** `201` ao criar, `204` ao remover, `404` para id inexistente, `400` para dado inválido e `409` quando uma regra de negócio impede a operação. O corpo do erro é um JSON no formato `{"erro": "mensagem"}`.
* **Interface web de demonstração:** página `index.html` servida pela própria aplicação, com botões de remover (não faz parte dos requisitos, apenas facilita testar).

## xx. Participação dos Integrantes

| Integrante             |                Contribuições |
| ---------------------- | ---------------------------- |
| **Isadora Maria**      |      |
| **Guilherme Luiz**     |      |
| **Jose Lucas**         |      |
| **Bruno Serpa**        |      |
| **Vitoria Gabriele**   |      |
| **Jesiane Vitoria**    |      |
| **Artur Barreto**      |      |
