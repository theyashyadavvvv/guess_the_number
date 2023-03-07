package guessthenumber_03;
import java.util.*;

import java.util.Random;

class gamess{
	int number;
	int no_of_gussses=0;
	int input_number;
	public int get_no_of_gussses() {
		return no_of_gussses;
	}
	public void set_no_of_gussses(int no_of_gussses) {
		this.no_of_gussses=no_of_gussses;
	}
	 gamess   () {
		Random rand= new Random();
		this.number=rand .nextInt(100); 
	
	}
	void takeuserinput() {
		System.out.println("guess the number");
;
		 Scanner sc = new Scanner(System.in);
		 input_number=sc.nextInt();
	}
	boolean  iscorrectnumber() {
		no_of_gussses++;
		if (input_number==number) {
			System.out.format("Yes you guessed it right, it was %d\nYou guessed it in %d attempts", number, no_of_gussses);
			return true;
		}
		
		
	 else if (input_number<number) {
		System.out.println("too low .....");
		
	}
		else if(input_number>number) {
			
			System.out.println("too high.....");
		}
		return false;
	}
	
}




public class ex_03_solve {
	public static void main(String args[]) {
		gamess g = new gamess();
		boolean b=false;
		while(!b) {
		g.takeuserinput() ;
		 b=g.iscorrectnumber();
        System.out.println(b);
        }
	}
	}


