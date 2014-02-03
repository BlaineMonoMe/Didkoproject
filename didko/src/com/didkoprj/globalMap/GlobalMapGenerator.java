package com.didkoprj.globalMap;

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
	
	public GlobalMap loadGlobalMap(String fileName) {
		return new GlobalMap();
	}
	
	
}
