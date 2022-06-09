package strong;
public class Armstrong{
	public void arm(int a){
		int x=0,y=0,z=a;
		while(z!=0){
			y=z%10;
			x=x+(y*y*y);
			z=z/10;
		}
		if(x==a){
			System.out.println("Armstrong number.");
		}else{
			System.out.println("Not a Armstrong number.");
		}
	}
}