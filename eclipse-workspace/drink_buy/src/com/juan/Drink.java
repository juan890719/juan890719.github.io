package com.juan;

import java.util.Scanner;

public class Drink {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String coin = "1";
		int n = 1;
		int total = 0;
		int a_price = 10;
		int b_price = 25;
		int c_price = 29;
		while(n != 0) {
			System.out.println("Please enter coins(1，5，10，50) Or buy drink(a：10，b：25，c：29)：");
			coin = scan.next();
			if(coin.equals("1")) {
				n = Integer.parseInt(coin);
				total += n;
				System.out.println("Total：" + total);
			}else if(coin.equals("5")) {
				n = Integer.parseInt(coin);
				total += n;
				System.out.println("Total：" + total);
			}else if(coin.equals("10")) {
				n = Integer.parseInt(coin);
				total += n;
				System.out.println("Total：" + total);
			}else if(coin.equals("50")) {
				n = Integer.parseInt(coin);
				total += n;
				System.out.println("Total：" + total);
			}else if(coin.equals("a")) {
				if(total >= a_price) {
					total -= a_price;
					System.out.println("Bi！Total：" + total);
				}else {
					System.out.println("Ding！Total：" + total);
				}
			}else if(coin.equals("b")) {
				if(total >= b_price) {
					total -= b_price;
					System.out.println("Bi！Total：" + total);
				}else {
					System.out.println("Ding！Total：" + total);
				}
			}else if(coin.equals("c")) {
				if(total >= c_price) {
					total -= c_price;
					System.out.println("Bi！Total：" + total);
				}else {
					System.out.println("Ding！Total：" + total);
				}
			}else if(coin.equals("0")) {
				break;
			}
		}
		System.out.println("Bye");
		System.out.println("Total：" + total);
	}

}
