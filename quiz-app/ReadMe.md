# 🎯 Quiz ProgWeb — plataforma de quizzes

Aplicação web (front-end) para **criar, jogar e ranquear quizzes**, desenvolvida na disciplina de **Programação Web (UFMS, 2023/02)**. Interface multi-página em HTML/CSS/JavaScript puro.

**Autores:** Gabriel Willye Borges Valençoela · Lucas Lacerda Arruda.

## ✨ Funcionalidades
- **Autenticação:** telas de login e cadastro de usuário.
- **Criar quiz:** montagem de perguntas/alternativas (`criar-quiz.js`).
- **Jogar quiz:** fluxo de partida (`jogar-quiz` → `play-quiz` → `resultado`).
- **Ranking:** classificação por quiz e geral (`ranking`, `ranking-quiz`, `menu-ranking`).
- **Sobre:** página da equipe (`about-us`).

## 🗂️ Estrutura (páginas)
```
index.html / tela-inicial.css   # entrada
login.html  · cadastro.html     # autenticação
menu.html   · menu-ranking.html # navegação
criar-quiz.html + criar-quiz.js # criação de quiz
jogar-quiz / play-quiz / quiz   # execução
ranking / ranking-quiz          # placares
resultado.html                  # resultado final
about-us.html                   # equipe
*.css                           # estilos por página
*.png                           # logo + telas (screenshots)
```

## ▶️ Como executar
Projeto **estático** — não precisa de build nem servidor:
```bash
# abra index.html no navegador, ou sirva a pasta:
python -m http.server 8000   # depois acesse http://localhost:8000
```

## 🛠️ Stack
HTML5 · CSS3 · JavaScript (vanilla)

## 🖼️ Telas
Capturas incluídas no repositório: `logo.png`, `jogarquiz.png`, `criarquiz.png`, `ranking.png`, `Desenvolvedores.png`.

> 📝 Trabalho acadêmico (turma 02 — 2023/02). README reescrito para publicação; os protótipos Balsamiq e relatórios em PDF citados na versão original do trabalho não estão nesta árvore.
