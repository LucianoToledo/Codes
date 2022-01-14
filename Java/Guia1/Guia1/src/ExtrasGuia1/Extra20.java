/*
20. Los profesores del curso de programación de Egg necesitan llevar un registro de
las notas adquiridas por sus 10 alumnos para luego obtener una cantidad de
aprobados y desaprobados. Durante el periodo de cursado cada alumno obtiene 4
notas, 2 por trabajos prácticos evaluativos y 2 por parciales. Las ponderaciones de
cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final
del programa los profesores necesitan obtener por pantalla la cantidad de
aprobados y desaprobados, teniendo en cuenta que solo aprueban los alumnos
con promedio mayor o igual al 7 de sus notas del curso.
 */
package ExtrasGuia1;

public class Extra20 {

    public static void main(String[] args) {

        int aprob = 0, desap = 0;
        float suma = 0, prom;

        int[][] notas = new int[10][5];

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                notas[i][j] = (int) (Math.random() * 10);
            }
        }

        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas.length; j++) {
                switch (j) {
                    case 0:
                        suma = (int) (notas[i][j] * 0.1 + suma);
                        break;
                    case 1:
                        suma = (int) (notas[i][j] * 0.15 + suma);
                        break;
                    case 2:
                        suma = (int) (notas[i][j] * 0.25 + suma);
                        break;
                    case 3:
                        suma = (int) (notas[i][j] * 0.5 + suma);
                        break;
                    case 4:
                        prom = suma / 4;
                        notas[i][4] = (int) prom;
                        if (prom >= 7) {
                            aprob++;
                        } else {
                            desap++;
                        }
                        break;
                }
            }
        }

        System.out.println("Cantidad de aprobados -->" + aprob);
        System.out.println("Cantidad de desaprobados -->" + desap);

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("|" + notas[i][j] + "|");
            }
            System.out.println("");
        }
    }
}
