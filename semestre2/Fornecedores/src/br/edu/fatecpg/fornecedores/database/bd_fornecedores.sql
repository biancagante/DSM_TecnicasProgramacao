CREATE DATABASE IF NOT EXISTS db_fornecedores;

-- Tabela de empresas
CREATE TABLE tb_empresa (
    id_empresa BIGSERIAL PRIMARY KEY,
    cnpj VARCHAR(14) NOT NULL UNIQUE,
    razao_social VARCHAR(150),
    nome_fantasia VARCHAR(150),
    logradouro VARCHAR(100),
    qsa VARCHAR[]
);

-- Tabela de sócios
CREATE TABLE tb_socio (
    id_socio BIGSERIAL PRIMARY KEY,
    nome_socio VARCHAR(150),
    cnpj_cpf_do_socio VARCHAR(14),
    qualificacao_socio VARCHAR(150),
    cnpj VARCHAR(14),
    CONSTRAINT fk_socio_empresa
      FOREIGN KEY (cnpj)
          REFERENCES tb_empresa (cnpj)
);