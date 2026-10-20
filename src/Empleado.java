public class Empleado {
    //Atributos
    protected String Nombre;
    protected String Apellidos;
    protected String Puesto;

    protected static final int HORAS_TRABAJADAS_DIA = 8;
    protected static final double PAGO_HORA = 10;
    //Constructor
    public Empleado (String Nombre, String Apellidos, String Puesto) {
        this.Nombre = Nombre;
        this.Apellidos = Apellidos;
        this.Puesto = Puesto;
    }
    //Getters
    public String getNombre() {
        return Nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public String getPuesto () {
        return Puesto;
    }
    //Setters
    public void setNombre (String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellidos (String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public void setPuesto (String Puesto) {
        this.Puesto = Puesto;
    }
    //Metodos

    public void trabajar() {
        System.out.println(
                Nombre + " " + Apellidos +
                        " trabaja como " + Puesto + "."
        );
    }


    public double calcularSalario() {

        int diasTrabajadosMes = 5 * 4;

        return HORAS_TRABAJADAS_DIA * PAGO_HORA * diasTrabajadosMes;
    }


    @Override
    public boolean equals(Object obj) {

        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Empleado otroEmpleado = (Empleado) obj;

        return Nombre.equals(otroEmpleado.Nombre)
                && Apellidos.equals(otroEmpleado.Apellidos)
                && Puesto.equals(otroEmpleado.Puesto);
    }


    @Override
    public String toString() {

        return Nombre + " " + Apellidos +
                " trabaja como " + Puesto + ".";
    }
}
