create database student_management;

INSERT INTO students (name, date_of_birth, gender, student_code)
VALUES ('John Doe', '2000-05-15', 'Male', 'STD12345');

INSERT INTO addresses (student_id, address_type, street, city, state, zip_code)
VALUES 
(1, 'Permanent', 'Boston road', 'New York', 'NY', '10001'),
(1, 'Current', '456 College Ave', 'Boston', 'MA', '02115');
