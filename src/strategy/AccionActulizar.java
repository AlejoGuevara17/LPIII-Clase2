package src.strategy;

public class AccionActulizar implements Accion{

    @Override
     public void aplicar(){
        System.out.println("Estoy actualizando");
    }

    @Override
    public int getOpcion() {
        return 4;
    }
}
