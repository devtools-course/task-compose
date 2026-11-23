CREATE TABLE IF NOT EXISTS locomotives (
    locomotive_id INT GENERATED ALWAYS AS IDENTITY PRIMARY KEY,
    locomotive_name VARCHAR(255),
    locomotive_speed DOUBLE PRECISION
);
