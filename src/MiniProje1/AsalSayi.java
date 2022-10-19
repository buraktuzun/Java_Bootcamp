package MiniProje1;

public class AsalSayi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 21;
		boolean isPrime = true;
		
		
		for (int i=2; i<number;i ++){
			if(number % i == 0){
				isPrime = false;
		}
			}
		
			if(isPrime){
				System.out.println("Sayı asaldır");
			}else{
				System.out.println("Sayı asal değildir");
			}
		
	}

}
