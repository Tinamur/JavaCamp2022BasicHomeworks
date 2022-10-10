package week_2_Homework_2._4_Inheritance_;

public class Main {

	public static void main(String[] args) {
		KrediUI krediUI = new KrediUI();
		
		krediUI.KrediHesapla(new TarimKrediManager());
		krediUI.KrediHesapla(new OgretmenKrediManager());
		krediUI.KrediHesapla(new AskerKrediManager());

	}

}
