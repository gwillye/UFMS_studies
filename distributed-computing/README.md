# 🌐 Computação Distribuída — App Flask (MVC) + Docker

Aplicação web da disciplina **Computação Distribuída (UFMS)**: um serviço Flask em arquitetura **MVC**, com painel administrativo (Flask-Admin), autenticação HTTP Basic, persistência via SQLAlchemy e banco em contêiner (Docker).

## 🏗️ Arquitetura
```
CompDist/
├── server.py            # bootstrap do servidor
├── apps.py              # criação/configuração da app Flask
├── app/
│   ├── model.py         # modelos SQLAlchemy (ex.: Profile)
│   ├── view.py          # views
│   ├── controller.py    # controladores
│   ├── routes.py        # rotas
│   ├── admin.py         # Flask-Admin
│   ├── basic_auth.py    # autenticação HTTP Basic
│   └── config.py        # configuração (lê de variáveis de ambiente)
└── docker/
    ├── start_db.sql     # init do banco
    └── wait-for-it.sh   # espera o banco subir
```

## 🔒 Configuração (sem segredos no código)
Toda credencial vem de **variáveis de ambiente** (ou de um `cfg/app.cfg` local, ignorado pelo git). Copie o modelo:
```bash
cp .env.example .env   # edite os valores
```
Variáveis: `SECRET_KEY`, `DATABASE` (URI SQLAlchemy), `DEFAULT_USERNAME`, `DEFAULT_PASSWORD`.

## ▶️ Como rodar
```bash
# dependências
pip install flask flask-admin flask-httpauth flask-sqlalchemy flask-migrate

# subir o banco (Docker) e a app
# (use docker/start_db.sql + wait-for-it.sh conforme seu compose)
python server.py
```

## 🛠️ Stack
Python · Flask · Flask-Admin · Flask-SQLAlchemy · Flask-Migrate · HTTP Basic Auth · Docker

> ✅ Secret-scan: sem credenciais hardcoded — `config.py` usa `os.getenv()`; `cfg/app.cfg`/`.env` ficam fora do versionamento.
