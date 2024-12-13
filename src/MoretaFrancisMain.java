import java.util.Scanner;

public class MoretaFrancisMain {
    public static void main(String[] args) {
        MoretaFrancisMain programa = new MoretaFrancisMain();
        programa.inicio();
    }

    public void inicio() {
        MoretaFrancisPerfil myMoretaFrancisPerfil = new MoretaFrancisPerfil("Francis Moreta",
                "Estoy estudiando DAW en La Salle y creo que voy muy bien.",
                new String[]{"\uD83C\uDFCB\uFE0F", "\uD83E\uDDD7\u200D♀\uFE0F", "\uD83D\uDEB5\u200D♀\uFE0F"},
                new String[]{"\uD83C\uDF63", "\uD83C\uDF2D", "\uD83C\uDF2F"},
                new String[]{"Me gustan las vacas", "Estudie en Ecuador", "Me gusta el invierno"});
        int opcion;
        String menu = "Menu AboutMe " + myMoretaFrancisPerfil.getName() + "\n [1] Story\n [2] Favorites\n [3] Fun Fact\n [4] Salir";
        System.out.println(myMoretaFrancisPerfil.formatoPerfil());

        do {
            opcion = opcionDeUsuario(menu, 1, 4);
            switch (opcion) {
                case 1:
                    System.out.println(myMoretaFrancisPerfil.getStory());
                    break;
                case 2:
                    System.out.println(String.join(", ", myMoretaFrancisPerfil.getHobbies()) + ", "+ (String.join(", ", myMoretaFrancisPerfil.getFoods())));
                    break;
                case 3:
                    System.out.println((String.join(", ", myMoretaFrancisPerfil.getRandomFunFact())));
                    break;
                case 4:
                    System.out.println("Saliendo del programa...");
                    break;
            }
        } while (opcion != 4);
    }

    /**
     * Solicita y valida la opción que escoje el usuario dentro de un rango específico.
     * Muestra un menú al usuario y le pide que ingrese un número entero.
     * Verifica que el valor esté dentro del rango especificado (min y max) antes de aceptarlo.
     *
     * @param menu El texto del menú que se mostrará al usuario.
     * @param min El valor mínimo aceptable para la opción.
     * @param max El valor máximo aceptable para la opción.
     * @return El valor entero ingresado por el usuario que está dentro del rango especificado.
     */
    public int opcionDeUsuario(String menu, int min, int max) {
        Scanner input = new Scanner(System.in);
        int value = 0;
        boolean exit = false;

        do {
            System.out.println(menu);
            if (input.hasNextInt()) {
                value = input.nextInt();
                input.nextLine();
                if (value>=min && value<=max){
                    exit = true;
                }else{
                    System.out.println("ERROR: Valor fuera de rango "+min+"..."+max);
                }
            } else {
                System.out.println("ERROR: No has introducido un entero");
                input.nextLine();
            }
        }while(!exit);
        return value;
    }
}