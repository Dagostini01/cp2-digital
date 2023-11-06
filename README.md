# Nome do Projeto

Cp2Digital - Sistema de Gerenciamento de Tarefas

## Descrição

O Cp2Digital é um sistema de gerenciamento de tarefas desenvolvido em Spring Boot, proporcionando uma plataforma eficiente para criação, atualização e listagem de tarefas. Além disso, possui autenticação de usuários e controle de acesso.

## Pré-requisitos

Certifique-se de ter instalado:

- Java 11 ou superior
- Gradle
- Banco de dados (por padrão, utiliza-se o H2 em memória)

## Instalação

1. Clone o repositório: `git clone https://github.com/Dagostini01/cp2-digital.git`
2. Navegue até o diretório do projeto: `cd cp2-digital`
3. Execute o aplicativo: `mvn spring-boot:run`

## Configuração

- O projeto utiliza o H2 Database por padrão. Para alterar as configurações do banco de dados, edite o arquivo `application.properties`.

## Uso

- Acesse o sistema em [http://localhost:9090](http://localhost:9090)
- Utilize as APIs de autenticação (`signup` e `signin`) para criar e autenticar usuários.
- Utilize a API `/task` para gerenciar tarefas (criar, listar, atualizar).

## Contribuição

Sinta-se à vontade para contribuir! Abra problemas, envie solicitações de pull e ajude-nos a melhorar este projeto.

## Contato

Para dúvidas ou mais informações, entre em contato através do email: pedro01dagostini@gmail.com
