package br.rio.puc.piecewisebus.estimator;

import java.io.IOException;
import java.sql.SQLException;

import br.rio.puc.piecewisebus.dao.DAO;
import br.rio.puc.piecewisebus.function.PiecewiseException;
import br.rio.puc.binarytree.model.*;
import br.rio.puc.piecewisebus.model.ElementsTimestamp;

public class ManipulatorFunction {
	
	     public void build_treeEstimator(double timestamp, int id_edge, double gama_value) 
	    		 throws NumberFormatException, ClassNotFoundException, PiecewiseException, SQLException, IOException {

	    	 DAO dao = new DAO();
	    	 Statistic e = new Statistic();
	    	 ArvoreBinaria arvore = new ArvoreBinaria();
             TreeEstimator tree = new TreeEstimator();

	    	 //Obtem os valores das duracoes de viagem
	    	 double array[] = dao.getTotalTravelTime(id_edge);
             e.setArray(array);
          
             //Obtem os valores minimos e maximos de timestamp
             ElementsTimestamp time = dao.getMaxMinTimeValue(id_edge);

             //Construcao da arvore
             if (arvore.getRaiz() == null){
            	 
            	 tree.setMiddleTime(time.getMiddleTime());
		    	 tree.setFunction(1);
		    	 tree.setMedia(e.getMedia());
		    	 tree.setVariancia(e.getVariancia());
		    	 tree.setStandardDeviation(e.getDesvioPadrao());
		    	 tree.setEndTime(time.getEndTime());
		    	 
		    	 arvore.insereBusData(tree);
             }
             
             arvore.percorrerInOrder();

    		 //Filho da Esquerda
    		 double new_middletime = time.getStartTime() + ((time.getMiddleTime() - time.getStartTime()) / 2);
	    	 double arrayesq[] = dao.getTotalTravelTimeEsq(id_edge, new_middletime);
             e.setArray(arrayesq);
	    	 double desvio_padrao_esq = e.getDesvioPadrao();
	    	 double antigamedia_esq = e.getMedia();
	    	 
	    	 double tolerance = 0.5  * e.getDesvioPadrao() + (1-0.5) * e.getNewDesvioPadrao(e.getMedia(), new_middletime, e.getDesvioPadrao()); 
	    	 
             while(desvio_padrao_esq > tolerance){
            	 
                 tree.setMiddleTime(new_middletime);
		    	 tree.setVariancia(e.getVariancia());
		    	 tree.setMedia(e.getNewMedia(antigamedia_esq, e.getMedia()));
		    	 tree.setStandardDeviation(e.getNewDesvioPadrao(antigamedia_esq, e.getMedia(), desvio_padrao_esq));
        		 tree.setEndTime(time.getMiddleTime());
		    	 tree.setFunction(e.updateFunctionValue(gama_value, time.getStartTime(), tree.getEndTime(), timestamp));
		    	
		    	 arvore.insereBusData(tree);

		    	 new_middletime = time.getStartTime() + ((tree.getEndTime() - time.getStartTime()) / 2);
	             double arrayesq1[] = dao.getTotalTravelTimeEsq(id_edge, new_middletime);
	             e.setArray(arrayesq1);
	             desvio_padrao_esq = tree.getStandardDeviation();
	             
             }
             
             arvore.percorrerInOrder();

             //Filho da Direita
    		 new_middletime = time.getMiddleTime() + ((time.getEndTime() - time.getMiddleTime()) / 2);
	    	 double arraydir[] = dao.getTotalTravelTimeDir(id_edge, new_middletime);
             e.setArray(arraydir);
	    	 double desvio_padrao_dir = e.getDesvioPadrao();
	    	 double antigamedia_dir = e.getMedia();
 
             while(desvio_padrao_dir > tolerance){

                 tree.setMiddleTime(new_middletime);
		    	 tree.setVariancia(e.getVariancia());
		    	 tree.setMedia(e.getNewMedia(antigamedia_dir, e.getMedia()));
		    	 tree.setStandardDeviation(e.getNewDesvioPadrao(antigamedia_dir, e.getMedia(), desvio_padrao_dir));
        		 tree.setStartTime(time.getMiddleTime());
		    	 tree.setFunction(1 - (e.updateFunctionValue(gama_value, tree.getStartTime(), time.getEndTime(), timestamp)));

		    	 arvore.insereBusData(tree);

		    	 new_middletime = tree.getStartTime() + ((time.getEndTime() - tree.getStartTime()) / 2);
		    	 double arraydir1[] = dao.getTotalTravelTimeDir(id_edge, new_middletime);
	             e.setArray(arraydir1);
	             desvio_padrao_dir = tree.getStandardDeviation();
	             
	             arvore.percorrerInOrder();

             }
          
            arvore.busca(timestamp);
             
	     }
	     
 }