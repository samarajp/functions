package br.rio.puc.binarytree.model;

import br.rio.puc.graph.model.No;
import br.rio.puc.piecewisebus.estimator.TreeEstimator;

public class ArvoreBinaria {
    
	private No raiz;
    private ArvoreBinaria arvoreEsquerda;
    private ArvoreBinaria arvoreDireita;

    public ArvoreBinaria() { }

    public ArvoreBinaria getArvoreDireita() {
        return arvoreDireita;
    }

    public void setArvoreDireita(ArvoreBinaria arvoreDireita) {
        this.arvoreDireita = arvoreDireita;
    }

    public ArvoreBinaria getArvoreEsquerda() {
        return arvoreEsquerda;
    }

    public void setArvoreEsquerda(ArvoreBinaria arvoreEsquerda) {
        this.arvoreEsquerda = arvoreEsquerda;
    }

    public No getRaiz() {
        return raiz;
    }

    public void setRaiz(No raiz) {
        this.raiz = raiz;
    }

    public void insereBusData(TreeEstimator tree_list) {
        No no = new No(tree_list);
        inserir(no);
    }

    public void inserir(No no) {
        if (this.raiz == null) {
        	this.raiz = no;
        } else {
            if (no.getElements().getMiddleTime() > this.raiz.getElements().getMiddleTime()) {
                if (this.arvoreDireita == null) {
                    this.arvoreDireita = new ArvoreBinaria();
                }
                this.arvoreDireita.inserir(no);
            } else if (no.getElements().getMiddleTime() < this.raiz.getElements().getMiddleTime()) {
                if (this.arvoreEsquerda == null) {
                    this.arvoreEsquerda = new ArvoreBinaria();
                }
                this.arvoreEsquerda.inserir(no);
            }
        }
    }
    
       public void percorrerInOrder() {
        if (this.raiz == null) {
           return;
        }
        else{
        System.out.println("\nMiddleTime: " + this.raiz.getElements().getMiddleTime());
        System.out.println("Function: " + this.raiz.getElements().getFunction());
        System.out.println("Media: " + this.raiz.getElements().getMedia());
        System.out.println("Standard Deviation: " + this.raiz.getElements().getStandardDeviation());
        }
        if (this.arvoreEsquerda != null) {
            this.arvoreEsquerda.percorrerInOrder();
        }
        
        if (this.arvoreDireita != null) {
            this.arvoreDireita.percorrerInOrder();
        }
    }

    public void percorrerPreOrder() {
        if (this.raiz == null) {
           return;
        }
        else{
        System.out.println("\nMiddleTime: " + this.raiz.getElements().getMiddleTime());
        System.out.println("Function: " + this.raiz.getElements().getFunction());
        System.out.println("Media: " + this.raiz.getElements().getMedia());
        System.out.println("Standard Deviation: " + this.raiz.getElements().getStandardDeviation());
        }
        if (this.arvoreEsquerda != null) {
            this.arvoreEsquerda.percorrerPreOrder();
        }

        if (this.arvoreDireita != null) {
            this.arvoreDireita.percorrerPreOrder();
        }
    }

    public void percorrerPostOrder() {
        if (this.raiz == null) {
           return;
        }
        else{
        	System.out.println("\nMiddleTime: " + this.raiz.getElements().getMiddleTime());
            System.out.println("Function: " + this.raiz.getElements().getFunction());
            System.out.println("Media: " + this.raiz.getElements().getMedia());
            System.out.println("Standard Deviation: " + this.raiz.getElements().getStandardDeviation());
        }
        if (this.arvoreEsquerda != null) {
            this.arvoreEsquerda.percorrerPostOrder();
        }

        if (this.arvoreDireita != null) {
            this.arvoreDireita.percorrerPostOrder();
        }

        
       
    }

    public void busca(double timestamp) {
    	System.out.println("timestamp: "+ timestamp);
    	
    	if (this.raiz == null) {
    		System.out.println("Arvore vazia");
    		} else {
            if (timestamp == this.raiz.getElements().getMiddleTime()) {
        		System.out.println("timestamp: "+ timestamp);
        		System.out.println("getFunction: "+ (this.raiz.getElements().getFunction()*this.raiz.getElements().getMedia()));
            } else {
                if (timestamp > this.raiz.getElements().getMiddleTime()) {
                    if (this.arvoreDireita == null) {
                		System.out.println("Arvore direita vazia");
                    }
                    else{
                		System.out.println("getFunction: "+ (this.raiz.getElements().getFunction()*this.raiz.getElements().getMedia()));
                    	this.arvoreDireita.busca(timestamp);
                    }
                } else {
                    if (this.arvoreEsquerda == null) {
                		System.out.println("Arvore esquerda vazia");
                    }
                    else{
                		System.out.println("getFunction: "+ (this.raiz.getElements().getFunction()*this.raiz.getElements().getMedia()));
                    	this.arvoreEsquerda.busca(timestamp);
                    }
                }
            }
        }
    }
       
}