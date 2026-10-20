public class Rectangulo extends Figura{
    //Atributos
    private double Base;
    private double Altura;
    //Constructor
    public Rectangulo ( double Base, double Altura) {
        this.Base = Base;
        this.Altura = Altura;
    }
    //Getters
    public double getBase () {
        return Base;
    }

    public double getAltura() {
        return Altura;
    }
    //Setters
    public void setBase (double Base) {
        this.Base = Base;
    }

    public void setAltura() {
        this.Altura = Altura;
    }
    //Metodos
    @Override
    public double calcularArea() {
        return Base * Altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (Base + Altura);
    }

    @Override
    public String toString() {
        return "El rectangulo tiene una base de " + Base +
                " y una altura de " + Altura + ".";
    }
}

