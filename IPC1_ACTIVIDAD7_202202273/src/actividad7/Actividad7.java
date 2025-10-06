
package actividad7;
import model.*;
import view.*;
import controller.*;

public class Actividad7 {

    
    public static void main(String[] args) {
        Calculadora cal = new Calculadora();
        Usuario usu = new Usuario("Diego");
        
        ControladorCalculadora controlador = new ControladorCalculadora(usu, cal);
        
        VistaCalculadora vista = new VistaCalculadora();
        vista.setControlador(controlador);
        
        vista.setVisible(true);
        
    }
    
}
