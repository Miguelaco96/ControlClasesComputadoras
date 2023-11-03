
package mundopc;

public class Orden {
    private int idOrden;
    private Computadora computadora[];
    private static int contadorOrdenes;
    private static int contadorComputadora;
    private static final int MAX_COMPUTADORAS = 10;

    public Orden() {
        this.idOrden = ++Orden.contadorOrdenes;
        
        this.computadora = new Computadora[Orden.MAX_COMPUTADORAS];
        
    }
    public void agregarComputadora(Computadora computadora){
        
        
        
        if (contadorComputadora< MAX_COMPUTADORAS) {
           
           this.computadora[this.contadorComputadora++] = computadora;
          
        }else{
            System.out.println("Maximo de computadoras alcanzado");
        }
        
    }
    public void mostrarOrden(){
        
        System.out.println("Orden: "+ this.idOrden);
       
        
        for (int i = 0; i < contadorComputadora; i++) {
            
             System.out.println(this.computadora[i]);
            
            
            
        }
    }
   
    
    
    
}


