package main;

/**
 *
 * @author ana.csantos119
 */
public class No {
    public Object elemento;
    public No prox;

    public No(Object elemento, No prox) {
        this.elemento = elemento;
        this.prox = prox;
    }

    public No() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public ObjectgetElemento() {
        return elemento;
    }

    public No getProx() {
        return prox;
    }

    public void setElemento(int elemento) {
        this.elemento = elemento;
    }

    public void setProx(No prox) {
        this.prox = prox;
    }

    @Override
    public String toString() {
        return "No{" + "elemento=" + elemento + ", prox=" + prox + '}';
    }
}
