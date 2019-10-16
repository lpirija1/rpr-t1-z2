package ba.unsa.etf.rpr;
import java.util.Scanner;
public class Main {
private static int sumaCifara(int broj){
    int s=0;
    while(broj>0){
        int ostatak=broj%10;
        s=s+ostatak;
        broj=broj/10;
    }
    return s;
}
    public static void main(String[] args) {
	System.out.println("Unesite broj n: ");
	int n;
	Scanner ulaz=new Scanner(System.in);
	n=ulaz.nextInt();
	for(int i=1; i<=n; i++){
	    int suma=sumaCifara(i);
	    if(i%suma==0) System.out.println(i);
    }

    }
}
