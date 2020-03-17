# CREATE USER john@localhost IDENTIFIED BY 'password';
CREATE database dogs_db;
GRANT ALL ON dogs_db.* TO john@localhost;

