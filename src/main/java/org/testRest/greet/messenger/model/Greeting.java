package org.testRest.greet.messenger.model;

/**
 * 
 * @author ajayram12
 *
 */
public class Greeting {

	private String greetText;

	public Greeting() {
	}
	
	public Greeting(String greetText) {
		this.greetText = greetText;
	}

	public String getGreetText() {
		return greetText;
	}

	public void setGreetText(String greetText) {
		this.greetText = greetText;
	}
	
	
}
