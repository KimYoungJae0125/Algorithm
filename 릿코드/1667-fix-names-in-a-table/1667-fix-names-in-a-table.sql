# Write your MySQL query statement below
SELECT
    user_id
  , Concat(Upper(substr(name, 1, 1)), Lower(substr(name, 2, length(name)))) as name
FROM
    Users
ORDER BY
    user_id