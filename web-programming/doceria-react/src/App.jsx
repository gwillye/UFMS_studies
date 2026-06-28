import { useState } from 'react'
import Home from './components/Home.jsx'
import Catalog from './components/Catalog.jsx'
import OrderForm from './components/OrderForm.jsx'
import { useCart } from './useCart.js'

export default function App() {
  const [view, setView] = useState('home')
  const cart = useCart()

  return (
    <div className="app">
      <header className="nav">
        <span className="brand">🧁 Doceria</span>
        <nav>
          <button onClick={() => setView('home')}>Início</button>
          <button onClick={() => setView('catalog')}>Produtos</button>
          <button onClick={() => setView('order')}>Pedido ({cart.count})</button>
        </nav>
      </header>

      <main className="container">
        {view === 'home' && <Home onShop={() => setView('catalog')} />}
        {view === 'catalog' && <Catalog cart={cart} />}
        {view === 'order' && <OrderForm cart={cart} />}
      </main>

      <footer className="foot">Doceria · React + Vite · projeto de portfólio</footer>
    </div>
  )
}
