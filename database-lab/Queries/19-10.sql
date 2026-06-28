-- Lista

-- 1 - Liste os nomes dos empregados e os projetos para os quais cada empregado trabalha. 
-- Ordene o resultado pelo nome do projeto, em ordem ascendente. 
-- Renomeie as colunas exibidas para Nome do Empregado e Nome do Projeto.
 
 select emp.pnome as "Nome do Empregado",
        proj.pjnome as "Nome do Projeto"
from empregado as emp, 
	projeto as proj
where proj.dnum = emp.dno
order by proj.pjnome asc;


--  2 - Resolva o exercício anterior usando a cláusula JOIN. 

select emp.pnome as "Nome do Empregado",
	proj.pjnome as "Nome do Projeto"
from empregado as emp
left join projeto as proj
	on proj.dnum = emp.dno
order by proj.pjnome asc;

-- 3 - Liste os nomes dos departamentos e seus respectivos projetos. 
-- Ordene o resultado pelo nome do departamento, em ordem ascendente.
-- Renomeie as colunas exibidas para Nome do Departamento e Nome do Projeto.

select dep.dnome as "Nome do Departamento",
	proj.pjnome as "Nome do Projeto"
from departamento as dep, 
	projeto as proj
where dep.dnumero = proj.dnum
order by proj.pjnome asc;

-- 4 - Resolva o exercício anterior usando a cláusula JOIN.

select dep.dnome as "Nome do Departamento",
	proj.pjnome as "Nome do Projeto"
from departamento as dep
left join projeto as proj
	on dep.dnumero = proj.dnum
order by proj.pjnome asc;

-- 5 - Liste os nomes dos departamentos que possuem projetos usando a cláusula IN.

select dep.dnome
from departamento as dep
where dep.dnumero in (
	select distinct proj.dnum 
	from projeto as proj);

-- 6 - Selecione os nomes e salários dos empregados que ganham entre 40000 e 50000. 



-- 7 - Resolva o exercício anterior usando a cláusula BETWEEN... AND



-- 8 - Selecione os nomes do empregados que tem dependentes, usando a cláusula INTERSECT.

select emp.pnome
from empregado as emp
where emp.ssn in (
	select ssn
	from empregado
	intersect
	select essn
	from dependente);

-- 9 - Selecione os nomes do empregados que tem dependentes, usando apenas a cláusula IN.



-- 10 -  Selecione os nomes do empregados que tem dependentes, usando apenas a cláusula EXISTS.



-- 11 -  Liste a quantidade de empregados cadastrados.



-- 12 -  Liste a quantidade de empregados por supervisor, bem como o ssn do supervisor.



-- 13 -  Liste a quantidade de empregados por supervisor e o ssn do supervisor, 
-- de forma que apenas os supervisores com mais de dois empregados supervisionados sejam listados.



-- 14 -  Liste os números dos departamentos, bem como seus gastos totais com salários de empregados, 
-- para os casos em que os gastos são superiores à média dos gastos (com salário de todos os empregados). 
-- Ordene o resultado de forma descendente pelo gasto. 
