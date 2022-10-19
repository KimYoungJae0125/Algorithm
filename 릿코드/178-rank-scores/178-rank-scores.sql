# Write your MySQL query statement below
SELECT
    score
  , Dense_Rank() Over(order by score desc) `rank`
FROM
    Scores
ORDER BY score desc
