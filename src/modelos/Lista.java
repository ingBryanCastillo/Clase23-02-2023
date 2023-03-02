/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author umg
 */
public class Lista {
Nodo primero;


public void InsertarNodo(String dato)
{
  Nodo nodoNuevo = new Nodo(dato);
  if(primero == null)
  {
      primero = nodoNuevo;
  }
  else 
  {
      nodoNuevo.siguiente = primero;
      primero = nodoNuevo;
  }
}

public void ListarNodos()
{
    Nodo Auxiliar;
    Auxiliar = primero;
    while(Auxiliar!=null)
    {
        System.out.println(Auxiliar.getDato());
        Auxiliar = Auxiliar.siguiente;
    }


}

}
