import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		   System.out.println("Sifreleme mi yapacaksınız , yoksa sifre mi cözümleyeceksiniz ?");
	        System.out.println("Eğer sifre olusturacaksanız 1 sayısını giriniz ,eger sifre cözecekseniz 2 sayısını giriniz ");
	        Scanner giris = new Scanner(System.in);
	        int yonlendirme = giris.nextInt();
	        if (yonlendirme == 1) {
	            Sifreleme();
	        } else if (yonlendirme == 2) {
	            tersten();
	        } else
	            System.out.println("Gecersiz hane girdiniz !");
	    }
	    public static void Sifreleme() {
	        String cıktı = "";
	        String[][] charecters = {{"a", "Br"}, {"b", "Se"}, {"c", "As"}, {"ç", "Ge"}, {"d", "Ga"}, {"e", "Zn"}, {"f", "Cu"}, {"g", "Ni"},
	                {"ğ", "Co"}, {"h", "Fe"}, {"ı", "Mn"}, {"i", "Cr"}, {"j", "Mo"}, {"k", "Ti"}, {"l", "Ca"}, {"m", "Ru"}, {"n", "Ar"}, {"o", "Cl"},
	                {"ö", "Zr"}, {"p", "Xe"}, {"r", "Al"}, {"s", "Mg"}, {"ş", "Na"}, {"t", "Rb"}, {"u", "Nb"}, {"ü", "Ag"}, {"v", "Te"}, {"y", "Sc"}, {"z", "Be"},
	                {"0", "Ce"},{"1", "Pr"},{"2", "Nd"},{"3", "Pm"},{"4", "Sm"},{"5", "Eu"},{"6", "Gd"},{"7", "Tb"},{"8", "Dy"},{"9", "Ho"},
	                {".", "Er"},{",", "Tm"},{"!", "Yb"},{" ", "Kd"}};

	        Scanner klv = new Scanner(System.in);
	        System.out.println("Lütfen sifrelenmesini istediginiz kelimeyi veya cümleyi girin :");
	        String gırılen = klv.nextLine();
	        String cumle = gırılen.toLowerCase();
	        String[] parca = cumle.split("");
	        for (int i = 0; i < cumle.length(); i++) {
	            for (int j = 0; j < charecters.length; j++) {
	                if (parca[i].equals(charecters[j][0])) {
	                    parca[i] = charecters[j][1];
	                    cıktı = cıktı + parca[i];
	                }
	            }
	        }
	        System.out.println("Şifreniz : "+cıktı);
	    }
	    public static void tersten() {
	        String cıktı = "";
	        String[][] charecters = {{"Br", "a"}, {"Se", "b"}, {"As", "c"}, {"Ge", "ç"}, {"Ga", "d"}, {"Zn", "e"}, {"Cu", "f"}, {"Ni", "g"},
	                {"Co", "ğ"}, {"Fe", "h"}, {"Mn", "ı"}, {"Cr", "i"}, {"Mo", "j"}, {"Ti", "k"}, {"Ca", "l"}, {"Ru", "m"}, {"Ar", "n"}, {"Cl", "o"},
	                {"Zr", "ö"}, {"Xe", "p"}, {"Al", "r"}, {"Mg", "s"}, {"Na", "ş"}, {"Rb", "t"}, {"Nb", "u"}, {"Ag", "ü"}, {"Te", "v"}, {"Sc", "y"}, {"Be", "z"},
	                {"Ce", "0"},{"Pr", "1"},{"Nd", "2"},{"Pm", "3"},{"Sm", "4"},{"Eu", "5"},{"Gd", "6"},{"Tb", "7"},{"Dy", "8"},{"Ho", "9"},
	                {"Er", "."},{"Tm", ","},{"Yb", "!"},{"Kd", " "}};

	        Scanner klavye = new Scanner(System.in);
	        System.out.println("Sifreli Metni Giriniz :");
	        String gırılen = klavye.nextLine();
	        String cumle = gırılen;
	        String[] parca = gırılen.split("");
	        for (int i = 0; i < cumle.length() - 1; i++) {
	            for (int j = 0; j < charecters.length; j++) {
	                if (cumle.substring(i, i + 2).equals(charecters[j][0])) {
	                    parca[i] = charecters[j][1];
	                    cıktı = cıktı + parca[i];
	                }
	            }
	        }
	        System.out.println("Şifrenizin Çözümü : "+cıktı);
	}
}








