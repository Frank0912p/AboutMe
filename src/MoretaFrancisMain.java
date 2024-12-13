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
        System.out.println(myMoretaFrancisPerfil.formatoPerfil());
    }
}