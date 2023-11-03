
package test;

import mundopc.*;

public class MundoPC {
    
   public static void main(String[] args) {
        Monitor monitorHP = new Monitor("HP", 13);
        Teclado tecladoHP = new Teclado("bluetooth", "HP");
        Raton ratonHP = new Raton("bluetooth", "HP");
        Computadora computadoraHP = new Computadora("Computadora HP", monitorHP, tecladoHP, ratonHP );
        
        Monitor monitorHP2 = new Monitor("HP", 13);
        Teclado tecladoHP2 = new Teclado("bluetooth", "HP");
        Raton ratonHP2 = new Raton("bluetooth", "HP");
        Computadora computadoraHP2 = new Computadora("Computadora HP", monitorHP2, tecladoHP2, ratonHP2 );
        
        Orden orden1 = new Orden();
//        Orden orden2 = new Orden();
        
        orden1.agregarComputadora(computadoraHP);
        orden1.agregarComputadora(computadoraHP2);
      
//        orden2.agregarComputadora(computadoraHP);
//        orden2.agregarComputadora(computadoraHP2);
        
        orden1.mostrarOrden();
//        orden2.mostrarOrden();
    }
    
}
