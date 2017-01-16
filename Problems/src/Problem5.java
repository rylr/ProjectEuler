
public class Problem5 {
	public static void main(String[] args) {
		boolean looking = true;
		long king = 1;
		while(looking) {
			for(int i = 1; i <= 20; i++) {
				if(king % i != 0) 
					break;
				if(i == 20 && king % i == 0)
					looking = false;
			}
		if(looking == true)
			king++;
		}
		System.out.println(king);
	}
}
