delete
from employee using employee,
    employee e1
where employee.id > e1.id
    and employee.last_name = e1.last_name