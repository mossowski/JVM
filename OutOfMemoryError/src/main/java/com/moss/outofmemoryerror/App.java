package com.moss.outofmemoryerror;

import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<String>();

		while (true) {
			arrayList.add("cos");
		}
	}
}
