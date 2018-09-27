# Write your MySQL query statement below
select ee.name as Employee from Employee ee left join Employee e on ee.ManagerId = e.Id  where ee.salary > e.salary
