package com.didkoprj.globalMap;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * 		This class generate/load/create a GlobalMap
 */

public class GlobalMapGenerator {


	private static GlobalMapGenerator globalMapGenerator = null;
	
	private GlobalMapGenerator() {
	}
	
	public static GlobalMapGenerator getGlobalMapGenerator() {
		if(globalMapGenerator == null) {
			globalMapGenerator = new GlobalMapGenerator();
		}
		
		return globalMapGenerator;

	}
	
	public GlobalMap loadGlobalMap(int width, int height, SpriteBatch batch) {
		return new GlobalMap(width, height, batch);
	}
	
	
}
