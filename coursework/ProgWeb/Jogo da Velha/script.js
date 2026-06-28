// Declaração das variáveis globais
const cells = document.querySelectorAll(".cell");
const statusText = document.querySelector("#statusText");
const winConditions = [
  [0, 1, 2],
  [3, 4, 5],
  [6, 7, 8],
  [0, 3, 6],
  [1, 4, 7],
  [2, 5, 8],
  [0, 4, 8],
  [2, 4, 6],
];

let options = ["", "", "", "", "", "", "", "", ""];
let currentPlayer = "X";
let running = false;

// Chamada da função para inicializar o jogo
initializeGame();

// Função para a inicialização do jogo
function initializeGame() {
  cells.forEach((cell) => {
    cell.addEventListener("click", cellClicked);
  });
  document.querySelector("#restart-Btn").addEventListener("click", restartGame);
  renderStatusText();
}

// Função chamada quando uma célula é clicada
function cellClicked(e) {
  const cell = e.target;
  const index = cell.getAttribute("cellIndex");

  if (options[index] === "" && running) {
    options[index] = currentPlayer;
    updateCell(cell, index);
    checkWinner();
    changePlayer();
  }
}

// Função para atualizar a visualização da célula
function updateCell(cell, index) {
  cell.textContent = options[index];
}

// Função para atualizar o texto de status
function renderStatusText() {
  if (!running) {
    statusText.textContent = "Clique em Reiniciar para jogar novamente!";
  } else {
    statusText.textContent = `Jogador atual: ${currentPlayer}`;
  }
}

// Função para alternar entre os jogadores
function changePlayer() {
  currentPlayer = currentPlayer === "X" ? "O" : "X";
  renderStatusText();
}

// Função para verificar o vencedor
function checkWinner() {
  for (const condition of winConditions) {
    const [a, b, c] = condition;
    if (options[a] && options[a] === options[b] && options[a] === options[c]) {
      statusText.textContent = `Jogador ${options[a]} venceu!`;
      running = false;
      return;
    }
  }

  if (!options.includes("")) {
    statusText.textContent = "Empate!";
    running = false;
  }
}

// Função para reiniciar o jogo
function restartGame() {
  options = ["", "", "", "", "", "", "", "", ""];
  currentPlayer = "X";
  running = true;
  cells.forEach((cell) => {
    cell.textContent = "";
  });
  renderStatusText();
}

// Inicializar o jogo
initializeGame();
