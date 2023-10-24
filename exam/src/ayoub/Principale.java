package ayoub;

public class Principale {
	public static void main (String [] args) {
		Fluvial f1=new Fluvial(50);
		
		Marchandise m1=new Marchandise(1,65,30);
		
		
		
		f1.ajouter(m1);
		
		
		System.out.println(f1);
	}

}
