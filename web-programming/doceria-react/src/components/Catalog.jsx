import { products } from '../products.js'

export default function Catalog({ cart }) {
  return (
    <section>
      <h2>Nossos produtos</h2>
      <div className="grid">
        {products.map((p) => (
          <article key={p.id} className="card">
            <img src={p.image} alt={p.name} />
            <h3>{p.name}</h3>
            <p className="desc">{p.desc}</p>
            <div className="row">
              <span className="price">R$ {p.price.toFixed(2)}</span>
              <button onClick={() => cart.add(p)}>Adicionar</button>
            </div>
          </article>
        ))}
      </div>
    </section>
  )
}
