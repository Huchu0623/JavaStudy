package pk24;

public class GenericPrinter<T extends Material> {
	
	private T material;//material ->powder, plastic, water

	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	

}
