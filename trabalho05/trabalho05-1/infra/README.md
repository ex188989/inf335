# Jenkins local

## Dependências

- docker
- docker-compose
- make

## Comandos

```bash
# Constrói a imagem Docker para o Jenkins.
make build

# Sobe o contêiner Jenkins em modo destacado.
make up

# Derruba o contêiner Jenkins.
make down

# Exibe os logs do contêiner Jenkins
make logs
```

## Criando ambiente local

1. Execute os comandos abaixo:
````bash
make build
make up
````
2. Acesse o [Jenkins local](http://127.0.0.1:8088).
3. Siga o passo a passo para concluir a instalação.