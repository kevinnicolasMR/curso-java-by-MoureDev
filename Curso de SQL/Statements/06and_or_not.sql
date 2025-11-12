SELECT * FROM users; 
/*Traeme todo, menos este dato*/
SELECT * FROM users WHERE NOT emal_user = "kevinnicolasmr@gmail.com"; 
/*Traeme todo, menos este dato y los usuarios que tienen 50*/
SELECT * FROM users WHERE NOT emal_user = "kevinnicolasmr@gmail.com" AND age_user = 50; 

SELECT * FROM users WHERE NOT emal_user = "kevinnicolasmr@gmail.com" OR age_user < 50; 