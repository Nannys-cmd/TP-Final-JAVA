public class ArmaLarga extends Arma implements Comparable<ArmaLarga> {
    private boolean tieneSelloRENAR;
    private String descripcionUso;
    private int nivel; // del 1 al 5

    // Constructor
    public ArmaLarga(Policia policia, int cantidadMuniciones, int alcanceMetros, String marca, int calibre, String estado, boolean tieneSelloRENAR, String descripcionUso, int nivel) {
        super(policia, cantidadMuniciones, alcanceMetros, marca, calibre, estado);
        this.tieneSelloRENAR = tieneSelloRENAR;
        this.descripcionUso = descripcionUso;
        this.nivel = nivel;
    }

    // Métodos getters y setters para los campos adicionales

    // Implementación del método compareTo para comparar dos armas largas
    @Override
    public int compareTo(ArmaLarga otraArma) {
        return Integer.compare(this.nivel, otraArma.nivel);
    }

    // Método toString para imprimir los detalles del arma larga
    @Override
    public String toString() {
        return "ArmaLarga{" +
                "tieneSelloRENAR=" + tieneSelloRENAR +
                ", descripcionUso='" + descripcionUso + '\'' +
                ", nivel=" + nivel +
                ", " + super.toString() +
                '}';
    }
}
