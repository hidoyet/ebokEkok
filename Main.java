package ebokEkok;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		int num1,num2,ebob=1,kucukSayi,kontrol=1;
		System.out.print("Ebob'unu bulmak istediðiniz sayýlardan ilkini giriniz: ");
		num1=scanner.nextInt();
		System.out.print("Ebob'unu bulmak istediðiniz sayýlardan ikincisini giriniz: ");
		num2=scanner.nextInt();
		if(num1<num2) {
			kucukSayi=num1;
		}else {
			kucukSayi=num2;
		}
		while(kontrol<=kucukSayi) {
			
			while(num1%kontrol==0&&num2%kontrol==0) {
				ebob=kontrol;
				break;
			}
			kontrol++;
			
			
		}
		System.out.println("Girilen sayýlarýn ebobu: "+ebob+" ekoku: "+(num1*num2)/ebob);
	}

}
