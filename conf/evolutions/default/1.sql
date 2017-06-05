# --- !Ups

CREATE TABLE users (
    name TEXT NOT NULL,
    tel TEXT NOT NULL,
    email TEXT NOT NULL,
    id BIGSERIAL PRIMARY KEY NOT NULL
);

# --- !Downs

DROP TABLE IF EXISTS users;