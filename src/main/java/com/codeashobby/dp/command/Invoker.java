/**
 * Copyright (c) 2015 Ovitas Inc, All rights reserved.
 */
package com.codeashobby.dp.command;

/**
 * Description:
 *
 * @author hzhou
 */
public class Invoker {

	private Command command;

	public void setCommand(Command command) {
		this.command = command;
	}

	public void act() {
		this.command.execute();
	}
}