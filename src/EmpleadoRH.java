public class EmpleadoRH extends Empleado{
  //Constructor
    public EmpleadoRH(String Nombre, String Apellidos, String Puesto) {
        super(Nombre, Apellidos, Puesto);
    }

//Metodos
    public void contratarEmpleado(Empleado empleado) {

        System.out.println(
                Nombre + " " + Apellidos +
                        " contrató a " +
                        empleado.getNombre() + " " +
                        empleado.getApellidos() +
                        " para el puesto de " +
                        empleado.getPuesto() + "."
        );
    }


    @Override
    public String toString() {

        return Nombre + " " + Apellidos +
                " trabaja en Recursos Humanos como " +
                Puesto + ".";
    }
}
