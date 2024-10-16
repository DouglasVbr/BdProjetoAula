
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



