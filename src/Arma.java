public class Arma {
    private Policia policia;
    private int cantidadMuniciones;
    private int alcanceMetros;
    private String marca;
    private int calibre;
    private String estado; // "NUEVA", "EN MANTENIMIENTO", "EN USO"

    // Constructor
    public Arma(Policia policia, int cantidadMuniciones, int alcanceMetros, String marca, int calibre, String estado) {
        this.policia = policia;
        this.cantidadMuniciones = cantidadMuniciones;
        this.alcanceMetros = alcanceMetros;
        this.marca = marca;
        this.calibre = calibre;
        this.estado = estado;
    }

    // Métodos getters
    public Policia getPolicia() {
        return policia;
    }

    public int getCantidadMuniciones() {
        return cantidadMuniciones;
    }

    public int getAlcanceMetros() {
        return alcanceMetros;
    }

    public String getMarca() {
        return marca;
    }

    public int getCalibre() {
        return calibre;
    }

    public String getEstado() {
        return estado;
    }

    // Métodos setters
    public void setPolicia(Policia policia) {
        this.policia = policia;
    }

    public void setCantidadMuniciones(int cantidadMuniciones) {
        this.cantidadMuniciones = cantidadMuniciones;
    }

    public void setAlcanceMetros(int alcanceMetros) {
        this.alcanceMetros = alcanceMetros;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setCalibre(int calibre) {
        this.calibre = calibre;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    // Método para verificar si el arma está en condiciones de uso
    public boolean estaEnCondiciones() {
        return "EN USO".equals(estado) && calibre >= 9;
    }

    // Método toString para imprimir los detalles del arma
    @Override
    public String toString() {
        return "Arma{" +
                "policia=" + policia +
                ", cantidadMuniciones=" + cantidadMuniciones +
                ", alcanceMetros=" + alcanceMetros +
                ", marca='" + marca + '\'' +
                ", calibre=" + calibre +
                ", estado='" + estado + '\'' +
                '}';
    }
}
