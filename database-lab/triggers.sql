-- Exercício 1 - Criar uma TRIGGER no banco de dados de vendedores que não permita que
-- compras abaixo de R$ 10,00 sejam aceitas. Caso a situação ocorra, dispare uma
-- exceção que invalide a inserção.

-- FUNÇÃO

CREATE OR REPLACE FUNCTION validar_valor()
RETURNS TRIGGER AS $$
BEGIN
  IF NEW.valor < 10.00 THEN
    RAISE EXCEPTION 'O valor da venda deve ser igual ou maior que 10,00.';
  END IF;
  RETURN NEW;
END;
$$ LANGUAGE plpgsql;

-- TRIGGER

CREATE OR REPLACE TRIGGER trigger_validar_valor
BEFORE INSERT ON vendas.venda
FOR EACH ROW
EXECUTE FUNCTION validar_valor();

-- Exercício 2 - Crie uma FUNÇÃO que mude a situacao dos vendedores para inativo quando a
-- venda total do mês passado destes vendedores for inferior a R$ 1.000,00.


CREATE OR REPLACE FUNCTION inativa_vendedor(codigov integer) RETURNS void AS $$
DECLARE 
	ultimo_mes integer := EXTRACT(MONTH FROM (CURRENT_DATE - interval '1 month'));
	ultimo_mes_ano integer := EXTRACT(YEAR FROM (CURRENT_DATE - interval '1 month'));
	vendas_mes numeric := 0;
	
BEGIN
	SELECT COALESCE(SUM(valor), 0) INTO vendas_mes
    FROM vendas.venda
    WHERE codvendedor = codigov AND
    EXTRACT(MONTH FROM data) = ultimo_mes AND
    EXTRACT(YEAR FROM data) = ultimo_mes_ano;

	IF (vendas_mes < 1000) THEN
	UPDATE vendas.vendedor
	SET situacao = 'I'
	WHERE codigo = codigov;
	END IF;

END;
$$ LANGUAGE plpgsql;

-- Exercício 4 - Crie uma TRIGGER que não permita a duplicação do número da carteira de trabalho
-- dos vendedores (ctps). Caso ocorra a duplicação, dispare uma exceção informando
-- o erro. Rejeite a operação.

-- FUNÇÃO

CREATE OR REPLACE FUNCTION verificar_ctps()
RETURNS TRIGGER AS $$
BEGIN
  IF EXISTS (
    SELECT 1
    FROM vendas.vendedor
    WHERE ctps = NEW.ctps
  ) THEN
    RAISE EXCEPTION 'Já existe um vendedor com a mesma CTPS cadastrado.';
  END IF;
  RETURN NEW;
END;
$$ LANGUAGE plpgsql;

-- TRIGGER

CREATE OR REPLACE TRIGGER trigger_verificar_ctps
BEFORE INSERT ON vendas.vendedor
FOR EACH ROW
EXECUTE FUNCTION verificar_ctps();

-- Exercício 5 - Crie um TRIGGER que não permita cadastrar vendas em finais de semana.
-- Caso algum vendedor tente fazer isso, dispare uma exceção e rejeite a operação.

-- FUNÇÃO

CREATE OR REPLACE FUNCTION validar_data_venda()
RETURNS TRIGGER AS $$
BEGIN
  IF (EXTRACT(DOW FROM NEW.data) = 0) THEN
    RAISE EXCEPTION 'Vendas não podem ser cadastradas no Domingo, por ser durante o final de semana.';
	
  ELSIF (EXTRACT(DOW FROM NEW.data) = 6) THEN
  	RAISE EXCEPTION 'Vendas não podem ser cadastradas no Sábado, por ser durante o final de semana';
	
  END IF;
  RETURN NEW;
END;
$$ LANGUAGE plpgsql;

-- TRIGGER

CREATE OR REPLACE TRIGGER trigger_validar_data_venda
BEFORE INSERT ON vendas.venda
FOR EACH ROW
EXECUTE FUNCTION validar_data_venda();
