
public class Client2 implements Callback{

	public void performCallback(int n) {
		System.out.print(n*n*n);
	}
	
	public static void main(String [] args){
		int num = 3;
		Client2 cube = new Client2();
		cube.performCallback(num);
	}
	
}
