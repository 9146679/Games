import java.util.Random;
import java.util.Scanner;

public class srp {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		while(true) {
		String[] spr= {"s","r","p"};
		String cm=spr[new Random().nextInt(spr.length)];
		String pm;
		while(true) {
			System.out.println("Yours Round(r,p,s)");
			pm=sc.nextLine();
			if(pm.equals("r")|| pm.equals("p")||pm.equals("s")) {
				break;
			}
			System.out.println(pm+"this is not the correct Play Proparly");
		}
		if(cm.equals(pm)) {
			System.out.println("It's a Tie");
		}else if(pm.equals("r")) {
			if(cm.equals("s")) {
				System.out.println("You Won!!!!");
			}
			if(cm.equals("p")) {
				System.out.println("You Lose");
			}
		}else if(pm.equals("s")) {
			if(cm.equals("p")) {
				System.out.println("You Won");
			}
			if(cm.equals("r")) {
				System.out.println("You Lose");
			}
		}
		System.out.println("IF wan't to Play Again Type Y else N");
		String i=sc.next();
		if(!i.equals("y")) {
			break;
		}
		}
		sc.close();
	}
}