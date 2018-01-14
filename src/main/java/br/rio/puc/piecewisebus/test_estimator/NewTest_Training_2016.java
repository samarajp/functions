package br.rio.puc.piecewisebus.test_estimator;

public class NewTest_Training_2016 {

//	double tolerance = 1.3;
	double function = 0;
	Test_Estimator testcsv = new Test_Estimator();
	
	//Parte experimental de treino - Dia 2016-08-08 
	public void build_training_2016(double timestamp){
		System.out.println("Valor do tempo recebido: "+timestamp);

		double timestamp_min = timestamp * 60;
		
		System.out.println("Valor do tempo convertido: "+timestamp_min);

		double g = (1 / 2) + ((15 * 15) / 16) * timestamp_min - ((5 * Math.pow(15,3)) / 8) * Math.pow(timestamp_min,3) + ((3 * Math.pow(15,5)) / 16) * Math.pow(timestamp_min,5);

		//00:12 a 06:02
		if(timestamp_min >= 40 && timestamp_min <= 362){
			System.out.println(timestamp);
			System.out.println(timestamp_min);		
			
			function = 299122 * g + 241166.7 * g;
			
			System.out.println(function);	
			
			testcsv.sb_2016.append(timestamp);
			testcsv.sb_2016.append(';');
			testcsv.sb_2016.append(function);
			testcsv.sb_2016.append('\n');
		}
		//06:02 a 07:57
		if(timestamp_min > 362 && timestamp_min <= 477){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 299122 * g + 309057.1 * (1 - g) + 251352.9 * g + 269000 * g;
			
			System.out.println(function);		
			
			testcsv.sb_2016.append(timestamp);
			testcsv.sb_2016.append(';');
			testcsv.sb_2016.append(function);
			testcsv.sb_2016.append('\n');

			}
		//07:57 a 08:35
		if(timestamp_min > 477 && timestamp_min <= 515){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 299122 * g + 309057.1 * (1 - g) + 251352.9 * g + 241727.3 * (1 - g) + 222250 * g;

			System.out.println(function);		
			
			testcsv.sb_2016.append(timestamp);
			testcsv.sb_2016.append(';');
			testcsv.sb_2016.append(function);
			testcsv.sb_2016.append('\n');

			}
		//08:35  a 09:11
		if(timestamp_min > 515 && timestamp_min <= 551){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 299122 * g + 309057.1 * (1 - g) + 251352.9 * g + 241727.3 * (1 - g) + 250166.7 * (1 - g);

			System.out.println(function);		
			
			testcsv.sb_2016.append(timestamp);
			testcsv.sb_2016.append(';');
			testcsv.sb_2016.append(function);
			testcsv.sb_2016.append('\n');

			}
		//09:11 a 10:35
		if(timestamp_min > 551 && timestamp_min <= 635){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 299122 * g + 309057.1 * (1 - g) + 370823.5 * (1 - g) + 385800 * g;

			System.out.println(function);		
			
			testcsv.sb_2016.append(timestamp);
			testcsv.sb_2016.append(';');
			testcsv.sb_2016.append(function);
			testcsv.sb_2016.append('\n');

			}
		//10:35 a 11:10
		if(timestamp_min > 635 && timestamp_min <= 670){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 299122 * g + 309057.1 * (1 - g) + 370823.5 * (1 - g) + 366200 * (1 - g) + 339333.3 * g;

			System.out.println(function);		
			
			testcsv.sb_2016.append(timestamp);
			testcsv.sb_2016.append(';');
			testcsv.sb_2016.append(function);
			testcsv.sb_2016.append('\n');

			}
		//11:10 a 11:41
		if(timestamp_min > 670 && timestamp_min <= 701){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 299122 * g + 309057.1 * (1 - g) + 370823.5 * (1 - g) + 366200 * (1 - g) + 359166.7 * (1 - g);

			System.out.println(function);		
			
			testcsv.sb_2016.append(timestamp);
			testcsv.sb_2016.append(';');
			testcsv.sb_2016.append(function);
			testcsv.sb_2016.append('\n');

			}
		//11:41 a 17:49
		if(timestamp_min > 701 && timestamp_min <= 1069){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 354078.9 * (1 - g) + 341125 * g;

			System.out.println(function);		
			
			testcsv.sb_2016.append(timestamp);
			testcsv.sb_2016.append(';');
			testcsv.sb_2016.append(function);
			testcsv.sb_2016.append('\n');

			}
		//17:49 a 19:13
		if(timestamp_min > 1069 && timestamp_min <= 1153){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 354078.9 * (1 - g) + 355620.7 * (1 - g) + 429416.7 * g + 481333.3 * g;

			System.out.println(function);		
			
			testcsv.sb_2016.append(timestamp);
			testcsv.sb_2016.append(';');
			testcsv.sb_2016.append(function);
			testcsv.sb_2016.append('\n');

			}
		//19:13 a 20:39
		if(timestamp_min > 1153 && timestamp_min <= 1239){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 354078.9 * (1 - g) + 355620.7 * (1 - g) + 429416.7 * g + 412111.1 * (1 - g);

			System.out.println(function);		

			testcsv.sb_2016.append(timestamp);
			testcsv.sb_2016.append(';');
			testcsv.sb_2016.append(function);
			testcsv.sb_2016.append('\n');
		}
		
		//20:39 a 21:21
		if(timestamp_min > 1239 && timestamp_min <= 1281){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 354078.9 * (1 - g) + 355620.7 * (1 - g) + 303529.4 * (1 - g) + 344222.2 * g + 382833.3 * g;

			System.out.println(function);		

			testcsv.sb_2016.append(timestamp);
			testcsv.sb_2016.append(';');
			testcsv.sb_2016.append(function);
			testcsv.sb_2016.append('\n');
		}
				
		//21:21 a 21:58
		if(timestamp_min > 1281 && timestamp_min <= 1318){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 354078.9 * (1 - g) + 355620.7 * (1 - g) + 303529.4 * (1 - g) + 344222.2 * g + 267000 * (1 - g);

			System.out.println(function);		

			testcsv.sb_2016.append(timestamp);
			testcsv.sb_2016.append(';');
			testcsv.sb_2016.append(function);
			testcsv.sb_2016.append('\n');
		}
		
		//21:58
		if(timestamp_min > 1318){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 354078.9 * (1 - g) + 355620.7 * (1 - g) + 303529.4 * (1 - g) + 241000 * (1 - g);

			System.out.println(function);		

			testcsv.sb_2016.append(timestamp);
			testcsv.sb_2016.append(';');
			testcsv.sb_2016.append(function);
			testcsv.sb_2016.append('\n');
		}		
		
		 testcsv.pw_2016.write(testcsv.sb_2016.toString());
}
	
	
	public void build_test_11_08(double timestamp){
		
		double timestamp_min = timestamp * 60;
		double g = (1 / 2) + ((15 * 15) / 16) * timestamp_min - ((5 * Math.pow(15,3)) / 8) * Math.pow(timestamp_min,3) + ((3 * Math.pow(15,5)) / 16) * Math.pow(timestamp_min,5);
		
		//00:29 a 03:17
		if(timestamp_min >= 40 && timestamp_min <= 197){
			System.out.println(timestamp);
			System.out.println(timestamp_min);		
			
			function = 233833.3 * g + 237222.2 * g + 245428.6 * g;
			
			System.out.println(function);		
			
			testcsv.sb_training_11_2016.append(timestamp);
			testcsv.sb_training_11_2016.append(';');
			testcsv.sb_training_11_2016.append(function);
			testcsv.sb_training_11_2016.append('\n');

		}
		//03:17 a 06:06
		if(timestamp_min > 197 && timestamp_min <= 366){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 233833.3 * g + 237222.2 * g + 208500 * g;
			
			System.out.println(function);		
			
			testcsv.sb_training_11_2016.append(timestamp);
			testcsv.sb_training_11_2016.append(';');
			testcsv.sb_training_11_2016.append(function);
			testcsv.sb_training_11_2016.append('\n');
			}
		//06:06 a 09:03
		if(timestamp_min > 366 && timestamp_min <= 543){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 233833.3 * g + 232703.7 * (1- g) + 222571.4 * g;

			System.out.println(function);		
			
			testcsv.sb_training_11_2016.append(timestamp);
			testcsv.sb_training_11_2016.append(';');
			testcsv.sb_training_11_2016.append(function);
			testcsv.sb_training_11_2016.append('\n');

			}
		//09:03 a 10:28
		if(timestamp_min > 543 && timestamp_min <= 628){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 233833.3 * g + 232703.7 * (1- g) + 243181.8 * (1 - g) + 254500 * g;

			System.out.println(function);		
			
			testcsv.sb_training_11_2016.append(timestamp);
			testcsv.sb_training_11_2016.append(';');
			testcsv.sb_training_11_2016.append(function);
			testcsv.sb_training_11_2016.append('\n');

			}
		//10:28 a 11:48
		if(timestamp_min > 628 && timestamp_min <= 708){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 233833.3 * g + 232703.7 * (1- g) + 243181.8 * (1 - g) + 246833.3 * (1 - g);

			System.out.println(function);		
			
			testcsv.sb_training_11_2016.append(timestamp);
			testcsv.sb_training_11_2016.append(';');
			testcsv.sb_training_11_2016.append(function);
			testcsv.sb_training_11_2016.append('\n');

			}
		//11:48 a 13:21
		if(timestamp_min > 708 && timestamp_min <= 801){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 358774.2 * (1 - g) + 391000 * g + 351866.7 * g + 306200 * g;

			System.out.println(function);		
			
			testcsv.sb_training_11_2016.append(timestamp);
			testcsv.sb_training_11_2016.append(';');
			testcsv.sb_training_11_2016.append(function);
			testcsv.sb_training_11_2016.append('\n');

		}
		
		//13:21 a 14:38
		if(timestamp_min > 801 && timestamp_min <= 878){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 358774.2 * (1 - g) + 391000 * g + 351866.7 * g + 374700 * (1 - g);

			System.out.println(function);		
			
			testcsv.sb_training_11_2016.append(timestamp);
			testcsv.sb_training_11_2016.append(';');
			testcsv.sb_training_11_2016.append(function);
			testcsv.sb_training_11_2016.append('\n');

		}
		
		//14:38 a 17:12
		if(timestamp_min > 878 && timestamp_min <= 1032){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 358774.2 * (1 - g) + 391000 * g + 474857.1 * (1 - g);

			System.out.println(function);		
			
			testcsv.sb_training_11_2016.append(timestamp);
			testcsv.sb_training_11_2016.append(';');
			testcsv.sb_training_11_2016.append(function);
			testcsv.sb_training_11_2016.append('\n');

		}
		
		//17:12 a 19:53
		if(timestamp_min > 1032 && timestamp_min <= 1193){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 358774.2 * (1 - g) + 280714.3 * (1 - g) + 296000 * g;

			System.out.println(function);		
			
			testcsv.sb_training_11_2016.append(timestamp);
			testcsv.sb_training_11_2016.append(';');
			testcsv.sb_training_11_2016.append(function);
			testcsv.sb_training_11_2016.append('\n');

		}
		
		//19:53 a 21:16
		if(timestamp_min > 1193 && timestamp_min <= 1276){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 358774.2 * (1 - g) + 280714.3 * (1 - g) + 278166.7 * (1 - g) + 304500 * g;

			System.out.println(function);		
			
			testcsv.sb_training_11_2016.append(timestamp);
			testcsv.sb_training_11_2016.append(';');
			testcsv.sb_training_11_2016.append(function);
			testcsv.sb_training_11_2016.append('\n');

		}
		
		
		//21:16
		if(timestamp_min > 1276){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 358774.2 * (1 - g) + 280714.3 * (1 - g) + 278166.7 * (1 - g) + 271333.3 * (1 - g);

			System.out.println(function);		
			
			testcsv.sb_training_11_2016.append(timestamp);
			testcsv.sb_training_11_2016.append(';');
			testcsv.sb_training_11_2016.append(function);
			testcsv.sb_training_11_2016.append('\n');

		}
		
		
		 testcsv.pw_training_11_2016.write(testcsv.sb_training_11_2016.toString());

	}
	
		
	public void build_test_16_08_05(double timestamp){
		
		double timestamp_min = timestamp * 60;
		double g = (1 / 2) + ((15 * 15) / 16) * timestamp_min - ((5 * Math.pow(15,3)) / 8) * Math.pow(timestamp_min,3) + ((3 * Math.pow(15,5)) / 16) * Math.pow(timestamp_min,5);
		
		//00:05 a 01:45
		if(timestamp_min >= 40 && timestamp_min <= 105){
			System.out.println(timestamp);
			System.out.println(timestamp_min);		
			
			function = 500853.7 * g + 612444.4 * g + 246500 * g + 247666.7 * g;
			
			System.out.println(function);		
			
			testcsv.sb_training_16_05.append(timestamp);
			testcsv.sb_training_16_05.append(';');
			testcsv.sb_training_16_05.append(function);
			testcsv.sb_training_16_05.append('\n');

		}
		//01:45 a 03:45
		if(timestamp_min > 105 && timestamp_min <= 225){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 500853.7 * g + 612444.4 * g + 246500 * g + 134500 * (1 - g);
			
			System.out.println(function);	
			
			testcsv.sb_training_16_05.append(timestamp);
			testcsv.sb_training_16_05.append(';');
			testcsv.sb_training_16_05.append(function);
			testcsv.sb_training_16_05.append('\n');
			}
		
		//03:45 a 06:11
		if(timestamp_min > 225 && timestamp_min <= 371){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 500853.7 * g + 612444.4 * g + 519750 * (1 - g) + 242000 * g;

			System.out.println(function);		
			
			testcsv.sb_training_16_05.append(timestamp);
			testcsv.sb_training_16_05.append(';');
			testcsv.sb_training_16_05.append(function);
			testcsv.sb_training_16_05.append('\n');

			}
		
		//06:11 a 06:28
		if(timestamp_min > 371 && timestamp_min <= 388){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 500853.7 * g + 612444.4 * g + 519750 * (1 - g) + 190000 * (1 - g);

			System.out.println(function);		
			
			testcsv.sb_training_16_05.append(timestamp);
			testcsv.sb_training_16_05.append(';');
			testcsv.sb_training_16_05.append(function);
			testcsv.sb_training_16_05.append('\n');

			}
		
		//06:28 a 07:50
		if(timestamp_min > 388 && timestamp_min <= 470){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 500853.7 * g + 469468.8 * (1 - g) + 424437.5 * g + 51820 * g;

			System.out.println(function);		

			testcsv.sb_training_16_05.append(timestamp);
			testcsv.sb_training_16_05.append(';');
			testcsv.sb_training_16_05.append(function);
			testcsv.sb_training_16_05.append('\n');
			
			}
		
		//07:50 a 09:11
		if(timestamp_min > 470 && timestamp_min <= 551){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 500853.7 * g + 469468.8 * (1 - g) + 424437.5 * g + 38181.2 * (1 - g);

			System.out.println(function);		
			
			testcsv.sb_training_16_05.append(timestamp);
			testcsv.sb_training_16_05.append(';');
			testcsv.sb_training_16_05.append(function);
			testcsv.sb_training_16_05.append('\n');
		}
			
		//09:11 a 11:59
		if(timestamp_min > 551 && timestamp_min <= 719){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 500853.7 * g + 469468.8 * (1 - g) + 267285.7 * (1 - g);
	
			System.out.println(function);		
			
			testcsv.sb_training_16_05.append(timestamp);
			testcsv.sb_training_16_05.append(';');
			testcsv.sb_training_16_05.append(function);
			testcsv.sb_training_16_05.append('\n');
			
		}
		
		//11:59 a 15:02
		if(timestamp_min > 719 && timestamp_min <= 902){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 573952.4 * (1 - g) + 426387.8 * g + 270736.8 * g;

			System.out.println(function);		
			
			testcsv.sb_training_16_05.append(timestamp);
			testcsv.sb_training_16_05.append(';');
			testcsv.sb_training_16_05.append(function);
			testcsv.sb_training_16_05.append('\n');
			
		}
		
		//15:02 a 16:22
		if(timestamp_min > 902 && timestamp_min <= 982){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 573952.4 * (1 - g) + 426387.8 * g + 524966.7 * (1 - g) + 423615.4 * g;

			System.out.println(function);		
			
			testcsv.sb_training_16_05.append(timestamp);
			testcsv.sb_training_16_05.append(';');
			testcsv.sb_training_16_05.append(function);
			testcsv.sb_training_16_05.append('\n');

		}
		
		//16:22 a 17:41
		if(timestamp_min > 982 && timestamp_min <= 1061){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 573952.4 * (1 - g) + 426387.8 * g + 524966.7 * (1 - g) + 60247.6 * (1 - g);

			System.out.println(function);		
			
			testcsv.sb_training_16_05.append(timestamp);
			testcsv.sb_training_16_05.append(';');
			testcsv.sb_training_16_05.append(function);
			testcsv.sb_training_16_05.append('\n');

		}
		//17:41 a 20:41
		if(timestamp_min > 1061 && timestamp_min <= 1241){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 573952.4 * (1 - g) + 541871.4 * (1 - g) + 603333.3 * g;

			System.out.println(function);		
			
			testcsv.sb_training_16_05.append(timestamp);
			testcsv.sb_training_16_05.append(';');
			testcsv.sb_training_16_05.append(function);
			testcsv.sb_training_16_05.append('\n');
			
		}
		//20:41 a 22:10
		if(timestamp_min > 1241 && timestamp_min <= 1330){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 573952.4 * (1 - g) + 541871.4 * (1 - g) + 355263.2 * (1 - g) + 41090.1 * g;

			System.out.println(function);		
			
			testcsv.sb_training_16_05.append(timestamp);
			testcsv.sb_training_16_05.append(';');
			testcsv.sb_training_16_05.append(function);
			testcsv.sb_training_16_05.append('\n');

		}
		
		//22:10
		if(timestamp_min > 1330){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 573952.4 * (1 - g) + 541871.4 * (1 - g) + 355263.2 * (1 - g) + 233000 * (1 - g);

			System.out.println(function);		
			
			testcsv.sb_training_16_05.append(timestamp);
			testcsv.sb_training_16_05.append(';');
			testcsv.sb_training_16_05.append(function);
			testcsv.sb_training_16_05.append('\n');

		}
					
		 testcsv.pw_training_16_05.write(testcsv.sb_training_16_05.toString());

	}

	public void build_test_16_08_1(double timestamp){
		
		double timestamp_min = timestamp * 60;
		double g = (1 / 2) + ((15 * 15) / 16) * timestamp_min - ((5 * Math.pow(15,3)) / 8) * Math.pow(timestamp_min,3) + ((3 * Math.pow(15,5)) / 16) * Math.pow(timestamp_min,5);
		
		//00:05 a 03:45
		if(timestamp_min >= 40 && timestamp_min <= 225){
			System.out.println(timestamp);
			System.out.println(timestamp_min);		
			
			function = 500853.7 * g + 612444.4 * g + 246500 * g;
			
			System.out.println(function);		
			
			testcsv.sb_training_16_1.append(timestamp);
			testcsv.sb_training_16_1.append(';');
			testcsv.sb_training_16_1.append(function);
			testcsv.sb_training_16_1.append('\n');

		}
		
		//03:45 a 06:28
		if(timestamp_min > 225 && timestamp_min <= 388){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 500853.7 * g + 612444.4 * g + 519750 * (1 - g);

			System.out.println(function);		
			
			testcsv.sb_training_16_1.append(timestamp);
			testcsv.sb_training_16_1.append(';');
			testcsv.sb_training_16_1.append(function);
			testcsv.sb_training_16_1.append('\n');

			}
		
		//06:28 a 09:11
		if(timestamp_min > 388 && timestamp_min <= 551){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 500853.7 * g + 469468.8 * (1 - g) + 424437.5 * g;

			System.out.println(function);		

			testcsv.sb_training_16_1.append(timestamp);
			testcsv.sb_training_16_1.append(';');
			testcsv.sb_training_16_1.append(function);
			testcsv.sb_training_16_1.append('\n');
			
			}
		
		//09:11 a 11:59
		if(timestamp_min > 551 && timestamp_min <= 719){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 500853.7 * g + 469468.8 * (1 - g) + 267285.7 * (1 - g);
	
			System.out.println(function);		
			
			testcsv.sb_training_16_1.append(timestamp);
			testcsv.sb_training_16_1.append(';');
			testcsv.sb_training_16_1.append(function);
			testcsv.sb_training_16_1.append('\n');
			
		}
		
		//11:59 a 15:02
		if(timestamp_min > 719 && timestamp_min <= 902){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 573952.4 * (1 - g) + 426387.8 * g + 270736.8 * g;

			System.out.println(function);		
			
			testcsv.sb_training_16_1.append(timestamp);
			testcsv.sb_training_16_1.append(';');
			testcsv.sb_training_16_1.append(function);
			testcsv.sb_training_16_1.append('\n');
			
		}
		
		//15:02 a 17:41
		if(timestamp_min > 902 && timestamp_min <= 1061){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 573952.4 * (1 - g) + 426387.8 * g + 524966.7 * (1 - g);

			System.out.println(function);		
			
			testcsv.sb_training_16_1.append(timestamp);
			testcsv.sb_training_16_1.append(';');
			testcsv.sb_training_16_1.append(function);
			testcsv.sb_training_16_1.append('\n');

		}

		//17:41 a 20:41
		if(timestamp_min > 1061 && timestamp_min <= 1241){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 573952.4 * (1 - g) + 541871.4 * (1 - g) + 603333.3 * g;

			System.out.println(function);		
			
			testcsv.sb_training_16_1.append(timestamp);
			testcsv.sb_training_16_1.append(';');
			testcsv.sb_training_16_1.append(function);
			testcsv.sb_training_16_1.append('\n');
			
		}
		//20:41 a 22:10
		if(timestamp_min > 1241){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 573952.4 * (1 - g) + 541871.4 * (1 - g) + 355263.2 * (1 - g);

			System.out.println(function);		
			
			testcsv.sb_training_16_1.append(timestamp);
			testcsv.sb_training_16_1.append(';');
			testcsv.sb_training_16_1.append(function);
			testcsv.sb_training_16_1.append('\n');

		}

		 testcsv.pw_training_16_1.write(testcsv.sb_training_16_1.toString());

	}
	
	public void build_test_16_08_1_5(double timestamp){
		
		double timestamp_min = timestamp * 60;
		double g = (1 / 2) + ((15 * 15) / 16) * timestamp_min - ((5 * Math.pow(15,3)) / 8) * Math.pow(timestamp_min,3) + ((3 * Math.pow(15,5)) / 16) * Math.pow(timestamp_min,5);
		
		//00:05 a 06:28
		if(timestamp_min >= 40 && timestamp_min <= 388){
			System.out.println(timestamp);
			System.out.println(timestamp_min);		
			
			function = 500853.7 * g + 612444.4 * g;
			
			System.out.println(function);		
			
			testcsv.sb_training_16_1_5.append(timestamp);
			testcsv.sb_training_16_1_5.append(';');
			testcsv.sb_training_16_1_5.append(function);
			testcsv.sb_training_16_1_5.append('\n');

		}
		
		//06:28 a 11:59
		if(timestamp_min > 388 && timestamp_min <= 719){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 500853.7 * g + 469468.8 * (1 - g);

			System.out.println(function);		

			testcsv.sb_training_16_1_5.append(timestamp);
			testcsv.sb_training_16_1_5.append(';');
			testcsv.sb_training_16_1_5.append(function);
			testcsv.sb_training_16_1_5.append('\n');
			
			}
		
		//11:59 a 17:41
		if(timestamp_min > 719 && timestamp_min <= 1061){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 573952.4 * (1 - g) + 426387.8 * g;

			System.out.println(function);		
			
			testcsv.sb_training_16_1_5.append(timestamp);
			testcsv.sb_training_16_1_5.append(';');
			testcsv.sb_training_16_1_5.append(function);
			testcsv.sb_training_16_1_5.append('\n');
			
		}

		//17:41
		if(timestamp_min > 1061){
			System.out.println(timestamp);
			System.out.println(timestamp_min);
			
			function = 573952.4 * (1 - g) + 541871.4 * (1 - g);

			System.out.println(function);		

			testcsv.sb_training_16_1_5.append(timestamp);
			testcsv.sb_training_16_1_5.append(';');
			testcsv.sb_training_16_1_5.append(function);
			testcsv.sb_training_16_1_5.append('\n');
			
		}

		 testcsv.pw_training_16_1_5.write(testcsv.sb_training_16_1_5.toString());

	}
	
}
