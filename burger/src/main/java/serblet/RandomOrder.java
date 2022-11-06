package serblet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.MakeOrder;
import model.Menu;
import model.Order;

/**
 * Servlet implementation class RandomOrder
 */
@WebServlet("/RandomOrder")
public class RandomOrder extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//金額入力フォームjspへフォワード
		RequestDispatcher d = request.getRequestDispatcher("/WEB-INF/jsp/orderForm.jsp");
		d.forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//モデルを使って数値を割り出し、スコープに保存、オーダー出力フォームへフォワード
		//リクエストパラメータ取得
		int budget = Integer.parseInt(request.getParameter("budget"));
		
		//入力値をプロパティに設定
		Order o = new Order(budget);
		
		//MakeOrderのメソッドを使用
		MakeOrder mOrder = new MakeOrder();
		Menu menu = new Menu();
		
		mOrder.Execute(o, menu);
		
		//リクエストスコープ
		request.setAttribute("order", o);
		
		//フォワード
		RequestDispatcher d = request.getRequestDispatcher("/WEB-INF/jsp/showOrder.jsp");
		d.forward(request, response);
	}

}
