SELECT I.INGREDIENT_TYPE, SUM(H.TOTAL_ORDER) AS TOTAL_ORDER
FROM ICECREAM_INFO I JOIN FIRST_HALF H
ON I.FLAVOR = H.FLAVOR
GROUP BY 1
ORDER BY 2