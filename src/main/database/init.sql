CREATE TABLE app_users (
ID BIGINT PRIMARY KEY IDENTITY(1,1),
email VARCHAR(256),
password VARCHAR(256),
first_name VARCHAR(50),
last_name VARCHAR(50),
created DATETIME  DEFAULT GETDATE()
);

CREATE TABLE dialogs(
ID BIGINT PRIMARY KEY IDENTITY(1,1),
created DATETIME  DEFAULT GETDATE()
);


INSERT INTO app_users(email, password, first_name, last_name) VALUES('alex', '0000', 'alexander', 'ramanovich');