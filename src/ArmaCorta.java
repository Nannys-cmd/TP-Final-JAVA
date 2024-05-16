public class ArmaCorta extends Arma {
    private boolean esAutomatica;

    public ArmaCorta(Policia policia, int cantidadMuniciones, int alcanceMetros, String marca, int calibre, String estado, boolean esAutomatica) {
        super(policia, cantidadMuniciones, alcanceMetros, marca, calibre, estado);
        this.esAutomatica = esAutomatica;
    }

    // Getter
    public boolean isEsAutomatica() {
        return esAutomatica;
    }

    // Método para verificar si el arma puede disparar a más de 200 metros
    public boolean puedeDispararALargaDistancia() {
        return getAlcanceMetros() > 200;
    }

    // Método toString para imprimir los detalles del arma
    @Override
    public String toString() {
        return "ArmaCorta{" +
                "esAutomatica=" + esAutomatica +
                ", " + super.toString() +
                '}';
    }
}
