# 🎯 Quiz App — quiz platform

> *Academic context — UFMS, Web Programming course (2023/02).*

A front-end web app to **create, play and rank quizzes**. Multi-page interface in plain HTML/CSS/JavaScript.

**Authors:** Gabriel Willye Borges Valençoela · Lucas Lacerda Arruda.

## Features
- **Authentication:** login and sign-up screens.
- **Create quiz:** build questions / answers (`criar-quiz.js`).
- **Play quiz:** match flow (`jogar-quiz` → `play-quiz` → `resultado`).
- **Ranking:** per-quiz and overall leaderboards (`ranking`, `ranking-quiz`, `menu-ranking`).
- **About:** team page (`about-us`).

## Structure (pages)
```
index.html / tela-inicial.css   # entry
login.html  · cadastro.html     # authentication
menu.html   · menu-ranking.html # navigation
criar-quiz.html + criar-quiz.js # quiz creation
jogar-quiz / play-quiz / quiz   # gameplay
ranking / ranking-quiz          # leaderboards
resultado.html                  # final result
about-us.html                   # team
*.css                           # per-page styles
*.png                           # logo + screenshots
```

## How to run
Static project — no build or server required:
```bash
# open index.html in the browser, or serve the folder:
python -m http.server 8000   # then open http://localhost:8000
```

## Stack
HTML5 · CSS3 · JavaScript (vanilla)
