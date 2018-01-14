//package br.rio.puc.piecewisebus.test_estimator;
//
//public class Test_Training {
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
//		//12 a 14:39
//		if(timestamp_min >= 720 && timestamp_min <= 879){
//			System.out.println(timestamp);
//			System.out.println(timestamp_min);		
//			
//			function = 9.166111 * g + 4.444697 * g;
//			
//			System.out.println(function);	
//			
//			testcsv.sb.append(timestamp);
//			testcsv.sb.append(';');
//			testcsv.sb.append(function);
//			testcsv.sb.append('\n');
//		}
//		//14:39 a 15:15
//		if(timestamp_min > 879 && timestamp_min <= 915){
//			System.out.println(timestamp);
//			System.out.println(timestamp_min);
//			
//			function = 9.166111 * g + 11.81577 * g + 7.689583 * g + 6.863333 * g;
//			
//			System.out.println(function);		
//			
//			testcsv.sb.append(timestamp);
//			testcsv.sb.append(';');
//			testcsv.sb.append(function);
//			testcsv.sb.append('\n');
//
//			}
//		//15:15 a 16:10
//		if(timestamp_min > 915 && timestamp_min <= 970){
//			System.out.println(timestamp);
//			System.out.println(timestamp_min);
//			
//			function = 9.166111 * g + 11.81577 * g + 7.689583 * g + 9.025 * g;
//
//			System.out.println(function);		
//			
//			testcsv.sb.append(timestamp);
//			testcsv.sb.append(';');
//			testcsv.sb.append(function);
//			testcsv.sb.append('\n');
//
//			}
//		//16:10 a 16:42
//		if(timestamp_min > 970 && timestamp_min <= 1002){
//			System.out.println(timestamp);
//			System.out.println(timestamp_min);
//			
//			function = 9.166111 * g + 11.81577 * g + 12.95402 * g + 12.07407 * g;
//
//			System.out.println(function);		
//			
//			testcsv.sb.append(timestamp);
//			testcsv.sb.append(';');
//			testcsv.sb.append(function);
//			testcsv.sb.append('\n');
//
//			}
//		//16:42 a 17:13
//		if(timestamp_min > 1002 && timestamp_min <= 1033){
//			System.out.println(timestamp);
//			System.out.println(timestamp_min);
//			
//			function = 9.166111 * g + 11.81577 * g + 12.95402 * g + 13.35 * g;
//
//			System.out.println(function);		
//			
//			testcsv.sb.append(timestamp);
//			testcsv.sb.append(';');
//			testcsv.sb.append(function);
//			testcsv.sb.append('\n');
//
//			}
//		//17:13 a 17:51
//		if(timestamp_min > 1033 && timestamp_min <= 1071){
//			System.out.println(timestamp);
//			System.out.println(timestamp_min);
//			
//			function = 12.65864 * g + 14.31158 * g + 14.76667 * g + 13.55877 * g;
//
//			System.out.println(function);		
//			
//			testcsv.sb.append(timestamp);
//			testcsv.sb.append(';');
//			testcsv.sb.append(function);
//			testcsv.sb.append('\n');
//
//			}
//		//17:51 a 18:28
//		if(timestamp_min > 1071 && timestamp_min <= 1108){
//			System.out.println(timestamp);
//			System.out.println(timestamp_min);
//			
//			function = 12.65864 * g + 14.31158 * g + 14.76667 * g + 16.40278 * g;
//
//			System.out.println(function);		
//			
//			testcsv.sb.append(timestamp);
//			testcsv.sb.append(';');
//			testcsv.sb.append(function);
//			testcsv.sb.append('\n');
//
//			}
//		//18:28 a 19:10
//		if(timestamp_min > 1108 && timestamp_min <= 1150){
//			System.out.println(timestamp);
//			System.out.println(timestamp_min);
//			
//			function = 12.65864 * g + 14.31158 * g + 13.91923 * g + 16.09744 * g;
//
//			System.out.println(function);		
//			
//			testcsv.sb.append(timestamp);
//			testcsv.sb.append(';');
//			testcsv.sb.append(function);
//			testcsv.sb.append('\n');
//
//			}
//		//19:10 a 19:44
//		if(timestamp_min > 1150 && timestamp_min <= 1184){
//			System.out.println(timestamp);
//			System.out.println(timestamp_min);
//			
//			function = 12.65864 * g + 14.31158 * g + 13.91923 * g + 11.74103 * g;
//
//			System.out.println(function);		
//			
//			testcsv.sb.append(timestamp);
//			testcsv.sb.append(';');
//			testcsv.sb.append(function);
//			testcsv.sb.append('\n');
//
//			}
//		//19:44 a 21:04
//		if(timestamp_min > 1184 && timestamp_min <= 1264){
//			System.out.println(timestamp);
//			System.out.println(timestamp_min);
//			
//			function = 12.65864 * g + 8.52029 * g + 10.06562 * g;
//
//			System.out.println(function);		
//			
//			testcsv.sb.append(timestamp);
//			testcsv.sb.append(';');
//			testcsv.sb.append(function);
//			testcsv.sb.append('\n');
//
//			}
//		//21:04 a 23:00
//		if(timestamp_min > 1264 && timestamp_min <= 1380){
//			System.out.println(timestamp);
//			System.out.println(timestamp_min);
//			
//			function = 12.65864 * g + 8.52029 * g + 5.608333 * g;
//
//			System.out.println(function);		
//
//			testcsv.sb.append(timestamp);
//			testcsv.sb.append(';');
//			testcsv.sb.append(function);
//			testcsv.sb.append('\n');
//		}
//		
//		
//		 testcsv.pw.write(testcsv.sb.toString());
//}
//	
//	
//	public void build_test_09_08(double timestamp){
//		
//		double timestamp_min = timestamp * 60;
//		double g = (1 / 2) + ((15 * 15) / 16) * timestamp_min - ((5 * Math.pow(15,3)) / 8) * Math.pow(timestamp_min,3) + ((3 * Math.pow(15,5)) / 16) * Math.pow(timestamp_min,5);
//		
//		//12 a 14:50
//		if(timestamp_min >= 720 && timestamp_min <= 890){
//			System.out.println(timestamp);
//			System.out.println(timestamp_min);		
//			
//			function = 9.220068 * g + 6.502874 * g;
//			
//			System.out.println(function);		
//			
//			testcsv.sb_training_09.append(timestamp);
//			testcsv.sb_training_09.append(';');
//			testcsv.sb_training_09.append(function);
//			testcsv.sb_training_09.append('\n');
//
//		}
//		//14:50 a 15:30
//		if(timestamp_min > 890 && timestamp_min <= 930){
//			System.out.println(timestamp);
//			System.out.println(timestamp_min);
//			
//			function = 9.220068 * g + 13.0614 * g + 9.177273 * g + 8.133333 * g;
//			
//			System.out.println(function);		
//			
//			testcsv.sb_training_09.append(timestamp);
//			testcsv.sb_training_09.append(';');
//			testcsv.sb_training_09.append(function);
//			testcsv.sb_training_09.append('\n');
//			}
//		//15:15 a 16:09
//		if(timestamp_min > 930 && timestamp_min <= 969){
//			System.out.println(timestamp);
//			System.out.println(timestamp_min);
//			
//			function = 9.220068 * g + 13.0614 * g + 9.177273 * g + 9.81 * g;
//
//			System.out.println(function);		
//			
//			testcsv.sb_training_09.append(timestamp);
//			testcsv.sb_training_09.append(';');
//			testcsv.sb_training_09.append(function);
//			testcsv.sb_training_09.append('\n');
//
//			}
//		//16:09 a 16:52
//		if(timestamp_min > 970 && timestamp_min <= 1012){
//			System.out.println(timestamp);
//			System.out.println(timestamp_min);
//			
//			function = 9.220068 * g + 13.0614 * g + 18.40208 * g + 16.56667 * g;
//
//			System.out.println(function);		
//			
//			testcsv.sb_training_09.append(timestamp);
//			testcsv.sb_training_09.append(';');
//			testcsv.sb_training_09.append(function);
//			testcsv.sb_training_09.append('\n');
//
//			}
//		//16:52 a 17:27
//		if(timestamp_min > 1012 && timestamp_min <= 1047){
//			System.out.println(timestamp);
//			System.out.println(timestamp_min);
//			
//			function = 9.220068 * g + 13.0614 * g + 18.40208 * g + 19.57667 * g;
//
//			System.out.println(function);		
//			
//			testcsv.sb_training_09.append(timestamp);
//			testcsv.sb_training_09.append(';');
//			testcsv.sb_training_09.append(function);
//			testcsv.sb_training_09.append('\n');
//
//			}
//		//17:27 a 23:00
//		if(timestamp_min > 1047 && timestamp_min <= 1380){
//			System.out.println(timestamp);
//			System.out.println(timestamp_min);
//			
//			function = 8.559848 * g;
//
//			System.out.println(function);		
//			
//			testcsv.sb_training_09.append(timestamp);
//			testcsv.sb_training_09.append(';');
//			testcsv.sb_training_09.append(function);
//			testcsv.sb_training_09.append('\n');
//
//		}
//		
//		 testcsv.pw_training_09.write(testcsv.sb_training_09.toString());
//
//	}
//	
//		
//	public void build_test_10_08(double timestamp){
//		
//		double timestamp_min = timestamp * 60;
//		double g = (1 / 2) + ((15 * 15) / 16) * timestamp_min - ((5 * Math.pow(15,3)) / 8) * Math.pow(timestamp_min,3) + ((3 * Math.pow(15,5)) / 16) * Math.pow(timestamp_min,5);
//		
//		//12 a 13:21
//		if(timestamp_min >= 720 && timestamp_min <= 801){
//			System.out.println(timestamp);
//			System.out.println(timestamp_min);		
//			
//			function = 11.50444 * g + 8.636842 * g + 5.818519 * g;
//			
//			System.out.println(function);		
//			
//			testcsv.sb_training_10.append(timestamp);
//			testcsv.sb_training_10.append(';');
//			testcsv.sb_training_10.append(function);
//			testcsv.sb_training_10.append('\n');
//
//		}
//		//13:21 a 14:41
//		if(timestamp_min > 801 && timestamp_min <= 881){
//			System.out.println(timestamp);
//			System.out.println(timestamp_min);
//			
//			function = 11.50444 * g + 8.636842 * g + 11.17333 * g;
//			
//			System.out.println(function);	
//			
//			testcsv.sb_training_10.append(timestamp);
//			testcsv.sb_training_10.append(';');
//			testcsv.sb_training_10.append(function);
//			testcsv.sb_training_10.append('\n');
//			}
//		
//		//14:41 a 17:42
//		if(timestamp_min > 881 && timestamp_min <= 1062){
//			System.out.println(timestamp);
//			System.out.println(timestamp_min);
//			
//			function = 11.50444 * g + 12.52061 * g;
//
//			System.out.println(function);		
//			
//			testcsv.sb_training_10.append(timestamp);
//			testcsv.sb_training_10.append(';');
//			testcsv.sb_training_10.append(function);
//			testcsv.sb_training_10.append('\n');
//
//			}
//		
//		//17:42 a 18:20
//		if(timestamp_min > 1062 && timestamp_min <= 1100){
//			System.out.println(timestamp);
//			System.out.println(timestamp_min);
//			
//			function = 9.318687 * g + 9.951361 * g + 10.97083 * g + 12.91429 * g;
//
//			System.out.println(function);		
//			
//			testcsv.sb_training_10.append(timestamp);
//			testcsv.sb_training_10.append(';');
//			testcsv.sb_training_10.append(function);
//			testcsv.sb_training_10.append('\n');
//
//			}
//		
//		//18:20 a 18:59
//		if(timestamp_min > 1100 && timestamp_min <= 1139){
//			System.out.println(timestamp);
//			System.out.println(timestamp_min);
//			
//			function = 9.318687 * g + 9.951361 * g + 10.97083 * g + 10.17059 * g;
//
//			System.out.println(function);		
//
//			testcsv.sb_training_10.append(timestamp);
//			testcsv.sb_training_10.append(';');
//			testcsv.sb_training_10.append(function);
//			testcsv.sb_training_10.append('\n');
//			
//			}
//		
//		//18:59 a 20:17
//		if(timestamp_min > 1139 && timestamp_min <= 1217){
//			System.out.println(timestamp);
//			System.out.println(timestamp_min);
//			
//			function = 9.318687 * g + 9.951361 * g + 9.049306 * g;
//
//			System.out.println(function);		
//			
//			testcsv.sb_training_10.append(timestamp);
//			testcsv.sb_training_10.append(';');
//			testcsv.sb_training_10.append(function);
//			testcsv.sb_training_10.append('\n');
//		}
//			
//		//20:17 a 21:42
//		if(timestamp_min > 1217 && timestamp_min <= 1302){
//			System.out.println(timestamp);
//			System.out.println(timestamp_min);
//			
//			function = 9.318687 * g + 7.495098 * g + 9.233333 * g;
//	
//			System.out.println(function);		
//			
//			testcsv.sb_training_10.append(timestamp);
//			testcsv.sb_training_10.append(';');
//			testcsv.sb_training_10.append(function);
//			testcsv.sb_training_10.append('\n');
//			
//		}
//		
//		//21:42 a 23:00
//		if(timestamp_min > 1302 && timestamp_min <= 1380){
//			System.out.println(timestamp);
//			System.out.println(timestamp_min);
//			
//			function = 9.318687 * g + 7.495098 * g + 4.308333 * g;
//
//			System.out.println(function);		
//			
//			testcsv.sb_training_10.append(timestamp);
//			testcsv.sb_training_10.append(';');
//			testcsv.sb_training_10.append(function);
//			testcsv.sb_training_10.append('\n');
//
//		}
//		
//		 testcsv.pw_training_10.write(testcsv.sb_training_10.toString());
//
//	}
//	
//	public void build_test_11_08(double timestamp){
//		
//		double timestamp_min = timestamp * 60;
//		double g = (1 / 2) + ((15 * 15) / 16) * timestamp_min - ((5 * Math.pow(15,3)) / 8) * Math.pow(timestamp_min,3) + ((3 * Math.pow(15,5)) / 16) * Math.pow(timestamp_min,5);
//		
//		//12 a 13:21
//		if(timestamp_min >= 720 && timestamp_min <= 801){
//			System.out.println(timestamp);
//			System.out.println(timestamp_min);		
//			
//			function = 8.547083 * g + 7.969298 * g + 9.857143 * g;
//			
//			System.out.println(function);		
//			
//			testcsv.sb_training_11.append(timestamp);
//			testcsv.sb_training_11.append(';');
//			testcsv.sb_training_11.append(function);
//			testcsv.sb_training_11.append('\n');
//
//		}
//		//13:21 a 14:38
//		if(timestamp_min > 801 && timestamp_min <= 878){
//			System.out.println(timestamp);
//			System.out.println(timestamp_min);
//			
//			function = 8.547083 * g + 7.969298 * g + 6.868056 * g;
//			
//			System.out.println(function);		
//			
//			testcsv.sb_training_11.append(timestamp);
//			testcsv.sb_training_11.append(';');
//			testcsv.sb_training_11.append(function);
//			testcsv.sb_training_11.append('\n');
//			}
//		
//		//14:38 a 17:12
//		if(timestamp_min > 878 && timestamp_min <= 1032){
//			System.out.println(timestamp);
//			System.out.println(timestamp_min);
//			
//			function = 8.547083 * g + 9.069841 * g;
//
//			System.out.println(function);		
//			
//			testcsv.sb_training_11.append(timestamp);
//			testcsv.sb_training_11.append(';');
//			testcsv.sb_training_11.append(function);
//			testcsv.sb_training_11.append('\n');
//
//			}
//		
//		//17:12 a 17:58
//		if(timestamp_min > 1032 && timestamp_min <= 1078){
//			System.out.println(timestamp);
//			System.out.println(timestamp_min);
//			
//			function = 12.92421 * g + 13.56429 * g + 14.42456 * g + 13.17667 * g;
//
//			System.out.println(function);		
//			
//			testcsv.sb_training_11.append(timestamp);
//			testcsv.sb_training_11.append(';');
//			testcsv.sb_training_11.append(function);
//			testcsv.sb_training_11.append('\n');
//
//			}
//		
//		//17:58 a 18:36
//		if(timestamp_min > 1078 && timestamp_min <= 1116){
//			System.out.println(timestamp);
//			System.out.println(timestamp_min);
//			
//			function = 12.92421 * g + 13.56429 * g + 14.42456 * g + 15.3947 * g;
//
//			System.out.println(function);		
//			
//			testcsv.sb_training_11.append(timestamp);
//			testcsv.sb_training_11.append(';');
//			testcsv.sb_training_11.append(function);
//			testcsv.sb_training_11.append('\n');
//
//			}
//		
//		//18:36 a 19:08
//		if(timestamp_min > 1116 && timestamp_min <= 1148){
//			System.out.println(timestamp);
//			System.out.println(timestamp_min);
//			
//			function = 12.92421 * g + 13.56429 * g + 11.24167 * g + 12.1619 * g;
//
//			System.out.println(function);		
//			
//			testcsv.sb_training_11.append(timestamp);
//			testcsv.sb_training_11.append(';');
//			testcsv.sb_training_11.append(function);
//			testcsv.sb_training_11.append('\n');
//		}
//			
//		//19:08 a 19:36
//		if(timestamp_min > 1148 && timestamp_min <= 1176){
//			System.out.println(timestamp);
//			System.out.println(timestamp_min);
//			
//			function = 12.92421 * g + 13.56429 * g + 11.24167 * g + 11.175 * g;
//	
//			System.out.println(function);		
//			
//			testcsv.sb_training_11.append(timestamp);
//			testcsv.sb_training_11.append(';');
//			testcsv.sb_training_11.append(function);
//			testcsv.sb_training_11.append('\n');
//			
//		}
//		
//		//19:36 a 23:00
//		if(timestamp_min > 1176 && timestamp_min <= 1380){
//			System.out.println(timestamp);
//			System.out.println(timestamp_min);
//			
//			function = 12.92421 * g + 5.083333 * g;
//
//			System.out.println(function);		
//			
//			testcsv.sb_training_11.append(timestamp);
//			testcsv.sb_training_11.append(';');
//			testcsv.sb_training_11.append(function);
//			testcsv.sb_training_11.append('\n');
//
//		}
//		
//		testcsv.pw_training_11.write(testcsv.sb_training_11.toString());
//
//	}
//}
