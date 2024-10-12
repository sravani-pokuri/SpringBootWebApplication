INSERT INTO person (name) VALUES ('John Doe');
INSERT INTO passport (passport_number, person_id) VALUES ('A123456', 1);

INSERT INTO customer (name) VALUES ('Jane Smith');
INSERT INTO orders (order_description, customer_id) VALUES ('Order 1', 1);
INSERT INTO orders (order_description, customer_id) VALUES ('Order 2', 1);

INSERT INTO student (name) VALUES ('Student A');
INSERT INTO course (course_name) VALUES ('Course 1');
INSERT INTO student_course (student_id, course_id) VALUES (1, 1);