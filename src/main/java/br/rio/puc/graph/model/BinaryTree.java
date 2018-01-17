package br.rio.puc.graph.model;

import java.io.IOException;
import java.sql.SQLException;

import br.rio.puc.piecewisebus.dao.DAO;
import br.rio.puc.piecewisebus.function.PiecewiseException;

public class BinaryTree {
    private Node root;
    DAO dao = new DAO();

    public boolean isEmpty(){
        if(root == null){
            return true;
        }
        return false;
    }
    
    public void imprimirArvore(){
        if(this.root == null)
            System.out.println("ร?rvore vazia");
        else
            imprimirArvore(this.root);
    }
    
    private void imprimirArvore(Node node){
        if(node.getNoEsquerda() != null){
            imprimirArvore(node.getNoEsquerda());
        }
        if (node.getNoDireita() != null){
            imprimirArvore(node.getNoDireita());
        }
        System.out.println("Nรณ: " + node.getValor());
    }
    
    public void inserir(double middletime, double start_time, double end_time, double media, double variancia, double desvio_padrao) throws ClassNotFoundException, PiecewiseException, SQLException, IOException{
    	inserir(this.root, middletime, start_time, end_time, media, variancia, desvio_padrao);
    }
       
    public void inserir(Node node, double middletime, double start_time,  double end_time, double media, double variancia, 
    		double desvio_padrao) throws ClassNotFoundException, PiecewiseException, SQLException, IOException {
        
    	if(this.root == null){
            this.root = new Node(middletime);
            dao.insertDataFuction(middletime, start_time, end_time, media, variancia, desvio_padrao);
        } else {
            if (middletime < node.getValor()) {
            	if (node.getNoEsquerda() != null) { 
                    node.setNoEsquerda(new Node(middletime)); 
                } else { 
                    dao.insertDataFuction(middletime, start_time, end_time, media, variancia, desvio_padrao);
                } 
            } else if (middletime > node.getValor()) { 
                if (node.getNoDireita() != null) { 
                    node.setNoDireita(new Node(middletime)); 
                } else {
                    dao.insertDataFuction(middletime, start_time, end_time, media, variancia, desvio_padrao);
                } 
            }
        }
    }
    
}