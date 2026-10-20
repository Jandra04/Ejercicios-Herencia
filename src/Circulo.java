public class Circulo extends Figura{
    //Atributos
    private double Radio;
    //Constructor
    public Circulo (double Radio) {
        this.Radio = Radio;
    }
    //Getter
    public double getRadiop() {
        return Radio;
    }
    //Setter
    public void setRadio (double Radio) {
        this.Radio = Radio;
    }
    //Metodos
    @Override
    public double calcularArea() {
        return Math.PI * Radio * Radio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * Radio;
    }

    @Override
    public String toString() {
        return "El circulo tiene un radio de " + Radio + ".";
    }
}
