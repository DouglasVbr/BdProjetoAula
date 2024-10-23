# BdProjetoAula


# BdProjetoAula

# alterações no banco 
![image](https://github.com/user-attachments/assets/df7363c2-fa4d-4a64-8714-005a70f8a839)
![image](https://github.com/user-attachments/assets/47760d91-a029-4156-a472-99834a51ac17)
# Projeto Final


## Participantes 

 [<img src="https://avatars.githubusercontent.com/u/130025057?s=400&u=f96f391fe5b875750f59ae9e4f601eaed19b9a33&v=4" width="75px"/>](https://github.com/DouglasVbr ) 

 [Douglas Vieira](https://github.com/DouglasVbr)

 

 ## Índice
- [Projeto Final](#1-Projeto-Final)
- [Participantes](#2-Participantes)
- [Índice](#3-índice)
- [Descrição-do-Projeto](#4-Descrição-do-Projeto)
- [Badges](#5-Badges)
- [Tecnologias Utilizadas](#6-tecnologias-utilizadas)
- [IDEs/Editores Utilizados](#7-ideseditores-utilizados)
- [Instruções de Configuração e Execução](#8-instruções-de-configuração-e-execução)
- [Funcionalidades Implementadas](#9-funcionalidades-implementadas)
- [Como Contribuir para o Projeto](#10-como-contribuir-para-o-projeto)
- [Tabelas](#11-tabelas)
- [Tabela com a Tag HTML](#12-tabela-com-a-tag-html)
- [Contatos](#13-contatos)



 ## Descrição do Projeto 
Este trabalho final consiste no desenvolvimento de um Sistema de Gerenciamento de Usuários e Clientes utilizando a linguagem Java, com uma interface gráfica e banco de dados local MySQL , acessado via JDBC . O projeto visa atender às necessidades de um sistema administrativo simples, integrando funcionalidades de cadastro e gerenciamento de usuários, clientes e compromissos em uma agenda.

Objetivos:
Criar um sistema que permita operações CRUD (Criar, Ler, Atualizar, Excluir) para usuários e clientes.
Implemente uma agenda que possibilite o registro e visualização de compromissos.
Utilização do Swing ou JavaFX para desenvolver interfaces gráficas.
Integrar o sistema com um banco de dados MySQL para persistência de dados.
Funcionalidades do Sistema:
Tela de Login para autenticação de usuários, com validação de credenciais.
Tela Principal que oferece acesso a funcionalidades de cadastro de usuários, clientes e compromissos.
Cadastro de Usuários com controle de duplicidade e segurança de senhas.
Cadastro de Clientes , permitindo o registro detalhado com informações de contato e CPF/CNPJ.
Agenda de Compromissos , associando eventos aos clientes cadastrados, com visualização por dia, semana ou mês.
Tecnologias Utilizadas:
Java (Swing/JavaFX para interface gráfica)
MySQL (com gerenciamento via MySQL Workbench)
JDBC para comunicação entre Java e MySQL
O projeto segue uma arquitetura bem organizada, com separação de responsabilidades entre interface gráfica , lógica de negócios e persistência de dados . Todos os scripts SQL necessários para a criação e a população inicial do banco de dados serão fornecidos, juntamente com as instruções fornecidas no repositório do projeto no GitHub.

# Badges

![Java](https://img.shields.io/badge/Java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white)
![MySQL](https://img.shields.io/badge/MySQL-%2300f.svg?style=for-the-badge&logo=mysql&logoColor=white)
![JDBC](https://img.shields.io/badge/JDBC-%23F37626.svg?style=for-the-badge&logo=java&logoColor=white)
![Swing](https://img.shields.io/badge/Swing-Java%20GUI%20Framework-orange?style=for-the-badge)
![JavaFX](https://img.shields.io/badge/JavaFX-Frontend-blue?style=for-the-badge)
![GitHub](https://img.shields.io/badge/GitHub-%23121011.svg?style=for-the-badge&logo=github&logoColor=white)
![MySQL Workbench](https://img.shields.io/badge/MySQLWorkbench-%23007ACC.svg?style=for-the-badge&logo=mysql&logoColor=white)
![Visual Studio Code](https://img.shields.io/badge/Visual%20Studio%20Code-0078d7.svg?style=for-the-badge&logo=visual-studio-code&logoColor=white)



 ## Tecnologias Utilizadas
 
![Java](https://img.shields.io/badge/Java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white)
![MySQL](https://img.shields.io/badge/MySQL-%2300f.svg?style=for-the-badge&logo=mysql&logoColor=white)
![JDBC](https://img.shields.io/badge/JDBC-%23F37626.svg?style=for-the-badge&logo=java&logoColor=white)
![Swing](https://img.shields.io/badge/Swing-Java%20GUI%20Framework-orange?style=for-the-badge)
![JavaFX](https://img.shields.io/badge/JavaFX-Frontend-blue?style=for-the-badge)
![GitHub](https://img.shields.io/badge/GitHub-%23121011.svg?style=for-the-badge&logo=github&logoColor=white)
![MySQL Workbench](https://img.shields.io/badge/MySQLWorkbench-%23007ACC.svg?style=for-the-badge&logo=mysql&logoColor=white)
![Visual Studio Code](https://img.shields.io/badge/Visual%20Studio%20Code-0078d7.svg?style=for-the-badge&logo=visual-studio-code&logoColor=white)

## IDEs/Editores Utilizados

![Visual Studio Code](https://img.shields.io/badge/Visual%20Studio%20Code-0078d7.svg?style=for-the-badge&logo=visual-studio-code&logoColor=white)
![IntelliJ IDEA](https://img.shields.io/badge/IntelliJ%20IDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white)
![Eclipse IDE](https://img.shields.io/badge/Eclipse-2C2255.svg?style=for-the-badge&logo=eclipse&logoColor=white)
![NetBeans](https://img.shields.io/badge/NetBeans-1B6AC6.svg?style=for-the-badge&logo=apache-netbeans-ide&logoColor=white)


 ## Instruções de Configuração e Execução

Para configurar e executar o projeto localmente, siga os passos abaixo:

### 1. Pré-requisitos

Certifique-se de que as seguintes ferramentas estão instaladas em seu ambiente:

- **Java JDK 8+** (ou versão mais recente)
- **MySQL** (para o banco de dados)
- **MySQL Workbench** (para gerenciamento do banco de dados)
- **JDBC Driver para MySQL** (biblioteca de conexão do Java com MySQL)
- Uma **IDE** como **IntelliJ IDEA**, **Eclipse** ou **NetBeans**

### 2. Clone o Repositório

Faça o clone do repositório GitHub do projeto:

```bash
git clone https://github.com/usuario/nome-do-repositorio.git
cd nome-do-repositorio

3. Configuração do Banco de Dados
Abra o MySQL Workbench e crie um banco de dados com o nome sistema_gerenciamento.

Execute o script SQL fornecido no repositório (schema.sql) para criar as tabelas necessárias:

Tabelas de usuários, clientes e agenda.
(Opcional) Execute o script data.sql para popular o banco de dados com dados de exemplo.

4. Configuração do JDBC
Certifique-se de que o JDBC Driver para MySQL está incluído no classpath do seu projeto.
No código, atualize as informações de conexão com o banco de dados (host, usuário, senha, etc.), localizadas no arquivo de configuração de conexão com o banco de dados.
5. Compilação e Execução
Abra o projeto em sua IDE preferida (IntelliJ IDEA, Eclipse, NetBeans).
Compile o código-fonte.
Execute a classe principal do projeto (Main.java), que iniciará a aplicação.
A aplicação abrirá a tela de login. Utilize as credenciais fornecidas ou crie um novo usuário na tela de cadastro.
6. Acesso ao Sistema
Tela de login: Use um nome de usuário e senha previamente cadastrados.
Tela principal: A partir do menu, acesse as opções de Cadastro de Usuários, Cadastro de Clientes e Agenda.
7. Testes
Para garantir que o sistema está funcionando corretamente, siga os seguintes testes:

Faça login com um usuário existente.
Cadastre um novo usuário.
Cadastre um novo cliente.
Registre um compromisso na agenda e associe-o a um cliente.


 ## Funcionalidades Implementadas

### 1. Tela de Login
- Autenticação de usuários cadastrados.
- Validação de **nome de usuário** e **senha**.
- Exibição de mensagem de erro em caso de autenticação inválida.
  
### 2. Tela Principal
- Acesso ao menu com as opções principais: **Cadastro de Usuários**, **Cadastro de Clientes**, e **Agenda**.
- Proteção de acesso para usuários autenticados.

### 3. Tela de Cadastro de Usuários
- Cadastro de novos usuários com campos: **nome**, **e-mail**, **nome de usuário**, e **senha**.
- Edição e exclusão de usuários.
- Validação de duplicidade de nomes de usuário.
  
### 4. Tela de Cadastro de Clientes
- Cadastro de clientes com os campos: **nome**, **endereço**, **telefone**, **e-mail**, e **CPF/CNPJ**.
- Edição e exclusão de clientes.
  
### 5. Agenda de Compromissos
- Registro de compromissos com campos: **data**, **hora**, **descrição**, e **cliente associado**.
- Exibição de compromissos em formato de tabela.
- Visualização dos compromissos por **dia**, **semana**, ou **mês**.
- Associar compromissos a clientes cadastrados.

### 6. Banco de Dados MySQL
- Banco de dados **MySQL** com tabelas para **usuários**, **clientes**, e **agenda**.
- Integração via **JDBC** para operações CRUD (Create, Read, Update, Delete).


 

 ## Tabelas

## Tabelas do Banco de Dados

### Tabela de Usuários

| ID  | Nome      | E-mail          | Nome de Usuário | Senha  |
| --- | --------- | --------------- | --------------- | ------ |
| 1   | João Silva| joao@email.com   | joaosilva       | ****** |
| 2   | Maria Souza| maria@email.com | mariasouza      | ****** |
| 3   | Pedro Costa| pedro@email.com | pedrocosta      | ****** |

### Tabela de Clientes

| ID  | Nome         | Endereço        | Telefone      | E-mail           | CPF/CNPJ      |
| --- | ------------ | --------------- | ------------- | ---------------- | ------------- |
| 1   | Ana Pereira  | Rua A, 123      | (11) 99999-1234 | ana@email.com   | 123.456.789-00|
| 2   | Marcos Lima  | Rua B, 456      | (11) 98888-4321 | marcos@email.com| 987.654.321-00|

### Tabela de Compromissos (Agenda)

| ID  | Data       | Hora   | Descrição         | Cliente Associado |
| --- | ---------- | ------ | ----------------- | ----------------- |
| 1   | 25/09/2024 | 14:00  | Reunião de negócio| Ana Pereira       |
| 2   | 26/09/2024 | 10:30  | Consulta médica   | Marcos Lima       |


 ## Tabela com a Tag HTML <table>

## Tabelas em HTML

### Tabela de Usuários

<table>
  <tr>
    <th>ID</th>
    <th>Nome</th>
    <th>E-mail</th>
    <th>Nome de Usuário</th>
    <th>Senha</th>
  </tr>
  <tr>
    <td>1</td>
    <td>João Silva</td>
    <td>joao@email.com</td>
    <td>joaosilva</td>
    <td>******</td>
  </tr>
  <tr>
    <td>2</td>
    <td>Maria Souza</td>
    <td>maria@email.com</td>
    <td>mariasouza</td>
    <td>******</td>
  </tr>
</table>

### Tabela de Clientes

<table>
  <tr>
    <th>ID</th>
    <th>Nome</th>
    <th>Endereço</th>
    <th>Telefone</th>
    <th>E-mail</th>
    <th>CPF/CNPJ</th>
  </tr>
  <tr>
    <td>1</td>
    <td>Ana Pereira</td>
    <td>Rua A, 123</td>
    <td>(11) 99999-1234</td>
    <td>ana@email.com</td>
    <td>123.456.789-00</td>
  </tr>
  <tr>
    <td>2</td>
    <td>Marcos Lima</td>
    <td>Rua B, 456</td>
    <td>(11) 98888-4321</td>
    <td>marcos@email.com</td>
    <td>987.654.321-00</td>
  </tr>
</table>

### Tabela de Compromissos (Agenda)

<table>
  <tr>
    <th>ID</th>
    <th>Data</th>
    <th>Hora</th>
    <th>Descrição</th>
    <th>Cliente Associado</th>
  </tr>
  <tr>
    <td>1</td>
    <td>25/09/2024</td>
    <td>14:00</td>
    <td>Reunião de negócio</td>
    <td>Ana Pereira</td>
  </tr>
  <tr>
    <td>2</td>
    <td>26/09/2024</td>
    <td>10:30</td>
    <td>Consulta médica</td>
    <td>Marcos Lima</td>
  </tr>
</table>


## Contatos
[Github](https://github.com/DouglasVbr)
[linkedin](https://linkedin.com/in/douglas-vieira-685764212)
[whats](https://wa.me/5551998509992)

## mysql


-- Criar banco de dados
create database ProjetoFinal;

-- Escolher o banco que ira usar
use ProjetoFinal;

-- Criar tabela
create table tb_usuarios(
id_usuario int primary key,
usuario varchar(50) not null,
login varchar(50) not null unique,
senha varchar(15)not null
);

-- Descrever a tabela
describe tb_usuarios;

-- Inserir dados na tabela(create)
insert into tb_usuarios(id_usuario, usuario, login, senha)
values(1, 'Douglas Vieira', 'DouglasV', '123456');

insert into tb_usuarios(id_usuario, usuario, login, senha)
values(2, 'administrador', 'admin', 'admin');

-- selecionar itens da tabela(read)
select * from tb_usuarios;


-- editar itens da tabela(update)
update tb_usuarios set usuario = 'Dunga' where id_usuario = 1;

-- excluir um item da tabela(delete)
delete from tb_usuarios where id_usuario = 1;





CREATE TABLE usuarios (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100),
    email VARCHAR(100),
    nome_usuario VARCHAR(50) UNIQUE,
    senha VARCHAR(100)
);

CREATE TABLE clientes (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100),
    endereco VARCHAR(200),
    telefone VARCHAR(15),
    email VARCHAR(100),
    cpf_cnpj VARCHAR(20) UNIQUE
);

CREATE TABLE agenda (
    id INT AUTO_INCREMENT PRIMARY KEY,
    data DATE,
    hora TIME,
    descricao TEXT,
    cliente_id INT,
    FOREIGN KEY (cliente_id) REFERENCES clientes(id) ON DELETE CASCADE
);

insert into tb_usuarios(id_usuario, usuario, login, senha)
values(3, 'Doug', 'Douglas', '123');






