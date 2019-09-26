package main;

/**
 *
 * @author victor.salves5
 */
public class Pilha {
private Object item[];
private No topo;
private int tam;

    public Pilha (int maxTam){
    this.item  = new Object[maxTam];
    this.topo = null;
    this.tam = 0;

    }

    Pilha() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
public void empilha (Object x) throws Exception{
No aux = this.topo;

this.topo = new No(x,aux);
//this.topo.elemento = (int) x;
//this.topo.prox = aux;
this.tam++;

}  

public Object desempilha() throws Exception{
if (this.vazia())
throw new Exception ( "Erro : A pilha esta vazia" );
Object elemento = this.topo.getElemento();
this.topo = this.topo.getProx();
this.tam--;
return elemento;



}
public boolean vazia() {
return (this.topo == null);
}
public int tamanho () {
return this.tam;
}
    
}
