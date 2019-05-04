select (
    SELECT
    distinct Salary
    FROM Employee
    ORDER BY Salary
    DESC
    limit 1,1
    ) as SecondHighestSalary;