'''Receber a entrada e fazer divisões consecutivas por dez, para encontrar os valores de milhar, centena, dezena e unidade, respectivamente.'''
#A entrada é um número entre 0 e 9999
#N é uma variável (numero) que vai receber o valor do input como um inteiro, já que o exercício não trabalha com decimais. Além disso, se imprime o num.
N = int(input())
print("%i"":" %N)
#Após receber o valor, começaremos um processo de decomposição, semelhante ao usado ao usado no código "Cédulas"
#Para fins de comparação, o código "Cédulas" foi uploadado em meu Github, e pode ser acessado pelo link: https://github.com/GWillye/Python/blob/main/C%C3%A9dulas 
#O primeiro passo é descobrir os valores de milhar, centena, dezena e unidade. Para isso, vamos decompor o número em novas variáveis contendo abreviações com três letras dos mesmos
mil = N // 1000
#Como se efetua uma divisão inteira, ele vai receber o valor e implementar quantos milhares existem, e salvar na variável "mil".
#A fim de garantir que os milhares foram tirados, num vai recber como valor o resultado de sua divisão por mil, atualizando seu valor, e continuando em sequência para os próximos valores
N = N % 1000
cen = N // 100
N = N % 100
dez = N // 10
#Como o resultado agora já será direto o valor da unidade, já que não existe outra casa abaixo dela, não é necessário atualizar "num", apenas imprimir o resto gerado ao descobrir as dezenas
uni = N % 10
#Agora é só imprimir os resultados:
print("%i ""milhar(es)" %mil)
print("%i ""centena(s)" %cen)
print("%i ""dezena(s)" %dez)
print("%i ""unidade(s)" %uni)
#E sucesso! - Código feito por Gabriel Willye
