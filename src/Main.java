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
                {"¿Qué operador se utiliza para sumar?", "a. +", "b. -", "c. *", "d. /"}
        };

        String[] respuestas = {
                "d", "a", "b", "c", "a", "c", "b", "d", "a"
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
                scanner.close();
                return;
            }
        }
        System.out.println("Puntuación: " + puntos + "/" + preguntas.length);
        System.out.println("Respuestas incorrectas: " + (preguntas.length - puntos));
        System.out.println("Nota final: " + (puntos * 10.0 / preguntas.length));
        scanner.close();
    }
}
