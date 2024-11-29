import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numEmpleados =0;
        String nombre = "", apellido = "";
        double salario = 0.0;

        System.out.println("Ingrese el número de empleados:");
        numEmpleados = sc.nextInt();

        empleados[] empleadosArray = new empleados[numEmpleados];

        for (int i = 0; i < numEmpleados; i++) {
            System.out.println("Ingrese el nombre del empleado " + (i + 1) + ":");
            nombre = sc.next();

            System.out.println("Ingrese el apellido del empleado " + (i + 1) + ":");
            apellido = sc.next();

            System.out.println("Ingrese el salario del empleado " + (i + 1) + ":");
            salario = sc.nextDouble();

            empleadosArray[i] = new empleados(nombre, apellido, salario);
        }

        metodos.clasificarEmpleados(empleadosArray);
    }
}