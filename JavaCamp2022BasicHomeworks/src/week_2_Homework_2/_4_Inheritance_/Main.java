package week_2_Homework_2;

public class _4_Inheritance_Main {

	public static void main(String[] args) {
		_4_Inheritance_KrediUI krediUI = new _4_Inheritance_KrediUI();
		
		krediUI.KrediHesapla(new _4_Inheritance_TarimKrediManager());
		krediUI.KrediHesapla(new _4_Inheritance_OgretmenKrediManager());
		krediUI.KrediHesapla(new _4_Inheritance_AskerKrediManager());

	}

}
