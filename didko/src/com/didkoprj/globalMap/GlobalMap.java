package com.didkoprj.globalMap;

import java.util.Random;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.didkoprj.globalMap.cell.Cell;
import com.didkoprj.globalMap.cell.CellType;

public class GlobalMap implements Screen{
	
	
	private SpriteBatch batch;
	private Cell[][] cell;
	private int width;
	private int height;
	
	private final int CELLS_PER_WIDTH = 5;
	private final int CELLS_PER_HEIGHT = 4;
	private int CELL_WIDTH = Gdx.graphics.getWidth() / CELLS_PER_WIDTH;
	private int CELL_HEIGHT = Gdx.graphics.getHeight() / CELLS_PER_WIDTH;
	
	public GlobalMap(int w, int h, SpriteBatch batch) {
		
		this.batch = batch;
		
		width = w;
		height = h;
		
		cell = new Cell[h][];
		for(int i=0;i<h;i++) {
			cell[i] = new Cell[w];
		}
		
		Random random = new Random();
		for(int i=0;i<h;i++) {
			for(int j=0;j<w;j++) {
				int rand = random.nextInt(2);
				switch(rand) {
					case 0: cell[i][j] = new Cell(CellType.FIELD); break;
					case 1: cell[i][j] = new Cell(CellType.FOREST); break;
					case 2: cell[i][j] = new Cell(CellType.MOUNTAINS); break;
				}
				
			}
		}
	}

	@Override
	public void render(float delta) {
		cell[0][0].draw(0, 0, CELL_WIDTH, CELL_HEIGHT, batch);
		
	}

	@Override
	public void resize(int width, int height) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show() {
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
