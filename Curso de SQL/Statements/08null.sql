-- Agrego el IS NULL
SELECT * FROM users WHERE emal_user IS NULL; 

-- En el caso de que no sean nulos
SELECT * FROM users WHERE emal_user IS NOT NULL; 
