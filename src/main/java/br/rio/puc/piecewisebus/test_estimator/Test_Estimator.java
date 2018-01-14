package br.rio.puc.piecewisebus.test_estimator;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.Random;

import br.rio.puc.piecewisebus.estimator.EstimatorFunction;
import br.rio.puc.piecewisebus.function.PiecewiseException;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Test_Estimator {
	

	public static PrintWriter pw_training_11 = null;
	public static PrintWriter pw_training_18_05 = null;
	public static PrintWriter pw_training_18_1 = null;
	public static PrintWriter pw_training_18_1_5 = null;
	public static PrintWriter pw_training_16_05 = null;
	public static PrintWriter pw_training_16_1 = null;
	public static PrintWriter pw_training_16_1_5 = null;
	
	public static PrintWriter pw_training_11_2016 = null;
	public static PrintWriter pw_training_12_2016 = null;
	
	public static PrintWriter pw_2015 = null;
	public static PrintWriter pw_2016 = null;

	static StringBuilder sb_training_11 = new StringBuilder();
	static StringBuilder sb_training_18_05 = new StringBuilder();
	static StringBuilder sb_training_18_1 = new StringBuilder();
	static StringBuilder sb_training_18_1_5 = new StringBuilder();
	static StringBuilder sb_training_16_05 = new StringBuilder();
	static StringBuilder sb_training_16_1 = new StringBuilder();
	static StringBuilder sb_training_16_1_5 = new StringBuilder();

	static StringBuilder sb_training_11_2016 = new StringBuilder();
	static StringBuilder sb_training_18_05_2016 = new StringBuilder();
	
	static StringBuilder sb_2015 = new StringBuilder();
	static StringBuilder sb_2016 = new StringBuilder();


	public static void main(String[] args) 
		throws NumberFormatException, ClassNotFoundException, PiecewiseException, SQLException, IOException {
		// TODO Auto-generated method stub

        int array_2015[] = new int[24]; 
        int array_2016[] = new int[24]; 
        long inicio;
        long fim;
		double g = (1 / 2) + ((15 * 15) / 16) * 1 - ((5 * Math.pow(15,3)) / 8) * Math.pow(1,3) + ((3 * Math.pow(15,5)) / 16) * Math.pow(1,5);
		double function = 0;
		int tempo = 0;

        inicio = System.currentTimeMillis();
        
        try{
			pw_2015 = new PrintWriter(new File("C:\\Users\\Sam\\git\\pw_setembro_2015.csv"));		    
		   } catch (FileNotFoundException e) {
			    e.printStackTrace();
		 }
        Random gerador = new Random();
		Test_Training_Tercas_2015 test = new Test_Training_Tercas_2015(); 

		sb_2015.append("timestamp");
		sb_2015.append(';');
		sb_2015.append("function");
		sb_2015.append(';');
		sb_2015.append("tempo busca");
		sb_2015.append('\n');
		
		sb_2015.append("00:00");
		sb_2015.append(';');
		function = 688350 * g + 738297.3 * g + 550187.5 * g + 380545.5 * g;
		sb_2015.append(function);
		sb_2015.append(';');
		tempo = 10 + gerador.nextInt(300);
		sb_2015.append(tempo);
		sb_2015.append('\n');
        
	 	sb_2015.append("00:15");
		sb_2015.append(';');
		function = 688350 * g + 738297.3 * g + 550187.5 * g + 380545.5 * g;
		sb_2015.append(function);
		sb_2015.append(';');
		tempo = 10 + gerador.nextInt(300);
		sb_2015.append(tempo);
		sb_2015.append('\n');
        
		
		sb_2015.append("00:30");
		sb_2015.append(';');
		function = 688350 * g + 738297.3 * g + 550187.5 * g + 380545.5 * g;
		sb_2015.append(function);
		sb_2015.append(';');
		tempo = 10 + gerador.nextInt(300);
		sb_2015.append(tempo);
		sb_2015.append('\n');
        
				
		sb_2015.append("00:45");
		sb_2015.append(';');
		function = 688350 * g + 738297.3 * g + 550187.5 * g + 380545.5 * g;
		sb_2015.append(function);
		sb_2015.append(';');
		tempo = 10 + gerador.nextInt(300);
		sb_2015.append(tempo);
		sb_2015.append('\n');
        
		
		sb_2015.append("01:00");
		sb_2015.append(';');
		function = 688350 * g + 738297.3 * g + 550187.5 * g + 380545.5 * g;
		sb_2015.append(function);
		sb_2015.append(';');
		tempo = 10 + gerador.nextInt(300);
		sb_2015.append(tempo);
		sb_2015.append('\n');
        
				
		sb_2015.append("01:15");
		sb_2015.append(';');
		function = 688350 * g + 738297.3 * g + 550187.5 * g + 380545.5 * g;
		sb_2015.append(function);
		sb_2015.append(';');
		tempo = 10 + gerador.nextInt(300);
		sb_2015.append(tempo);
		sb_2015.append('\n');
        
		
		sb_2015.append("01:30");
		sb_2015.append(';');
		function = 688350 * g + 738297.3 * g + 550187.5 * g + 923400 * (1 - g);
		sb_2015.append(function);
		sb_2015.append(';');
		tempo = 10 + gerador.nextInt(300);
		sb_2015.append(tempo);
		sb_2015.append('\n');
        
		
		sb_2015.append("01:45");
		sb_2015.append(';');
		function = 688350 * g + 738297.3 * g + 550187.5 * g + 923400 * (1 - g);
		sb_2015.append(function);
		sb_2015.append(';');
		tempo = 10 + gerador.nextInt(300);
		sb_2015.append(tempo);
		sb_2015.append('\n');
        
		
		sb_2015.append("02:00");
		sb_2015.append(';');
		function = 688350 * g + 738297.3 * g + 550187.5 * g + 923400 * (1 - g);
		sb_2015.append(function);
		sb_2015.append(';');
		tempo = 10 + gerador.nextInt(300);
		sb_2015.append(tempo);
		sb_2015.append('\n');
        
		
		sb_2015.append("02:15");
		sb_2015.append(';');
		function = 688350 * g + 738297.3 * g + 550187.5 * g + 923400 * (1 - g);
		sb_2015.append(function);
		sb_2015.append(';');
		tempo = 10 + gerador.nextInt(300);
		sb_2015.append(tempo);
		sb_2015.append('\n');
        
		
		sb_2015.append("02:30");
		sb_2015.append(';');
		function = 688350 * g + 738297.3 * g + 550187.5 * g + 923400 * (1 - g);
		sb_2015.append(function);
		sb_2015.append(';');
		tempo = 10 + gerador.nextInt(300);
		sb_2015.append(tempo);
		sb_2015.append('\n');
        
		
		sb_2015.append("02:45");
		sb_2015.append(';');
		function = 688350 * g + 738297.3 * g + 550187.5 * g + 923400 * (1 - g);
		sb_2015.append(function);
		sb_2015.append(';');
		tempo = 10 + gerador.nextInt(300);
		sb_2015.append(tempo);
		sb_2015.append('\n');
        
		
		sb_2015.append("03:00");
		sb_2015.append(';');
		function = 688350 * g + 738297.3 * g + 881619 * (1 - g) + 493600 * g;
		sb_2015.append(function);
		sb_2015.append(';');
		tempo = 10 + gerador.nextInt(300);
		sb_2015.append(tempo);
		sb_2015.append('\n');
        
		
		sb_2015.append("03:15");
		sb_2015.append(';');
		function = 688350 * g + 738297.3 * g + 881619 * (1 - g) + 493600 * g;
		sb_2015.append(function);
		sb_2015.append(';');
		tempo = 10 + gerador.nextInt(300);
		sb_2015.append(tempo);
		sb_2015.append('\n');
        
		
		sb_2015.append("03:30");
		sb_2015.append(';');
		function = 688350 * g + 738297.3 * g + 881619 * (1 - g) + 493600 * g;
		sb_2015.append(function);
		sb_2015.append(';');
		tempo = 10 + gerador.nextInt(300);
		sb_2015.append(tempo);
		sb_2015.append('\n');
        
		
		sb_2015.append("03:45");
		sb_2015.append(';');
		function = 688350 * g + 738297.3 * g + 881619 * (1 - g) + 493600 * g;
		sb_2015.append(function);
		sb_2015.append(';');
		tempo = 10 + gerador.nextInt(300);
		sb_2015.append(tempo);
		sb_2015.append('\n');
        
		
		sb_2015.append("04:00");
		sb_2015.append(';');
		function = 688350 * g + 738297.3 * g + 881619 * (1 - g) + 493600 * g;
		sb_2015.append(function);
		sb_2015.append(';');
		tempo = 10 + gerador.nextInt(300);
		sb_2015.append(tempo);
		sb_2015.append('\n');
        
		
		sb_2015.append("04:15");
		sb_2015.append(';');
		function = 688350 * g + 738297.3 * g + 881619 * (1 - g) + 493600 * g;
		sb_2015.append(function);
		sb_2015.append(';');
		tempo = 10 + gerador.nextInt(300);
		sb_2015.append(tempo);
		sb_2015.append('\n');
        
		
		sb_2015.append("04:30");
		sb_2015.append(';');
		function = 688350 * g + 738297.3 * g + 881619 * (1 - g) + 493600 * g;
		sb_2015.append(function);
		sb_2015.append(';');
		tempo = 10 + gerador.nextInt(300);
		sb_2015.append(tempo);
		sb_2015.append('\n');
        
		
		sb_2015.append("04:45");
		sb_2015.append(';');
		function = 688350 * g + 738297.3 * g + 881619 * (1 - g) + 1002875 * (1 - g);
		sb_2015.append(function);
		sb_2015.append(';');
		tempo = 10 + gerador.nextInt(300);
		sb_2015.append(tempo);
		sb_2015.append('\n');
        
		sb_2015.append("05:00");
		sb_2015.append(';');
		function = 688350 * g + 738297.3 * g + 881619 * (1 - g) + 1002875 * (1 - g);
		sb_2015.append(function);
		sb_2015.append(';');
		tempo = 10 + gerador.nextInt(300);
		sb_2015.append(tempo);
		sb_2015.append('\n');
        
		
		sb_2015.append("05:15");
		sb_2015.append(';');
		function = 688350 * g + 738297.3 * g + 881619 * (1 - g) + 1002875 * (1 - g);
		sb_2015.append(function);
		sb_2015.append(';');
		tempo = 10 + gerador.nextInt(300);
		sb_2015.append(tempo);
		sb_2015.append('\n');
        
		
		sb_2015.append("05:30");
		sb_2015.append(';');
		function = 688350 * g + 738297.3 * g + 881619 * (1 - g) + 1002875 * (1 - g);
		sb_2015.append(function);
		sb_2015.append(function);
		sb_2015.append(';');
		tempo = 10 + gerador.nextInt(300);
		sb_2015.append(tempo);
		sb_2015.append('\n');
        
		
		sb_2015.append("05:45");
		sb_2015.append(';');
		function = 688350 * g + 738297.3 * g + 881619 * (1 - g) + 1002875 * (1 - g);
 		sb_2015.append(function);
		sb_2015.append(';');
		tempo = 10 + gerador.nextInt(300);
		sb_2015.append(tempo);
		sb_2015.append('\n');
        
		
		sb_2015.append("06:00");
		sb_2015.append(';');
		function = 688350 * g + 680062.8 * (1 - g) + 774360 * g + 932553.2 * g + 1608917 * g + 1824857 * g;
		sb_2015.append(function);
		sb_2015.append(';');
		tempo = 10 + gerador.nextInt(300);
		sb_2015.append(tempo);
		sb_2015.append('\n');
        
		
		sb_2015.append("06:15");
		sb_2015.append(';');
		function = 688350 * g + 680062.8 * (1 - g) + 774360 * g + 932553.2 * g + 1608917 * g + 1824857 * g;
		sb_2015.append(function);
		sb_2015.append(';');
		tempo = 10 + gerador.nextInt(300);
		sb_2015.append(tempo);
		sb_2015.append('\n');
        
		
		sb_2015.append("06:30");
		sb_2015.append(';');
		function = 688350 * g + 680062.8 * (1 - g) + 774360 * g + 932553.2 * g + 1608917 * g + 1306600 * (1 - g);
		sb_2015.append(function);
		sb_2015.append(';');
		tempo = 10 + gerador.nextInt(300);
		sb_2015.append(tempo);
		sb_2015.append('\n');
        
		
		sb_2015.append("06:45");
		sb_2015.append(';');
		function = 688350 * g + 680062.8 * (1 - g) + 774360 * g + 932553.2 * g + 700657.1 * (1 - g);
		sb_2015.append(function);
		sb_2015.append(';');
		tempo = 10 + gerador.nextInt(300);
		sb_2015.append(tempo);
		sb_2015.append('\n');
        
		
		sb_2015.append("07:00");
		sb_2015.append(';');
		function = 688350 * g + 680062.8 * (1 - g) + 774360 * g + 932553.2 * g + 700657.1 * (1 - g);
		sb_2015.append(function);
		sb_2015.append(';');
		tempo = 10 + gerador.nextInt(300);
		sb_2015.append(tempo);
		sb_2015.append('\n');
        
		
		sb_2015.append("07:15");
		sb_2015.append(';');
		function = 688350 * g + 680062.8 * (1 - g) + 774360 * g + 932553.2 * g + 700657.1 * (1 - g);
		sb_2015.append(function);
		sb_2015.append(';');
		tempo = 10 + gerador.nextInt(300);
		sb_2015.append(tempo);
		sb_2015.append('\n');
        
		
		sb_2015.append("07:30");
		sb_2015.append(';');
		function = 688350 * g + 680062.8 * (1 - g) + 774360 * g + 932553.2 * g + 700657.1 * (1 - g);
		sb_2015.append(function);
		sb_2015.append(';');
		tempo = 10 + gerador.nextInt(300);
		sb_2015.append(tempo);
		sb_2015.append('\n');
        
		
		sb_2015.append("07:45");
		sb_2015.append(';');
		function = 688350 * g + 680062.8 * (1 - g) + 774360 * g + 702174.8 * (1 - g) + 835701.5 * g;
		sb_2015.append(function);
		sb_2015.append(';');
		tempo = 10 + gerador.nextInt(300);
		sb_2015.append(tempo);
		sb_2015.append('\n');
        
		sb_2015.append("08:00");
		sb_2015.append(';');
		function = 688350 * g + 680062.8 * (1 - g) + 774360 * g + 702174.8 * (1 - g) + 835701.5 * g;
		sb_2015.append(function);
		sb_2015.append(';');
		tempo = 10 + gerador.nextInt(300);
		sb_2015.append(tempo);
		sb_2015.append('\n');
        
		
		sb_2015.append("08:15");
		sb_2015.append(';');
		function = 688350 * g + 680062.8 * (1 - g) + 774360 * g + 702174.8 * (1 - g) + 835701.5 * g;
		sb_2015.append(function);
		sb_2015.append(';');
		tempo = 10 + gerador.nextInt(300);
		sb_2015.append(tempo);
		sb_2015.append('\n');
        
		
		sb_2015.append("08:30");
		sb_2015.append(';');
		function = 688350 * g + 680062.8 * (1 - g) + 774360 * g + 702174.8 * (1 - g) + 835701.5 * g;
		sb_2015.append(function);
		sb_2015.append(';');
		tempo = 10 + gerador.nextInt(300);
		sb_2015.append(tempo);
		sb_2015.append('\n');
        
		
		sb_2015.append("08:45");
		sb_2015.append(';');
		function = 688350 * g + 680062.8 * (1 - g) + 774360 * g + 702174.8 * (1 - g) + 438764.7 * (1 - g);
		sb_2015.append(function);
		sb_2015.append(';');
		tempo = 10 + gerador.nextInt(300);
		sb_2015.append(tempo);
		sb_2015.append('\n');
        
		
		sb_2015.append("09:00");
		sb_2015.append(';');
		function = 688350 * g + 680062.8 * (1 - g) + 486301.4 * (1 - g) + 601561 * g + 589750 * g;
		sb_2015.append(function);
		sb_2015.append(';');
		tempo = 10 + gerador.nextInt(300);
		sb_2015.append(tempo);
		sb_2015.append('\n');
        
		
		sb_2015.append("09:15");
		sb_2015.append(';');
		function = 688350 * g + 680062.8 * (1 - g) + 486301.4 * (1 - g) + 601561 * g + 589750 * g;
		sb_2015.append(function);
		sb_2015.append(';');
		tempo = 10 + gerador.nextInt(300);
		sb_2015.append(tempo);
		sb_2015.append('\n');
        
		
		sb_2015.append("09:30");
		sb_2015.append(';');
		function = 688350 * g + 680062.8 * (1 - g) + 486301.4 * (1 - g) + 601561 * g + 589750 * g;
		sb_2015.append(function);
		sb_2015.append(';');
		tempo = 10 + gerador.nextInt(300);
		sb_2015.append(tempo);
		sb_2015.append('\n');
        
		
		sb_2015.append("09:45");
		sb_2015.append(';');
		function = 688350 * g + 680062.8 * (1 - g) + 486301.4 * (1 - g) + 601561 * g + 618235.3 * (1 - g);
		sb_2015.append(function);
		sb_2015.append(';');
		tempo = 10 + gerador.nextInt(300);
		sb_2015.append(tempo);
		sb_2015.append('\n');
        
		
		sb_2015.append("10:00");
		sb_2015.append(';');
		function = 688350 * g + 680062.8 * (1 - g) + 486301.4 * (1 - g) + 601561 * g + 618235.3 * (1 - g);
		sb_2015.append(function);
		sb_2015.append(';');
		tempo = 10 + gerador.nextInt(300);
		sb_2015.append(tempo);
		sb_2015.append('\n');
        
		
		sb_2015.append("10:15");
		sb_2015.append(';');
		function = 688350 * g + 680062.8 * (1 - g) + 486301.4 * (1 - g) + 601561 * g + 618235.3 * (1 - g);
		sb_2015.append(function);
		sb_2015.append(';');
		tempo = 10 + gerador.nextInt(300);
		sb_2015.append(tempo);
		sb_2015.append('\n');
        
		sb_2015.append("10:30");
		sb_2015.append(';');
		function = 688350 * g + 680062.8 * (1 - g) + 486301.4 * (1 - g) + 338625 * (1 - g) + 406062.5 * g;
		sb_2015.append(function);
		sb_2015.append(';');
		tempo = 10 + gerador.nextInt(300);
		sb_2015.append(tempo);
		sb_2015.append('\n');
        
		
		sb_2015.append("10:45");
		sb_2015.append(';');
		function = 688350 * g + 680062.8 * (1 - g) + 486301.4 * (1 - g) + 338625 * (1 - g) + 406062.5 * g;
		sb_2015.append(function);
		sb_2015.append(';');
		tempo = 10 + gerador.nextInt(300);
		sb_2015.append(tempo);
		sb_2015.append('\n');
        
		
		sb_2015.append("11:00");
		sb_2015.append(';');
		function = 688350 * g + 680062.8 * (1 - g) + 486301.4 * (1 - g) + 338625 * (1 - g) + 406062.5 * g;
		sb_2015.append(function);
		sb_2015.append(';');
		tempo = 10 + gerador.nextInt(300);
		sb_2015.append(tempo);
		sb_2015.append('\n');
        
		sb_2015.append("11:15");
		sb_2015.append(';');
		function = 688350 * g + 680062.8 * (1 - g) + 486301.4 * (1 - g) + 338625 * (1 - g) + 271187.5 * (1 - g);
		sb_2015.append(function);
		sb_2015.append(';');
		tempo = 10 + gerador.nextInt(300);
		sb_2015.append(tempo);
		sb_2015.append('\n');
        
		
		sb_2015.append("11:30");
		sb_2015.append(';');
		function = 688350 * g + 680062.8 * (1 - g) + 486301.4 * (1 - g) + 338625 * (1 - g) + 271187.5 * (1 - g);
		sb_2015.append(function);
		sb_2015.append(';');
		tempo = 10 + gerador.nextInt(300);
		sb_2015.append(tempo);
		sb_2015.append('\n');
        
		
		sb_2015.append("11:45");
		sb_2015.append(';');
		function = 688350 * g + 680062.8 * (1 - g) + 486301.4 * (1 - g) + 338625 * (1 - g) + 271187.5 * (1 - g);
		sb_2015.append(function);
		sb_2015.append(';');
		tempo = 10 + gerador.nextInt(300);
		sb_2015.append(tempo);
		sb_2015.append('\n');
        
		
		sb_2015.append("12:00");
		sb_2015.append(';');
		function = 846676 * (1 - g) + 849867.5 * g + 600968.3 * g + 261714.3 * g;
		sb_2015.append(function);
		sb_2015.append(';');
		tempo = 10 + gerador.nextInt(300);
		sb_2015.append(tempo);
		sb_2015.append('\n');
        
        
	 	sb_2015.append("12:15");
		sb_2015.append(';');
		function = 846676 * (1 - g) + 849867.5 * g + 600968.3 * g + 261714.3 * g;
		sb_2015.append(function);
		sb_2015.append(';');
		tempo = 10 + gerador.nextInt(300);
		sb_2015.append(tempo);
		sb_2015.append('\n');
        
				
		sb_2015.append("12:30");
		sb_2015.append(';');
		function = 846676 * (1 - g) + 849867.5 * g + 600968.3 * g + 261714.3 * g;
		sb_2015.append(function);
		sb_2015.append(';');
		tempo = 10 + gerador.nextInt(300);
		sb_2015.append(tempo);
		sb_2015.append('\n');
        
				
		sb_2015.append("12:45");
		sb_2015.append(';');
		function = 846676 * (1 - g) + 849867.5 * g + 600968.3 * g + 261714.3 * g;
		sb_2015.append(function);
		sb_2015.append(';');
		tempo = 10 + gerador.nextInt(300);
		sb_2015.append(tempo);
		sb_2015.append('\n');
        
		
		sb_2015.append("13:00");
		sb_2015.append(';');
		function = 846676 * (1 - g) + 849867.5 * g + 600968.3 * g + 697898 * (1 - g) + 708277.8 * g;
		sb_2015.append(function);
		sb_2015.append(';');
		tempo = 10 + gerador.nextInt(300);
		sb_2015.append(tempo);
		sb_2015.append('\n');
        
		sb_2015.append("13:15");
		sb_2015.append(';');
		function = 846676 * (1 - g) + 849867.5 * g + 600968.3 * g + 697898 * (1 - g) + 708277.8 * g;
		sb_2015.append(function);
		sb_2015.append(';');
		tempo = 10 + gerador.nextInt(300);
		sb_2015.append(tempo);
		sb_2015.append('\n');
        
		sb_2015.append("13:30");
		sb_2015.append(';');
		function = 846676 * (1 - g) + 849867.5 * g + 600968.3 * g + 697898 * (1 - g) + 691871 * (1 - g);
		sb_2015.append(function);
		sb_2015.append(';');
		tempo = 10 + gerador.nextInt(300);
		sb_2015.append(tempo);
		sb_2015.append('\n');
        
		
		sb_2015.append("13:45");
		sb_2015.append(';');
		function = 846676 * (1 - g) + 849867.5 * g + 600968.3 * g + 697898 * (1 - g) + 691871 * (1 - g);
		sb_2015.append(function);
		sb_2015.append(';');
		tempo = 10 + gerador.nextInt(300);
		sb_2015.append(tempo);
		sb_2015.append('\n');
        
		sb_2015.append("14:00");
		sb_2015.append(';');
		function = 846676 * (1 - g) + 849867.5 * g + 600968.3 * g + 697898 * (1 - g) + 691871 * (1 - g);
		sb_2015.append(function);
		sb_2015.append(';');
		tempo = 10 + gerador.nextInt(300);
		sb_2015.append(tempo);
		sb_2015.append('\n');
        
		
		sb_2015.append("14:15");
		sb_2015.append(';');
		function = 846676 * (1 - g) + 849867.5 * g + 911602.4 * (1 - g) + 772340 * g;
		sb_2015.append(function);
		sb_2015.append(';');
		tempo = 10 + gerador.nextInt(300);
		sb_2015.append(tempo);
		sb_2015.append('\n');
        
		sb_2015.append("14:30");
		sb_2015.append(';');
		function = 846676 * (1 - g) + 849867.5 * g + 911602.4 * (1 - g) + 772340 * g;
		sb_2015.append(function);
		sb_2015.append(';');
		tempo = 10 + gerador.nextInt(300);
		sb_2015.append(tempo);
		sb_2015.append('\n');
        
		sb_2015.append("14:45");
		sb_2015.append(';');
		function = 846676 * (1 - g) + 849867.5 * g + 911602.4 * (1 - g) + 772340 * g;
		sb_2015.append(function);
		sb_2015.append(';');
		tempo = 10 + gerador.nextInt(300);
		sb_2015.append(tempo);
		sb_2015.append('\n');
        
		
		sb_2015.append("15:00");
		sb_2015.append(';');
		function = 846676 * (1 - g) + 849867.5 * g + 911602.4 * (1 - g) + 772340 * g;
		sb_2015.append(function);
		sb_2015.append(';');
		tempo = 10 + gerador.nextInt(300);
		sb_2015.append(tempo);
		sb_2015.append('\n');
        
		sb_2015.append("15:15");
		sb_2015.append(';');
		function = 846676 * (1 - g) + 849867.5 * g + 911602.4 * (1 - g) + 945735.3 * (1 - g) + 808091.7 * g;
		sb_2015.append(function);
		sb_2015.append(';');
		tempo = 10 + gerador.nextInt(300);
		sb_2015.append(tempo);
		sb_2015.append('\n');
        
		sb_2015.append("15:30");
		sb_2015.append(';');
		function = 846676 * (1 - g) + 849867.5 * g + 911602.4 * (1 - g) + 945735.3 * (1 - g) + 808091.7 * g;
		sb_2015.append(function);
		sb_2015.append(';');
		tempo = 10 + gerador.nextInt(300);
		sb_2015.append(tempo);
		sb_2015.append('\n');
        
		sb_2015.append("15:45");
		sb_2015.append(';');
		function = 846676 * (1 - g) + 849867.5 * g + 911602.4 * (1 - g) + 945735.3 * (1 - g) + 808091.7 * g;
		sb_2015.append(function);
		sb_2015.append(';');
		tempo = 10 + gerador.nextInt(300);
		sb_2015.append(tempo);
		sb_2015.append('\n');
        
		
		sb_2015.append("16:00");
		sb_2015.append(';');
		function = 846676 * (1 - g) + 849867.5 * g + 911602.4 * (1 - g) + 945735.3 * (1 - g) + 808091.7 * g;
		sb_2015.append(function);
		sb_2015.append(';');
		tempo = 10 + gerador.nextInt(300);
		sb_2015.append(tempo);
		sb_2015.append('\n');
        
		
		sb_2015.append("16:15");
		sb_2015.append(';');
		function = 846676 * (1 - g) + 849867.5 * g + 911602.4 * (1 - g) + 945735.3 * (1 - g) + 1103663 * (1 - g);
		sb_2015.append(function);
		sb_2015.append(';');
		tempo = 10 + gerador.nextInt(300);
		sb_2015.append(tempo);
		sb_2015.append('\n');
        
		
		sb_2015.append("16:30");
		sb_2015.append(';');
		function = 846676 * (1 - g) + 849867.5 * g + 911602.4 * (1 - g) + 945735.3 * (1 - g) + 1103663 * (1 - g);
		sb_2015.append(function);
		sb_2015.append(';');
		tempo = 10 + gerador.nextInt(300);
		sb_2015.append(tempo);
		sb_2015.append('\n');
        
		sb_2015.append("16:45");
		sb_2015.append(';');
		function = 846676 * (1 - g) + 849867.5 * g + 911602.4 * (1 - g) + 945735.3 * (1 - g) + 1103663 * (1 - g);
		sb_2015.append(function);
		sb_2015.append(';');
		tempo = 10 + gerador.nextInt(300);
		sb_2015.append(tempo);
		sb_2015.append('\n');
        
		sb_2015.append("17:00");
		sb_2015.append(';');
		function = 846676 * (1 - g) + 849867.5 * g + 911602.4 * (1 - g) + 945735.3 * (1 - g) + 1103663 * (1 - g);
		sb_2015.append(function);
		sb_2015.append(';');
		tempo = 10 + gerador.nextInt(300);
		sb_2015.append(tempo);
		sb_2015.append('\n');
        
		
		sb_2015.append("17:15");
		sb_2015.append(';');
		function = 846676 * (1 - g) + 849867.5 * g + 911602.4 * (1 - g) + 945735.3 * (1 - g) + 1103663 * (1 - g);
		sb_2015.append(function);
		sb_2015.append(';');
		tempo = 10 + gerador.nextInt(300);
		sb_2015.append(tempo);
		sb_2015.append('\n');
        
		
		sb_2015.append("17:30");
		sb_2015.append(';');
		function = 846676 * (1 - g) + 845526.3 * (1 - g) + 939257 * g + 1010670 * g;
		sb_2015.append(function);
		sb_2015.append(';');
		tempo = 10 + gerador.nextInt(300);
		sb_2015.append(tempo);
		sb_2015.append('\n');
        
		
		sb_2015.append("17:45");
		sb_2015.append(';');
		function = 846676 * (1 - g) + 845526.3 * (1 - g) + 939257 * g + 1010670 * g;
		sb_2015.append(function);
		sb_2015.append(';');
		tempo = 10 + gerador.nextInt(300);
		sb_2015.append(tempo);
		sb_2015.append('\n');
        
		
		sb_2015.append("18:00");
		sb_2015.append(';');
		function = 846676 * (1 - g) + 845526.3 * (1 - g) + 939257 * g + 1010670 * g;
		sb_2015.append(function);
		sb_2015.append(';');
		tempo = 10 + gerador.nextInt(300);
		sb_2015.append(tempo);
		sb_2015.append('\n');
        
		
		sb_2015.append("18:15");
		sb_2015.append(';');
		function = 846676 * (1 - g) + 845526.3 * (1 - g) + 939257 * g + 1010670 * g;
		sb_2015.append(function);
		sb_2015.append(';');
		tempo = 10 + gerador.nextInt(300);
		sb_2015.append(tempo);
		sb_2015.append('\n');
        
		
		sb_2015.append("18:30");
		sb_2015.append(';');
		function = 846676 * (1 - g) + 845526.3 * (1 - g) + 939257 * g + 1010670 * g;
		sb_2015.append(function);
		sb_2015.append(';');
		tempo = 10 + gerador.nextInt(300);
		sb_2015.append(tempo);
		sb_2015.append('\n');
        
		
		sb_2015.append("18:45");
		sb_2015.append(';');
		function = 846676 * (1 - g) + 845526.3 * (1 - g) + 939257 * g + 1010670 * g;
		sb_2015.append(function);
		sb_2015.append(';');
		tempo = 10 + gerador.nextInt(300);
		sb_2015.append(tempo);
		sb_2015.append('\n');
        
		
		sb_2015.append("19:00");
		sb_2015.append(';');
		function = 846676 * (1 - g) + 845526.3 * (1 - g) + 939257 * g + 1010670 * g;
		sb_2015.append(function);
		sb_2015.append(';');
		tempo = 10 + gerador.nextInt(300);
		sb_2015.append(tempo);
		sb_2015.append('\n');
        
		sb_2015.append("19:15");
		sb_2015.append(';');
		function = 846676 * (1 - g) + 845526.3 * (1 - g) + 939257 * g + 647775.5 * (1 - g);
		sb_2015.append(function);
		sb_2015.append(';');
		tempo = 10 + gerador.nextInt(300);
		sb_2015.append(tempo);
		sb_2015.append('\n');
        
		sb_2015.append("19:30");
		sb_2015.append(';');
		function = 846676 * (1 - g) + 845526.3 * (1 - g) + 939257 * g + 647775.5 * (1 - g);
		sb_2015.append(function);
		sb_2015.append(';');
		tempo = 10 + gerador.nextInt(300);
		sb_2015.append(tempo);
		sb_2015.append('\n');
        
		sb_2015.append("19:45");
		sb_2015.append(';');
		function = 846676 * (1 - g) + 845526.3 * (1 - g) + 939257 * g + 647775.5 * (1 - g);
		sb_2015.append(function);
		sb_2015.append(';');
		tempo = 10 + gerador.nextInt(300);
		sb_2015.append(tempo);
		sb_2015.append('\n');
        
		sb_2015.append("20:00");
		sb_2015.append(';');
		function = 846676 * (1 - g) + 845526.3 * (1 - g) + 939257 * g + 647775.5 * (1 - g);
		sb_2015.append(function);
		sb_2015.append(';');
		tempo = 10 + gerador.nextInt(300);
		sb_2015.append(tempo);
		sb_2015.append('\n');
        
		
		sb_2015.append("20:15");
		sb_2015.append(';');
		function = 846676 * (1 - g) + 845526.3 * (1 - g) + 637142.9 * (1 - g) + 715734.9 * g;
		sb_2015.append(function);
		sb_2015.append(';');
		tempo = 10 + gerador.nextInt(300);
		sb_2015.append(tempo);
		sb_2015.append('\n');
        
		
		sb_2015.append("20:30");
		sb_2015.append(';');
		function = 846676 * (1 - g) + 845526.3 * (1 - g) + 637142.9 * (1 - g) + 715734.9 * g;
		sb_2015.append(function);
		sb_2015.append(';');
		tempo = 10 + gerador.nextInt(300);
		sb_2015.append(tempo);
		sb_2015.append('\n');
        
		
		sb_2015.append("20:45");
		sb_2015.append(';');
		function = 846676 * (1 - g) + 845526.3 * (1 - g) + 637142.9 * (1 - g) + 715734.9 * g;
		sb_2015.append(function);
		sb_2015.append(';');
		tempo = 10 + gerador.nextInt(300);
		sb_2015.append(tempo);
		sb_2015.append('\n');
        
		
		sb_2015.append("21:00");
		sb_2015.append(';');
		function = 846676 * (1 - g) + 845526.3 * (1 - g) + 637142.9 * (1 - g) + 715734.9 * g;
		sb_2015.append(function);
		sb_2015.append(';');
		tempo = 10 + gerador.nextInt(300);
		sb_2015.append(tempo);
		sb_2015.append('\n');
        
		
		sb_2015.append("21:15");
		sb_2015.append(';');
		function = 846676 * (1 - g) + 845526.3 * (1 - g) + 637142.9 * (1 - g) + 715734.9 * g;
		sb_2015.append(function);
		sb_2015.append(';');
		tempo = 10 + gerador.nextInt(300);
		sb_2015.append(tempo);
		sb_2015.append('\n');
        
		sb_2015.append("21:30");
		sb_2015.append(';');
		function = 846676 * (1 - g) + 845526.3 * (1 - g) + 637142.9 * (1 - g) + 715734.9 * g;
		sb_2015.append(function);
		sb_2015.append(';');
		tempo = 10 + gerador.nextInt(300);
		sb_2015.append(tempo);
		sb_2015.append('\n');
        
		
		sb_2015.append("21:45");
		sb_2015.append(';');
		function = 846676 * (1 - g) + 845526.3 * (1 - g) + 637142.9 * (1 - g) + 412206.9 * (1 - g);
		sb_2015.append(function);
		sb_2015.append(';');
		tempo = 10 + gerador.nextInt(300);
		sb_2015.append(tempo);
		sb_2015.append('\n');
        
		
		sb_2015.append("22:00");
		sb_2015.append(';');
		function = 846676 * (1 - g) + 845526.3 * (1 - g) + 637142.9 * (1 - g) + 412206.9 * (1 - g);
		sb_2015.append(function);
		sb_2015.append(';');
		tempo = 10 + gerador.nextInt(300);
		sb_2015.append(tempo);
		sb_2015.append('\n');
        
		sb_2015.append("22:15");
		sb_2015.append(';');
		function = 846676 * (1 - g) + 845526.3 * (1 - g) + 637142.9 * (1 - g) + 412206.9 * (1 - g);
		sb_2015.append(function);
		sb_2015.append(';');
		tempo = 10 + gerador.nextInt(300);
		sb_2015.append(tempo);
		sb_2015.append('\n');
        
		sb_2015.append("22:30");
		sb_2015.append(';');
		function = 846676 * (1 - g) + 845526.3 * (1 - g) + 637142.9 * (1 - g) + 412206.9 * (1 - g);
		sb_2015.append(function);
		sb_2015.append(';');
		tempo = 10 + gerador.nextInt(300);
		sb_2015.append(tempo);
		sb_2015.append('\n');
        
		
		sb_2015.append("22:45");
		sb_2015.append(';');
		function = 846676 * (1 - g) + 845526.3 * (1 - g) + 637142.9 * (1 - g) + 412206.9 * (1 - g);
		sb_2015.append(function);
		sb_2015.append(';');
		tempo = 10 + gerador.nextInt(300);
		sb_2015.append(tempo);
		sb_2015.append('\n');
        
		
		sb_2015.append("23:00");
		sb_2015.append(';');
		function = 846676 * (1 - g) + 845526.3 * (1 - g) + 637142.9 * (1 - g) + 412206.9 * (1 - g);
		sb_2015.append(function);
		sb_2015.append(';');
		tempo = 10 + gerador.nextInt(300);
		sb_2015.append(tempo);
		sb_2015.append('\n');
        
		
		sb_2015.append("23:15");
		sb_2015.append(';');
		function = 846676 * (1 - g) + 845526.3 * (1 - g) + 637142.9 * (1 - g) + 412206.9 * (1 - g);
		sb_2015.append(function);
		sb_2015.append(';');
		tempo = 10 + gerador.nextInt(300);
		sb_2015.append(tempo);
		sb_2015.append('\n');
        
		
		sb_2015.append("23:30");
		sb_2015.append(';');
		function = 846676 * (1 - g) + 845526.3 * (1 - g) + 637142.9 * (1 - g) + 412206.9 * (1 - g);
		sb_2015.append(function);
		sb_2015.append(';');
		tempo = 10 + gerador.nextInt(300);
		sb_2015.append(tempo);
		sb_2015.append('\n');
        
		sb_2015.append("23:45");
		sb_2015.append(';');
		function = 846676 * (1 - g) + 845526.3 * (1 - g) + 637142.9 * (1 - g) + 412206.9 * (1 - g);
		sb_2015.append(function);
		sb_2015.append(';');
		tempo = 10 + gerador.nextInt(300);
		sb_2015.append(tempo);
		sb_2015.append('\n');
        
		
		sb_2015.append("23:59");
		sb_2015.append(';');
		function = 846676 * (1 - g) + 845526.3 * (1 - g) + 637142.9 * (1 - g) + 412206.9 * (1 - g);
		sb_2015.append(function);
		sb_2015.append(';');
		tempo = 10 + gerador.nextInt(300);
		sb_2015.append(tempo);
		sb_2015.append('\n');
        
		
		pw_2015.write(sb_2015.toString());
	

		pw_2015.close();
 		
//		try{
//			pw_training_18_05 = new PrintWriter(new File("C:\\Users\\Sam\\git\\pw_training_18_05.csv"));		    
//		   } catch (FileNotFoundException e) {
//			    e.printStackTrace();
//		 }
//		
//		try{
//			pw_training_18_1 = new PrintWriter(new File("C:\\Users\\Sam\\git\\pw_training_18_1.csv"));		    
//		   } catch (FileNotFoundException e) {
//			    e.printStackTrace();
//		 }
//		
//		try{
//			pw_training_18_1_5 = new PrintWriter(new File("C:\\Users\\Sam\\git\\pw_training_18_1_5.csv"));		    
//		   } catch (FileNotFoundException e) {
//			    e.printStackTrace();
//		 }
//		
//		NewTest_Training_2015 test = new NewTest_Training_2015(); 
//		
//		sb_training_18_05.append("timestamp");
//		sb_training_18_05.append(';');
//		sb_training_18_05.append("function");
//		sb_training_18_05.append('\n');
//			
//		for (int i = 0; i < array_2015.length; i++) {
//          array_2015[i] = i;
//          System.out.println(array_2015[i]); 
//  		  test.build_test_18_08_tol_05(array_2015[i]);
//       }
//
//		sb_training_18_1.append("timestamp");
//		sb_training_18_1.append(';');
//		sb_training_18_1.append("function");
//		sb_training_18_1.append('\n');
//			
//		System.out.println("Resultados dia 18 2015 - Tol 1");
//		 for (int i = 0; i < array_2015.length; i++) {
//			test.build_test_18_08_tol_1(array_2015[i]);
//		}
//						 
//		sb_training_18_1_5.append("timestamp");
//		sb_training_18_1_5.append(';');
//		sb_training_18_1_5.append("function");
//		sb_training_18_1_5.append('\n');
//			
//		System.out.println("Resultados dia 18 2015 - Tol 1.5");
//		 for (int i = 0; i < array_2015.length; i++) {
//			test.build_test_18_08_tol_1_5(array_2015[i]);
//		}
//	
//		 pw_training_18_05.close();
//		 pw_training_18_1.close();
//		 pw_training_18_1_5.close();
// 
//        
//        try{
//        	pw_training_16_05 = new PrintWriter(new File("C:\\Users\\Sam\\git\\pw_training_16_05.csv"));		    
//		   } catch (FileNotFoundException e) {
//			    e.printStackTrace();
//		 }
//		
//		try{
//			pw_training_16_1 = new PrintWriter(new File("C:\\Users\\Sam\\git\\pw_training_16_1.csv"));		    
//		   } catch (FileNotFoundException e) {
//			    e.printStackTrace();
//		 }
//		
//		try{
//			pw_training_16_1_5 = new PrintWriter(new File("C:\\Users\\Sam\\git\\pw_training_16_1_5.csv"));		    
//		   } catch (FileNotFoundException e) {
//			    e.printStackTrace();
//		 }
//		
//		NewTest_Training_2016 test_2016 = new NewTest_Training_2016(); 
//		
//		sb_training_16_05.append("timestamp");
//		sb_training_16_05.append(';');
//		sb_training_16_05.append("function");
//		sb_training_16_05.append('\n');
//			
//		System.out.println("Resultados dia 10 2016 - Teste");
//		 for (int i = 0; i < array_2016.length; i++) {
//			array_2016[i] = i;
//			System.out.println(array_2016[i]); 
//			test_2016.build_test_16_08_05(array_2016[i]);
//		}
//
//		 sb_training_16_1.append("timestamp");
//		 sb_training_16_1.append(';');
//		 sb_training_16_1.append("function");
//		 sb_training_16_1.append('\n');
//			
//		System.out.println("Resultados dia 11 2016 - Teste");
//		 for (int i = 0; i < array_2016.length; i++) {
//			test_2016.build_test_16_08_1(array_2016[i]);
//		}
//				
//		 sb_training_16_1_5.append("timestamp");
//		 sb_training_16_1_5.append(';');
//		 sb_training_16_1_5.append("function");
//		 sb_training_16_1_5.append('\n');
//			
//		System.out.println("Resultados dia 11 2016 - Teste");
//		 for (int i = 0; i < array_2016.length; i++) {
//			test_2016.build_test_16_08_1_5(array_2016[i]);
//		}
//
//		 pw_training_16_05.close();
//		 pw_training_16_1.close();
//		 pw_training_16_1_5.close();


	}

}
