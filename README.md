---

# Lady Power

## Documentação de Requisitos

### Versão 1.0

#### Interessados

| NOME              | FUNÇÃO            |
|-------------------|-------------------|
| Gabrielly Santos | Gerente de Projetos |
| João Victor Castro | Tech Leader |
| Gleybson Rodrigues | Analista de Requisitos |

---

### Histórico de Versão

| Data       | Versão | Descrição           | Autor            |
|------------|--------|---------------------|------------------|
| 29/04/2024 | 1.0    | Emissão Inicial     | João Victor Castro |

---

## 1. Introdução

O LadyPower é um movimento de empoderamento feminino que visa combater a violência doméstica e apoiar mulheres em situação de vulnerabilidade. Este documento descreve os requisitos para o desenvolvimento do sistema citado, que oferecerá recursos para inspirar, conectar e apoiar mulheres em todas as áreas da vida.

## 2. Objetivo do Sistema

O objetivo do sistema LadyPower é fornecer um espaço seguro e sigiloso onde mulheres podem acessar os seguintes recursos:

- Canal de denúncias anônimas para casos de violência doméstica.
- Apoio e orientação por meio de conversas com especialistas em violência doméstica.
- Compartilhamento de experiências, onde mulheres podem compartilhar seus depoimentos e se inspirar com histórias de superação.

## 3. Funcionalidades do Sistema

### 3.1 Canal de Denúncias Anônimas

- Permitir que as usuárias registrem denúncias anônimas de violência doméstica.
- Garantir que apenas as autoridades competentes tenham acesso às informações fornecidas nas denúncias.
- Garantir a segurança e privacidade das informações das usuárias durante o processo de denúncia.

### 3.2 Apoio e Orientação

- Fornecer um sistema de chat ou mensagens para que as usuárias possam conversar com especialistas em violência doméstica.
- Garantir a confidencialidade das conversas entre as usuárias e os especialistas.
- Oferecer informações e recursos relevantes para ajudar as usuárias a lidar com sua situação.

### 3.3 Compartilhamento de Experiências

- Permitir que as usuárias compartilhem seus depoimentos e experiências de superação.
- Criar um ambiente seguro e solidário onde as usuárias possam se inspirar e se apoiar mutuamente.
- Moderar as interações para garantir um ambiente livre de discurso de ódio e violência.

## 4. Requisitos Não Funcionais

### 4.1 Segurança

- O sistema deve garantir a segurança das informações das usuárias, utilizando medidas de criptografia e controle de acesso adequadas.

### 4.2 Usabilidade

- O sistema deve ser fácil de usar, especialmente para mulheres em situações de estresse ou emergência.
- Deve ser acessível em diferentes dispositivos, como computadores, smartphones e tablets.

### 4.3 Conformidade Legal

- O sistema deve estar em conformidade com as leis de proteção de dados e privacidade, garantindo que as informações das usuárias sejam tratadas de acordo com as regulamentações vigentes.

## 5. Stakeholders

- Usuárias: Mulheres em situação de violência doméstica ou vulnerabilidade.
- Especialistas em Violência Doméstica: Profissionais qualificados para fornecer apoio e orientação.
- Desenvolvedores: Equipe responsável pelo desenvolvimento e manutenção do sistema.
- Autoridades Competentes: Instituições responsáveis por lidar com denúncias de violência doméstica.

## 6. Considerações Finais

O sistema LadyPower é mais do que um site; é uma ferramenta vital para apoiar e empoderar mulheres em situações difíceis. Portanto, é crucial que todos os requisitos sejam implementados com cuidado e que a segurança e privacidade das usuárias sejam priorizadas em todas as etapas do desenvolvimento.

---

Este documento de requisitos fornece uma visão geral dos recursos e funcionalidades necessários para o sistema LadyPower. Detalhes adicionais podem ser adicionados conforme necessário durante o processo de desenvolvimento.

## 7. Atualização / Expansão

O Lady Power idealiza um futuro onde todas as mulheres se sintam empoderadas, seguras e realizadas. Um futuro onde a igualdade de gênero seja uma realidade e a violência contra a mulher seja erradicada. Para alcançar essa visão, o Lady Power se dedica a:

- *Expandir seu alcance e impacto*: Através de campanhas de conscientização e parcerias estratégicas, o Lady Power busca alcançar mais mulheres em todo o Brasil, especialmente em comunidades carentes e vulneráveis.
- *Tornar-se referência em empoderamento feminino*: O Lady Power almeja se tornar a principal referência em empoderamento feminino no Brasil, reconhecido por sua atuação ética, transparente e eficaz.
- *Desenvolver soluções inovadoras*: O Lady Power investe continuamente em novas tecnologias e ferramentas para oferecer suporte ainda mais completo e personalizado às mulheres.

## Tecnologias

- *Banco de dados*: MySQL
- *Back-end*: IntelliJ IDE - Java / Spring boot
- *Front-end*: VsCode - Figma - Gimp - HTML / CSS
- *Metodologia Ágil*: Jira / Kanban

## Modelo UML do Caso de Uso

### Diagrama de Caso de Uso

#### Atores:
- Usuário Anônimo
- Usuário Autenticado (Feminino)
- Autenticador GOV.BR

#### Casos de Uso:
- Navegar pela Loja de Roupas
- Visualizar Relatos Anônimos
- Criar Relato Anônimo
- Atualizar Relato Anônimo
- Excluir Relato Anônimo
- Autenticar (usando GOV.BR)
- Desconectar

#### Descrições dos Casos de Uso:

*Usuário Anônimo:*
- Navegar pela Loja de Roupas
  - Exibir uma variedade de roupas e acessórios para compra
  - Permitir que os usuários naveguem e adicionem itens ao carrinho
  - Permitir que os usuários finalizem e processem pagamentos de forma segura
- Visualizar Relatos Anônimos
  - Exibir uma lista de relatos anônimos feitos por usu

ários
  - Permitir que os usuários filtrem e ordenem relatos por categoria ou data
  - Exibir detalhes do relato sem revelar a identidade do usuário
- Criar Relato Anônimo
  - Fornecer um formulário para que os usuários enviem relatos anônimos
  - Coletar informações relevantes, como localização, hora e descrição do incidente
  - Fornecer uma opção para enviar fotos ou outras evidências
- Atualizar Relato Anônimo
  - Permitir que os usuários editem seus relatos anônimos anteriormente enviados
  - Seguir o mesmo processo que Criar Relato Anônimo
- Excluir Relato Anônimo
  - Permitir que os usuários excluam seus relatos anônimos anteriormente enviados
  - Exibir um aviso sobre as consequências da exclusão de um relato

*Usuário Autenticado (Feminino):*
- Autenticar (usando GOV.BR)
  - Permitir que os usuários façam login usando suas credenciais GOV.BR
  - Verificar a identidade e o sexo do usuário com o autenticador GOV.BR
  - Redirecionar o usuário para a página inicial autenticada
- Desconectar
  - Permitir que os usuários desconectem de suas contas
  - Limpar a sessão do usuário e as credenciais

## Modelo UML do Diagrama de Classes

### Diagrama de Classes

#### Classes:
- Roupas
- Loja de Roupas
- Carrinho de Compras
- Relato Anônimo
- Categoria de Relato
- Evidência de Relato
- Usuário
- Autenticação de Usuário (usando GOV.BR)

#### Atributos:
- Roupas:
  - id (Inteiro)
  - nome (String)
  - descrição (String)
  - preço (Double)
  - imageUrl (String)
- Loja de Roupas:
  - id (Inteiro)
  - nome (String)
  - endereço (String)
  - telefone (String)
  - listaDeRoupas (List<Roupas>)
- Carrinho de Compras:
  - id (Inteiro)
  - usuário (Usuário)
  - listaDeRoupas (List<Roupas>)
  - totalDeCusto (Double)
- Relato Anônimo:
  - id (Inteiro)
  - usuário (Usuário)
  - categoria (Categoria de Relato)
  - descrição (String)
  - localização (String)
  - data (Data)
  - evidência (List<Evidência de Relato>)
- Categoria de Relato:
  - id (Inteiro)
  - nome (String)
- Evidência de Relato:
  - id (Inteiro)
  - arquivoUrl (String)
  - relato (Relato Anônimo)
- Usuário:
  - id (Inteiro)
  - nome de usuário (String)
  - email (String)
  - senha (String)
  - autenticação (Autenticação de Usuário)
- Autenticação de Usuário (usando GOV.BR):
  - id (Inteiro)
  - usuário (Usuário)
  - chaveAutenticadora (String)
  - sexo (String)

#### Associações:
- Loja de Roupas <-> Roupas (um-para-muitos)
- Usuário <-> Carrinho de Compras (um-para-um)
- Usuário <-> Relato Anônimo (um-para-muitos)
- Relato Anônimo <-> Categoria de Relato (um-para-um)
- Relato Anônimo <-> Evidência de Relato (um-para-muitos)
- Usuário <-> Autenticação de Usuário (um-para-um)
- Autenticador GOV.BR <–> Autenticação de Usuário (um-para-um)
- Autenticação de Usuário <-> Categoria de Relato (um-para-um)

#### Agregações:
- Loja de Roupas <-> Carrinho de Compras (muitos-para-muitos)
- Usuário <–> Relato Anônimo (muitos-para-muitos)

#### Herança:
- Não há herança neste exemplo.

---
