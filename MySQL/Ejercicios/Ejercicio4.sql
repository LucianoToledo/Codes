/*1. Mostrar el nombre de todos los jugadores ordenados alfabéticamente.*/

SELECT Nombre FROM jugadores ORDER BY Nombre;

/*2. Mostrar el nombre de los jugadores que sean pivots (‘C’) y que pesen más de 200
libras, ordenados por nombre alfabéticamente.*/

SELECT Nombre, Posicion, Peso FROM jugadores WHERE Posicion = 'C' AND Peso > 200 ORDER BY Nombre;

/*3. Mostrar el nombre de todos los equipos ordenados alfabéticamente.*/

SELECT Nombre FROM equipos ORDER BY Nombre;

/*4. Mostrar el nombre de los equipos del este (East).*/

SELECT Nombre FROM equipos WHERE Conferencia LIKE 'East';

/*5. Mostrar los equipos donde su ciudad empieza con la letra ‘c’, ordenados por nombre.*/

SELECT Nombre, Ciudad FROM equipos WHERE Ciudad LIKE 'C%' ORDER BY Nombre;

/*6. Mostrar todos los jugadores y su equipo ordenados por nombre del equipo.*/

SELECT Nombre, Nombre_equipo FROM jugadores ORDER BY Nombre_equipo;

/*7. Mostrar todos los jugadores del equipo “Raptors” ordenados por nombre.*/

SELECT Nombre, Nombre_equipo FROM jugadores WHERE Nombre_equipo LIKE 'Raptors' ORDER BY Nombre;

/*8. Mostrar los puntos por partido del jugador ‘Pau Gasol’.*/

SELECT COUNT(Puntos_por_partido) FROM estadisticas WHERE jugador = (SELECT codigo FROM jugadores WHERE Nombre LIKE 'Pau Gasol');

/*9. Mostrar los puntos por partido del jugador ‘Pau Gasol’ en la temporada ’04/05′.*/

SELECT Puntos_por_partido FROM estadisticas WHERE jugador = (SELECT codigo FROM jugadores WHERE Nombre LIKE 'Pau Gasol') AND temporada LIKE '04/05' ;

/*10. Mostrar el número de puntos de cada jugador en toda su carrera.*/

SELECT j.codigo ,j.Nombre, e.Puntos_por_partido FROM estadisticas e, jugadores j WHERE e.jugador = j.codigo GROUP BY j.Nombre;

/*11. Mostrar el número de jugadores de cada equipo.*/

SELECT Nombre_equipo, COUNT(Nombre) FROM jugadores GROUP BY Nombre_equipo;

/*12. Mostrar el jugador que más puntos ha realizado en toda su carrera. REVISARRRRRRRRRRRRRRRRRRRR*/ 

SELECT j.codigo ,j.Nombre, MAX(e.Puntos_por_partido) FROM estadisticas e, jugadores j WHERE e.jugador = j.codigo 
GROUP BY j.Nombre ORDER BY MAX(e.Puntos_por_partido) DESC ;

SELECt * from estadisticas WHERE jugador = 130;

/*13. Mostrar el nombre del equipo, conferencia y división del jugador más alto de la NBA.*/

SELECT e.Nombre, e.Conferencia, e.Division, j.altura ,j.Nombre FROM equipos e, jugadores j WHERE e.Nombre =j.Nombre_equipo ORDER BY j.Altura DESC LIMIT 1;

/*14. Mostrar la media de puntos en partidos de los equipos de la división Pacific.*/

SELECT AVG(p.puntos_local+p.puntos_visitante) FROM partidos p, equipos e WHERE e.Nombre IN (p.equipo_local, p.equipo_visitante) AND e.Division LIKE 'Pacific'; 

/*15. Mostrar el partido o partidos (equipo_local, equipo_visitante y diferencia) con mayor diferencia de puntos.*/

SELECT equipo_local,equipo_visitante, MAX(puntos_local-puntos_visitante) FROM partidos;

/*16. Mostrar la media de puntos en partidos de los equipos de la división Pacific.

IDEM 14

*/
/*17. Mostrar los puntos de cada equipo en los partidos, tanto de local como de visitante.*/

SELECT e.Nombre, p.puntos_local, p.puntos_visitante FROM partidos p, equipos e WHERE  e.Nombre IN (p.equipo_local, p.equipo_visitante) GROUP BY e.Nombre;

/*18. Mostrar quien gana en cada partido (codigo, equipo_local, equipo_visitante, equipo_ganador), en caso de empate sera null.*/

SELECT codigo, (CASE WHEN puntos_local > puntos_visitante THEN equipo_local ELSE(
				CASE WHEN puntos_local < puntos_visitante THEN equipo_visitante ELSE null end)end) AS Ganador
                FROM partidos;