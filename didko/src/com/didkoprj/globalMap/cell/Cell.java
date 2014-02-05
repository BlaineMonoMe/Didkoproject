package com.didkoprj.globalMap.cell;

import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.didkoprj.time.TimeWatcher;
import com.didkoprj.time.Season;

public class Cell {
	
	private Texture pic = null;
	private CellType type = null;
	
	public Cell(CellType type) {
		this.type = type;
	}
	
	public CellType getType() {
		return type;
	}
	
	public void draw(int x, int y, int width, int height, SpriteBatch batch) {
		String typeName = null;
		
		switch(type) {
			case FIELD: typeName = new String("fields/"); break;
			case FOREST: typeName = new String("forest/"); break;
			case MOUNTAINS: typeName = new String("mountains/"); break;
		}
		
		String seasonName = null;
		
		switch(TimeWatcher.getSeason()) {
			case SPRING: seasonName = new String("Summer.PNG"); break;
			case SUMMER: seasonName = new String("Summer.PNG"); break;
			case AUTUMN: seasonName = new String("Autumn.PNG"); break;
			case WINTER: seasonName = new String("Winter.PNG"); break;	
		}
		
		pic = new Texture("resources/images/global_map/" + typeName + seasonName);
		
		batch.begin();
		batch.draw(pic, x, y, width, height);
		batch.end();
		
		pic.dispose();
		
	}
	
}
