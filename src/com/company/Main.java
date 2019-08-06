package com.company;
import java.awt.*;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите слово 1");
		String stroka1 = sc.next();
		System.out.println("Введите слово 2");
		String stroka2 = sc.next();

		if (stroka1.equals(stroka2)){
			System.out.println ( "Отлично! Слова одинаковы" );
		}else if (stroka1.equalsIgnoreCase ( stroka2 ) ) {
			System.out.println("Хорошою Почти одинаковы");
		} else if (stroka1.length ()==stroka2.length ()) {
			System.out.println("Ну, хотя бы они одной длины");
		} else  {
			System.out.println("Слова абсолютно разные");
		}
	}
}