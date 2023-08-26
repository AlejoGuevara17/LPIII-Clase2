package src.package2;

import src.builder.Empleado;
import src.factorymethod.CreadorPizza;
import src.factorymethod.CreadorPizzaHawaiana;
import src.factorymethod.CreadorPizzaSalami;
import src.factorymethod.Pizza;
import src.prototype.Estudiante;
import src.singleton.Singleton;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
  //      Empleado empleado = Empleado.builder()
        //            .id(123L)
         //       .nombre("Jorge")
          //      .build();
        //System.out.println(empleado);

       // Estudiante estudiante = new Estudiante("sebastian", 123L, 8);
        //Estudiante estudiante2 = estudiante.clone();

        //System.out.println( estudiante == estudiante2);
        //System.out.println("Estudiante 1"+estudiante);
        //System.out.println("Estudiante 2"+estudiante2);


        CreadorPizza creadorPizza= new CreadorPizzaSalami();

        Pizza pizza= crearPizza(creadorPizza);

        System.out.println(pizza);
    }

    public static Pizza crearPizza(CreadorPizza creadorPizza){
        return creadorPizza.crear();

    }
}
