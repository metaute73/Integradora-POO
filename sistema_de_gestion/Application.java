import java.util.ArrayList;
import java.util.Scanner;
import modelos.Empleado;
public class Application{
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //menu();
        new Empleado("Pedro",24,300.50, "Finanzas");
        new Empleado("Luis", 25, 215.39, "Computación");
        new Empleado("Jose", 25, 215.39, "Computación");
        new Empleado("Jaime",27,308.50, "Ensamble");
        //mostrarEmpleados(Empleado.empleados);
        //mostrarEmpleadosLuis(Empleado.empleados);
        bubbleSort(Empleado.empleados, "salario");
        mostrarEmpleados(Empleado.empleados);

    }
     /* public static void menu(){
         int opcion=0;
         do{
             textMenu();
             opcion=sc.nextInt();
          switch(opcion){
            case 1:
          default:
            System.out.println("Ingrese una opción válida entre 1 y 7");

break;            
            }
         }while(opcion!=7);
     } */
    public static void mostrarEmpleadosLuis(ArrayList<Empleado> empleados) {
        int cont = 1;
        System.out.print("Indice | ");
        System.out.print("Nombre | ");
        System.out.print("Edad | ");
        System.out.print("Salario | ");
        System.out.print("Departamento | ");
        System.out.println(' ');

        for (Empleado emp : empleados) {
            System.out.print((cont + 1) + "\t");
            System.out.print(emp.getNombre() + "\t");
            System.out.print(emp.getEdad() + "\t");
            System.out.print(emp.getSalario() + "\t");
            System.out.print(emp.getDepartamento() + "\t");
            System.out.println(" ");
            cont++;
        }
    }

    static ArrayList<Empleado> filtrarEmpleados(ArrayList<Empleado> empleados, String atributo, String valor) {
        ArrayList<Empleado> empleadosFiltrados = new ArrayList<>();
        
        return empleadosFiltrados;
    }
    
    static void bubbleSort(ArrayList<Empleado> list, String atributo) {
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                switch(atributo){
                    case "nombre":
                        //if (list.get(j).getNombre().toLowerCase().charAt(0) > list.get(j + 1).getNombre().toLowerCase().charAt(0)) {
                        if(list.get(j).getNombre().compareToIgnoreCase(list.get(j+1).getNombre())>0){
                            Empleado temp = list.get(j);
                            list.set(j, list.get(j + 1));
                            list.set(j + 1, temp);
                            //list.get(j).getNombre().compareToIgnoreCase(list.get(j+1).getNombre())
                        }
                        break;
                    case "edad":
                        if (list.get(j).getEdad() > list.get(j + 1).getEdad()) {
                            Empleado temp = list.get(j);
                            list.set(j, list.get(j + 1));
                            list.set(j + 1, temp);
                        }
                        break;
                    case "salario":
                    if (list.get(j).getSalario() > list.get(j + 1).getSalario()) {
                        Empleado temp = list.get(j);
                        list.set(j, list.get(j + 1));
                        list.set(j + 1, temp);
                    }
                    break;
                        
            }
            }
        }
    }
    public static void mostrarEmpleados(ArrayList<Empleado> empleados) {
        System.out.print("Indice | ");
        System.out.print("Nombre | ");
        System.out.print("Edad | ");
        System.out.print("Salario | ");
        System.out.print("Departamento | ");
        System.out.println(' ');

        for (int i = 0; i < empleados.toArray().length; i++) {
            System.out.print(empleados.get(i).getNombre() + " ");
            System.out.print(empleados.get(i).getEdad() + " ");
            System.out.print(empleados.get(i).getSalario() + " ");
            System.out.print(empleados.get(i).getDepartamento() + " ");
            System.out.println();
            }
            
        }
        public static void textMenu(){
            String texto = """
            SISTEMA DE GESTION
            Ingrese una opción
            1. Mostrar todos los empleados
            2. Crear empleado
            3. Filtrar empleados
            4. Ordenar empleados
            5. Incrementar salario
            6. Limpiar filtros
            7. Salir
            """;
            
        }
        
       /* public static Empleado incrementarSalario(Empleado empleado, double porcentaje){
            for(empleados e: emp){
                if(){
                }
            }
        }
        */
    }
    