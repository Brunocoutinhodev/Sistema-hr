# 🏢 Sistema HR - Gestão de Ponto para Freelancers

Uma API RESTful desenvolvida em Java com Spring Boot para gerenciar o registro de ponto e calcular automaticamente as horas trabalhadas de freelancers.

## 🚀 Funcionalidades

* **Registro de Batidas:** Gravação de horários de `ENTRADA` e `SAIDA`.
* **Cálculo de Horas (Motor Inteligente):** Rota dedicada para calcular o tempo exato trabalhado em um dia específico, com validação de pontos incompletos.
* **Gestão de Freelancers:** Listagem e filtragem de pontos por freelancer.
* **Operações CRUD:** Criação, leitura, atualização e exclusão de registros de ponto.

## 🛠️ Tecnologias Utilizadas

* **Linguagem:** Java
* **Framework:** Spring Boot
* **Documentação da API:** Swagger (Springdoc OpenAPI)
* **Manipulação de Tempo:** Java `java.time` (LocalDateTime, Duration)

## 📖 Documentação (Swagger)

Com a aplicação rodando, você pode testar todas as rotas da API diretamente pelo navegador acessando o Swagger UI:
> `http://localhost:8080/swagger-ui/index.html`
*(Nota: a porta pode variar conforme a configuração do seu servidor)*
