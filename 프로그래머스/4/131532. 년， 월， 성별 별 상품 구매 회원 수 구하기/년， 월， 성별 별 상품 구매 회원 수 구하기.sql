SELECT YEAR(O.SALES_DATE) YEAR, MONTH(O.SALES_DATE) MONTH, GENDER, COUNT(DISTINCT U.USER_ID) USER
FROM USER_INFO U JOIN ONLINE_SALE O
ON U.USER_ID = O.USER_ID
WHERE U.GENDER IS NOT NULL
GROUP BY 1, 2, 3
ORDER BY 1, 2, 3