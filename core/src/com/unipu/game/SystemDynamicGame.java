package com.unipu.game;


import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;

import com.uwsoft.editor.renderer.SceneLoader;

public class SystemDynamicGame extends Game {
    SceneLoader sceneLoader;
	@Override
	public void create () {
        sceneLoader = new SceneLoader();
        sceneLoader.loadScene("MainScene");
    }

	@Override
	public void render () {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
        sceneLoader.getEngine().update(Gdx.graphics.getDeltaTime());
    }
	
	@Override
	public void dispose () {
	}
}
