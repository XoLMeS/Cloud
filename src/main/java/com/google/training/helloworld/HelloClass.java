package com.google.training.helloworld;

import java.util.Random;

public class HelloClass {
    public String message = "Hello World";

    public HelloClass () {
    }

    public HelloClass (String name) {
        this.message = "Hello " + name + "!";
    }

    public HelloClass(String name, String period) {
		this.message = "Good " + period + " " + name + "!";
	}

	public HelloClass(String name, int i) {
		String[] thougths = new String[9];
		thougths[0] = "you are fool";
		thougths[1] = "you are smart";
		thougths[2] = "you are fat";
		thougths[3] = "go AWAY";
		thougths[4] = "just do it";
		thougths[5] = "and now you must say hello to me";
		thougths[6] = "you are completely right";
		thougths[7] = "show me what you can";
		thougths[8] = "nice mouseclicking, you are good at it";
		int say_a_thougth_number = rand.nextInt(9);
		this.message = name + " " + thougths[say_a_thougth_number] + "!";
	}

	public String getMessage() {
        return message;
    }
	
	
	Random rand = new Random();
}
