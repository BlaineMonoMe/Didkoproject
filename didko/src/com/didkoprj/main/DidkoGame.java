package com.didkoprj.main;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.Texture.TextureFilter;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.didkoprj.globalMap.GlobalMap;
import com.didkoprj.globalMap.GlobalMapGenerator;
import com.didkoprj.location.Location;
import com.didkoprj.time.TimeWatcher;

public class DidkoGame extends Game {
	
	SpriteBatch batch;// = new SpriteBatch();
	
	Screen loc;// = new Location(null, null, batch);
	
	GlobalMapGenerator gmg = null;
	GlobalMap globalMap = null;


	private DidkoGame() { 
	}
	
	private static DidkoGame instance = new DidkoGame();
	
	public static DidkoGame getInstance() {
		return instance;
	}
	
	
	@Override
	public void create() {	
		
		batch = new SpriteBatch();
		
		gmg = GlobalMapGenerator.getGlobalMapGenerator();
		globalMap = gmg.loadGlobalMap(30, 20, batch);
		/*for(int i = 0; i < 160; i++) {
			System.out.println(TimeWatcher.getString());
			TimeWatcher.nextTurn();
		}*/
		//GlobalMapGenerator gmg = GlobalMapGenerator.getGlobalMapGenerator();
		
		loc = new Location(null, null, batch);
		this.setScreen(globalMap);
		
	}

	@Override
	public void dispose() {
		
	}

	@Override
	public void render() {		
		this.getScreen().render((float)0.2);
		TimeWatcher.nextTurn();
		TimeWatcher.nextTurn();
		System.out.println(TimeWatcher.getSeason());
	}

	@Override
	public void resize(int width, int height) {
	}

	@Override
	public void pause() {
	}

	@Override
	public void resume() {
	}
}
