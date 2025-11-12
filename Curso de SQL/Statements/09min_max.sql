SELECT * FROM users;

-- Ordeno de menor a mayor
SELECT * FROM users ORDER BY age_user;
-- Solo podemos sacar el valor maximo o minimo, no los datos asociados a esea row
SELECT MAX(age_user) FROM users;
