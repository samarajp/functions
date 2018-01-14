package br.rio.puc.piecewisebus.test_estimator;

public class Test_Training_Tercas_2015 {

	double tolerance = 1.3;
	double function = 0;
	Test_Estimator testcsv = new Test_Estimator();
	
	//Parte experimental de treino - 70% das terças-feiras de 2015 
	public void build_training(double timestamp){
		System.out.println("Valor do tempo recebido: "+timestamp);

		double timestamp_min = timestamp * 60;
		
		if (timestamp == 0){
			timestamp_min = 1;
		}
		
		System.out.println("Valor do tempo convertido: "+timestamp_min);

		double g = (1 / 2) + ((15 * 15) / 16) * timestamp_min - ((5 * Math.pow(15,3)) / 8) * Math.pow(timestamp_min,3) + ((3 * Math.pow(15,5)) / 16) * Math.pow(timestamp_min,5);

		//00 a 02
		if(timestamp_min >= 1 && timestamp_min <= 120){
			System.out.println(timestamp);
			System.out.println(timestamp_min);		 
			
			function = 556209 * g + 425625 * g + 408153.8 * g + 238000 * g;
			
			System.out.println(function);	
			
			testcsv.sb_2015.append(timestamp);
			testcsv.sb_2015.append(';');
			testcsv.sb_2015.append(function);
			testcsv.sb_2015.append('\n');
		}
		//02 a 03
		if(timestamp_min > 120 && timestamp_min <= 180){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 556209 * g + 425625 * g + 408153.8 * g + 554000 * (1 - g);
			
			System.out.println(function);		
			
			testcsv.sb_2015.append(timestamp);
			testcsv.sb_2015.append(';');
			testcsv.sb_2015.append(function);
			testcsv.sb_2015.append('\n');

			}
		//03 a 05
		if(timestamp_min > 180 && timestamp_min <= 300){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 556209 * g + 425625 * g + 446272.7 * (1 - g) + 970000 * g;

			System.out.println(function);		
			
			testcsv.sb_2015.append(timestamp);
			testcsv.sb_2015.append(';');
			testcsv.sb_2015.append(function);
			testcsv.sb_2015.append('\n');

			}
		//05  a 06
		if(timestamp_min > 300 && timestamp_min <= 360){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 556209 * g + 425625 * g + 446272.7 * (1 - g) + 249875 * (1 - g);

			System.out.println(function);		
			
			testcsv.sb_2015.append(timestamp);
			testcsv.sb_2015.append(';');
			testcsv.sb_2015.append(function);
			testcsv.sb_2015.append('\n');

			}
		//06 a 07
		if(timestamp_min > 360 && timestamp_min <= 420){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 556209 * g + 570454.5 * (1 - g) + 729232 * g + 493087 * g;

			System.out.println(function);		
			
			testcsv.sb_2015.append(timestamp);
			testcsv.sb_2015.append(';');
			testcsv.sb_2015.append(function);
			testcsv.sb_2015.append('\n');

			}
		//07 a 09
		if(timestamp_min > 420 && timestamp_min <= 540){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 556209 * g + 570454.5 * (1 - g) + 729232 * g + 782480.4 * (1 - g);

			System.out.println(function);		
			
			testcsv.sb_2015.append(timestamp);
			testcsv.sb_2015.append(';');
			testcsv.sb_2015.append(function);
			testcsv.sb_2015.append('\n');

			}
		//09 a 10
		if(timestamp_min > 540 && timestamp_min <= 600){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 556209 * g + 570454.5 * (1 - g) + 361536.8 * (1 - g) + 398019.2 * g;

			System.out.println(function);		
			
			testcsv.sb_2015.append(timestamp);
			testcsv.sb_2015.append(';');
			testcsv.sb_2015.append(function);
			testcsv.sb_2015.append('\n');

			}
		//10 a 11
		if(timestamp_min > 600 && timestamp_min <= 660){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 556209 * g + 570454.5 * (1 - g) + 361536.8 * (1 - g) + 317418.6 * (1 - g) + 384809.5 * g;

			System.out.println(function);		
			
			testcsv.sb_2015.append(timestamp);
			testcsv.sb_2015.append(';');
			testcsv.sb_2015.append(function);
			testcsv.sb_2015.append('\n');

			}
		//11 a 12
		if(timestamp_min > 660 && timestamp_min <= 720){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 556209 * g + 570454.5 * (1 - g) + 361536.8 * (1 - g) + 317418.6 * (1 - g) + 253090.9 * (1 - g);

			System.out.println(function);		
			
			testcsv.sb_2015.append(timestamp);
			testcsv.sb_2015.append(';');
			testcsv.sb_2015.append(function);
			testcsv.sb_2015.append('\n');

			}
		//12 a 13
		if(timestamp_min > 720 && timestamp_min <= 780){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 615298.9 * (1 - g) + 651963.3 * g + 418675 * g + 263789.5 * g;

			System.out.println(function);		

			testcsv.sb_2015.append(timestamp);
			testcsv.sb_2015.append(';');
			testcsv.sb_2015.append(function);
			testcsv.sb_2015.append('\n');
		}
		
		//13 a 15
		if(timestamp_min > 780 && timestamp_min <= 900){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 615298.9 * (1 - g) + 651963.3 * g + 418675 * g + 466918 * (1 - g);

			System.out.println(function);		

			testcsv.sb_2015.append(timestamp);
			testcsv.sb_2015.append(';');
			testcsv.sb_2015.append(function);
			testcsv.sb_2015.append('\n');
		}
				
		//15 a 16
		if(timestamp_min > 900 && timestamp_min <= 960){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 615298.9 * (1 - g) + 651963.3 * g + 727522.3 * (1 - g) + 667368.4 * g;

			System.out.println(function);		

			testcsv.sb_2015.append(timestamp);
			testcsv.sb_2015.append(';');
			testcsv.sb_2015.append(function);
			testcsv.sb_2015.append('\n');
		}
		
		//16 a 18
		if(timestamp_min > 960 && timestamp_min <= 1080){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 615298.9 * (1 - g) + 651963.3 * g + 727522.3 * (1 - g) + 754257.3 * (1 - g);

			System.out.println(function);		

			testcsv.sb_2015.append(timestamp);
			testcsv.sb_2015.append(';');
			testcsv.sb_2015.append(function);
			testcsv.sb_2015.append('\n');
		}
		
		//18 a 19
		if(timestamp_min > 1080 && timestamp_min <= 1140){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 615298.9 * (1 - g) + 556814.6 * (1 - g) + 638753.2 * g + 681055.6 * g + 741425 * g;

			System.out.println(function);		

			testcsv.sb_2015.append(timestamp);
			testcsv.sb_2015.append(';');
			testcsv.sb_2015.append(function);
			testcsv.sb_2015.append('\n');
		}
		
		//19 a 20
		if(timestamp_min > 1140 && timestamp_min <= 1200){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 615298.9 * (1 - g) + 556814.6 * (1 - g) + 638753.2 * g + 681055.6 * g + 576065.2 * (1 - g);

			System.out.println(function);		

			testcsv.sb_2015.append(timestamp);
			testcsv.sb_2015.append(';');
			testcsv.sb_2015.append(function);
			testcsv.sb_2015.append('\n');
		}
		
		//20 a 21
		if(timestamp_min > 1200 && timestamp_min <= 1260){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 615298.9 * (1 - g) + 556814.6 * (1 - g) + 638753.2 * g + 448392.9 * (1 - g);

			System.out.println(function);		

			testcsv.sb_2015.append(timestamp);
			testcsv.sb_2015.append(';');
			testcsv.sb_2015.append(function);
			testcsv.sb_2015.append('\n');
		}
		//21 a 22
		if(timestamp_min > 1260 && timestamp_min <= 1320){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
					
			function = 615298.9 * (1 - g) + 556814.6 * (1 - g) + 309392.2 * (1 - g) + 302851.9 * g;
			System.out.println(function);		

			testcsv.sb_2015.append(timestamp);
			testcsv.sb_2015.append(';');
			testcsv.sb_2015.append(function);
			testcsv.sb_2015.append('\n');
		}
		//22:00
		if(timestamp_min > 1320){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 615298.9 * (1 - g) + 556814.6 * (1 - g) + 309392.2 * (1 - g) + 316750 * (1 - g);

			System.out.println(function);		

			testcsv.sb_2015.append(timestamp);
			testcsv.sb_2015.append(';');
			testcsv.sb_2015.append(function);
			testcsv.sb_2015.append('\n');
		}
		 testcsv.pw_2015.write(testcsv.sb_2015.toString());
}
	
	
	public void build_test_11_08(double timestamp){
		
		double timestamp_min = timestamp * 60;
		double g = (1 / 2) + ((15 * 15) / 16) * timestamp_min - ((5 * Math.pow(15,3)) / 8) * Math.pow(timestamp_min,3) + ((3 * Math.pow(15,5)) / 16) * Math.pow(timestamp_min,5);
		
		//00 a 07:26
		if(timestamp_min >= 40 && timestamp_min <= 446){
			System.out.println(timestamp);
			System.out.println(timestamp_min);		
			
			function = 330586.2 * g + 339625 * g + 362750 * g;
			
			System.out.println(function);		
			
			testcsv.sb_training_11.append(timestamp);
			testcsv.sb_training_11.append(';');
			testcsv.sb_training_11.append(function);
			testcsv.sb_training_11.append('\n');

		}
		//07:26 a 09:45
		if(timestamp_min > 446 && timestamp_min <= 585){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 330586.2 * g + 339625 * g + 316500 * (1 - g);
			
			System.out.println(function);		
			
			testcsv.sb_training_11.append(timestamp);
			testcsv.sb_training_11.append(';');
			testcsv.sb_training_11.append(function);
			testcsv.sb_training_11.append('\n');
			}
		//09:45 a 12:01
		if(timestamp_min > 585 && timestamp_min <= 721){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 330586.2 * g + 327142.9 * (1 - g) + 256000 * g;

			System.out.println(function);		
			
			testcsv.sb_training_11.append(timestamp);
			testcsv.sb_training_11.append(';');
			testcsv.sb_training_11.append(function);
			testcsv.sb_training_11.append('\n');

			}
		//12:01 a 13:10
		if(timestamp_min > 721 && timestamp_min <= 790){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 330586.2 * g + 327142.9 * (1 - g) + 364440 * (1 - g) + 250200 * g;

			System.out.println(function);		
			
			testcsv.sb_training_11.append(timestamp);
			testcsv.sb_training_11.append(';');
			testcsv.sb_training_11.append(function);
			testcsv.sb_training_11.append('\n');

			}
		//13:10 a 13:49
		if(timestamp_min > 790 && timestamp_min <= 829){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 330586.2 * g + 327142.9 * (1 - g) + 364440 * (1 - g) + 399500 * (1 - g) + 335571.4 * g;

			System.out.println(function);		
			
			testcsv.sb_training_11.append(timestamp);
			testcsv.sb_training_11.append(';');
			testcsv.sb_training_11.append(function);
			testcsv.sb_training_11.append('\n');

			}
		//13:49 a 14:15
		if(timestamp_min > 829 && timestamp_min <= 855){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 330586.2 * g + 327142.9 * (1 - g) + 364440 * (1 - g) + 399500 * (1 - g) + 455200 * (1 - g);

			System.out.println(function);		
			
			testcsv.sb_training_11.append(timestamp);
			testcsv.sb_training_11.append(';');
			testcsv.sb_training_11.append(function);
			testcsv.sb_training_11.append('\n');

		}
		
		//14:15 a 19:13
		if(timestamp_min > 855 && timestamp_min <= 1153){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 337806.5 * (1 - g) + 480000 * g;

			System.out.println(function);		
			
			testcsv.sb_training_11.append(timestamp);
			testcsv.sb_training_11.append(';');
			testcsv.sb_training_11.append(function);
			testcsv.sb_training_11.append('\n');

		}
		
		//19:13 a 20:24
		if(timestamp_min > 1153 && timestamp_min <= 1224){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 337806.5 * (1 - g) + 333066.7 * (1 - g) + 353909.1 * g + 416692.3 * g;

			System.out.println(function);		
			
			testcsv.sb_training_11.append(timestamp);
			testcsv.sb_training_11.append(';');
			testcsv.sb_training_11.append(function);
			testcsv.sb_training_11.append('\n');

		}
		
		//20:24 a 21:07
		if(timestamp_min > 1224 && timestamp_min <= 1267){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 337806.5 * (1 - g) + 333066.7 * (1 - g) + 353909.1 * g + 263222.2 * (1 - g) + 315000 * g;

			System.out.println(function);		
			
			testcsv.sb_training_11.append(timestamp);
			testcsv.sb_training_11.append(';');
			testcsv.sb_training_11.append(function);
			testcsv.sb_training_11.append('\n');

		}
		
		//21:07 a 21:33
		if(timestamp_min > 1267 && timestamp_min <= 1293){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 337806.5 * (1 - g) + 333066.7 * (1 - g) + 353909.1 * g + 263222.2 * (1 - g) + 243285.7 * (1 - g);

			System.out.println(function);		
			
			testcsv.sb_training_11.append(timestamp);
			testcsv.sb_training_11.append(';');
			testcsv.sb_training_11.append(function);
			testcsv.sb_training_11.append('\n');

		}
		
		
		//21:33 a 22:45
		if(timestamp_min > 1293 && timestamp_min <= 1365){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 337806.5 * (1 - g) + 333066.7 * (1 - g) + 275750 * (1 - g) + 255500 * g;

			System.out.println(function);		
			
			testcsv.sb_training_11.append(timestamp);
			testcsv.sb_training_11.append(';');
			testcsv.sb_training_11.append(function);
			testcsv.sb_training_11.append('\n');

		}
		
		//22:45 
		if(timestamp_min > 1365){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 337806.5 * (1 - g) + 333066.7 * (1 - g) + 275750 * (1 - g) + 294666.7 * (1 - g);

			System.out.println(function);		
			
			testcsv.sb_training_11.append(timestamp);
			testcsv.sb_training_11.append(';');
			testcsv.sb_training_11.append(function);
			testcsv.sb_training_11.append('\n');

		}
		 testcsv.pw_training_11.write(testcsv.sb_training_11.toString());

	}
	
		
	public void build_test_12_08(double timestamp){
		
		double timestamp_min = timestamp * 60;
		double g = (1 / 2) + ((15 * 15) / 16) * timestamp_min - ((5 * Math.pow(15,3)) / 8) * Math.pow(timestamp_min,3) + ((3 * Math.pow(15,5)) / 16) * Math.pow(timestamp_min,5);
		
		//00:11 a 05:56
		if(timestamp_min >= 40 && timestamp_min <= 356){
			System.out.println(timestamp);
			System.out.println(timestamp_min);		
			
			function = 413233.3 * g + 239166.7 * g;
			
			System.out.println(function);		
			
			testcsv.sb_training_18_05.append(timestamp);
			testcsv.sb_training_18_05.append(';');
			testcsv.sb_training_18_05.append(function);
			testcsv.sb_training_18_05.append('\n');

		}
		//05:56 a 09:01
		if(timestamp_min > 356 && timestamp_min <= 541){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 413233.3 * g + 432574.1 * (1 - g) + 395400 * g;
			
			System.out.println(function);	
			
			testcsv.sb_training_18_05.append(timestamp);
			testcsv.sb_training_18_05.append(';');
			testcsv.sb_training_18_05.append(function);
			testcsv.sb_training_18_05.append('\n');
			}
		
		//09:01 a 10:21
		if(timestamp_min > 541 && timestamp_min <= 621){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 413233.3 * g + 432574.1 * (1 - g) + 439750 * (1 - g) + 452350 * g;

			System.out.println(function);		
			
			testcsv.sb_training_18_05.append(timestamp);
			testcsv.sb_training_18_05.append(';');
			testcsv.sb_training_18_05.append(function);
			testcsv.sb_training_18_05.append('\n');

			}
		
		//10:21 a 11:42
		if(timestamp_min > 621 && timestamp_min <= 702){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 413233.3 * g + 432574.1 * (1 - g) + 439750 * (1 - g) + 432629.6 * (1 - g);

			System.out.println(function);		
			
			testcsv.sb_training_18_05.append(timestamp);
			testcsv.sb_training_18_05.append(';');
			testcsv.sb_training_18_05.append(function);
			testcsv.sb_training_18_05.append('\n');

			}
		
		//11:42 a 12:28
		if(timestamp_min > 702 && timestamp_min <= 748){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 395076.9 * (1 - g) + 381500 * g + 372833.3 * g + 353900 * g + 421500 * g;

			System.out.println(function);		

			testcsv.sb_training_18_05.append(timestamp);
			testcsv.sb_training_18_05.append(';');
			testcsv.sb_training_18_05.append(function);
			testcsv.sb_training_18_05.append('\n');
			
			}
		
		//12:28 a 13:07
		if(timestamp_min > 748 && timestamp_min <= 787){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 395076.9 * (1 - g) + 381500 * g + 372833.3 * g + 353900 * g + 337000 * (1 - g);

			System.out.println(function);		
			
			testcsv.sb_training_18_05.append(timestamp);
			testcsv.sb_training_18_05.append(';');
			testcsv.sb_training_18_05.append(function);
			testcsv.sb_training_18_05.append('\n');
		}
			
		//13:07 a 14:40
		if(timestamp_min > 787 && timestamp_min <= 880){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 395076.9 * (1 - g) + 381500 * g + 372833.3 * g + 467500 * (1 - g);
	
			System.out.println(function);		
			
			testcsv.sb_training_18_05.append(timestamp);
			testcsv.sb_training_18_05.append(';');
			testcsv.sb_training_18_05.append(function);
			testcsv.sb_training_18_05.append('\n');
			
		}
		
		//14:40 a 17:36
		if(timestamp_min > 880 && timestamp_min <= 1056){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 395076.9 * (1 - g) + 381500 * g + 485500 * (1 - g);

			System.out.println(function);		
			
			testcsv.sb_training_18_05.append(timestamp);
			testcsv.sb_training_18_05.append(';');
			testcsv.sb_training_18_05.append(function);
			testcsv.sb_training_18_05.append('\n');

		}
		
		//17:36 a 20:29
		if(timestamp_min > 1056 && timestamp_min <= 1229){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 395076.9 * (1 - g) + 403862.7 * (1 - g) + 451450 * g;

			System.out.println(function);		
			
			testcsv.sb_training_18_05.append(timestamp);
			testcsv.sb_training_18_05.append(';');
			testcsv.sb_training_18_05.append(function);
			testcsv.sb_training_18_05.append('\n');

		}
		
		//20:29 a 21:12
		if(timestamp_min > 1229 && timestamp_min <= 1272){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 395076.9 * (1 - g) + 403862.7 * (1 - g) + 373161.3 * (1 - g) + 397958.3 * g + 415157.9 * g;

			System.out.println(function);		
			
			testcsv.sb_training_18_05.append(timestamp);
			testcsv.sb_training_18_05.append(';');
			testcsv.sb_training_18_05.append(function);
			testcsv.sb_training_18_05.append('\n');

		}
		//21:12 a 21:50
		if(timestamp_min > 1272 && timestamp_min <= 1310){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 395076.9 * (1 - g) + 403862.7 * (1 - g) + 373161.3 * (1 - g) + 397958.3 * g + 332600 * (1 - g);

			System.out.println(function);		
			
			testcsv.sb_training_18_05.append(timestamp);
			testcsv.sb_training_18_05.append(';');
			testcsv.sb_training_18_05.append(function);
			testcsv.sb_training_18_05.append('\n');

		}
		//21:50 
		if(timestamp_min > 1310){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 395076.9 * (1 - g) + 403862.7 * (1 - g) + 373161.3 * (1 - g) + 270857.1 * (1 - g);

			System.out.println(function);		
			
			testcsv.sb_training_18_05.append(timestamp);
			testcsv.sb_training_18_05.append(';');
			testcsv.sb_training_18_05.append(function);
			testcsv.sb_training_18_05.append('\n');

		}
				
		 testcsv.pw_training_18_05.write(testcsv.sb_training_18_05.toString());

	}
	
	
	//Terceira Terça-Feira de Agosto - tolerancia 0.5
	public void build_test_18_08_tol_05(double timestamp){
		
		double timestamp_min = timestamp * 60;
		double g = (1 / 2) + ((15 * 15) / 16) * timestamp_min - ((5 * Math.pow(15,3)) / 8) * Math.pow(timestamp_min,3) + ((3 * Math.pow(15,5)) / 16) * Math.pow(timestamp_min,5);
		
		//00:28 a 01:45
		if(timestamp_min >= 40 && timestamp_min <= 105){
			System.out.println(timestamp);
			System.out.println(timestamp_min);		
			
			function = 768552.8 * g + 608153.8 * g + 447000 * g + 240000 * g;
			
			System.out.println(function);		
			
			testcsv.sb_training_18_05.append(timestamp);
			testcsv.sb_training_18_05.append(';');
			testcsv.sb_training_18_05.append(function);
			testcsv.sb_training_18_05.append('\n');

		}
		//01:45 a 03:01
		if(timestamp_min > 105 && timestamp_min <= 181){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 768552.8 * g + 608153.8 * g + 447000 * g + 498750 * (1 - g);
			
			System.out.println(function);	
			
			testcsv.sb_training_18_05.append(timestamp);
			testcsv.sb_training_18_05.append(';');
			testcsv.sb_training_18_05.append(function);
			testcsv.sb_training_18_05.append('\n');
			}
		
		//03:01 a 05:16
		if(timestamp_min > 181 && timestamp_min <= 316){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 768552.8 * g + 608153.8 * g + 708875 * (1 - g) + 239000 * g;

			System.out.println(function);		
			
			testcsv.sb_training_18_05.append(timestamp);
			testcsv.sb_training_18_05.append(';');
			testcsv.sb_training_18_05.append(function);
			testcsv.sb_training_18_05.append('\n');

			}
		
		//05:16 a 06:09
		if(timestamp_min > 316 && timestamp_min <= 369){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 768552.8 * g + 608153.8 * g + 708875 * (1 - g) + 960400 * (1 - g);

			System.out.println(function);		
			
			testcsv.sb_training_18_05.append(timestamp);
			testcsv.sb_training_18_05.append(';');
			testcsv.sb_training_18_05.append(function);
			testcsv.sb_training_18_05.append('\n');

			}
		
		//06:09 a 06:50
		if(timestamp_min > 369 && timestamp_min <= 410){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 768552.8 * g + 787509.1 * (1 - g) + 897952.4 * g + 1102556 * g + 1480000 * g;

			System.out.println(function);		

			testcsv.sb_training_18_05.append(timestamp);
			testcsv.sb_training_18_05.append(';');
			testcsv.sb_training_18_05.append(function);
			testcsv.sb_training_18_05.append('\n');
			
			}
		
		//06:50 a 07:30
		if(timestamp_min > 410 && timestamp_min <= 450){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 768552.8 * g + 787509.1 * (1 - g) + 897952.4 * g + 1102556 * g + 1055375 * (1 - g);

			System.out.println(function);		
			
			testcsv.sb_training_18_05.append(timestamp);
			testcsv.sb_training_18_05.append(';');
			testcsv.sb_training_18_05.append(function);
			testcsv.sb_training_18_05.append('\n');
		}
			
		//07:30 a 08:14
		if(timestamp_min > 450 && timestamp_min <= 494){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 768552.8 * g + 787509.1 * (1 - g) + 897952.4 * g + 744500 * (1 - g) + 845800 * g;
	
			System.out.println(function);		
			
			testcsv.sb_training_18_05.append(timestamp);
			testcsv.sb_training_18_05.append(';');
			testcsv.sb_training_18_05.append(function);
			testcsv.sb_training_18_05.append('\n');
			
		}
		
		//08:14 a 08:59
		if(timestamp_min > 494 && timestamp_min <= 539){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 768552.8 * g + 787509.1 * (1 - g) + 897952.4 * g + 744500 * (1 - g) + 717842.1 * (1 - g);

			System.out.println(function);		
			
			testcsv.sb_training_18_05.append(timestamp);
			testcsv.sb_training_18_05.append(';');
			testcsv.sb_training_18_05.append(function);
			testcsv.sb_training_18_05.append('\n');

		}
		
		//08:59 a 09:47
		if(timestamp_min > 539 && timestamp_min <= 587){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 768552.8 * g + 787509.1 * (1 - g) + 696970.1 * (1 - g) + 607666.7 * g + 516961.5 * g;

			System.out.println(function);		
			
			testcsv.sb_training_18_05.append(timestamp);
			testcsv.sb_training_18_05.append(';');
			testcsv.sb_training_18_05.append(function);
			testcsv.sb_training_18_05.append('\n');

		}
		
		//09:47 a 10:31
		if(timestamp_min > 587 && timestamp_min <= 631){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 768552.8 * g + 787509.1 * (1 - g) + 696970.1 * (1 - g) + 607666.7 * g + 731789.5 * (1 - g);

			System.out.println(function);		
			
			testcsv.sb_training_18_05.append(timestamp);
			testcsv.sb_training_18_05.append(';');
			testcsv.sb_training_18_05.append(function);
			testcsv.sb_training_18_05.append('\n');

		}
		//10:31 a 12:02
		if(timestamp_min > 631 && timestamp_min <= 722){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 768552.8 * g + 787509.1 * (1 - g) + 696970.1 * (1 - g) + 961227.3 * (1 - g);

			System.out.println(function);		
			
			testcsv.sb_training_18_05.append(timestamp);
			testcsv.sb_training_18_05.append(';');
			testcsv.sb_training_18_05.append(function);
			testcsv.sb_training_18_05.append('\n');

		}
		//12:02 a 13:28
		if(timestamp_min > 722 && timestamp_min <= 808){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 758899.7 * (1 - g) + 786218.2 * g + 686087 * g + 331875 * g;

			System.out.println(function);		
			
			testcsv.sb_training_18_05.append(timestamp);
			testcsv.sb_training_18_05.append(';');
			testcsv.sb_training_18_05.append(function);
			testcsv.sb_training_18_05.append('\n');

		}
		//13:28 a 14:55
		if(timestamp_min > 808 && timestamp_min <= 895){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 758899.7 * (1 - g) + 786218.2 * g + 686087 * g + 760657.9 * (1 - g);

			System.out.println(function);		
			
			testcsv.sb_training_18_05.append(timestamp);
			testcsv.sb_training_18_05.append(';');
			testcsv.sb_training_18_05.append(function);
			testcsv.sb_training_18_05.append('\n');

		}
		//14:55 a 16:29
		if(timestamp_min > 895 && timestamp_min <= 989){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 758899.7 * (1 - g) + 786218.2 * g + 824924.4 * (1 - g) + 823968.3 * g;

			System.out.println(function);		
			
			testcsv.sb_training_18_05.append(timestamp);
			testcsv.sb_training_18_05.append(';');
			testcsv.sb_training_18_05.append(function);
			testcsv.sb_training_18_05.append('\n');

		}
		//16:29 a 17:11
		if(timestamp_min > 989 && timestamp_min <= 1031){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 758899.7 * (1 - g) + 786218.2 * g + 824924.4 * (1 - g) + 831037 * (1 - g) + 815000 * g;

			System.out.println(function);		
			
			testcsv.sb_training_18_05.append(timestamp);
			testcsv.sb_training_18_05.append(';');
			testcsv.sb_training_18_05.append(function);
			testcsv.sb_training_18_05.append('\n');

		}
		//17:11 a 17:52
		if(timestamp_min > 1031 && timestamp_min <= 1072){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 758899.7 * (1 - g) + 786218.2 * g + 824924.4 * (1 - g) + 831037 * (1 - g) + 849214.3 * (1 - g);

			System.out.println(function);		
			
			testcsv.sb_training_18_05.append(timestamp);
			testcsv.sb_training_18_05.append(';');
			testcsv.sb_training_18_05.append(function);
			testcsv.sb_training_18_05.append('\n');

		}
		//17:52 a 18:37
		if(timestamp_min > 1072 && timestamp_min <= 1117){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 758899.7 * (1 - g) + 722548.4 * (1 - g) + 733701.9 * g + 853983.3 * g + 866034.5 * g;

			System.out.println(function);		
			
			testcsv.sb_training_18_05.append(timestamp);
			testcsv.sb_training_18_05.append(';');
			testcsv.sb_training_18_05.append(function);
			testcsv.sb_training_18_05.append('\n');

		}
		//18:37 a 19:21
		if(timestamp_min > 1117 && timestamp_min <= 1161){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 758899.7 * (1 - g) + 722548.4 * (1 - g) + 733701.9 * g + 853983.3 * g + 842709.7 * (1 - g);

			System.out.println(function);		
			
			testcsv.sb_training_18_05.append(timestamp);
			testcsv.sb_training_18_05.append(';');
			testcsv.sb_training_18_05.append(function);
			testcsv.sb_training_18_05.append('\n');

		}
		//19:21 a 20:51
		if(timestamp_min > 1161 && timestamp_min <= 1251){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 758899.7 * (1 - g) + 722548.4 * (1 - g) + 733701.9 * g + 569681.8 * (1 - g);

			System.out.println(function);		
			
			testcsv.sb_training_18_05.append(timestamp);
			testcsv.sb_training_18_05.append(';');
			testcsv.sb_training_18_05.append(function);
			testcsv.sb_training_18_05.append('\n');

		}
		//20:51 a 21:33
		if(timestamp_min > 1251 && timestamp_min <= 1293){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 758899.7 * (1 - g) + 722548.4 * (1 - g) + 677681.8 * (1 - g) + 530176.5 * g + 444230.8 * g;

			System.out.println(function);		
			
			testcsv.sb_training_18_05.append(timestamp);
			testcsv.sb_training_18_05.append(';');
			testcsv.sb_training_18_05.append(function);
			testcsv.sb_training_18_05.append('\n');

		}
		//21:33 a 22:16
		if(timestamp_min > 1293 && timestamp_min <= 1336){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 758899.7 * (1 - g) + 722548.4 * (1 - g) + 677681.8 * (1 - g) + 530176.5 * g + 809500 * (1 - g);

			System.out.println(function);		
			
			testcsv.sb_training_18_05.append(timestamp);
			testcsv.sb_training_18_05.append(';');
			testcsv.sb_training_18_05.append(function);
			testcsv.sb_training_18_05.append('\n');

		}
		//22:16
		if(timestamp_min > 1336){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 758899.7 * (1 - g) + 722548.4 * (1 - g) + 677681.8 * (1 - g) + 179200 * (1 - g);

			System.out.println(function);		
			
			testcsv.sb_training_18_05.append(timestamp);
			testcsv.sb_training_18_05.append(';');
			testcsv.sb_training_18_05.append(function);
			testcsv.sb_training_18_05.append('\n');

		}
				
		 testcsv.pw_training_18_05.write(testcsv.sb_training_18_05.toString());

	}
	
	//Terceira Terça-Feira de Agosto - tolerancia 1
	public void build_test_18_08_tol_1(double timestamp){
		
		double timestamp_min = timestamp * 60;
		double g = (1 / 2) + ((15 * 15) / 16) * timestamp_min - ((5 * Math.pow(15,3)) / 8) * Math.pow(timestamp_min,3) + ((3 * Math.pow(15,5)) / 16) * Math.pow(timestamp_min,5);
		
		//00:28 a 01:45
		if(timestamp_min >= 40 && timestamp_min <= 105){
			System.out.println(timestamp);
			System.out.println(timestamp_min);		
			
			function = 768552.8 * g + 608153.8 * g + 447000 * g + 240000 * g;
			
			System.out.println(function);		
			
			testcsv.sb_training_18_1.append(timestamp);
			testcsv.sb_training_18_1.append(';');
			testcsv.sb_training_18_1.append(function);
			testcsv.sb_training_18_1.append('\n');

		}
		//01:45 a 03:01
		if(timestamp_min > 105 && timestamp_min <= 181){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 768552.8 * g + 608153.8 * g + 447000 * g + 498750 * (1 - g);
			
			System.out.println(function);	
			
			testcsv.sb_training_18_1.append(timestamp);
			testcsv.sb_training_18_1.append(';');
			testcsv.sb_training_18_1.append(function);
			testcsv.sb_training_18_1.append('\n');
			}
		
		//03:01 a 05:16
		if(timestamp_min > 181 && timestamp_min <= 316){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 768552.8 * g + 608153.8 * g + 708875 * (1 - g) + 239000 * g;

			System.out.println(function);		
			
			testcsv.sb_training_18_1.append(timestamp);
			testcsv.sb_training_18_1.append(';');
			testcsv.sb_training_18_1.append(function);
			testcsv.sb_training_18_1.append('\n');

			}
		
		//05:16 a 06:09
		if(timestamp_min > 316 && timestamp_min <= 369){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 768552.8 * g + 608153.8 * g + 708875 * (1 - g) + 960400 * (1 - g);

			System.out.println(function);		
			
			testcsv.sb_training_18_1.append(timestamp);
			testcsv.sb_training_18_1.append(';');
			testcsv.sb_training_18_1.append(function);
			testcsv.sb_training_18_1.append('\n');
			}
		
		//06:09 a 07:30
		if(timestamp_min > 369 && timestamp_min <= 450){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 768552.8 * g + 787509.1 * (1 - g) + 897952.4 * g + 1102556 * g;

			System.out.println(function);		

			testcsv.sb_training_18_1.append(timestamp);
			testcsv.sb_training_18_1.append(';');
			testcsv.sb_training_18_1.append(function);
			testcsv.sb_training_18_1.append('\n');
			
			}
		
		//07:30 a 08:59
		if(timestamp_min > 450 && timestamp_min <= 539){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 768552.8 * g + 787509.1 * (1 - g) + 897952.4 * g + 744500 * (1 - g);

			System.out.println(function);		
			
			testcsv.sb_training_18_1.append(timestamp);
			testcsv.sb_training_18_1.append(';');
			testcsv.sb_training_18_1.append(function);
			testcsv.sb_training_18_1.append('\n');
		}
			
		//08:59 a 10:31
		if(timestamp_min > 539 && timestamp_min <= 631){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 768552.8 * g + 787509.1 * (1 - g) + 696970.1 * (1 - g) + 607666.7 * g;

			System.out.println(function);		
			
			testcsv.sb_training_18_1.append(timestamp);
			testcsv.sb_training_18_1.append(';');
			testcsv.sb_training_18_1.append(function);
			testcsv.sb_training_18_1.append('\n');

		}
	
		//10:31 a 12:02
		if(timestamp_min > 631 && timestamp_min <= 722){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 768552.8 * g + 787509.1 * (1 - g) + 696970.1 * (1 - g) + 961227.3 * (1 - g);

			System.out.println(function);		
			
			testcsv.sb_training_18_1.append(timestamp);
			testcsv.sb_training_18_1.append(';');
			testcsv.sb_training_18_1.append(function);
			testcsv.sb_training_18_1.append('\n');

		}
		//12:02 a 13:28
		if(timestamp_min > 722 && timestamp_min <= 808){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 758899.7 * (1 - g) + 786218.2 * g + 686087 * g + 331875 * g;

			System.out.println(function);		
			
			testcsv.sb_training_18_1.append(timestamp);
			testcsv.sb_training_18_1.append(';');
			testcsv.sb_training_18_1.append(function);
			testcsv.sb_training_18_1.append('\n');

		}
		//13:28 a 14:55
		if(timestamp_min > 808 && timestamp_min <= 895){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 758899.7 * (1 - g) + 786218.2 * g + 686087 * g + 760657.9 * (1 - g);

			System.out.println(function);		
			
			testcsv.sb_training_18_1.append(timestamp);
			testcsv.sb_training_18_1.append(';');
			testcsv.sb_training_18_1.append(function);
			testcsv.sb_training_18_1.append('\n');

		}
		//14:55 a 16:29
		if(timestamp_min > 895 && timestamp_min <= 989){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 758899.7 * (1 - g) + 786218.2 * g + 824924.4 * (1 - g) + 823968.3 * g;

			System.out.println(function);		
			
			testcsv.sb_training_18_1.append(timestamp);
			testcsv.sb_training_18_1.append(';');
			testcsv.sb_training_18_1.append(function);
			testcsv.sb_training_18_1.append('\n');
		}
		//16:29 a 17:52
		if(timestamp_min > 989 && timestamp_min <= 1072){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 758899.7 * (1 - g) + 786218.2 * g + 824924.4 * (1 - g) + 831037 * (1 - g);

			System.out.println(function);		
			
			testcsv.sb_training_18_1.append(timestamp);
			testcsv.sb_training_18_1.append(';');
			testcsv.sb_training_18_1.append(function);
			testcsv.sb_training_18_1.append('\n');

		}
	
		//17:52 a 19:21
		if(timestamp_min > 1072 && timestamp_min <= 1161){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 758899.7 * (1 - g) + 722548.4 * (1 - g) + 733701.9 * g + 853983.3 * g;

			System.out.println(function);		
			
			testcsv.sb_training_18_1.append(timestamp);
			testcsv.sb_training_18_1.append(';');
			testcsv.sb_training_18_1.append(function);
			testcsv.sb_training_18_1.append('\n');
		}
	
		//19:21 a 20:51
		if(timestamp_min > 1161 && timestamp_min <= 1251){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 758899.7 * (1 - g) + 722548.4 * (1 - g) + 733701.9 * g + 569681.8 * (1 - g);

			System.out.println(function);		
			
			testcsv.sb_training_18_1.append(timestamp);
			testcsv.sb_training_18_1.append(';');
			testcsv.sb_training_18_1.append(function);
			testcsv.sb_training_18_1.append('\n');

		}
		//20:51 a 22:16
		if(timestamp_min > 1251 && timestamp_min <= 1336){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 758899.7 * (1 - g) + 722548.4 * (1 - g) + 677681.8 * (1 - g) + 530176.5 * g;

			System.out.println(function);		
			
			testcsv.sb_training_18_1.append(timestamp);
			testcsv.sb_training_18_1.append(';');
			testcsv.sb_training_18_1.append(function);
			testcsv.sb_training_18_1.append('\n');

		}
		
		//22:16
		if(timestamp_min > 1336){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 758899.7 * (1 - g) + 722548.4 * (1 - g) + 677681.8 * (1 - g) + 179200 * (1 - g);

			System.out.println(function);		
			
			testcsv.sb_training_18_1.append(timestamp);
			testcsv.sb_training_18_1.append(';');
			testcsv.sb_training_18_1.append(function);
			testcsv.sb_training_18_1.append('\n');

		}
				
		 testcsv.pw_training_18_1.write(testcsv.sb_training_18_1.toString());

	}
	
	//Terceira Terça-Feira de Agosto - tolerancia 1.5
	public void build_test_18_08_tol_1_5(double timestamp){
		
		double timestamp_min = timestamp * 60;
		double g = (1 / 2) + ((15 * 15) / 16) * timestamp_min - ((5 * Math.pow(15,3)) / 8) * Math.pow(timestamp_min,3) + ((3 * Math.pow(15,5)) / 16) * Math.pow(timestamp_min,5);
		
		//00:28 a 03:01
		if(timestamp_min >= 40 && timestamp_min <= 181){
			System.out.println(timestamp);
			System.out.println(timestamp_min);		
			
			function = 768552.8 * g + 608153.8 * g + 447000 * g;
			
			System.out.println(function);		
			
			testcsv.sb_training_18_1_5.append(timestamp);
			testcsv.sb_training_18_1_5.append(';');
			testcsv.sb_training_18_1_5.append(function);
			testcsv.sb_training_18_1_5.append('\n');

		}
		
		//03:01 a 06:09
		if(timestamp_min > 181 && timestamp_min <= 369){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 768552.8 * g + 608153.8 * g + 708875 * (1 - g);

			System.out.println(function);		
			
			testcsv.sb_training_18_1_5.append(timestamp);
			testcsv.sb_training_18_1_5.append(';');
			testcsv.sb_training_18_1_5.append(function);
			testcsv.sb_training_18_1_5.append('\n');


			}
		
		
		//06:09 a 08:59
		if(timestamp_min > 369 && timestamp_min <= 539){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 768552.8 * g + 787509.1 * (1 - g) + 897952.4 * g;

			System.out.println(function);		

			testcsv.sb_training_18_1_5.append(timestamp);
			testcsv.sb_training_18_1_5.append(';');
			testcsv.sb_training_18_1_5.append(function);
			testcsv.sb_training_18_1_5.append('\n');

			
			}
		
		//08:59 a 12:02
		if(timestamp_min > 539 && timestamp_min <= 722){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 768552.8 * g + 787509.1 * (1 - g) + 696970.1 * (1 - g);

			System.out.println(function);		
			
			testcsv.sb_training_18_1_5.append(timestamp);
			testcsv.sb_training_18_1_5.append(';');
			testcsv.sb_training_18_1_5.append(function);
			testcsv.sb_training_18_1_5.append('\n');


		}
	
		//12:02 a 14:55
		if(timestamp_min > 722 && timestamp_min <= 895){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 758899.7 * (1 - g) + 786218.2 * g + 686087 * g;

			System.out.println(function);		
			
			testcsv.sb_training_18_1_5.append(timestamp);
			testcsv.sb_training_18_1_5.append(';');
			testcsv.sb_training_18_1_5.append(function);
			testcsv.sb_training_18_1_5.append('\n');


		}
		
		//14:55 a 17:52
		if(timestamp_min > 895 && timestamp_min <= 1072){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 758899.7 * (1 - g) + 786218.2 * g + 824924.4 * (1 - g);

			System.out.println(function);		
			
			testcsv.sb_training_18_1_5.append(timestamp);
			testcsv.sb_training_18_1_5.append(';');
			testcsv.sb_training_18_1_5.append(function);
			testcsv.sb_training_18_1_5.append('\n');

		}
		
	
		//17:52 a 20:51
		if(timestamp_min > 1072 && timestamp_min <= 1251){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 758899.7 * (1 - g) + 722548.4 * (1 - g) + 733701.9 * g;

			System.out.println(function);		
			
			testcsv.sb_training_18_1_5.append(timestamp);
			testcsv.sb_training_18_1_5.append(';');
			testcsv.sb_training_18_1_5.append(function);
			testcsv.sb_training_18_1_5.append('\n');

		}
			
		//20:51
		if(timestamp_min > 1251){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 758899.7 * (1 - g) + 722548.4 * (1 - g) + 677681.8 * (1 - g);

			System.out.println(function);		
			
			testcsv.sb_training_18_1_5.append(timestamp);
			testcsv.sb_training_18_1_5.append(';');
			testcsv.sb_training_18_1_5.append(function);
			testcsv.sb_training_18_1_5.append('\n');


		}		
				
		 testcsv.pw_training_18_1_5.write(testcsv.sb_training_18_1_5.toString());

	}
}
