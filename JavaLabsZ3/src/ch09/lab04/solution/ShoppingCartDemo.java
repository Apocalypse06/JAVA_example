package ch09.lab04.solution;

// Collection ���O�m��(add(), iterator()...) // 
// ShoppingCartDemo.java
// ShoppingCart ���@ Collection ����, �{�b�n�N Hat, Shirt, 
// Shoes �����O������[�� ShoppingCart ����, �C�����O���t��
// �f�~�s��, �ƶq, ������ݩ�. ShoppingCart ���@��k(getTotalPrice())
// ��p��䤺�ҧt���f�~���`���B, �Эק惡�{��, �Ϩ��H�h�Ϊ��覡
// ��²�� getTotalPrice() ���]�p
//
// ����:������ Hat, Shirt, Shoes �]�p�@�Ӧ@�P�����O�ι�@�P�@�Ӥ���

import java.util.*;

class ShoppingCart {
	private Vector<Product> v = new Vector<Product>();
	private double totalPrice = 0;
	public void addProduct(Product o) {
		v.add(o);
	}

	// �o�Ӥ�k�����I�A�ЧQ�Φh�Ψӥ[�H�ﵽ
	public double getTotalPrice() {
		Iterator<Product> it = v.iterator();
		while (it.hasNext()) {
			Product p = it.next();
			totalPrice += p.getPrice();
		}
		return totalPrice;
	}
	// public void removeProduct(Object o) { }
}

public class ShoppingCartDemo {
	public static void main(String args[]) {
		ShoppingCart sc = new ShoppingCart();
		Hat h1 = new Hat("H001", 350, 1);
		Shirt st1 = new Shirt("ST01", 200, 2);
		Shoes sh1 = new Shoes("SH01", 100, 2);

		sc.addProduct(h1);
		sc.addProduct(st1);
		sc.addProduct(sh1);
		System.out.println(sc.getTotalPrice());
	}
}

class Hat implements Product {
	String code;
	double unitPrice;
	int amount;

	Hat(String code, double unitPrice, int amount) {
		this.code = code;
		this.unitPrice = unitPrice;
		this.amount = amount;
	}

	public double getPrice() {
		return unitPrice * amount;
	}
}

class Shirt implements Product {
	String prodCode;
	double p;
	int a;

	Shirt(String prodCode, double p, int a) {
		this.prodCode = prodCode;
		this.p = p;
		this.a = a;
	}

	public double getPrice() {
		return a * p ;
	}
}

class Shoes implements Product {
	String pCode;
	double price;
	int amt;

	Shoes(String pCode, double price, int amt) {
		this.pCode = pCode;
		this.price = price;
		this.amt = amt;
	}

	public double getPrice() {
		return price * amt;
	}
}