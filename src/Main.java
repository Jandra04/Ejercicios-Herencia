public class Main {

    public static void main(String[] args) {

        // Sistema animal
        Animal animal1 = new Animal(
                "Toby",
                "Macho"
        );

        animal1.hacerSonido();


        // Sistema gato
        Gato gato1 = new Gato(
                "Luna",
                "Hembra",
                "Tricolor"
        );

        gato1.hacerSonido();


        // Sistema figuras
        Figura figura1 = new Figura();

        System.out.println("Area de figura: " + figura1.calcularArea());
        System.out.println("Perimetro de figura: " + figura1.calcularPerimetro());


        // Sistema rectangulo
        Rectangulo Rectangulo1 = new Rectangulo(
                5,
                3
        );

        System.out.println(Rectangulo1);
        System.out.println("Area: " + Rectangulo1.calcularArea());
        System.out.println("Perimetro: " + Rectangulo1.calcularPerimetro());


        // Sistema circulo
        Circulo circulo1 = new Circulo(
                4
        );

        System.out.println(circulo1);
        System.out.println("Area: " + circulo1.calcularArea());
        System.out.println("Perimetro: " + circulo1.calcularPerimetro());


        // Sistema empleado
        Empleado empleado1 = new Empleado(
                "Carlos",
                "Mora",
                "Programador"
        );

        empleado1.trabajar();

        System.out.println(
                "Salario mensual: $" +
                        empleado1.calcularSalario()
        );


        // Sistema recursos humanos
        EmpleadoRH empleadoRH1 = new EmpleadoRH(
                "Sofia",
                "Ramirez",
                "Encargada de recursos humanos"
        );

        empleadoRH1.trabajar();

        empleadoRH1.contratarEmpleado(empleado1);

        System.out.println(
                "Salario mensual: $" +
                        empleadoRH1.calcularSalario()
        );
    }
}