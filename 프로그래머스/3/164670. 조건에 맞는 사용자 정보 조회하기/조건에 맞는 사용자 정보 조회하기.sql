SELECT U.USER_ID, U.NICKNAME, 
CONCAT(U.CITY, ' ', U.STREET_ADDRESS1, ' ', IFNULL(U.STREET_ADDRESS2, '')) AS '전체주소', 
CONCAT(SUBSTRING(U.TLNO, 1, 3), '-', SUBSTRING(U.TLNO, 4, 4), '-', SUBSTRING(U.TLNO, 8)) AS '전화번호'
FROM USED_GOODS_BOARD B JOIN USED_GOODS_USER U
ON B.WRITER_ID = U.USER_ID
GROUP BY 1
HAVING COUNT(U.USER_ID) >= 3
ORDER BY 1 DESC