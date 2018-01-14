package br.rio.puc.piecewisebus.estimator;

public class Node {


    private double valor;


    private Node noEsquerda;


    private Node noDireita;  


    public Node() { }


  


   public Node(double time_value) {


        super();


        this.valor = time_value;


    }


    public double getValor() {


        return valor;


    }


    public void setValor(double valor) {


        this.valor = valor;


    }


    public Node getNoEsquerda() {


        return noEsquerda;


    }


    public void setNoEsquerda(Node noEsquerda) {


        this.noEsquerda = noEsquerda;


    }


  public Node getNoDireita() {


        return noDireita;


    }


    public void setNoDireita(Node noDireita) {


        this.noDireita = noDireita;


    }




    @Override


    public String toString() {


        return "Node [valor=" + valor + "]";


    }    


}