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
import com.didkoprj.globalMap.GlobalMapGenerator;
import com.didkoprj.time.TimeWatcher;

public class DidkoGame extends Game {
	


	private DidkoGame(){}
	
	private static DidkoGame instance = new DidkoGame();
	
	public static DidkoGame getInstance() {
		return instance;
	}
	
	
	@Override
	public void create() {	
		/*for(int i = 0; i < 160; i++) {
			System.out.println(TimeWatcher.getString());
			TimeWatcher.nextTurn();
		}*/
		//GlobalMapGenerator gmg = GlobalMapGenerator.getGlobalMapGenerator();
		
	}

	@Override
	public void dispose() {
		
	}

	@Override
	public void render() {		
		
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
