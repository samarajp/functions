//package br.rio.puc.piecewisebus.test_estimator;
//
//public class Test_Training_2015 {
//
//	double tolerance = 1.3;
//	double function = 0;
//	Test_Estimator testcsv = new Test_Estimator();
//	
//	//Parte experimental de treino - Dia 2016-08-08 
//	public void build_training(double timestamp){
//		System.out.println("Valor do tempo recebido: "+timestamp);
//
//		double timestamp_min = timestamp * 60;
//		
//		System.out.println("Valor do tempo convertido: "+timestamp_min);
//
//		double g = (1 / 2) + ((15 * 15) / 16) * timestamp_min - ((5 * Math.pow(15,3)) / 8) * Math.pow(timestamp_min,3) + ((3 * Math.pow(15,5)) / 16) * Math.pow(timestamp_min,5);
//
//		//12 a 13:22
//		if(timestamp_min >= 720 && timestamp_min <= 802){
//			System.out.println(timestamp);
//			System.out.println(timestamp_min);		
//			
//			function = 12.33693 * g + 9.41 * g + 8.853846 * g + 5.575 * g;
//			
//			System.out.println(function);	
//			
//			testcsv.sb_2015.append(timestamp);
//			testcsv.sb_2015.append(';');
//			testcsv.sb_2015.append(function);
//			testcsv.sb_2015.append('\n');
//		}
//		//13:22 a 13:59
//		if(timestamp_min > 802 && timestamp_min <= 839){
//			System.out.println(timestamp);
//			System.out.println(timestamp_min);
//			
//			function = 12.33693 * g + 9.41 * g + 8.853846 * g + 9.45 * g;
//			
//			System.out.println(function);		
//			
//			testcsv.sb_2015.append(timestamp);
//			testcsv.sb_2015.append(';');
//			testcsv.sb_2015.append(function);
//			testcsv.sb_2015.append('\n');
//
//			}
//		//13:59 a 15:25
//		if(timestamp_min > 839 && timestamp_min <= 925){
//			System.out.println(timestamp);
//			System.out.println(timestamp_min);
//			
//			function = 12.33693 * g + 9.41 * g + 10.0125 * g;
//
//			System.out.println(function);		
//			
//			testcsv.sb_2015.append(timestamp);
//			testcsv.sb_2015.append(';');
//			testcsv.sb_2015.append(function);
//			testcsv.sb_2015.append('\n');
//
//			}
//		//15:25 a 18:13
//		if(timestamp_min > 925 && timestamp_min <= 1093){
//			System.out.println(timestamp);
//			System.out.println(timestamp_min);
//			
//			function = 12.33693 * g + 13.49841 * g;
//
//			System.out.println(function);		
//			
//			testcsv.sb_2015.append(timestamp);
//			testcsv.sb_2015.append(';');
//			testcsv.sb_2015.append(function);
//			testcsv.sb_2015.append('\n');
//
//			}
//		//18:13 a 19:00
//		if(timestamp_min > 1093 && timestamp_min <= 1140){
//			System.out.println(timestamp);
//			System.out.println(timestamp_min);
//			
//			function = 11.16091 * g + 11.28778 * g + 13.48864 * g + 14.05357 * g;
//
//			System.out.println(function);		
//			
//			testcsv.sb_2015.append(timestamp);
//			testcsv.sb_2015.append(';');
//			testcsv.sb_2015.append(function);
//			testcsv.sb_2015.append('\n');
//
//			}
//		//19:00 a 19:36
//		if(timestamp_min > 1140 && timestamp_min <= 1176){
//			System.out.println(timestamp);
//			System.out.println(timestamp_min);
//			
//			function = 11.16091 * g + 11.28778 * g + 13.48864 * g + 12.5 * g;
//
//			System.out.println(function);		
//			
//			testcsv.sb_2015.append(timestamp);
//			testcsv.sb_2015.append(';');
//			testcsv.sb_2015.append(function);
//			testcsv.sb_2015.append('\n');
//
//			}
//		//19:36 a 20:12
//		if(timestamp_min > 1176 && timestamp_min <= 1212){
//			System.out.println(timestamp);
//			System.out.println(timestamp_min);
//			
//			function = 11.16091 * g + 11.28778 * g + 9.182609 * g + 10.07727 * g;
//
//			System.out.println(function);		
//			
//			testcsv.sb_2015.append(timestamp);
//			testcsv.sb_2015.append(';');
//			testcsv.sb_2015.append(function);
//			testcsv.sb_2015.append('\n');
//
//			}
//		//20:12 a 20:47
//		if(timestamp_min > 1212 && timestamp_min <= 1247){
//			System.out.println(timestamp);
//			System.out.println(timestamp_min);
//			
//			function = 11.16091 * g + 11.28778 * g + 9.182609 * g + 8.405 * g;
//
//			System.out.println(function);		
//			
//			testcsv.sb_2015.append(timestamp);
//			testcsv.sb_2015.append(';');
//			testcsv.sb_2015.append(function);
//			testcsv.sb_2015.append('\n');
//
//			}
//		//20:47 a 22:23
//		if(timestamp_min > 1247 && timestamp_min <= 1343){
//			System.out.println(timestamp);
//			System.out.println(timestamp_min);
//			
//			function = 11.16091 * g + 6.60625 * g + 6.375 * g;
//
//			System.out.println(function);		
//			
//			testcsv.sb_2015.append(timestamp);
//			testcsv.sb_2015.append(';');
//			testcsv.sb_2015.append(function);
//			testcsv.sb_2015.append('\n');
//
//			}
//		//22:23 a 23:00
//		if(timestamp_min > 1343 && timestamp_min <= 1380){
//			System.out.println(timestamp);
//			System.out.println(timestamp_min);
//			
//			function = 11.16091 * g + 6.60625 * g + 14.6 * g;
//
//			System.out.println(function);		
//
//			testcsv.sb_2015.append(timestamp);
//			testcsv.sb_2015.append(';');
//			testcsv.sb_2015.append(function);
//			testcsv.sb_2015.append('\n');
//		}
//		
//		
//		 testcsv.pw_2015.write(testcsv.sb_2015.toString());
//}
//	
//	
//	public void build_test_19_08(double timestamp){
//		
//		double timestamp_min = timestamp * 60;
//		double g = (1 / 2) + ((15 * 15) / 16) * timestamp_min - ((5 * Math.pow(15,3)) / 8) * Math.pow(timestamp_min,3) + ((3 * Math.pow(15,5)) / 16) * Math.pow(timestamp_min,5);
//		
//		//12 a 15:15
//		if(timestamp_min >= 720 && timestamp_min <= 915){
//			System.out.println(timestamp);
//			System.out.println(timestamp_min);		
//			
//			function = 10.02719 * g + 4.857143 * g;
//			
//			System.out.println(function);		
//			
//			testcsv.sb_training_19.append(timestamp);
//			testcsv.sb_training_19.append(';');
//			testcsv.sb_training_19.append(function);
//			testcsv.sb_training_19.append('\n');
//
//		}
//		//15:15 a 16:01
//		if(timestamp_min > 915 && timestamp_min <= 961){
//			System.out.println(timestamp);
//			System.out.println(timestamp_min);
//			
//			function = 10.02719 * g + 10.751 * g + 9.59375 * g + 8.722222 * g;
//			
//			System.out.println(function);		
//			
//			testcsv.sb_training_19.append(timestamp);
//			testcsv.sb_training_19.append(';');
//			testcsv.sb_training_19.append(function);
//			testcsv.sb_training_19.append('\n');
//			}
//		//16:01 a 16:39
//		if(timestamp_min > 961 && timestamp_min <= 999){
//			System.out.println(timestamp);
//			System.out.println(timestamp_min);
//			
//			function = 10.02719 * g + 10.751 * g + 9.59375 * g + 10.71429 * g;
//
//			System.out.println(function);		
//			
//			testcsv.sb_training_19.append(timestamp);
//			testcsv.sb_training_19.append(';');
//			testcsv.sb_training_19.append(function);
//			testcsv.sb_training_19.append('\n');
//
//			}
//		//16:39 a 18:00
//		if(timestamp_min > 999 && timestamp_min <= 1080){
//			System.out.println(timestamp);
//			System.out.println(timestamp_min);
//			
//			function = 10.02719 * g + 10.751 * g + 11.39545 * g;
//
//			System.out.println(function);		
//			
//			testcsv.sb_training_19.append(timestamp);
//			testcsv.sb_training_19.append(';');
//			testcsv.sb_training_19.append(function);
//			testcsv.sb_training_19.append('\n');
//
//			}
//		//18:00 a 19:45
//		if(timestamp_min > 1080 && timestamp_min <= 1185){
//			System.out.println(timestamp);
//			System.out.println(timestamp_min);
//			
//			function = 9.552459 * g + 10.95909 * g + 12.07069 * g;
//
//			System.out.println(function);		
//			
//			testcsv.sb_training_19.append(timestamp);
//			testcsv.sb_training_19.append(';');
//			testcsv.sb_training_19.append(function);
//			testcsv.sb_training_19.append('\n');
//
//			}
//		//19:45 a 20:26
//		if(timestamp_min > 1185 && timestamp_min <= 1226){
//			System.out.println(timestamp);
//			System.out.println(timestamp_min);
//			
//			function = 9.552459 * g + 10.95909 * g + 8.81 * g + 10.025 * g;
//
//			System.out.println(function);		
//			
//			testcsv.sb_training_19.append(timestamp);
//			testcsv.sb_training_19.append(';');
//			testcsv.sb_training_19.append(function);
//			testcsv.sb_training_19.append('\n');
//
//		}
//		
//		//20:26 a 21:04
//		if(timestamp_min > 1226 && timestamp_min <= 1264){
//			System.out.println(timestamp);
//			System.out.println(timestamp_min);
//			
//			function = 9.552459 * g + 10.95909 * g + 8.81 * g + 7.625 * g;
//
//			System.out.println(function);		
//			
//			testcsv.sb_training_19.append(timestamp);
//			testcsv.sb_training_19.append(';');
//			testcsv.sb_training_19.append(function);
//			testcsv.sb_training_19.append('\n');
//
//		}
//		
//		//21:04 a 23:00
//		if(timestamp_min > 1264 && timestamp_min <= 1380){
//			System.out.println(timestamp);
//			System.out.println(timestamp_min);
//			
//			function = 9.552459 * g + 5.6 * g;
//
//			System.out.println(function);		
//			
//			testcsv.sb_training_19.append(timestamp);
//			testcsv.sb_training_19.append(';');
//			testcsv.sb_training_19.append(function);
//			testcsv.sb_training_19.append('\n');
//
//		}
//		
//		 testcsv.pw_training_19.write(testcsv.sb_training_19.toString());
//
//	}
//	
//		
//	public void build_test_20_08(double timestamp){
//		
//		double timestamp_min = timestamp * 60;
//		double g = (1 / 2) + ((15 * 15) / 16) * timestamp_min - ((5 * Math.pow(15,3)) / 8) * Math.pow(timestamp_min,3) + ((3 * Math.pow(15,5)) / 16) * Math.pow(timestamp_min,5);
//		
//		//12 a 14:50
//		if(timestamp_min >= 720 && timestamp_min <= 890){
//			System.out.println(timestamp);
//			System.out.println(timestamp_min);		
//			
//			function = 10.76667 * g + 7.135714 * g;
//			
//			System.out.println(function);		
//			
//			testcsv.sb_training_20.append(timestamp);
//			testcsv.sb_training_20.append(';');
//			testcsv.sb_training_20.append(function);
//			testcsv.sb_training_20.append('\n');
//
//		}
//		//14:50 a 15:33
//		if(timestamp_min > 890 && timestamp_min <= 933){
//			System.out.println(timestamp);
//			System.out.println(timestamp_min);
//			
//			function = 10.76667 * g + 12.0375 * g + 11.08 * g + 9.214286 * g;
//			
//			System.out.println(function);	
//			
//			testcsv.sb_training_20.append(timestamp);
//			testcsv.sb_training_20.append(';');
//			testcsv.sb_training_20.append(function);
//			testcsv.sb_training_20.append('\n');
//			}
//		
//		//15:33 a 16:13
//		if(timestamp_min > 933 && timestamp_min <= 973){
//			System.out.println(timestamp);
//			System.out.println(timestamp_min);
//			
//			function = 10.76667 * g + 12.0375 * g + 11.08 * g + 12.08462 * g;
//
//			System.out.println(function);		
//			
//			testcsv.sb_training_20.append(timestamp);
//			testcsv.sb_training_20.append(';');
//			testcsv.sb_training_20.append(function);
//			testcsv.sb_training_20.append('\n');
//
//			}
//		
//		//16:13 a 17:32
//		if(timestamp_min > 973 && timestamp_min <= 1052){
//			System.out.println(timestamp);
//			System.out.println(timestamp_min);
//			
//			function = 10.76667 * g + 12.0375 * g + 12.995 * g;
//
//			System.out.println(function);		
//			
//			testcsv.sb_training_20.append(timestamp);
//			testcsv.sb_training_20.append(';');
//			testcsv.sb_training_20.append(function);
//			testcsv.sb_training_20.append('\n');
//
//			}
//		
//		//17:32 a 19:09
//		if(timestamp_min > 1052 && timestamp_min <= 1149){
//			System.out.println(timestamp);
//			System.out.println(timestamp_min);
//			
//			function = 9.959091 * g + 11.79512 * g + 14.03958 * g;
//
//			System.out.println(function);		
//
//			testcsv.sb_training_20.append(timestamp);
//			testcsv.sb_training_20.append(';');
//			testcsv.sb_training_20.append(function);
//			testcsv.sb_training_20.append('\n');
//			
//			}
//		
//		//19:09 a 20:29
//		if(timestamp_min > 1149 && timestamp_min <= 1229){
//			System.out.println(timestamp);
//			System.out.println(timestamp_min);
//			
//			function = 9.959091 * g + 11.79512 * g + 8.626471 * g;
//
//			System.out.println(function);		
//			
//			testcsv.sb_training_20.append(timestamp);
//			testcsv.sb_training_20.append(';');
//			testcsv.sb_training_20.append(function);
//			testcsv.sb_training_20.append('\n');
//		}
//			
//		//20:29 a 21:08
//		if(timestamp_min > 1229 && timestamp_min <= 1268){
//			System.out.println(timestamp);
//			System.out.println(timestamp_min);
//			
//			function = 9.959091 * g + 6.654167 * g + 6.930556 * g + 7.711538 * g;
//	
//			System.out.println(function);		
//			
//			testcsv.sb_training_20.append(timestamp);
//			testcsv.sb_training_20.append(';');
//			testcsv.sb_training_20.append(function);
//			testcsv.sb_training_20.append('\n');
//			
//		}
//		
//		//21:08 a 21:47
//		if(timestamp_min > 1268 && timestamp_min <= 1307){
//			System.out.println(timestamp);
//			System.out.println(timestamp_min);
//			
//			function = 9.959091 * g + 6.654167 * g + 6.930556 * g + 4.9 * g;
//
//			System.out.println(function);		
//			
//			testcsv.sb_training_20.append(timestamp);
//			testcsv.sb_training_20.append(';');
//			testcsv.sb_training_20.append(function);
//			testcsv.sb_training_20.append('\n');
//
//		}
//		
//		//21:47 a 22:29
//		if(timestamp_min > 1307 && timestamp_min <= 1349){
//			System.out.println(timestamp);
//			System.out.println(timestamp_min);
//			
//			function = 9.959091 * g + 6.654167 * g + 5.825 * g + 4.183333 * g;
//
//			System.out.println(function);		
//			
//			testcsv.sb_training_20.append(timestamp);
//			testcsv.sb_training_20.append(';');
//			testcsv.sb_training_20.append(function);
//			testcsv.sb_training_20.append('\n');
//
//		}
//		
//		//22:29 a 23:00
//		if(timestamp_min > 1349 && timestamp_min <= 1380){
//			System.out.println(timestamp);
//			System.out.println(timestamp_min);
//			
//			function = 9.959091 * g + 6.654167 * g + 5.825 * g + 7.466667 * g;
//
//			System.out.println(function);		
//			
//			testcsv.sb_training_20.append(timestamp);
//			testcsv.sb_training_20.append(';');
//			testcsv.sb_training_20.append(function);
//			testcsv.sb_training_20.append('\n');
//
//		}
//		
//		 testcsv.pw_training_20.write(testcsv.sb_training_20.toString());
//
//	}
//	
//	public void build_test_21_08(double timestamp){
//		
//		double timestamp_min = timestamp * 60;
//		double g = (1 / 2) + ((15 * 15) / 16) * timestamp_min - ((5 * Math.pow(15,3)) / 8) * Math.pow(timestamp_min,3) + ((3 * Math.pow(15,5)) / 16) * Math.pow(timestamp_min,5);
//		
//		//12 a 14:11
//		if(timestamp_min >= 720 && timestamp_min <= 851){
//			System.out.println(timestamp);
//			System.out.println(timestamp_min);		
//			
//			function = 7.628571 * g + 6.19 * g;
//			
//			System.out.println(function);		
//			
//			testcsv.sb_training_21.append(timestamp);
//			testcsv.sb_training_21.append(';');
//			testcsv.sb_training_21.append(function);
//			testcsv.sb_training_21.append('\n');
//
//		}
//		//14:11 a 16:14
//		if(timestamp_min > 851 && timestamp_min <= 974){
//			System.out.println(timestamp);
//			System.out.println(timestamp_min);
//			
//			function = 7.628571 * g + 8.204 * g;
//			
//			System.out.println(function);		
//			
//			testcsv.sb_training_21.append(timestamp);
//			testcsv.sb_training_21.append(';');
//			testcsv.sb_training_21.append(function);
//			testcsv.sb_training_21.append('\n');
//			}
//		
//		//16:14 a 18:21
//		if(timestamp_min > 974 && timestamp_min <= 1101){
//			System.out.println(timestamp);
//			System.out.println(timestamp_min);
//			
//			function = 12.53636 * g + 12.71562 * g;
//
//			System.out.println(function);		
//			
//			testcsv.sb_training_21.append(timestamp);
//			testcsv.sb_training_21.append(';');
//			testcsv.sb_training_21.append(function);
//			testcsv.sb_training_21.append('\n');
//
//			}
//		
//		//18:21 a 19:22
//		if(timestamp_min > 1101 && timestamp_min <= 1162){
//			System.out.println(timestamp);
//			System.out.println(timestamp_min);
//			
//			function = 12.53636 * g + 12.34545 * g + 13.23438 * g;
//
//			System.out.println(function);		
//			
//			testcsv.sb_training_21.append(timestamp);
//			testcsv.sb_training_21.append(';');
//			testcsv.sb_training_21.append(function);
//			testcsv.sb_training_21.append('\n');
//
//			}
//		
//		//19:22 a 23:00
//		if(timestamp_min > 1162 && timestamp_min <= 1380){
//			System.out.println(timestamp);
//			System.out.println(timestamp_min);
//			
//			function = 12.53636 * g + 12.34545 * g + 8.97 * g;
//
//			System.out.println(function);		
//			
//			testcsv.sb_training_21.append(timestamp);
//			testcsv.sb_training_21.append(';');
//			testcsv.sb_training_21.append(function);
//			testcsv.sb_training_21.append('\n');
//
//		}
//		
//		testcsv.pw_training_21.write(testcsv.sb_training_21.toString());
//
//	}
//}
