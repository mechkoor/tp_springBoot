package ayoub;

public class Marchandise {
	private int reference;
	private int poids;
	private int volume;
	
	public Marchandise(int r,int p,int v) {
		this.reference=r;
		this.poids=p;
		this.volume=v;		
	}
	
	public int getReference() {
		return reference;
	}
	public void setReference(int r) {
		this.reference=r;
	}
	
	public int getPoids() {
		return poids;
	}
	public void setPoids(int p) {
		this.poids=p;
	}
	
	public int getVolume() {
		return volume;
	}
	public void setVolume(int v) {
		this.volume=v;
	}
	
	public String toString() {
		return "la reference : "+reference+
				"\nle poids :"+poids+
				"\nle volume: "+volume;
	}
}
