CREATE DATABASE db_fornecedores;

CREATE TABLE tb_empresa (
    id_empresa BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    cnpj VARCHAR(14) NOT NULL UNIQUE,
    razao_social VARCHAR(150),
    nome_fantasia VARCHAR(150),
    logradouro VARCHAR(100)
);

CREATE TABLE tb_socio (
    id_socio BIGINT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    nome_socio VARCHAR(150),
    cnpj_cpf_do_socio VARCHAR(14) UNIQUE,
    qualificacao_socio VARCHAR(150),
    cnpj VARCHAR(14) NOT NULL,
    CONSTRAINT fk_socio_empresa FOREIGN KEY (cnpj) REFERENCES tb_empresa (cnpj)
);

SELECT * FROM tb_empresa;

SELECT * FROM tb_socio;