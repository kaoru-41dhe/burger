package model;

import java.io.Serializable;

public class Menu implements Serializable {
	private Product[] list;

	public Menu() {
		Product[] l = new Product[13];
		this.setList(l);
		
		this.getList()[0] = new Product("ワッパーチーズ", 670);
		this.getList()[1] = new Product("ワッパーチーズJr.", 440);
		this.getList()[2] = new Product("ダブルワッパーチーズ", 970);
		this.getList()[3] = new Product("ダブルワッパーチーズJr.", 620);
		this.getList()[4] = new Product("アボカドワッパー", 770);
		this.getList()[5] = new Product("アボカドワッパーjr.", 520);
		this.getList()[6] = new Product("クアトロチーズワッパー", 770);
		this.getList()[7] = new Product("クアトロチーズワッパーJr.", 520);
		this.getList()[8] = new Product("ワッパー", 570);
		this.getList()[9] = new Product("ワッパーJr.", 390);
		this.getList()[10] = new Product("フレンチフライ(S)", 170);
		this.getList()[11] = new Product("フレンチフライ(M)", 300);
		this.getList()[12] = new Product("フレンチフライ(L)", 350);
	}

	public Product[] getList() {
		return list;
	}

	public void setList(Product[] list) {
		this.list = list;
	}

}
