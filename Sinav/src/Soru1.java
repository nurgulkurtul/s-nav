
public class Soru1 {

	public static void yldz() {
		String yldz="*";
		for (int i=1; i<=7; i++) {
			System.out.println(yldz);
			yldz=yldz+"*";
		}
		for (int j=1; j<=3; j++) {
			System.out.println("*******");
		}
		
	}
	public static void main(String[] args) {
		yldz();
	}

}
