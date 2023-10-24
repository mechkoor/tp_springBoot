package ayoub;

public class Fluvial extends Cargison {
	public Fluvial(int d) {
		super(d);
		this.limite=60;		
	}
	
	public void ajouter(Marchandise m) {
		if (this.encombrement()+m.getPoids()<=getLimite()) {
			collection.add(m);
		}
		else {
			System.out.println("vous allez depasser la limmite ");
		}
	}
	
	public int encombrement() {
		int a=0;
		for( int i=0 ;i<collection.size();i++) {
			a+=collection.get(i).getPoids();
		}
		return a;
	}
	
	public int cout() {
		return distance*encombrement();
	}
	
	public String toString() {
		return super.toString();
		}

}
