package Coding;

public class MultiThreadProcess1 {
	public static void main(String[] args) {

		Add add = new Add();
		add.start();
		Sub sub=new Sub();
		sub.start();

	}

}

class Add extends Thread {
	int sum;
	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			sum=sum+i;
			System.out.println(sum);
		}

	}
}
class Sub extends Thread{
	int sub=0;
	@Override
	public void run() {
		for (int i = 50; i >= 0; i--) {
			sub=sub-i;
			System.out.println(sub);
			
		}
	}
	
	
	
}
