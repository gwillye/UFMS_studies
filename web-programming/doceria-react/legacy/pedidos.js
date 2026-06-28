function pedido()
{
    var pedido_doce = parseInt(prompt("Digite o código do doce"))
    var qtd_doce = parseInt(prompt("Digite a quantidade"))
    switch (pedido_doce) 
    {
        case 01:
        va_doce = 25;
        total_doce = qtd_doce * va_doce;
        break;
        case 02:
        va_doce = 12; 
        total_doce = qtd_doce * va_doce;
        break;
        case 03:
        va_doce = 35;
        total_doce = qtd_doce * va_doce;
        break;
        case 04:
        va_doce = 15; 
        total_doce = qtd_doce * va_doce;
        break;
        case 05:
        va_doce = 20; 
        total_doce = qtd_doce * va_doce;
        break;
        case 06:
        va_doce = 12.50; 
        total_doce = qtd_doce * va_doce;
        break;
        case 07:
        va_doce = 12.50; 
        total_doce = qtd_doce * va_doce;
        break;
        case 08:
        va_doce = 30; 
        total_doce = qtd_doce * va_doce;
        break;
        case 09:
        va_doce = 27.50; 
        total_doce = qtd_doce * va_doce;
        break;
        case 10:
        va_doce = 7.50; 
        total_doce = qtd_doce * va_doce;
        break;
    }
    alert(`Valor total a pagar R$ ${total_doce}`)
}
