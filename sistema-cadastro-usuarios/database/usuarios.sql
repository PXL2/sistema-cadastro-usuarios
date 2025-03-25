-- Criação da tabela de usuários
CREATE TABLE IF NOT EXISTS usuarios (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    nome TEXT NOT NULL,
    email TEXT UNIQUE NOT NULL,
    senha TEXT NOT NULL
);

-- Inserção de dados de exemplo
INSERT INTO usuarios (nome, email, senha) VALUES 
    ('Admin', 'admin@email.com', '123456');