/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula_06;

/**
 *
 * @author ana.csantos119
 */
public class ListaEncadeada {
    private No ini;
    
    //Cria lista vazia
    public ListaEncadeada() {
        this.ini = null;
    }
    
    public boolean vazia(){
        return ini==null;
    }

    @Override
    public String toString() {
        String strLista="";
        No temp=ini;
        while(temp!=null){
            strLista+=temp.getElemento()+",";
            temp=temp.getProx();
        }
        return strLista;  
    }
    public void insereInicio(int elemento){
        No novo = new No(elemento,ini);
        ini=novo;
    }
    public void insereFinal(int elemento){
        No novo = new No(elemento,null);
        No temp=ini;
        
        if (temp==null){
            //lista vazia
            ini=novo;
        } else {
            //Para 1 ou mais nodes na lista
            while (temp.getProx()!=null){
                temp=temp.getProx();
            }
            temp.setProx(novo);  
        }
    }
    
    public void insereFinalR(int elemento){
        insereFinalR(ini,elemento);
    }
    public void insereFinalR(No temp,int elemento){
       
         //lista vazia, inseri no início
        if (temp==null){
            No novo = new No(elemento,ini);
            ini=novo;    
        } else {
            //Para 1 ou mais nodes na lista
            if(temp.getProx()==null){
                No novo = new No(elemento,null);
                temp.setProx(novo);  
            } else {
                insereFinalR(temp.getProx(),elemento);
            }
        }
        
    }
    public void insereOrdenado(int elemento){
        No novo = new No(elemento,ini);
        No temp=ini;
        No anterior=null;
        
        while(temp!=null && temp.getElemento()<novo.getElemento()){
            anterior=temp;
            temp=temp.getProx();
        }
        //lista vazia
        if (anterior==null){
            ini=novo;
            
        } else{
            novo.setProx(anterior.getProx());
            anterior.setProx(novo);
        }
    }
    public void insereOrdenadoR(int elemento){
        insereOrdenadoR(null,ini,elemento);
    }
    public void insereOrdenadoR(No anterior,No temp,int elemento){
        //Lista vazia
        if (temp==null){
            No novo = new No(elemento,ini);
            ini=novo;  
        } else{
            No novo = new No(elemento,null);
            if (anterior!=null && temp.getElemento()>novo.getElemento()){
                novo.setProx(anterior.getProx());
                anterior.setProx(novo);
            } else {
                if (anterior==null && temp.getElemento()>novo.getElemento()){
                    novo.setProx(ini);
                    ini=novo;
                } else{
                    insereOrdenadoR(temp,temp.getProx(),elemento);
                  }
            }
        }
    }
    public boolean buscaLinearIt(int x){
        No temp=ini;
        while (temp!=null){
            if (temp.getElemento()==x){
                return true;
            }
            temp=temp.getProx();
        }
        return false;
    }
    
    public boolean buscaLinearR(int x){
        return buscaLinearR(ini,x);
    }
    public boolean buscaLinearR(No temp, int x){
       
        if (temp==null)
            return false;    
        if (temp.getElemento()==x)
            return true;
        return buscaLinearR(temp.getProx(),x);
    }
    
    public No buscaLinearIt2(int x){
        No temp=ini;
        while (temp!=null){
            if (temp.getElemento()==x){
                return temp;
            }
            temp=temp.getProx();
        }
        return null;
    }
    
    public No buscaLinearR2(int x){
        return buscaLinearR2(ini,x);
    }
    public No buscaLinearR2(No temp,int x){
        if (temp==null || temp.getElemento()==x)
            return temp;
        
        return buscaLinearR2(temp.getProx(),x);
    }
}
