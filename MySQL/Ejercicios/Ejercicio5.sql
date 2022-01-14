#1. Devuelve un listado con el código de oficina y la ciudad donde hay oficinas.

SELECT codigo_oficina, ciudad FROM oficina;

#2. Devuelve un listado con la ciudad y el teléfono de las oficinas de España.

SELECT ciudad, telefono FROM oficina WHERE pais LIKE 'España';

#3. Devuelve un listado con el nombre, apellidos y email de los empleados cuyo jefe tiene un código de jefe igual a 7.

SELECT nombre, apellido1, apellido2, email FROM empleado WHERE codigo_jefe = 7;

#4. Devuelve el nombre del puesto, nombre, apellidos y email del jefe de la empresa.

SELECT puesto, nombre, apellido1, apellido2, email FROM empleado WHERE codigo_jefe IS NULL;

#5. Devuelve un listado con el nombre, apellidos y puesto de aquellos empleados que no sean representantes de ventas.

SELECT puesto, nombre, apellido1, apellido2 FROM empleado WHERE puesto NOT LIKE 'Representante Ventas';

#6. Devuelve un listado con el nombre de los todos los clientes españoles.

SELECT nombre FROM cliente WHERE pais LIKE 'Spain';

#7. Devuelve un listado con los distintos estados por los que puede pasar un pedido.

SELECT estado FROM pedido GROUP BY estado;

#8. Devuelve un listado con el código de cliente de aquellos clientes que realizaron algún pago en 2008. Tenga en cuenta que deberá eliminar 
#aquellos códigos de cliente que aparezcan repetidos. Resuelva la consulta:

#  o Utilizando la función YEAR de MySQL.
#  o Utilizando la función DATE_FORMAT de MySQL.
#  o Sin utilizar ninguna de las funciones anteriores.

SELECT c.* FROM cliente c, pago p 
WHERE c.codigo_cliente = p.codigo_cliente AND
YEAR(p.fecha_pago) LIKE '2008';

SELECT c.* FROM cliente c, pago p 
WHERE c.codigo_cliente = p.codigo_cliente AND
date_format(p.fecha_pago, "%Y") LIKE '2008';

SELECT c.* FROM cliente c, pago p 
WHERE c.codigo_cliente = p.codigo_cliente AND
p.fecha_pago LIKE '%2008%';

#9. Devuelve un listado con el código de pedido, código de cliente, fecha esperada y fecha de entrega de los pedidos
# que no han sido entregados a tiempo.

SELECT codigo_pedido, codigo_cliente, fecha_esperada, fecha_entrega FROM pedido WHERE fecha_entrega > fecha_esperada;

#10. Devuelve un listado con el código de pedido, código de cliente, fecha esperada y
#fecha de entrega de los pedidos cuya fecha de entrega ha sido al menos dos días antes de la fecha esperada.
#  o Utilizando la función ADDDATE de MySQL.
#  o Utilizando la función DATEDIFF de MySQL.

SELECT codigo_pedido, codigo_cliente, fecha_esperada, fecha_entrega FROM pedido WHERE (fecha_entrega - fecha_esperada) >= 2;


#11. Devuelve un listado de todos los pedidos que fueron rechazados en 2009.

SELECT * FROM pedido WHERE estado LIKE 'rechazado' AND '2009' IN(YEAR(fecha_pedido),YEAR(fecha_esperada),YEAR(fecha_entrega), NULL);

#12. Devuelve un listado de todos los pedidos que han sido entregados en el mes de enero de cualquier año.

SELECT * FROM pedido WHERE estado LIKE 'Entregado' AND 
fecha_entrega LIKE '%01%';

#13. Devuelve un listado con todos los pagos que se realizaron en el año 2008 mediante Paypal. Ordene el resultado de mayor a menor.

SELECT * FROM pago WHERE forma_pago LIKE 'PayPal' AND YEAR(fecha_pago) LIKE '2009';

#14. Devuelve un listado con todas las formas de pago que aparecen en la tabla pago.
#Tenga en cuenta que no deben aparecer formas de pago repetidas.

SELECT forma_pago FROM pago GROUP BY forma_pago;

#15. Devuelve un listado con todos los productos que pertenecen a la gama
#Ornamentales y que tienen más de 100 unidades en stock. El listado deberá estar
#ordenado por su precio de venta, mostrando en primer lugar los de mayor precio.

SELECT * FROM producto WHERE gama LIKE 'Ornamentales' AND cantidad_en_stock > 100 ORDER BY precio_venta DESC;

#16. Devuelve un listado con todos los clientes que sean de la ciudad de Madrid y cuyo
#representante de ventas tenga el código de empleado 11 o 30.

SELECT * FROM cliente WHERE ciudad LIKE 'Madrid' AND codigo_empleado_rep_ventas IN (11,30);

#Consultas multitabla (Composición interna)
#Las consultas se deben resolver con INNER JOIN.
#1. Obtén un listado con el nombre de cada cliente y el nombre y apellido de su representante de ventas.

SELECT c.nombre_cliente, e.nombre 
FROM cliente c INNER JOIN empleado e ON c.codigo_empleado_rep_ventas = e.codigo_empleado;

#2. Muestra el nombre de los clientes que hayan realizado pagos, junto con el nombre de sus representantes de ventas.

SELECT c.nombre_cliente,c.codigo_cliente,p.codigo_cliente, e.nombre 
FROM cliente c,empleado e, pago p
WHERE c.codigo_empleado_rep_ventas = e.codigo_empleado AND c.codigo_cliente = p.codigo_cliente; 

#3. Muestra el nombre de los clientes que no hayan realizado pagos junto con el nombre de sus representantes de ventas.  //revisar

SELECT c.nombre_cliente,c.codigo_cliente, e.nombre 
FROM cliente c,empleado e, pago p
WHERE c.codigo_empleado_rep_ventas = e.codigo_empleado AND  c.codigo_cliente NOT IN (SELECT codigo_cliente FROM pedido) GROUP BY c.nombre_cliente; 


SELECT codigo_cliente FROM pago GROUP BY codigo_cliente;

#4. Devuelve el nombre de los clientes que han hecho pagos y el nombre de sus representantes junto con la ciudad
#de la oficina a la que pertenece el representante.

SELECT c.nombre_cliente,c.codigo_cliente,p.codigo_cliente, e.nombre, o.ciudad
FROM cliente c,empleado e, pago p, oficina o
WHERE c.codigo_empleado_rep_ventas = e.codigo_empleado AND c.codigo_cliente = p.codigo_cliente AND e.codigo_oficina = o.codigo_oficina ; 

#5. Devuelve el nombre de los clientes que no hayan hecho pagos y el nombre de sus
#representantes junto con la ciudad de la oficina a la que pertenece el representante.



#6. Lista la dirección de las oficinas que tengan clientes en Fuenlabrada.
#7. Devuelve el nombre de los clientes y el nombre de sus representantes junto con la
#ciudad de la oficina a la que pertenece el representante.
#8. Devuelve un listado con el nombre de los empleados junto con el nombre de sus jefes.
#9. Devuelve el nombre de los clientes a los que no se les ha entregado a tiempo un pedido.
#10. Devuelve un listado de las diferentes gamas de producto que ha comprado cada cliente.
