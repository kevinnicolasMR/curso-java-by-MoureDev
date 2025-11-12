SELECT * FROM users;
-- el AS funciona para asignarle un valor al resultado final
SELECT name_user, born_user AS "Fecha de nacimiento" FROM users WHERE age_user BETWEEN 20 AND 52; 
