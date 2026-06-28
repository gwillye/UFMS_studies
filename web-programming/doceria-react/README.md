# 🧁 Doceria — bakery web app (React + Vite)

A small **bakery storefront** — browse products, build a cart, and place an order — rebuilt as a modern **React + Vite** single-page app. (Originally a UFMS Web Programming assignment in plain HTML/CSS/JS; this is the rewritten, improved version.)

## ✨ Features
- **Product catalog** with cart (add / remove), built from a small data module.
- **Cart state in React** (`useCart` hook) **persisted to `localStorage`** — survives refresh.
- **Order form** with a confirmation step.
- Componentized (`Home`, `Catalog`, `OrderForm`) + modern responsive CSS.

## ▶️ Run
```bash
npm install
npm run dev      # http://localhost:5173
npm run build    # production build
```

## 🗂️ Structure
```
doceria-web/
├── index.html
├── package.json · vite.config.js
├── public/            # Cake.jpg, 150.jpg
├── src/
│   ├── main.jsx · App.jsx · styles.css
│   ├── products.js · useCart.js
│   └── components/  Home.jsx · Catalog.jsx · OrderForm.jsx
└── legacy/            # the original HTML/CSS/JS version (reference)
```

## ⚠️ Status — honest note
**Code-complete and structurally reviewed, but not smoke-tested in a runtime here:** the build environment had **no Node/npm**, so I couldn't run `npm run dev` to confirm it boots. The code is standard Vite + React; run the two commands above to verify locally — any tweak needed should be minor. The previous raw HTML/CSS/JS version is kept under `legacy/` for comparison.

## 🛠️ Stack
React 18 · Vite 5 · CSS · localStorage
