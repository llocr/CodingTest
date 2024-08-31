SELECT name, bonus
FROM employee e
LEFT JOIN bonus  b
ON e.empId = b.empId
WHERE b.BONUS < 1000
OR b.BONUS IS NULL