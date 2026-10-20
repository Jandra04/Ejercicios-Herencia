public class Gato extends Animal{
    private String Color;
    //Constructor
    public Gato(String Nombre, String Sexo, String Color) {
        super(Nombre, Sexo);
        this.Color = Color;
    }
    //Getter
    public String getColor() {
        return Color;
    }

    //Setter
    public void setColor (String Color) {
        this.Color = Color;
    }

//    Metodo Sobreescrito
@Override
public void hacerSonido() {

    super.hacerSonido();

    System.out.println(
            Nombre + " es " + Sexo +
                    ", de color " + Color +
                    ", y maúlla: Miau."
    );
}
    @Override
    public String toString()  {
        return "Gato: " + getNombre();
    }
}
