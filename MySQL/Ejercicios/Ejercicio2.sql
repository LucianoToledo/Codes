 
/*a) A continuación, realizar las siguientes consultas sobre la base de datos personal:
/*1. Obtener los datos completos de los empleados.*/

SELECT * FROM empleados;

/*2. Obtener los datos completos de los departamentos.*/

SELECT*FROM departamentos;

/*3. Listar el nombre de los departamentos.*/

SELECT nombre_depto FROM departamentos;

/*4. Obtener el nombre y salario de todos los empleados.*/

SELECT nombre, sal_emp FROM empleados;

/*5. Listar todas las comisiones.*/

SELECT comision_emp FROM empleados;

/*6. Obtener los datos de los empleados cuyo cargo sea ‘Secretaria’.*/

SELECT * FROM empleados WHERE cargo_emp = 'Secretaria';

/*7. Obtener los datos de los empleados vendedores, ordenados por nombre alfabéticamente.*/

SELECT * FROM empleados WHERE cargo_emp = 'Vendedor' ORDER BY nombre ASC;

/*8. Obtener el nombre y cargo de todos los empleados, ordenados por salario de menor a mayor.*/

SELECT nombre, cargo_emp FROM empleados ORDER BY sal_emp ASC;

/*9. Elabore un listado donde para cada fila, figure el alias ‘Nombre’ y ‘Cargo’ para las respectivas tablas de empleados.*/

SELECT nombre AS Nombre , cargo_emp AS Cargo FROM empleados;

/*10. Listar los salarios y comisiones de los empleados del departamento 2000, ordenado por comisión de menor a mayor.*/

SELECT sal_emp, comision_emp FROM empleados  WHERE id_depto = 2000 ORDER BY comision_emp ASC;

/*11. Obtener el valor total a pagar que resulta de sumar el salario y la comisión de los empleados del departamento
 3000 una bonificación de 500, en orden alfabético del empleado.*/
 
 SELECT nombre, sal_emp + comision_emp + 500 AS Total FROM empleados WHERE id_depto = 3000 ORDER BY nombre ASC;
 
/*12. Muestra los empleados cuyo nombre empiece con la letra J.*/

SELECT * FROM empleados WHERE nombre LIKE 'J%';

/*13. Listar el salario, la comisión, el salario total (salario + comisión) y nombre, de aquellos empleados que tienen comisión superior a 1000.*/

SELECT nombre, sal_emp, comision_emp, sal_emp+comision_emp AS Salario_Total FROM empleados WHERE  comision_emp > 1000;

/*14. Obtener un listado similar al anterior, pero de aquellos empleados que NO tienen comisión.*/

SELECT nombre, sal_emp, comision_emp, sal_emp+comision_emp AS Salario_Total FROM empleados WHERE  comision_emp = 0;

/*15. Obtener la lista de los empleados que ganan una comisión superior a su sueldo.*/

SELECT * FROM empleados WHERE comision_emp > sal_emp;

/*16. Listar los empleados cuya comisión es menor o igual que el 30% de su sueldo.*/

SELECT * FROM empleados WHERE comision_emp <= sal_emp*0.3;

/*17. Hallar los empleados cuyo nombre no contiene la cadena “MA”*/

SELECT * FROM empleados WHERE nombre NOT LIKE '%ma%';

/*18. Obtener los nombres de los departamentos que  sean “Ventas” , “Investigación” y ‘Mantenimiento.*/

SELECT nombre_depto FROM departamentos WHERE nombre_depto = 'Ventas' OR nombre_depto = 'Investigación' OR nombre_depto = 'Mantenimiento' ;

/*19. Ahora obtener los nombres de los departamentos que no sean “Ventas” ni “Investigación” ni ‘Mantenimiento.*/

SELECT nombre_depto FROM departamentos WHERE nombre_depto <> 'Ventas' AND nombre_depto <> 'Investigación' AND nombre_depto <> 'Mantenimiento' ;

/*20. Mostrar el salario más alto de la empresa.*/

SELECT MAX(sal_emp) FROM empleados ;

/*21. Mostrar el nombre del último empleado de la lista por orden alfabético.*/

SELECT MAX(nombre) FROM empleados;

/*22. Hallar el salario más alto, el más bajo y la diferencia entre ellos.*/

SELECT MAX(sal_emp) AS Maximo, MIN(sal_emp) AS Minimo, MAX(sal_emp) - MIN(sal_emp) AS Diferencia FROM empleados;

/*23. Hallar el salario promedio por departamento.*/

SELECT AVG(e.sal_emp),  d.nombre_depto FROM empleados e, departamentos d WHERE e.id_depto = d.id_depto GROUP BY d.nombre_depto;

/*Consultas con Having
/*24. Hallar los departamentos que tienen más de tres empleados. Mostrar el número de empleados de esos departamentos.*/

SELECT d.nombre_depto, COUNT(*) FROM departamentos d, empleados e WHERE (d.id_depto = e.id_depto) GROUP BY d.nombre_depto HAVING COUNT(*)>=3;

/*25. Mostrar el código y nombre de cada jefe, junto al número de empleados que dirige. Solo los que tengan más de dos empleados (2 incluido).*/

SELECT cod_jefe, nombre, COUNT(*) AS Num_Empleados FROM empleados GROUP BY cod_jefe HAVING COUNT(cod_jefe)>=2;

/*26. Hallar los departamentos que no tienen empleados*/

SELECT d.nombre_depto, COUNT(*) AS Num_Empleados FROM departamentos d, empleados e WHERE (d.id_depto = e.id_depto) GROUP BY d.nombre_depto HAVING COUNT(*) =0 ;

/*Consulta con Subconsulta*/
/*27. Mostrar la lista de los empleados cuyo salario es mayor o igual que el promedio de la empresa. Ordenarlo por departamento.*/

SELECT nombre, sal_emp, id_depto FROM empleados WHERE sal_emp >= (SELECT AVG(sal_emp) FROM empleados) ORDER BY id_depto ;

SELECT e.nombre, e.sal_emp, d.nombre_depto FROM empleados e, departamentos d WHERE (d.id_depto = e.id_depto) AND sal_emp >= (SELECT AVG(sal_emp) FROM empleados) ORDER BY e.id_depto ;