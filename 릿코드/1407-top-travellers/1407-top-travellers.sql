# Write your MySQL query statement below
SELECT * FROM (
    SELECT
        users.name 
      , IFNULL(sum(rides.distance), 0) travelled_distance
    FROM
      Users users
    LEFT OUTER JOIN
      Rides rides
    ON
      users.id = rides.user_id
    GROUP BY
      users.id
) users_ride
ORDER BY
  travelled_distance DESC, name