/*De la tabla users cundo en la columna del email, termine con "gmail.com"*/
SELECT * FROM users WHERE emal_user LIKE "%gmail.com"; 

/*De la tabla users cundo en la columna del email, este el @ en alguna parte del texto*/
SELECT * FROM users WHERE emal_user LIKE "%@%"; 