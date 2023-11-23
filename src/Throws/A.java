package Throws;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @author Administrator
 *
 *Throws keyword use to propagate the list of exception (checked exception)
 *Throws keyword return at the line of declaration of the method.
 *
 *Throw keyword use to throws the exception object explicitly
 *Throw keyword return inside the method based on some condition.
 *
 */

public class A {

	public void m2() throws FileNotFoundException { 
		
		FileInputStream fis = new FileInputStream("");
		
		System.out.println("Continue");

	}

	public void m3() {
		A a = new A();
		try {
			a.m2();
		} catch (FileNotFoundException e) {

		}
	}
}