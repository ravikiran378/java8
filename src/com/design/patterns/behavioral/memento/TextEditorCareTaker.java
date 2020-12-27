package com.design.patterns.behavioral.memento;

import java.util.ArrayList;
import java.util.List;

public class TextEditorCareTaker {

  private TextWindowOriginator textWindow;
  private List<TextWindowMemento> textWindowMementos;
 
  public TextEditorCareTaker() {
	  this.textWindow = new TextWindowOriginator();
	  this.textWindowMementos = new ArrayList<>();
  }
  
  public TextEditorCareTaker(String initalText) {
	 this.textWindow = new TextWindowOriginator(initalText);// care taker initializes with Given one.
	 this.textWindowMementos = new ArrayList<>();
  }
  
 
	  public TextWindowOriginator getTextWindow() {
		return textWindow;
	  }

	public void setTextWindow(TextWindowOriginator textWindow) {
		this.textWindow = textWindow;
	}

public void captureMemento() {
	  textWindowMementos.add(textWindow.capture());
  }
  
  public void undoMemento() {
	  if(!textWindowMementos.isEmpty()) {
		  textWindowMementos.remove(textWindowMementos.size()-1);
	  }
	  this.getTextWindow().setText(restore()==null?"":restore().getText());
  }
  
  private TextWindowMemento restore() {
	  return textWindowMementos.isEmpty()?null:textWindowMementos.get(textWindowMementos.size()-1);
  }

  public static void main(String...strings) {
	  TextEditorCareTaker t = new TextEditorCareTaker();
	  t.getTextWindow().addText("This is first text.");
	  t.captureMemento();
	  t.getTextWindow().addText(" Second Text.");
	  t.captureMemento();
	  t.getTextWindow().addText(" 3rd Text.");
	  t.captureMemento();
	  t.getTextWindow().addText(" 4th Text.");
	  t.captureMemento();
	  System.out.println("-->"+t.getTextWindow().getText()+"<--");
	  t.undoMemento();// Undo 4th
	  System.out.println("-->"+t.getTextWindow().getText()+"<--");
	  t.undoMemento();// Undo 3rd
	  System.out.println("-->"+t.getTextWindow().getText()+"<--");
	  t.undoMemento();// Undo 2nd
	  System.out.println("-->"+t.getTextWindow().getText()+"<--");
	  t.undoMemento();// Undo 1st
	  
	  t.undoMemento();// Undo When Empty.
	  System.out.println("-->"+t.getTextWindow().getText()+"<--");
	  
	  t.undoMemento();// Undo When Empty Again.
	  System.out.println("-->"+t.getTextWindow().getText()+"<--");
	  
  }
 
}
