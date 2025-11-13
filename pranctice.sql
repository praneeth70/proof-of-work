CREATE TABLE students (
    id INT PRIMARY KEY,
    name VARCHAR(50),
    marks INT
);

INSERT INTO students VALUES
(1, 'Ravi', 85),
(2, 'Sneha', 92),
(3, 'Arjun', 74);

-- Fetch all
SELECT * FROM students;

-- Students with marks above 80
SELECT * FROM students WHERE marks > 80;

-- Update a record
UPDATE students
SET marks = 95
WHERE id = 2;

-- Delete low-performing students
DELETE FROM students WHERE marks < 75;
