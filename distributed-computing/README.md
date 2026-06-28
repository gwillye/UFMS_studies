# 🌐 Distributed Computing — Flask (MVC) + Docker

> *Academic context — UFMS, Distributed Computing course.*

A Flask web service in **MVC** architecture: admin panel (Flask-Admin), HTTP Basic auth, SQLAlchemy persistence, and a containerized database (Docker).

## Architecture
```
CompDist/
├── server.py            # server bootstrap
├── apps.py              # Flask app creation / config
├── app/
│   ├── model.py         # SQLAlchemy models (e.g. Profile)
│   ├── view.py          # views
│   ├── controller.py    # controllers
│   ├── routes.py        # routes
│   ├── admin.py         # Flask-Admin
│   ├── basic_auth.py    # HTTP Basic auth
│   └── config.py        # config (reads from environment variables)
└── docker/
    ├── start_db.sql     # database init
    └── wait-for-it.sh   # wait for the DB to be ready
```

## How to run
```bash
pip install flask flask-admin flask-httpauth flask-sqlalchemy flask-migrate

cp .env.example .env   # set SECRET_KEY, DATABASE (SQLAlchemy URI), DEFAULT_USERNAME, DEFAULT_PASSWORD

# bring up the DB (Docker) via docker/start_db.sql + wait-for-it.sh, then:
python server.py
```

## Stack
Python · Flask · Flask-Admin · Flask-SQLAlchemy · Flask-Migrate · HTTP Basic Auth · Docker
