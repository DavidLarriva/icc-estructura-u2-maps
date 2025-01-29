import controllers.Ejercicios;
import controllers.EmpleadoContoller;
import controllers.Mapa;

import models.Empleado;

public class App {
    public static void main(String[] args) throws Exception {

        // Ejecuta el ejemplo de uso de HashMap con ejemplos sencillos
        //runMapExamlpe();

        // Ejecuta el ejemplo de gestión de empleados usando HashMap
        runEmpleadoExample();

        // Ejecuta los ejercicios de sumatoria y anagramas
        //runEjerccios();
    }

    private static void runEmpleadoExample() {
        EmpleadoContoller empleadoContoller = new EmpleadoContoller();

        boolean result = empleadoContoller.addEmpleado(new Empleado (1, "Pablo", "Senior"));

        System.out.println(result);
        
        empleadoContoller.addEmpleado(new Empleado(2, "David", "Jefe"));
        
        boolean result1 = empleadoContoller.addEmpleado(new Empleado (1, "Pablo", "Senior"));



         System.out.println("Ingreso: " + result1);



        empleadoContoller.displayEmpleadosSoloNombres();
    
    }

    private static void runMapExamlpe() {
        new Mapa();
    }

    private static void runEjerccios() {
        throw new UnsupportedOperationException("Not implemented yet");

    }

    

}
