package com.didkoprj.location;

import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;

public class Location implements Screen {
	private Texture fon = null;
	
	public Location(String fonFileName) {
		if(fonFileName != null) {
			this.fon = new Texture(fonFileName);
		}
		
	}
	
	public void show() {
		
	}

	@Override
	public void render(float delta) {
		// TODO Auto-generated method stub
		
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
