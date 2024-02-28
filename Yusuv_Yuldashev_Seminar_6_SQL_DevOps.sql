-- Простой вариант решения первого задания:
DROP PROCEDURE IF EXISTS mission1_1;
DELIMITER //
CREATE PROCEDURE mission1_1(num INT)
BEGIN
	DECLARE seconds INT;
    DECLARE minutes INT;
    DECLARE hours INT;
    DECLARE days INT;
    SET seconds = num % 60;
    SET minutes = (num/60) % 60;
    SET hours = (num/3600) % 24;
    SET days = num/86400;
    SELECT CONCAT(days,' days ',hours,' hours ',minutes,' minutes ',seconds,' seconds ') AS FormattedTime;
END //
DELIMITER ;
CALL mission1_1(123456);

-- Более практичное решение первого задания:
DROP PROCEDURE IF EXISTS mission1_2;
DELIMITER //
CREATE PROCEDURE mission1_2(num INT)
BEGIN
	DECLARE seconds INT;
    DECLARE minutes INT;
    DECLARE hours INT;
    DECLARE days INT;
    SET seconds = num % 60;
    SET minutes = (num/60) % 60;
    SET hours = (num/3600) % 24;
    SET days = num/86400;
    SELECT CONCAT(
		CASE WHEN days > 0 THEN days ELSE '' END,
		CASE WHEN days > 0 THEN ' days ' ELSE '' END, 
        CASE WHEN hours > 0 THEN hours ELSE '' END,
        CASE WHEN hours > 0 THEN ' hours ' ELSE '' END ,
        CASE WHEN minutes > 0 THEN minutes ELSE '' END,
        CASE WHEN minutes > 0 THEN ' minutes ' ELSE '' END, 
        seconds, ' seconds ') AS FormattedTime;
END //
DELIMITER ;
CALL mission1(0); 
CALL mission1(60);
CALL mission1(3600);
CALL mission1(86400);
CALL mission1(90061);
CALL mission1(123456);


-- Первый вариант решения второго задания)
DROP FUNCTION IF EXISTS mission2_1;
DELIMITER //
CREATE FUNCTION mission2_1()
RETURNS VARCHAR(255)
DETERMINISTIC
BEGIN
RETURN CONCAT(2,',',4,',',6,',',8,',',10);
END //
DELIMITER ;
SELECT mission2_1();

-- Второй вариант решения второго задания:
DROP FUNCTION IF EXISTS mission2_2;
DELIMITER //
CREATE FUNCTION mission2_2()
RETURNS VARCHAR(255)
DETERMINISTIC
BEGIN
    DECLARE result VARCHAR(100);
    DECLARE i INT DEFAULT 2;
    SET result = '';
    WHILE i <= 10 DO
        IF i % 2 = 0 THEN
            SET result = CONCAT(result, i, ',');
        END IF;
        SET i = i + 2;
    END WHILE;
    
    RETURN LEFT(result, LENGTH(result) - 1);
END //
DELIMITER ;

SELECT mission2_2();

-- Спасибо что рассказывали все и помогали закрыть пробелы) 