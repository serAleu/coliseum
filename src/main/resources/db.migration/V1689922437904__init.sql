DROP TABLE IF EXISTS users;
CREATE TABLE IF NOT EXISTS users (
  id serial PRIMARY KEY,
  nickName varchar(200)
);