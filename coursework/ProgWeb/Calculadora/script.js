// Variáveis de Controle
let elementoResultado = document.querySelector(".js-resultado");
let valorAtual = "0"; // Valor atual exibido no visor
let operadorAtual = null; // Operador atual
let valorAnterior = null; // Valor anterior

// Função para adicionar um elemento ao input de resultado
function adicionaElementoAoInputResultado(valor) {
  // Verificar se o símbolo é o primeiro a ser inserido
  if (verificaSimboloInicial(valor)) {
    if (valor !== "-") {
      valorAtual = valor;
    }
  } else {
    valorAtual += valor;
  }

  // Atualizar o visor
  elementoResultado.value = valorAtual;
}

// Função para verificar se o símbolo é o primeiro a ser inserido
function verificaSimboloInicial(simbolo) {
  return (
    (valorAtual === "0" && simbolo !== ".") ||
    (valorAtual === "" && simbolo === ".")
  );
}

// Função para verificar se há símbolos duplicados no resultado
function verificarSimboloDuplicado(simbolo) {
  const ultimoCaractere = valorAtual.slice(-1);
  return isNaN(simbolo) && isNaN(ultimoCaractere) && simbolo !== ".";
}

// Função para executar o cálculo
function executarCalculo() {
  try {
    valorAnterior = valorAtual;
    valorAtual = eval(valorAtual).toString(); // Usando eval para calcular
    elementoResultado.value = valorAtual;
  } catch (error) {
    alert("Erro de cálculo");
  }
}

// Função para limpar o resultado
function limparResultado() {
  valorAtual = "0";
  operadorAtual = null;
  valorAnterior = null;
  elementoResultado.value = valorAtual;
}

// Função para trocar o sinal da conta
function trocarSinalDaConta() {
  valorAtual = (parseFloat(valorAtual) * -1).toString();
  elementoResultado.value = valorAtual;
}

// Função para deletar o último caractere do resultado
function deletarUltimaLetraDoResultado() {
  valorAtual = valorAtual.slice(0, -1);
  if (valorAtual === "") {
    valorAtual = "0";
  }
  elementoResultado.value = valorAtual;
}

// Função para gerenciar os ouvintes de eventos
function gerenciarEscutadores() {
  const botoes = document.querySelectorAll("a");

  botoes.forEach((botao) => {
    botao.addEventListener("click", () => {
      const valor = botao.textContent;

      if (valor >= "0" && valor <= "9") {
        adicionaElementoAoInputResultado(valor);
      } else if (valor === ".") {
        if (!valorAtual.includes(".")) {
          adicionaElementoAoInputResultado(valor);
        }
      } else if (valor === "+/-") {
        trocarSinalDaConta();
      } else if (valor === "AC") {
        limparResultado();
      } else if (valor === "=") {
        executarCalculo();
      } else if (valor === "Del") {
        deletarUltimaLetraDoResultado();
      } else {
        // É um operador
        if (!verificarSimboloDuplicado(valor)) {
          adicionaElementoAoInputResultado(valor);
        }
      }
    });
  });
}

// Inicializar os ouvintes de eventos
gerenciarEscutadores();
