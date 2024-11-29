public class empleados {
    String nombre ="";
    String apellido ="";
    double salario=0.0;

    empleados(String nombre, String apellido, double salario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
    }

    public String toString() {
        return "Nombre: " + nombre + ", Apellido: " + apellido + ", Salario: " + salario;
    }
}