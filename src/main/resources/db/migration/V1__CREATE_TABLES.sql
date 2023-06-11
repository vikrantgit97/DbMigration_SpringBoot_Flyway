create table if not exists employee_tbl (
        employee_id integer not null auto_increment,
        name varchar(255),
        primary key (employee_id)
);