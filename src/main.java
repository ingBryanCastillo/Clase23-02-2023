
import Controlador.nodoControlador;
import Vista.frmPrincipal;
import modelos.Nodo;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author umg
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        frmPrincipal VistaPrincipal = new frmPrincipal();
        Nodo modeloNodo = new Nodo("");
        nodoControlador controler = new nodoControlador(VistaPrincipal, modeloNodo);
         
    }
    
}
