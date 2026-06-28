import { useState } from 'react'

export default function OrderForm({ cart }) {
  const [name, setName] = useState('')
  const [address, setAddress] = useState('')
  const [sent, setSent] = useState(false)

  const submit = (e) => {
    e.preventDefault()
    setSent(true)
    cart.clear()
  }

  if (sent) {
    return (
      <section className="order">
        <h2>Pedido enviado! 🎉</h2>
        <p>Obrigado, {name || 'cliente'}. Entraremos em contato para confirmar a entrega.</p>
      </section>
    )
  }

  return (
    <section className="order">
      <h2>Seu pedido</h2>
      {cart.items.length === 0 ? (
        <p>Seu carrinho está vazio. Adicione produtos na aba “Produtos”.</p>
      ) : (
        <>
          <ul className="cart">
            {cart.items.map((i) => (
              <li key={i.id}>
                <span>{i.name} × {i.qty}</span>
                <span>R$ {(i.qty * i.price).toFixed(2)}</span>
                <button className="link" onClick={() => cart.remove(i.id)}>remover</button>
              </li>
            ))}
          </ul>
          <p className="total">Total: R$ {cart.total.toFixed(2)}</p>
          <form onSubmit={submit} className="form">
            <input
              placeholder="Seu nome"
              value={name}
              onChange={(e) => setName(e.target.value)}
              required
            />
            <input
              placeholder="Endereço de entrega"
              value={address}
              onChange={(e) => setAddress(e.target.value)}
              required
            />
            <button type="submit" className="cta">Enviar pedido</button>
          </form>
        </>
      )}
    </section>
  )
}
