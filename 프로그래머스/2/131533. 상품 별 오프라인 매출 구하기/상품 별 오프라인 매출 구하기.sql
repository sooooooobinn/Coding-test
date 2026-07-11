SELECT
    product_code,
    SUM(sales_amount * price) sales
FROM
    offline_sale o
    LEFT JOIN product p
    USING(product_id)
GROUP BY
    1
ORDER BY
    2 DESC,
    1;