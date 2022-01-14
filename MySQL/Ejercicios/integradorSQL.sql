#CANDADO A
#Posición: El candado A está ubicado en la posición calculada a partir del número obtenido en la/s siguiente/s consulta/s:
#Muestre cuántas veces los jugadores lograron tener más o la misma cantidad de
#asistencias por partido, que el máximo de asistencias por partido.
#Este resultado nos dará la posición del candado (1, 2, 3 o 4)

SELECT COUNT(Asistencias_por_partido)
FROM estadisticas
WHERE Asistencias_por_partido >= (SELECT MAX(Asistencias_por_partido) FROM estadisticas);

#Clave: La clave del candado A estará con formada por la/s siguientes consulta/s a la base de datos:
#Muestre la suma total del peso de los jugadores, donde la conferencia sea Este y la posición
#sea centro o esté comprendida en otras posiciones.

SELECT SUM(j.peso) FROM jugadores j ,equipos e  
WHERE j.Nombre_equipo = e.Nombre AND
e.Conferencia LIKE 'East'
AND j.Posicion LIKE '%C%';

#CANDADO B
#Posición: El candado B está ubicado en la posición calculada a partir del número obtenido en la/s siguiente/s consulta/s:
#Muestre la cantidad de jugadores que poseen más asistencias por partidos, que el numero
#de jugadores que tiene el equipo Heat.
#Este resultado nos dará la posición del candado (1, 2, 3 o 4)

SELECT COUNT(jugador)
FROM estadisticas
WHERE Asistencias_por_partido >= (SELECT COUNT(codigo) FROM jugadores WHERE Nombre_equipo LIKE 'Heat');


#Clave: La clave del candado B estará con formada por la/s siguientes consulta/s a la base de datos:
#La clave será igual al conteo de partidos jugados durante las temporadas del año 1999.

SELECT COUNT(codigo) FROM partidos WHERE temporada LIKE '%99%';


#CANDADO C
#Posición: El candado C está ubicado en la posición calculada a partir del número obtenido en la/s siguiente/s consulta/s:
#La posición del código será igual a la cantidad de jugadores que proceden de Michigan y forman parte de equipos de la conferencia oeste.
#Al resultado obtenido lo dividiremos por la cantidad de jugadores cuyo peso es mayor o igual
#a 195, y a eso le vamos a sumar 0.9945.
#Este resultado nos dará la posición del candado (1, 2, 3 o 4)


SELECT ROUND((COUNT(j.codigo)/(SELECT COUNT(codigo) FROM jugadores WHERE peso >= 195)+0.9945)) AS posicion
FROM jugadores j, equipos e
WHERE j.Nombre_equipo = e.Nombre AND 
Procedencia LIKE 'Michigan' AND e.Conferencia LIKE 'West';

#Clave: La clave del candado C estará con formada por la/s siguientes consulta/s a la base de datos:
#Para obtener el siguiente código deberás redondear hacia abajo el resultado que se
#devuelve de sumar: 
#el promedio de puntos por partido, 
#el conteo de asistencias por partido,
#y la suma de tapones por partido.
#Además, este resultado debe ser, donde la división sea central.

SELECT FLOOR( AVG(e.Puntos_por_partido) +  COUNT(e.Asistencias_por_partido) + SUM(e.Tapones_por_partido)) AS claveC
FROM estadisticas e, jugadores j, equipos
WHERE (e.jugador = j.codigo AND j.Nombre_equipo = equipos.nombre) AND
equipos.Division LIKE 'Central';


#CANDADO D
#Posición: El candado D está ubicado en la posición calculada a partir del número obtenido en la/s siguiente/s consulta/s:
#Muestre los tapones por partido del jugador Corey Maggette durante la temporada 00/01.
#Este resultado debe ser redondeado. Nota: el resultado debe estar redondeado
#Este resultado nos dará la posición del candado (1, 2, 3 o 4)

SELECT ROUND(e.Tapones_por_partido) FROM estadisticas e, jugadores j
WHERE e.jugador = j. codigo AND
j.Nombre LIKE 'Corey Maggette' AND
e.temporada LIKE '00/01';

#Clave: La clave del candado D estará con formada por la/s siguientes consulta/s a la base de datos:
#Para obtener el siguiente código deberás redondear hacia abajo, la suma de puntos por
#partido de todos los jugadores de procedencia argentina.

SELECT FLOOR(SUM(e.Puntos_por_partido)) FROM estadisticas e, jugadores j
WHERE e.jugador = j. codigo AND
j.Procedencia LIKE 'Argentina';


#A 2
#A 14043

#B 3
#B 3480

#C 1
#C 631

#D 4
#D 191