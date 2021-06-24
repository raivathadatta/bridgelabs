package day4;

public class snakesandladders {
public  void snakesAndLadders() {
	
int count=0;
while(count<=100) {
	if(count==100)
		break;
	System.out.println("count"+" "+count);
	int die=(int)((Math.random()*10)%6);
	die=die+1;
	System.out.println("die"+" "+die);
	int move=(int)((Math.random()*10)%3);
	switch(move) {
	case 0:
		break;
	case 1:{
		if(count+die>100);
		else
			count=count+die;
		break;
			}
	case 2:{if(count>die)
		count=count-die;
	else
		count=0;
		break;
		}
			
	}
	
}
if(count==100)
	System.out.println("win");
}
}