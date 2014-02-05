package com.didkoprj.location;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.didkoprj.globalMap.Cell;
import com.didkoprj.time.Season;
import com.didkoprj.time.TimeWatcher;

public class Location implements Screen {
	private Texture fon = null; 
	private SpriteBatch batch;
	
	private Cell cell = null;
	
	public Location(Cell cell, String fonFileName, SpriteBatch batch) {
		
		this.cell = cell; // like a pointer
		this.batch = batch;
		
		if(fonFileName != null) {
			this.fon = new Texture(fonFileName);
		} 
		else {
			if(TimeWatcher.getSeason() == Season.SPRING) {
				this.fon = new Texture("resources/images/location/fons/fields/Summer.PNG");
			}
			if(TimeWatcher.getSeason() == Season.SUMMER) {
				this.fon = new Texture("resources/images/location/fons/fields/Summer.PNG");
			}
			if(TimeWatcher.getSeason() == Season.AUTUMN) {
				this.fon = new Texture("resources/images/location/fons/fields/Autumn.PNG");
			}
			if(TimeWatcher.getSeason() == Season.WINTER) {
				this.fon = new Texture("resources/images/location/fons/fields/Winter.PNG");
				//hehe
			} 
		}
		
	}
	
	public void show() {
		
	}

	@Override
	public void render(float delta) {
		batch.begin();
		batch.draw(fon, 0, 0, Gdx.graphics.getWidth(), Gdx.graphics.getHeight());
		batch.end();
		
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub
		
	}
}
