package com.design.patterns.behavioral.memento;

public class TextWindowOriginator {
	
	private StringBuilder text;
	
	public TextWindowOriginator() {
		text = new StringBuilder();
	}

	public TextWindowOriginator(String text) {
		this.text = new StringBuilder(text);
	}

	public String getText() {
		return new String(text);
	}

	public void addText(String text) {
		this.text.append(text);
	}
	
	public void setText(String text) {
		this.text = new StringBuilder(text);
	}
	
	public TextWindowMemento capture() {
		return new TextWindowMemento(this.getText().toString());
	}
	
	public void restore(TextWindowMemento textWindowMemento) {
		text = new StringBuilder(textWindowMemento.getText());
	}
	
	
}
