-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: dev_mysql:3306
-- Tempo de geração: 22/09/2023 às 01:22
-- Versão do servidor: 8.1.0
-- Versão do PHP: 8.2.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `loja_venda_automoveis`
--

-- --------------------------------------------------------

--
-- Estrutura para tabela `cliente`
--

CREATE TABLE `cliente` (
  `codigo_id` int NOT NULL,
  `nome` varchar(128) NOT NULL,
  `endereco_id` int NOT NULL,
  `telefone` varchar(32) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Despejando dados para a tabela `cliente`
--

INSERT INTO `cliente` (`codigo_id`, `nome`, `endereco_id`, `telefone`) VALUES
(1, 'Adan Turing', 1, '67991349936'),
(2, 'Cabo Ulisses Santos Barbosa (Cabo USB)', 2, '67991102939'),
(3, 'Alana Lovelace', 3, '67992747434');

-- --------------------------------------------------------

--
-- Estrutura para tabela `endereco`
--

CREATE TABLE `endereco` (
  `endereco_id` int NOT NULL,
  `bairro` varchar(32) NOT NULL,
  `cep` varchar(9) NOT NULL,
  `cidade` varchar(32) NOT NULL,
  `numero` int NOT NULL,
  `estado` varchar(32) NOT NULL,
  `logradouro` varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Despejando dados para a tabela `endereco`
--

INSERT INTO `endereco` (`endereco_id`, `bairro`, `cep`, `cidade`, `numero`, `estado`, `logradouro`) VALUES
(1, 'Nova Jerusalém', '79065-638', 'Campo Grande', 65, 'Mato Grosso do Sul', 'Rua Jonas Alves de Souza'),
(2, 'Moreninhas II', '79065-062', 'Campo Grande', 117, 'Mato Grosso do Sul', ''),
(3, 'Olinda', '79070-900', 'Campo Grande', 0, 'Mato Grosso do Sul', 'UFMS'),
(4, 'Limoeiro', '77700-001', 'Ficção', 123, 'Imaginário', 'Rua do Limoeiro'),
(5, 'Limoeiro', '60606-001', 'Ficção', 321, 'Imaginário', 'Rua da Piratininga');

-- --------------------------------------------------------

--
-- Estrutura para tabela `funcionario`
--

CREATE TABLE `funcionario` (
  `codigo_id` int NOT NULL,
  `endereco_id` int NOT NULL,
  `categoria` varchar(16) NOT NULL,
  `nome` varchar(128) NOT NULL,
  `telefone` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Despejando dados para a tabela `funcionario`
--

INSERT INTO `funcionario` (`codigo_id`, `endereco_id`, `categoria`, `nome`, `telefone`) VALUES
(1, 4, 'aprendiz', 'Fulano de Tal', '+550679948756321'),
(2, 4, 'mecanico', 'Pacífico Armando Guerras', '6770706060'),
(3, 5, 'funileiro', 'Um Dois Três de Oliveira Quatro', '6799901234');

-- --------------------------------------------------------

--
-- Estrutura para tabela `historico`
--

CREATE TABLE `historico` (
  `reparacao_id` int NOT NULL,
  `veiculo_id` int NOT NULL,
  `cliente_id` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Despejando dados para a tabela `historico`
--

INSERT INTO `historico` (`reparacao_id`, `veiculo_id`, `cliente_id`) VALUES
(1, 1, 1),
(2, 2, 3),
(3, 3, 2);

-- --------------------------------------------------------

--
-- Estrutura para tabela `pagamento`
--

CREATE TABLE `pagamento` (
  `categoria` varchar(16) NOT NULL,
  `valor_hora` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Despejando dados para a tabela `pagamento`
--

INSERT INTO `pagamento` (`categoria`, `valor_hora`) VALUES
('aprendiz', 8),
('funileiro', 10),
('mecanico', 20);

-- --------------------------------------------------------

--
-- Estrutura para tabela `peca`
--

CREATE TABLE `peca` (
  `peca_id` int NOT NULL,
  `designacao` varchar(128) NOT NULL,
  `nome` varchar(32) NOT NULL,
  `custo_unitario` float NOT NULL,
  `qtd_estoque` int NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Despejando dados para a tabela `peca`
--

INSERT INTO `peca` (`peca_id`, `designacao`, `nome`, `custo_unitario`, `qtd_estoque`) VALUES
(1, 'Consertos em geral', 'Rebimboca da parafuseta', 25, 25),
(2, 'Consertos em geral', 'Geringonça', 18, 5),
(3, 'Consertos em geral', 'Engrenagem randômica', 12, 3);

-- --------------------------------------------------------

--
-- Estrutura para tabela `reparacao`
--

CREATE TABLE `reparacao` (
  `reparacao_id` int NOT NULL,
  `cliente_id` int NOT NULL,
  `veiculo_id` int NOT NULL,
  `data_reparacao` date NOT NULL,
  `custo_total` float NOT NULL,
  `peca_id` int NOT NULL,
  `funcionario_id` int NOT NULL,
  `pagamento_funcionario` float NOT NULL,
  `duracao_reparacao` time NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Despejando dados para a tabela `reparacao`
--

INSERT INTO `reparacao` (`reparacao_id`, `cliente_id`, `veiculo_id`, `data_reparacao`, `custo_total`, `peca_id`, `funcionario_id`, `pagamento_funcionario`, `duracao_reparacao`) VALUES
(1, 1, 1, '2023-09-21', 200, 1, 1, 24, '03:18:23'),
(2, 1, 2, '2023-09-21', 350, 2, 3, 90, '06:12:23'),
(3, 2, 3, '2023-09-20', 500, 3, 2, 60, '03:00:00');

-- --------------------------------------------------------

--
-- Estrutura para tabela `veiculo`
--

CREATE TABLE `veiculo` (
  `codigo_id` int NOT NULL,
  `dono_id` int NOT NULL,
  `data_adquirido` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Despejando dados para a tabela `veiculo`
--

INSERT INTO `veiculo` (`codigo_id`, `dono_id`, `data_adquirido`) VALUES
(1, 1, '2023-09-14'),
(2, 3, '2023-09-08'),
(3, 2, '2023-09-11');

--
-- Índices para tabelas despejadas
--

--
-- Índices de tabela `cliente`
--
ALTER TABLE `cliente`
  ADD PRIMARY KEY (`codigo_id`),
  ADD KEY `endereco_cliente_fk` (`endereco_id`);

--
-- Índices de tabela `endereco`
--
ALTER TABLE `endereco`
  ADD PRIMARY KEY (`endereco_id`);

--
-- Índices de tabela `funcionario`
--
ALTER TABLE `funcionario`
  ADD PRIMARY KEY (`codigo_id`),
  ADD KEY `endereco_funcionario_fk` (`endereco_id`),
  ADD KEY `categoria_fk` (`categoria`);

--
-- Índices de tabela `historico`
--
ALTER TABLE `historico`
  ADD PRIMARY KEY (`reparacao_id`),
  ADD KEY `cliente_historico_fk` (`cliente_id`),
  ADD KEY `veiculo_historico_fk` (`veiculo_id`);

--
-- Índices de tabela `pagamento`
--
ALTER TABLE `pagamento`
  ADD PRIMARY KEY (`categoria`),
  ADD UNIQUE KEY `valor_hora` (`valor_hora`);

--
-- Índices de tabela `peca`
--
ALTER TABLE `peca`
  ADD PRIMARY KEY (`peca_id`);

--
-- Índices de tabela `reparacao`
--
ALTER TABLE `reparacao`
  ADD PRIMARY KEY (`reparacao_id`),
  ADD KEY `cliente_fk` (`cliente_id`),
  ADD KEY `veiculo_fk` (`veiculo_id`),
  ADD KEY `peca_fk` (`peca_id`),
  ADD KEY `funcionario_fk` (`funcionario_id`);

--
-- Índices de tabela `veiculo`
--
ALTER TABLE `veiculo`
  ADD PRIMARY KEY (`codigo_id`),
  ADD KEY `dono_fk` (`dono_id`);

--
-- AUTO_INCREMENT para tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `cliente`
--
ALTER TABLE `cliente`
  MODIFY `codigo_id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de tabela `endereco`
--
ALTER TABLE `endereco`
  MODIFY `endereco_id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=6;

--
-- AUTO_INCREMENT de tabela `funcionario`
--
ALTER TABLE `funcionario`
  MODIFY `codigo_id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de tabela `peca`
--
ALTER TABLE `peca`
  MODIFY `peca_id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT de tabela `reparacao`
--
ALTER TABLE `reparacao`
  MODIFY `reparacao_id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT de tabela `veiculo`
--
ALTER TABLE `veiculo`
  MODIFY `codigo_id` int NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- Restrições para tabelas despejadas
--

--
-- Restrições para tabelas `cliente`
--
ALTER TABLE `cliente`
  ADD CONSTRAINT `endereco_cliente_fk` FOREIGN KEY (`endereco_id`) REFERENCES `endereco` (`endereco_id`) ON DELETE RESTRICT ON UPDATE CASCADE;

--
-- Restrições para tabelas `funcionario`
--
ALTER TABLE `funcionario`
  ADD CONSTRAINT `categoria_fk` FOREIGN KEY (`categoria`) REFERENCES `pagamento` (`categoria`) ON DELETE RESTRICT ON UPDATE CASCADE,
  ADD CONSTRAINT `endereco_funcionario_fk` FOREIGN KEY (`endereco_id`) REFERENCES `endereco` (`endereco_id`) ON DELETE RESTRICT ON UPDATE CASCADE;

--
-- Restrições para tabelas `historico`
--
ALTER TABLE `historico`
  ADD CONSTRAINT `cliente_historico_fk` FOREIGN KEY (`cliente_id`) REFERENCES `cliente` (`codigo_id`) ON DELETE RESTRICT ON UPDATE CASCADE,
  ADD CONSTRAINT `reparacao_historico_fk` FOREIGN KEY (`reparacao_id`) REFERENCES `reparacao` (`reparacao_id`) ON DELETE RESTRICT ON UPDATE CASCADE,
  ADD CONSTRAINT `veiculo_historico_fk` FOREIGN KEY (`veiculo_id`) REFERENCES `veiculo` (`codigo_id`) ON DELETE RESTRICT ON UPDATE CASCADE;

--
-- Restrições para tabelas `reparacao`
--
ALTER TABLE `reparacao`
  ADD CONSTRAINT `cliente_fk` FOREIGN KEY (`cliente_id`) REFERENCES `cliente` (`codigo_id`) ON DELETE RESTRICT ON UPDATE CASCADE,
  ADD CONSTRAINT `funcionario_fk` FOREIGN KEY (`funcionario_id`) REFERENCES `funcionario` (`codigo_id`) ON DELETE RESTRICT ON UPDATE CASCADE,
  ADD CONSTRAINT `peca_fk` FOREIGN KEY (`peca_id`) REFERENCES `peca` (`peca_id`) ON DELETE RESTRICT ON UPDATE CASCADE,
  ADD CONSTRAINT `veiculo_fk` FOREIGN KEY (`veiculo_id`) REFERENCES `veiculo` (`codigo_id`) ON DELETE RESTRICT ON UPDATE CASCADE;

--
-- Restrições para tabelas `veiculo`
--
ALTER TABLE `veiculo`
  ADD CONSTRAINT `dono_fk` FOREIGN KEY (`dono_id`) REFERENCES `cliente` (`codigo_id`) ON DELETE RESTRICT ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
