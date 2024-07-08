SELECT YEAR(a.SALES_DATE)  AS YEAR
       , MONTH(a.SALES_DATE) AS MONTH
       , COUNT(DISTINCT a.USER_ID) AS PUCHASED_USERS
       , ROUND(COUNT(DISTINCT a.USER_ID)/(SELECT COUNT(1) FROM USER_INFO WHERE JOINED LIKE '2021%'), 1) AS PUCHASED_RATIO
    FROM ONLINE_SALE a
       , USER_INFO   b
   WHERE 1 = 1
     AND a.USER_ID = b.USER_ID
     AND b.JOINED  LIKE '2021%'
GROUP BY YEAR, MONTH
ORDER BY 1, 2