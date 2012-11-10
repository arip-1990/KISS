package fr.neamar.summon.lite;

import android.app.Application;
import android.content.Context;

public class SummonApplication extends Application {
	private static DataHandler dataHandler;
	
	public static DataHandler getDataHandler(Context ctx){
		if (dataHandler == null) {
			dataHandler = new DataHandler(ctx);
		}
		return dataHandler;
	}
	
	public static void resetDataHandler(Context ctx){
		if (dataHandler != null) {
			dataHandler = new DataHandler(ctx);
		}
	}
}