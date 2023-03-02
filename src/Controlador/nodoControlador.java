/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Vista.frmPrincipal;
import javax.swing.table.DefaultTableModel;
import modelos.Lista;
import modelos.Nodo;
import modelos.registroNodos;

/**
 *
 * @author fabia
 */
public class nodoControlador implements ActionListener{

   frmPrincipal vistaPrincipal;
   Nodo nodo;
   Lista ListaNueva = new Lista();
   registroNodos RegistroNodo;
   DefaultTableModel TablaNodos = new DefaultTableModel();

    public nodoControlador(frmPrincipal vistaPrincipal, Nodo nodo) {
        this.vistaPrincipal = vistaPrincipal;
        this.nodo = nodo;
        
         this.TablaNodos.addColumn("Lista de nodos");
        
        

        this.vistaPrincipal.btnAgregarNodo.addActionListener(this);
       
                
                
        //Levantar la vista principal
        this.vistaPrincipal.setExtendedState(frmPrincipal.MAXIMIZED_BOTH);
        this.vistaPrincipal.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== this.vistaPrincipal.btnAgregarNodo){
            
            ListaNueva.InsertarNodo(this.vistaPrincipal.txtNodo.getText()); 
            this.ListaNueva.ListarNodos();
             
       }
       
           
    }
        
        
        
}
    