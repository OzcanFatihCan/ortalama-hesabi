package projedosya;
import java.util.*;
public class projedosya1 {

	public static void main(String[] args) {
		ArrayList <Integer> notlar=new ArrayList <Integer>();
    	int toplam=0;
    	double ortalama;
    	Scanner giris=new Scanner(System.in);
    	System.out.println("Sayý giriniz: ");
    	int a=giris.nextInt();
    	while(a>0) 
    	{
    		System.out.println("Sayý giriniz: ");
    		notlar.add(a);
    		a=giris.nextInt();
    	}
    	System.out.println(notlar);
    	for(int i:notlar)
    	{
    		toplam+=i;
    	}
    	ortalama=toplam/notlar.size();
    	System.out.println("Girilen sayýlarýn ortalamasý: "+ortalama);

	}

}
