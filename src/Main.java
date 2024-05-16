import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static List<Policia> policias = new ArrayList<>();
    private static List<Arma> armas = new ArrayList<>();

    public static void main(String[] args) {
        // Crear objetos de prueba
        Policia policia1 = new Policia("Juan", "Perez", 1234);
        Policia policia2 = new Policia("Ana", "Gomez", 5678);

        policias.add(policia1);
        policias.add(policia2);

        ArmaCorta armaCorta = new ArmaCorta(policia1, 15, 250, "Glock", 9, "EN USO", true);
        ArmaLarga armaLarga1 = new ArmaLarga(policia2, 30, 500, "Remington", 12, "EN USO", true, "Uso táctico", 4);
        ArmaLarga armaLarga2 = new ArmaLarga(policia1, 25, 400, "Winchester", 10, "EN USO", false, "Uso defensivo", 3);

        armas.add(armaCorta);
        armas.add(armaLarga1);
        armas.add(armaLarga2);

        // Interactuar con el usuario
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el nombre del policía: ");
        String nombrePolicia = scanner.nextLine();
        System.out.print("Ingrese el tipo de arma (Corta/Larga): ");
        String tipoArma = scanner.nextLine();

        buscarYMostrarArma(nombrePolicia, tipoArma);
    }

    private static void buscarYMostrarArma(String nombrePolicia, String tipoArma) {
        for (Arma arma : armas) {
            Policia policia = arma.getPolicia();
            if (policia.getNombre().equalsIgnoreCase(nombrePolicia) &&
                    ((tipoArma.equalsIgnoreCase("Corta") && arma instanceof ArmaCorta) ||
                            (tipoArma.equalsIgnoreCase("Larga") && arma instanceof ArmaLarga))) {
                System.out.println(arma);
                if (arma.estaEnCondiciones()) {
                    System.out.println("El arma está en condiciones para ser usada.");
                } else {
                    System.out.println("El arma NO está en condiciones para ser usada.");
                }
                return;
            }
        }
        System.out.println("No se encontró un arma para el policía con el tipo especificado.");
    }
}

