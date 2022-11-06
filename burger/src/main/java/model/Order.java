package model;

import java.io.Serializable;

public class Order implements Serializable {
	//商品の一覧を配列としたフィールドを持つ
	private int budget;
	private int total;
	private Product[] list;
	
	public Order() {}
	
	public Order(int budget) {
		this.setBudget(budget);
	}

	public int getBudget() {
		return budget;
	}

	public void setBudget(int budget) {
		this.budget = budget;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public Product[] getList() {
		return list;
	}

	public void setList(Product[] list) {
		this.list = list;
	}
}
