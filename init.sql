-- Used for Lab#3 of COMP-10072 to create the database in Derby. 
-- Created in April 2014 by C. Mark Yendt (Mohawk College)

DROP TABLE TRIPS;
DROP TABLE CARS;

CREATE TABLE CARS (id INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
                   make VARCHAR(20) NOT NULL,
                   model VARCHAR(20) not null,
                   model_year VARCHAR(20) not null);

ALTER TABLE CARS ADD CONSTRAINT primary_key PRIMARY KEY (id);

CREATE TABLE TRIPS (id INTEGER NOT NULL GENERATED ALWAYS AS IDENTITY (START WITH 1, INCREMENT BY 1),
                    mileage_start INTEGER NOT NULL,
                    mileage_end INTEGER not null,
                    gas_used REAL not null,
                    car_id INTEGER not null);

ALTER TABLE TRIPS ADD CONSTRAINT trips_primary_key PRIMARY KEY (id);
ALTER TABLE TRIPS ADD FOREIGN KEY (car_id) REFERENCES CARS(ID);
   
INSERT INTO CARS (make, model, model_year) VALUES ('Honda', 'Civic', '2004');
INSERT INTO CARS (make, model, model_year) VALUES ('Mazda', 'MX5', '2010');
INSERT INTO CARS (make, model, model_year) VALUES ('Lexus', 'ES350', '2012');

INSERT INTO TRIPS (car_id, mileage_start, mileage_end, gas_used) VALUES (1, 100172,100491,25);
INSERT INTO TRIPS (car_id, mileage_start, mileage_end, gas_used) VALUES (2, 22222, 22567, 31.1);
INSERT INTO TRIPS (car_id, mileage_start, mileage_end, gas_used) VALUES (1, 100491,101001,32);
INSERT INTO TRIPS (car_id, mileage_start, mileage_end, gas_used) VALUES (3, 96000, 96456, 44);
INSERT INTO TRIPS (car_id, mileage_start, mileage_end, gas_used) VALUES (1, 101001,101591,34.5);
INSERT INTO TRIPS (car_id, mileage_start, mileage_end, gas_used) VALUES (2, 22567,23005,33);
INSERT INTO TRIPS (car_id, mileage_start, mileage_end, gas_used) VALUES (2, 23005,23576,41);
INSERT INTO TRIPS (car_id, mileage_start, mileage_end, gas_used) VALUES (1, 101591,102102,33.1);
INSERT INTO TRIPS (car_id, mileage_start, mileage_end, gas_used) VALUES (1, 102102,102654,35.3);
INSERT INTO TRIPS (car_id, mileage_start, mileage_end, gas_used) VALUES (3, 96456,97023,52.3);
INSERT INTO TRIPS (car_id, mileage_start, mileage_end, gas_used) VALUES (1, 102654,103132,29.3);
INSERT INTO TRIPS (car_id, mileage_start, mileage_end, gas_used) VALUES (3, 97545,98009,47.8);
INSERT INTO TRIPS (car_id, mileage_start, mileage_end, gas_used) VALUES (2, 23576,23888,25.4);
INSERT INTO TRIPS (car_id, mileage_start, mileage_end, gas_used) VALUES (1, 103400,104007,37.6);
INSERT INTO TRIPS (car_id, mileage_start, mileage_end, gas_used) VALUES (2, 23888,24565,25);
