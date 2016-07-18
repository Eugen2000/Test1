package model;

import javafx.scene.paint.Color;

public class myDot {
	private int itemX; //pcs
	private int itemY; //pcs
	private int spaceX; //px
	private int spaceY; //px

	private Color dotColor;
	
	private int dotNeighbor; //pcs 
//							-1 - empty 
//							0  - stand alone
//							1 - deed
//							2 - leaving
//							3 - burn
//							4...-dead
	private int dotSex;
	public int getDotSex() {
		return dotSex;
	}
	public void setDotSex(int dotSex) {
		this.dotSex = dotSex;
	}
	public int getDotItemX() {
		return itemX;
	}
	public void setDotItemX(int itemX) {
		this.itemX = itemX;
	}
	public int getDotItemY() {
		return itemY;
	}
	public void setDotItemY(int itemY) {
		this.itemY = itemY;
	}
	public int getSpaceX() {
		return spaceX;
	}
	public void setSpaceX(int spaceX) {
		this.spaceX = spaceX;
	}
	public int getSpaceY() {
		return spaceY;
	}
	public void setSpaceY(int spaceY) {
		this.spaceY = spaceY;
	}
	public Color getDotColor() {
		return dotColor;
	}
	public void setDotColor(Color dotColor) {
		this.dotColor = dotColor;
	}
	public int getDotNeighbor() {
		return dotNeighbor;
	}
	public void setDotNeighbor(int dotNeighbor) {
		this.dotNeighbor = dotNeighbor;
	}
	
	public myDot(int x, int y){
		this.setDotItemX(x);
		this.setDotItemY(y);
		this.setDotNeighbor(-1);
		this.setDotColor(Color.BLACK);
	}
	public myDot(int x, int y, Color c){
		this.setDotItemX(x);
		this.setDotItemY(y);
		this.setDotNeighbor(-1);
		this.setDotColor(c);
	}
}
