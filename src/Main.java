import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int puntos = 0;

        String[][] preguntas = {
            // Parte 1: preguntas 1-9
            {"¿Cuál no es un tipo primitivo en Java?", "a. int", "b. char", "c. boolean", "d. String"},
            {"¿Qué tipo de dato almacena números enteros?", "a. int", "b. String", "c. boolean", "d. char"},
            {"¿Qué tipo almacena verdadero o falso?", "a. double", "b. boolean", "c. int", "d. String"},
            {"¿Qué símbolo termina una instrucción?", "a. :", "b. ,", "c. ;", "d. ."},
            {"¿Qué palabra se utiliza para crear una clase?", "a. class", "b. new", "c. void", "d. int"},
            {"¿Qué método inicia un programa Java?", "a. start", "b. run", "c. main", "d. init"},
            {"¿Qué tipo almacena un solo carácter?", "a. int", "b. char", "c. String", "d. float"},
            {"¿Qué clase permite leer datos del teclado?", "a. System", "b. Math", "c. String", "d. Scanner"},
            {"¿Qué operador se utiliza para sumar?", "a. +", "b. -", "c. *", "d. /"},
            {"¿Qué operador devuelve el resto de una división?", "a. /", "b. +", "c. %", "d. *"},
            {"¿Qué palabra se utiliza para una condición?", "a. for", "b. if", "c. class", "d. import"},
            {"¿Qué palabra se utiliza si la condición es falsa?", "a. else", "b. while", "c. return", "d. new"},
            {"¿Qué operador compara si dos valores son iguales?", "a. =", "b. !=", "c. ==", "d. >"},
            {"¿Qué operador significa diferente?", "a. ==", "b. !=", "c. >=", "d. <="},
            {"¿Qué operador significa AND lógico?", "a. ||", "b. !", "c. &&", "d. =="},
            {"¿Qué operador significa OR lógico?", "a. ||", "b. &&", "c. !", "d. %"},
            {"¿Qué operador significa NOT lógico?", "a. +", "b. !", "c. &&", "d. ||"},
            {"¿Qué bucle comprueba la condición antes de ejecutarse?", "a. if", "b. switch", "c. while", "d. class"}
        };

        String[] respuestas = {
            "d", "a", "b", "c", "a", "c", "b", "d", "a", "c", "b", "a", "c", "b", "c", "a", "b", "c"
        };

        for (int i = 0; i < preguntas.length; i++) {
            System.out.println("Pregunta " + (i + 1));
            for (int j = 0; j < preguntas[i].length; j++) {
                System.out.println(preguntas[i][j]);
            }
            String respuesta = scanner.nextLine().toLowerCase();
            if (respuesta.equals(respuestas[i])) {
                System.out.println("Respuesta correcta!");
                puntos++;
            } else if (respuesta.equals("a") || respuesta.equals("b") ||
                       respuesta.equals("c") || respuesta.equals("d")) {
                System.out.println("Respuesta incorrecta");
                System.out.println("Respuesta correcta: " + respuestas[i]);
            } else {
                System.out.println("Respuesta no válida");
                return;
            }
        }
        System.out.println("Puntuación: " + puntos + "/" + preguntas.length);
        System.out.println("Respuestas incorrectas: " + (preguntas.length - puntos));
        System.out.println("Nota final: " + (puntos * 10.0 / preguntas.length));
    }
}
