public class Animal {
    protected String Nombre;
    protected String Sexo;

    //Constructor
    public Animal(String Nombre, String Sexo) {
        this.Nombre = Nombre;
        this.Sexo = Sexo;
    }

    //Getter
    public String getNombre() {
        return Nombre;
    }

    public String getSexo() {
        return Sexo;
    }

    //Setter
    public void SetNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    //    Metodo
    public void hacerSonido() {
        System.out.println(Nombre + "Emite un sonido.");
    }

    @Override
    public String toString() {
        return "El animal se llama " + Nombre + " y es " + Sexo + ".";
    }
}