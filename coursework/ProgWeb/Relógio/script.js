/*
 *  Script com a lógica do relógio digital.
 *  Ele possui o esqueleto dos método essenciais.
 *  Modifique este arquivo o quanto for necessário.
 *
 *  DICAS GERAIS:
 *
 *  Você pode implementar a lógica de um relógio.
 *  1. Utilizando o método Date() do javaScript para retorna um objeto de data com
 *     a hora, os minutos e os segundos atuais.
 *
 *  Depois de computar os valores de hora, minutos e segundos,
 *  atualize o HTML chamando o método timer(). Para isso,
 *  finalize a implementação simplesmente colocando os valores dentro dos elementos
 *  usando do atributo textContent dos elementos retornados.
 *
 *  Essa atualização pode ser feita usando o método 'setInterval'.
 */
const horas = document.getElementById('horas');
const minutos = document.getElementById('minutos');
const segundos = document.getElementById('segundos');

const relogio = setInterval(function time () {
  let dateToday = new Date();
  let h = dateToday.getHours();
  let min = dateToday.getMinutes();
  let sec = dateToday.getSeconds();

  horas.textContent = h;
  minutos.textContent = min;
  segundos.textContent = sec;
});
