let hours = 0;
let minutes = 0;
let seconds = 0;
let milliseconds = 0;
let interval;

function start() {
  // Cancelar qualquer intervalo de atualização anterior
  stop();

  // Configurar um novo intervalo de atualização a cada 10 milissegundos
  interval = setInterval(timer, 10);
}

// Função "reset()"
function reset() {
  // Cancelar qualquer intervalo de atualização existente
  stop();

  // Reiniciar as variáveis de controle para zero
  hours = 0;
  minutes = 0;
  seconds = 0;
  milliseconds = 0;

  // Atualizar o conteúdo dos elementos HTML com IDs "horas", "minutos", "segundos" e "milissegundo"
  document.getElementById("horas").innerText = "00";
  document.getElementById("minutos").innerText = "00";
  document.getElementById("segundos").innerText = "00";
  document.getElementById("milissegundo").innerText = "000";
}

function stop() {
  // Cancelar o intervalo de atualização existente
  clearInterval(interval);
}

function timer() {
  // Incrementar os milissegundos em 10 a cada chamada
  milliseconds += 10;

  // Verificar se os milissegundos atingiram 1000 (1 segundo)
  if (milliseconds >= 1000) {
    // Incrementar os segundos em 1 e redefine os milissegundos para zero
    seconds++;
    milliseconds = 0;

    // Verificar se os segundos atingiram 60 (1 minuto)
    if (seconds >= 60) {
      // Incrementar os minutos em 1 e redefine os segundos para zero
      minutes++;
      seconds = 0;

      // Verificar se os minutos atingiram 60 (1 hora)
      if (minutes >= 60) {
        // Incrementar as horas em 1 e redefine os minutos para zero
        hours++;
        minutes = 0;
      }
    }
  }

  // Atualizar o conteúdo dos elementos HTML com IDs "horas", "minutos", "segundos" e "milissegundo"
  document.getElementById("horas").innerText = hours.toString().padStart(2, "0");
  document.getElementById("minutos").innerText = minutes.toString().padStart(2, "0");
  document.getElementById("segundos").innerText = seconds.toString().padStart(2, "0");
  document.getElementById("milissegundo").innerText = milliseconds.toString().padStart(3, "0");
}
