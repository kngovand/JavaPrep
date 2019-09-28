-- select from where group by

CREATE TABLE countries(
COUNTRY_ID varchar(2),
COUNTRY_NAME varchar(40),
REGION_ID decimal(10,0)
);

-- DESC countries;

-- Duplicate table
CREATE TABLE if not exists dup_countries
like countries;
-- desc dup_countries;

-- Jobs table with only particular job titles
CREATE TABLE jobs(
job_id integer PRIMARY KEY,
job_title varchar(40),
country_id varchar(2),
FOREIGN KEY(country_id) references countries(country_id),
CHECK(job_title IN ('CEO', 'CTO', 'COO', 'employee')),
min_salary decimal(6,0),
max_salary decimal(6,0),
CHECK(max_salary <= 25000)
);

insert into jobs(job_id, job_title, country_id, min_salary, max_salary) values(1, 'COO', 15, 5000, 150000);
insert into jobs(job_id, job_title, country_id, min_salary, max_salary) values(2, 'COO', 15, 4000, 100000);
insert into jobs(job_id, job_title, country_id, min_salary, max_salary) values(3, 'COO', 15, 3000, 100000);

select job_id, max_salary from jobs order by max_salary;