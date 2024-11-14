package modelos;
import java.util.ArrayList;

public class Empleado {
    public static Integer numero_empleados = 0;
    public static ArrayList<Empleado> empleados = new ArrayList<>();
    
    private String nombre;
    private Integer edad;
    private Double salario;
    private String departamento;

    // CONSTRUCTOR
    public Empleado(String nombre, Integer edad, Double salario, String departamento) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
        this.departamento = departamento;
        empleados.add(this);
        numero_empleados++;
    }

    // GETTERS Y SETTERS
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public Integer getEdad() {
        return edad;
    }
    public void setEdad(Integer edad) {
        if (edad < 0) {
            System.err.println("¡LA EDAD NO PUEDE SER MENOR QUE CERO!");
        }
        else {
            this.edad = edad;
        }
    }
    public Double getSalario() {
        return salario;
    }
    public void setSalario(Double salario) {
        if (salario < 0) {
            System.err.println("¡EL SALARIO NO PUEDE SER MENOR QUE CERO!");
        }
        else {
            this.salario = salario;
        }
    }
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        if (departamento.length() == 0) {
            System.err.println("¡UN EMPLEADO DEBE TENER UN DEPARTAMENTO ASIGNADO!");
        }
        this.departamento = departamento;
    }
    // FIN - GETTERS Y SETTERS
}