package basic;



public class HelloWorldExercise {

    //Function de entrada y salida de la class
    public static void main(String[] args){
       nombreCompleto();
       saltoHolaMundo();
       annadeComentarios();
       edadColorCiudad();
       diferenteOutErr();
       formatoInterpoladoTexto();
       disennoSimbolos();
    }

    // 1. imprime un mensaje que diga tu nombre en lugar de ¡Hola Mundo!
    public static void nombreCompleto(){
        System.out.println("Giovanni");
    }

    // 2. Imprime dos líneas: "Hola" y luego "Mundo" con un solo println
     public static void saltoHolaMundo(){
        System.out.println("Hola \nMundo");
     }

     //3. Añade un comentario sobre lo que hace cada línea del programa.
    public static void annadeComentarios(){
        System.out.println("Se añade comentarios a cada parte del programa");
    }

    //4. Crea un comentario en varías líneas
    /*
    Java, lo voy a dominar y lo voy a lograr. Es un lenguaje bastante complejo y bien tipado. Pero, practicando y logrando entenderlo establecere nuevos skill. Rumbo a la transformación.
    */

    // 5. Imprime tu edad, tu color favorito y tu ciudad.
    public static void edadColorCiudad(){
        var edad = 38;
        var color = "Pasteles";
        var ciudad = "Santiago de Chile";

        System.out.println("Edad: " + edad);
        System.out.println("Color: " + color);
        System.out.println("Ciudad: " + ciudad);
    }

    // 6. Explora los diferentes System.XXX.println(); más allá de "out".
    public static void diferenteOutErr(){
        System.out.print("imprimir sin salto de línea");
        System.out.println("imprimir con salto de línea");
        System.out.println("---------------------------\n");
        System.out.printf("Id | Nombre | Apellido");
        System.out.println("---------------------------");
        System.out.printf("01 | Giovanni | Di Rosa");
        System.err.println("Texto con error");
        System.out.printf("%-4s | %-10s | %-15s%n", "Id", "Nombre", "Apellido");
        System.out.println("------------------------------------");
        System.out.printf("%-4s | %-10s | %-15s%n", "01", "Giovanni", "Di Rosa");
        System.out.printf("%-4s | %-10s | %-15s%n", "02", "María", "González");
        System.out.printf("%-4s | %-10s | %-15s%n", "10", "Carlos", "Pérez-Fernández");

    }

    // 7. Utiliza varios println para imprimir una frase.

    public static void formatoInterpoladoTexto(){
        var color = "Violeta";
        var edad= 38;
        var pais= "Chile";

        String info= """
                === MI información personal ===
                Edad: %d años,
                Color: %s, 
                Ciudad: %s
                """.formatted(edad, color, pais);
        System.out.print(info);
        int codigo = 404;
        String recurso = "Página no encontrada";
        System.err.printf("❌ Error %d: No se encontró %s%n", codigo, recurso);
    }

    // 8. Imprime un diseño ASCII (por ejmplo, cara feliz usando símbolos)
    public static void disennoSimbolos(){
        System.out.println("&#1F60A ^");
    }

    // 9. Intenta ejecutar el programa sin el método main y observar el error.
    // 10. Intenta cambiar el nombre del archivo a uno diferente del de la clase y compílalo. ¿Qué pasa?
}


