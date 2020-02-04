package com.design.patterns.memento;

public class TextWindow {
	
	private StringBuilder text;
	
	public TextWindow() {
		text = new StringBuilder();
	}

	public TextWindow(String text) {
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
