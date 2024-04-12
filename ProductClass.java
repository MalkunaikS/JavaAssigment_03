package assigment_03;

public class ProductClass {
	private String [] productNames = {"Pen","Pencile","Notebook","Pendrive","WorkSheet"};
	private int [] productCost = {90,10,70,899,30};
	private int[] productquantity = new int[5];
	
	
	protected ProductClass(String[] productNames, int[] productCost, int[] productquantity) {
		super();
		this.productNames = productNames;
		this.productCost = productCost;
		this.productquantity = productquantity;
	}


	public String[] getProductNames() {
		return productNames;
	}


	public int[] getProductCost() {
		return productCost;
	}


	public int[] getProductquantity() {
		return productquantity;
	}

}
