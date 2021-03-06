/**
 * Copyright (c) 2015 Ovitas Inc, All rights reserved.
 */
package com.codeashobby.dp.strategy;

/**
 * Description:
 *
 * @author hzhou
 */
public enum Calculator {
	ADD("+") {
		@Override
		public int exec(int a, int b) {
			return a + b;
		}
	},

	SUB("-") {
		@Override
		public int exec(int a, int b) {
			return a - b;
		}
	};

	String value = "";

	Calculator(String value) {
		this.value = value;
	}

	public String getValue() {
		return this.value;
	}

	public abstract int exec(int a, int b);
}