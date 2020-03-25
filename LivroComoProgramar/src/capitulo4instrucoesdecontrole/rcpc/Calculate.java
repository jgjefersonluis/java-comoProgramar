package capitulo4instrucoesdecontrole.rcpc;

public class Calculate {

	public static void main(String[] args) {


		int sum;
		int x;
		
		x=1;
		sum=0;
		
		while(x<=10){
			sum += x;
			++x;
		}
		System.out.printf("The sum is: %d\n", sum);
	}

}
