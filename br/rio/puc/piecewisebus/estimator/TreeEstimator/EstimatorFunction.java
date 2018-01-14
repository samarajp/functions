package br.rio.puc.piecewisebus.estimator;

import java.io.IOException;
import java.sql.SQLException;
import br.rio.puc.piecewisebus.dao.DAO;
import br.rio.puc.piecewisebus.function.PiecewiseException;
import br.rio.puc.piecewisebus.model.ElementsTimestamp;

public class EstimatorFunction {
	
	     public void build_treeEstimator(double timestamp, int id_edge, double tolerance, double gama_value) 
	    		 throws NumberFormatException, ClassNotFoundException, PiecewiseException, SQLException, IOException {

	    	 DAO dao = new DAO();
	    	 Statistic e = new Statistic();
	    	 BinaryTree tree = new BinaryTree();

	    	 //Obtem os valores das duracoes de viagem
	    	 double array[] = dao.getTotalTravelTime(id_edge);
             e.setArray(array);
          
             //Obtem os valores minimos e maximos de timestamp
             ElementsTimestamp time = dao.getMaxMinTimeValue(id_edge);
             
             System.out.println("time.getMiddleTime: "+time.getMiddleTime());
             System.out.println("time.getStartTime: "+time.getStartTime());
             System.out.println("time.getEndTime: "+time.getEndTime());
             System.out.println("e.getMedia(): "+e.getMedia());
             System.out.println("e.getVariancia(): "+e.getVariancia());
             System.out.println("e.getDesvioPadrao(): "+e.getDesvioPadrao());
             
	    	 System.out.println("\n");
	    	 System.out.println("\n");

	    	 double antigamedia_esq = e.getMedia();
	    	 double antigamedia_dir = e.getMedia();


	    	 tree.inserir(time.getMiddleTime(), time.getStartTime(), time.getEndTime(), 
            		 e.getMedia(), e.getVariancia(), e.getDesvioPadrao());
		    
    		 //Filho da Esquerda
    		 double new_middletime = time.getStartTime() + ((time.getMiddleTime() - time.getStartTime()) / 2);
	    	 double arrayesq[] = dao.getTotalTravelTimeEsq(id_edge, new_middletime);
	    	 e.setArray(arrayesq);
	    	// double desvio_padrao_esq = e.getNewDesvioPadrao(antigamedia_esq, e.getMedia(), e.getDesvioPadrao());
	    	 double desvio_padrao_esq = e.getDesvioPadrao();
	    	 
	    	 tree.inserir(new_middletime, time.getStartTime(), time.getMiddleTime(), 
            		 e.getNewMedia(antigamedia_esq, e.getMedia()), e.getVariancia(), 
            		 desvio_padrao_esq);
	    	 
             while(desvio_padrao_esq < tolerance){

                 new_middletime = time.getStartTime() + ((time.getMiddleTime() - time.getStartTime()) / 2);
	             double arrayesq1[] = dao.getTotalTravelTimeEsq(id_edge, new_middletime);
		    	 e.setArray(arrayesq1);
		    	 desvio_padrao_esq = e.getNewDesvioPadrao(antigamedia_esq, e.getMedia(), e.getDesvioPadrao());
		    	 
		    	 if(desvio_padrao_esq < tolerance){
		    		 tree.inserir(new_middletime, time.getStartTime(), time.getMiddleTime(), 
                		 e.getNewMedia(antigamedia_esq, e.getMedia()), e.getVariancia(), 
                		 desvio_padrao_esq);
		    	 }
             }
             
             //Filho da Direita
    		 new_middletime = time.getMiddleTime() + ((time.getEndTime() - time.getMiddleTime()) / 2);
	    	 double arraydir[] = dao.getTotalTravelTimeDir(id_edge, new_middletime);
             e.setArray(arraydir);
	    	 double desvio_padrao_dir = e.getDesvioPadrao();
	    	 
	    	 tree.inserir(new_middletime, time.getMiddleTime(), time.getEndTime(), 
            		 e.getNewMedia(antigamedia_dir, e.getMedia()), e.getVariancia(), 
            		 desvio_padrao_dir);
 
             while(desvio_padrao_dir < tolerance){

                 new_middletime = time.getMiddleTime() + ((time.getEndTime() - time.getMiddleTime()) / 2);
		    	 double arraydir1[] = dao.getTotalTravelTimeDir(id_edge, new_middletime);
	             e.setArray(arraydir1);
	             desvio_padrao_dir = e.getNewDesvioPadrao(antigamedia_dir, e.getMedia(), e.getDesvioPadrao());
		    	 
		    	 if(desvio_padrao_dir < tolerance){
		    		 tree.inserir(new_middletime, time.getMiddleTime(), time.getEndTime(), 
	                		 e.getNewMedia(antigamedia_esq, e.getMedia()), e.getVariancia(), 
	                		 desvio_padrao_dir);
		    	 }
             }   
	     }
	     
 }