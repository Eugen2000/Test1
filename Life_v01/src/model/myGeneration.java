package model;

import javafx.scene.paint.Color;

public class myGeneration {
	private int genNum;
	private int spaceSizeX; //px
	private int spaceSizeY; //px
	private int spaceBlank; //px
	private int genSizeX; //pcs
	private int genSizeY; //pcs
	private int dotSize; //px 
	private Color dotColor; //px 
	private Color emptyDotColor; //px 
	private Color busyDotColor; //px 
	
	
	private myDot[][] myDots;
	
	public myGeneration(int spaceSizeX,int spaceSizeY,int spaceBlank, int dotSize){
		this.setGenNum(0);
		this.setSpaceSizeX(spaceSizeX);
		this.setSpaceSizeY(spaceSizeY);
		this.setSpaceBlank(spaceBlank);
		this.setDotSize(dotSize);
		
		this.setGenSizeX(spaceSizeX/(spaceBlank+dotSize));
		this.setGenSizeY(spaceSizeY/(spaceBlank+dotSize));
		
		for(int i=0;i<this.getGenSizeX();i++){
			for(int j=0;j<this.getGenSizeY();j++){
				myDots[i][j]=new myDot(i,j);
			}
		}
		
		
	}

	public int getGenNum() {
		return genNum;
	}

	public void setGenNum(int genNum) {
		this.genNum = genNum;
	}

	public int getSpaceSizeX() {
		return spaceSizeX;
	}

	public void setSpaceSizeX(int spaceSizeX) {
		this.spaceSizeX = spaceSizeX;
	}

	public int getSpaceSizeY() {
		return spaceSizeY;
	}

	public void setSpaceSizeY(int spaceSizeY) {
		this.spaceSizeY = spaceSizeY;
	}

	public int getSpaceBlank() {
		return spaceBlank;
	}

	public void setSpaceBlank(int spaceBlank) {
		this.spaceBlank = spaceBlank;
	}

	public int getDotSize() {
		return dotSize;
	}

	public void setDotSize(int dotSize) {
		this.dotSize = dotSize;
	}

	public int getGenSizeX() {
		return genSizeX;
	}

	public void setGenSizeX(int genSizeX) {
		this.genSizeX = genSizeX;
	}

	public int getGenSizeY() {
		return genSizeY;
	}

	public void setGenSizeY(int genSizeY) {
		this.genSizeY = genSizeY;
	}

	public Color getDotColor() {
		return dotColor;
	}

	public void setDotColor(Color dotColor) {
		this.dotColor = dotColor;
	}

	public Color getEmptyDotColor() {
		return emptyDotColor;
	}

	public void setEmptyDotColor(Color emptyDotColor) {
		this.emptyDotColor = emptyDotColor;
	}

	public Color getBusyDotColor() {
		return busyDotColor;
	}

	public void setBusyDotColor(Color busyDotColor) {
		this.busyDotColor = busyDotColor;
	}
}
