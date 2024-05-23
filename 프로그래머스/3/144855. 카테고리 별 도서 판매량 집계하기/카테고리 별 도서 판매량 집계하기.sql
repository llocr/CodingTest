SELECT A.CATEGORY, SUM(B.SALES) AS 'TOTAL_SALES'
FROM BOOK A LEFT JOIN BOOK_SALES B ON A.BOOK_ID = B.BOOK_ID
WHERE B.SALES_DATE LIKE '2022-01-%'
GROUP BY 1
ORDER BY 1