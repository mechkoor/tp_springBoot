package ayoub;
import java.util.ArrayList;
public abstract class  Cargison {
	protected ArrayList<Marchandise> collection;
	protected int distance;
	protected int limite;
	
	public Cargison(int d) {
		this.collection=new ArrayList<Marchandise>();
		this.distance=d;		
	}
	
	public ArrayList<Marchandise> getCollection(){
		return collection;
	}
	public void setCollection(ArrayList<Marchandise> a) {
		this.collection=a;
	}
	
	public int getDistance() {
		return distance;
	}
	public void setDistance(int d) {
		this.distance=d;
	}
	
	public int getLimite() {
		return limite;
	}
	
	public abstract int cout();
	public abstract int encombrement();
	public abstract void ajouter(Marchandise m);
	
	public String toString() {
		return "le cout totale est : "+this.cout();
	}
}
