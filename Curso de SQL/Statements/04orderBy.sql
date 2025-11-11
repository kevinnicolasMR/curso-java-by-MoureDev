/* Por defecto lo ordena de menor a mayor, si quieres que sea a la inversa, quenes que poner DESC al final*/
SELECT * FROM users ORDER BY age_user ASC; 

SELECT * FROM users ORDER BY age_user DESC; 


/* Tambien podemos ordenarlo, luego de usar la condicional WHERE*/
SELECT * FROM users WHERE emal_user="kevinnicolasmr@gmail.com" ORDER BY age_user DESC; 

/*Traeme los nombres de la tabla users cuando tengan un email igual a este, y ordename el resultado por edad de mayor a menor*/
SELECT name_user FROM users WHERE emal_user="kevinnicolasmr@gmail.com" ORDER BY age_user DESC; 
