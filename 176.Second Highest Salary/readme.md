最开始认为
  select Salary from Employee order by Salary desc limit 1,1;
即可简单实现，但是该sql不够严谨，当100 100 时 按要求返回null 不应返回100,对其改善
select Salary from Employee group by Salary order by Salary desc limit 1,1;
但是当100 时 需要返回null,所以在外面在包一层
select  (select Salary from Employee group by Salary order by Salary desc limit 1,1) as SecondHighestSalary; ac


别人用max来实现也可以
# Write your MySQL query statement below
select MAX(Salary) as SecondHighestSalary from Employee where Salary < (select MAX(Salary) from Employee ) ;
