export default function Home({ onShop }) {
  return (
    <section className="home">
      <h1>Delícias artesanais 🍰</h1>
      <p>Bolos, tortas e cupcakes feitos com carinho, sob encomenda.</p>
      <button className="cta" onClick={onShop}>
        Ver produtos
      </button>
    </section>
  )
}
