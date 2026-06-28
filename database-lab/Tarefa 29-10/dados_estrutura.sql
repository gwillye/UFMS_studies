-- Aluno: Gabriel Willye Borges Valençoela RGA: 202219070180
-- Aluno: Gabriel Augusto Ocampos Vitorino RGA: 202219070406

-- Criação das tabelas:

-- Criar a tabela de Cargas
CREATE TABLE teste.Cargas (
    CargaID SERIAL PRIMARY KEY,
    Destino VARCHAR(255),
    PesoKg NUMERIC,
    DataMaxDesembarque DATE,
    AgenteReceptor VARCHAR(255),
    DataValidade DATE,
    TemperaturaMax NUMERIC
);

-- Criar a tabela de Navios
CREATE TABLE teste.Navios (
    NavioID SERIAL PRIMARY KEY,
    Nome VARCHAR(255),
    CapacidadeCarga NUMERIC,
    Rota VARCHAR(255)
);

-- Criar a tabela de Agentes
CREATE TABLE teste.Agentes (
    AgenteID SERIAL PRIMARY KEY,
    Nome VARCHAR(255),
    PortoDestino VARCHAR(255)
);

-- Criar a tabela de Portos
CREATE TABLE teste.Portos (
    PortoID SERIAL PRIMARY KEY,
    Nome VARCHAR(255)
);

-- Criar a tabela de CargasEmbarcadas
CREATE TABLE teste.CargasEmbarcadas (
    EmbarqueID SERIAL PRIMARY KEY,
    CargaID INT REFERENCES Cargas (CargaID),
    NavioID INT REFERENCES Navios (NavioID),
    DataEmbarque DATE
);


-- Popular tabelas:

INSERT INTO teste.Navios (Nome, CapacidadeCarga, Rota) VALUES
    ('Navio A', 10000, 'Rota 1'),
    ('Navio B', 12000, 'Rota 2'),
    ('Navio C', 8000, 'Rota 1'),
    ('Navio D', 11000, 'Rota 3'),
    ('Navio E', 9500, 'Rota 2');

INSERT INTO teste.Agentes (Nome, PortoDestino) VALUES
    ('Agente X', 'Porto A'),
    ('Agente Y', 'Porto B'),
    ('Agente Z', 'Porto C'),
    ('Agente W', 'Porto D'),
    ('Agente V', 'Porto E');


INSERT INTO teste.Portos (Nome) VALUES
    ('Porto A'),
    ('Porto B'),
    ('Porto C'),
    ('Porto D'),
    ('Porto E');


INSERT INTO teste.Cargas (Destino, PesoKg, DataMaxDesembarque, AgenteReceptor, DataValidade, TemperaturaMax) VALUES
    ('Porto A', 5000, '2023-12-15', 'Agente X', '2023-12-10', 15),
    ('Porto B', 7000, '2023-12-20', 'Agente Y', '2023-12-18', 10),
    ('Porto C', 9000, '2023-12-25', 'Agente Z', '2023-12-23', 20),
    ('Porto D', 4500, '2023-12-10', 'Agente W', '2023-12-05', 12),
    ('Porto E', 6000, '2023-12-18', 'Agente V', '2023-12-15', 18);
-- Certifique-se de que os IDs de carga e navio correspondam aos dados inseridos nas tabelas "Cargas" e "Navios".
INSERT INTO teste.CargasEmbarcadas (CargaID, NavioID, DataEmbarque) VALUES
    (1, 1, '2023-12-05'),
    (2, 2, '2023-12-10'),
    (3, 3, '2023-12-12'),
    (4, 4, '2023-12-08'),
    (5, 5, '2023-12-14');


-- Inserindo tuplas na tabela testes.Cargas
INSERT INTO testes.Cargas (Destino, PesoKg, DataMaxDesembarque, AgenteReceptor, DataValidade, TemperaturaMax)
VALUES ('Porto A', 5000, '2023-06-01', 'Agente1', '2023-06-01', 10.0);

INSERT INTO testes.Cargas (Destino, PesoKg, DataMaxDesembarque, AgenteReceptor, DataValidade, TemperaturaMax)
VALUES ('Porto B', 200, '2023-06-01', 'Agente2', '2023-06-01', 40.0);

INSERT INTO testes.Cargas (Destino, PesoKg, DataMaxDesembarque, AgenteReceptor, DataValidade, TemperaturaMax)
VALUES ('Porto C', 3000, '2023-06-01', 'Agente3', '2023-06-01', 5.0);

INSERT INTO testes.Cargas (Destino, PesoKg, DataMaxDesembarque, AgenteReceptor, DataValidade, TemperaturaMax)
VALUES ('Porto D', 1000, '2023-06-01', 'Agente4', '2023-06-01', 15.0);

INSERT INTO testes.Cargas (Destino, PesoKg, DataMaxDesembarque, AgenteReceptor, DataValidade, TemperaturaMax)
VALUES ('Porto E', 800, '2023-06-01', 'Agente5', '2023-06-01', 20.0);

INSERT INTO teste.Navios (Nome, CapacidadeCarga, Rota)
VALUES ('Navio em Manutenção', 10000, NULL);
