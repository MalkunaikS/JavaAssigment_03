package assigment_03;

public class ShoppingCart {

  	private int totalCost = 0;

	protected ShoppingCart(int totalCost) {
		this.totalCost = totalCost;
	}
	public void CartDisplay(int[] productquantity, String[]  productNames){
		for (int x = 0; x < productquantity.length; x++)
		{
			System.out.println("Your cart has " + productquantity[x] + productNames[x]);
		}
	}	
		
	public int getTotalCost(int[] productquantity, int[] productCost, int totalCost){
		for(int i = 0; i < productquantity.length; i++){
			int lineItemCost = productCost[i] * productquantity[i];
			totalCost = totalCost + lineItemCost;
}
		System.out.println("Total cost Of all the products is ");
		return totalCost;
}
}
