// FILE: src/App.js:

import logo from './logo.svg';
import { Component } from 'react';
import './App.css';


class App extends Component{
  constructor (props){
    super(props);

    this.state = {
      nome: "COMO DIMINUI A FONTE", 
      contador: 0,
    };
    this.aumentar = this.aumentar.bind(this);
    this.diminuir = this.diminuir.bind(this);
  }

  aumentar(){
    let state = this.state;
    state.contador += 1;
    state.nome = state.contador;
    this.setState(state);
  }

  diminuir(){
    let state = this.state;
    if(state.contador == 0){
      alert('Estamos trabalhando apenas com números naturais');
      return;
    }
    state.contador -=1;
    state.nome = state.contador;
    this.setState(state);
  }
  

  render(){
    return(
      <div>
        <h1>CONTADOR</h1>
        {this.state.nome}
        <h3>
          <button onClick={this.diminuir}>-</button>
          <button onClick={this.aumentar}>+</button>
        </h3>
      </div>
    )
    
  }
}

export default App;

//