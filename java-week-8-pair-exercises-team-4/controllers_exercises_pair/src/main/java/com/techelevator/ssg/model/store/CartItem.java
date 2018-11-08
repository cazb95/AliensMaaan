package com.techelevator.ssg.model.store;

public class CartItem {
	
	Product product;
	int quantity;
	DollarAmount subTotal;
	
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public DollarAmount calculateSubTotal(Product product, int quantity) {
        int price = (product.getPrice()).hashCode();
        subTotal = new DollarAmount(price * quantity);
        return subTotal;
    }
	public void setTotalPrice(int totalPrice) {
		this.subTotal = subTotal;
	}
	
	

}
