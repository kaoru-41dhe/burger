package model;

import java.util.ArrayList;

public class MakeOrder {
	
 
	
	//商品リストを作ってOrderのフィールドを埋めるメソッドを持つ
	//メニューを記載したフィールドを持つMenuクラスを別に作って、Orderクラスと共に引数としたほうがいいかも
	public void Execute(Order o, Menu m) {
		ArrayList<Product> a = new ArrayList<>();
		//sumは作り途中のリストの価格合計
		int sum = 0;
		
		while(sum <= o.getTotal()) {
			//1番安い商品を購入する余裕があるかチェック
			if(o.getTotal() - sum < 170) {
				break;
			}
			//乱数を生成
			int r = new java.util.Random().nextInt(13);
			//乱数を用いてメニューリスト配列から商品を選択し、ArrayListに代入
			if(sum + m.getList()[r].getPrice() > o.getTotal()) {
				continue;
			}
			sum += m.getList()[r].getPrice();
			a.add(m.getList()[r]);
		}
		
		//一時的な配列にArrayListを代入
		Product[] list = new Product[a.size()];
		for(int i=0; i < a.size(); i++) {
			list[i] = a.get(i);
		}
		
		//一時配列をOrderクラスのlistフィールドへ代入
		o.setList(list);
	}

}
