-- Aluno: Gabriel Willye Borges Valençoela RGA: 202219070180
-- Aluno: Gabriel Augusto Ocampos Vitorino RGA: 202219070406



-- Consulta 1

SELECT
    nav.Nome AS NomeDoNavio,
    nav.CapacidadeCarga AS CapacidadeMaximaKg,
    port.Nome AS NomeDoPorto,
    cargE.DataEmbarque AS DataChegada
FROM
    teste.Navios AS nav
JOIN
    teste.CargasEmbarcadas AS cargE ON nav.NavioID = cargE.NavioID
JOIN
    teste.Cargas AS carg ON cargE.CargaID = carg.CargaID
JOIN
    teste.Portos AS port ON carg.Destino = port.Nome
ORDER BY
    nav.Nome, port.Nome, cargE.DataEmbarque;

-- Consulta 2
SELECT
    carg.CargaID AS NumeroDaCarga,
    carg.Destino AS PortoDestino,
    nav.Nome AS NomeDoNavio,
    carg.DataMaxDesembarque AS DataMaximaDesembarque,
    cargE.DataEmbarque AS DataChegadaNoPorto
FROM
    teste.Cargas AS carg
JOIN
    teste.CargasEmbarcadas AS cargE ON carg.CargaID = cargE.CargaID
JOIN
    teste.Navios AS nav ON cargE.NavioID = nav.NavioID;

-- Consulta 3
SELECT
    carg.CargaID AS "Número da Carga",
    carg.Destino AS "Porto Destino",
    carg.DataMaxDesembarque AS "Data Máxima de Desembarque",
    carg.AgenteReceptor AS "Código do Agente Receptor"
FROM teste.Cargas AS carg
WHERE carg.CargaID NOT IN (SELECT cargE.CargaID FROM teste.CargasEmbarcadas AS cargE);

-- Consulta 4

SELECT
    port.Nome AS "Nome do Porto",
    nav.Nome AS "Nome do Navio",
    nav.CapacidadeCarga AS "Capacidade de Carga (Kg)",
    nav.Rota AS "Rota do Navio"
FROM
    teste.Portos AS port
LEFT JOIN
    teste.Navios AS nav ON port.Nome = nav.Rota;

-- Consulta 5
SELECT
    carg.CargaID AS "Número da Carga",
    carg.Destino AS "Porto Destino",
    carg.PesoKg AS "Peso da Carga (Kg)",
    carg.DataMaxDesembarque AS "Data Máxima de Desembarque",
    carg.AgenteReceptor AS "Código do Agente Receptor"
FROM
    teste.Cargas AS carg
LEFT JOIN
    teste.Navios AS nav ON carg.Destino = nav.Rota
WHERE
    nav.NavioID IS NULL;

-- Consulta 6

SELECT
    nav.NavioID AS "ID do Navio",
    nav.Nome AS "Nome do Navio"
FROM
    teste.Navios AS nav
WHERE
    nav.Rota IS NULL;

-- Consulta 7
SELECT
    agen.AgenteID AS "ID do Agente",
    agen.Nome AS "Nome do Agente"
FROM
    teste.Agentes AS agen
WHERE
    agen.PortoDestino = 'Porto A' 
    AND agen.AgenteID::text NOT IN (SELECT carg.AgenteReceptor::text FROM teste.Cargas AS carg WHERE carg.destino = 'Porto A');
