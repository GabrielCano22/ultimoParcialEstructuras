import java.util.LinkedList;
import java.util.Queue;

public class metodos {
    public static void clasificarEmpleados(empleados[] empleadosArray) {
        Queue<empleados> salarioMenor2500000 = new LinkedList<>();
        Queue<empleados> salarioEntre2500000y3000000 = new LinkedList<>();
        Queue<empleados> salarioMayor3000000 = new LinkedList<>();

        for (empleados empleado : empleadosArray) {
            if (empleado.salario < 2500000) {
                salarioMenor2500000.add(empleado);
            } else if (empleado.salario >= 2500000 && empleado.salario <= 3000000) {
                salarioEntre2500000y3000000.add(empleado);
            } else {
                salarioMayor3000000.add(empleado);
            }
        }

        System.out.println("Salarios menores a 2,500,000:");
        for (empleados empleado : salarioMenor2500000) {
            System.out.println(empleado);
        }

        System.out.println("\nSalarios entre 2,500,000 y 3,000,000:");
        for (empleados empleado : salarioEntre2500000y3000000) {
            System.out.println(empleado);
        }

        System.out.println("\nSalarios mayores a 3,000,000:");
        for (empleados empleado : salarioMayor3000000) {
            System.out.println(empleado);
        }
    }
}