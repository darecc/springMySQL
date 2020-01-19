CREATE TABLE PRIVATE_ACCOUNT (
 ID INT AUTO_INCREMENT PRIMARY KEY,
NAME VARCHAR(30) NOT NULL,
PASSWORD VARCHAR(10) NOT NULL,
BALANCE FLOAT(8)
);
INSERT INTO PRIVATE_ACCOUNT (NAME, PASSWORD, BALANCE) VALUES
('Dariusz' , 'darek2020', 120.33),
('Alicja'  , 'ala2020',    20.50),
('Roman'   , 'romek',     320.10),
('Dorota'  , 'dorotka',   200.00),
('Quentin' , 'quentek',   144400),
('Zuzanna' , 'zusia',   11400.00);