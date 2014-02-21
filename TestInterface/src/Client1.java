
public class Client1 implements Callback{

	public void performCallback(int n) {
		while(n >= 0){
			System.out.println(n);
			n--;
		}
	}
	
	public static void main(String [] args){
		Client1 countdown = new Client1();
		countdown.performCallback(10);
	}
	
}
