package ec.edu.ister.controlador;

import ec.edu.ister.vista.*;
import ec.edu.ister.vista.subForms.FrmFigCirculo;
import ec.edu.ister.vista.subForms.FrmIngDatosArea;
import ec.edu.ister.vista.subForms.FrmIngDatosPerimetro;

/**
  * @Instituto Rumiñahui
 * @author SSolis
 */
public class Coordinador {
    Login login= new Login(this);
    Circulo circulo = new Circulo(this);
    Cuadrado cuadrado= new Cuadrado(this);
    Triangulo triangulo =new Triangulo(this);
    FrmFigCirculo ffc = new FrmFigCirculo(this);
    FrmIngDatosArea fia = new FrmIngDatosArea(this);
    FrmIngDatosPerimetro fip=new FrmIngDatosPerimetro(this);
    public void mostrarIngresoPerimetro(){
        fip.setSize(1500,1500);
        circulo.escritorio.removeAll();
        circulo.escritorio.add(fip);
        ffc.setVisible(true);
        circulo.escritorio.revalidate();
        circulo.escritorio.repaint();
    }
    public void mostrarIngresoArea(){
        fia.setSize(1500,1500);
        circulo.escritorio.removeAll();
        circulo.escritorio.add(fia);
        ffc.setVisible(true);
        circulo.escritorio.revalidate();
        circulo.escritorio.repaint();
    }
    
    
    public void mostarFiguraCirculo(){
        ffc.setSize(1500,1500);
        circulo.escritorio.removeAll();
        circulo.escritorio.add(ffc);
        ffc.setVisible(true);
        circulo.escritorio.revalidate();
        circulo.escritorio.repaint();
    }
    
    
    public void mostrarLogin(){
        login.setVisible(true);
    }
    public void mostrarCirculo(){
        circulo.setVisible(true);
    }
    public void mostrarCuadrado(){
        cuadrado.setVisible(true);
    }
    public void mostarTriangulo(){
        triangulo.setVisible(true);
    }

     public void ocultarLogin(){
        login.setVisible(false);
    }
    public void ocultarCirculo(){
        circulo.setVisible(false);
    }
    public void ocultarCuadrado(){
        cuadrado.setVisible(false);
    }
    public void ocultarTriangulo(){
        triangulo.setVisible(false);
    }
    
    
}
