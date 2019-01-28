package com.test;

import com.app.MyApp;
import com.app.StepDefs;

public class CukeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Hello Cucumber!");
		StepDefs stepdefs = new StepDefs();
		MyApp myapp = new MyApp();
		myapp.myWebApp();
	}

}
