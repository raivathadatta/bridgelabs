package day4;

public class employeepresent {

	public void  wagecaluclation() {
		System.out.println("hello");
		// TODO Auto-generated method stub
		int days=0;;int hours=0;
		
		while(hours<=100&&days<=20) {System.out.println("hour"+" "+ hours+" "+ "days"+days);
			if(hours+8>100)
				break;
			
		int check=(int) ((Math.random()*10)%2);
		System.out.println(check+""+"check");
      
			int fhours=8;
          // 	int partTme=8;
			
		
		switch (check) {
//		
		
		case 0: {
			//fulltime 8 houres preday 20days 20per hou
			days++;
			
		hours=hours+fhours;
			
			break;
			
		}
		case 1: {
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " );
		}
		}
        // System.out.println("hour"+" "+ hours+" "+ "days"+days);
		int cost=20;int partTime=8;
		hours+=partTime;
		int amount=hours*cost;
		
		
		
			System.out.println("amount"+amount);
			//return (amount,hours,days);	
	}

		
	}



