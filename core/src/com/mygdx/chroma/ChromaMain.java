package com.mygdx.chroma;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class ChromaMain extends ApplicationAdapter {
	SpriteBatch batch;
	
	@Override
	public void create () {
		batch=new SpriteBatch();
		ScreenManager.setScreen(new FightScreen());
	}

	public void dispose() {
		batch.dispose();
	}

	@Override
	public void render() {
		Gdx.gl.glClearColor(0, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);

		if (ScreenManager.getCurrentScreen() != null) {
			ScreenManager.getCurrentScreen().render(batch);
			ScreenManager.getCurrentScreen().update();
			
		}
	}
}
