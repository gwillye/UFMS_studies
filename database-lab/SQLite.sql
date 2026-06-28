SELECT 
    SUM(CASE WHEN sexo = 'Mulher' THEN 1 ELSE 0 END) AS qd_mulheres,
    SUM(CASE WHEN sexo = 'Homem' THEN 1 ELSE 0 END) AS qtd_homens,
    SUM(CASE WHEN sexo != 'Homem' and sexo != 'Mulher' then 1 else 0 end) as qtd_lgtv
FROM 
    normalizado AS nor;
