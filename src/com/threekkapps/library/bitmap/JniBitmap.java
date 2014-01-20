package com.threekkapps.library.bitmap;


import android.graphics.Bitmap;


public class JniBitmap {

	
	static {
		System.loadLibrary("jnibitmap");
	}

	public static native void floodFill(Bitmap bitmap, int x, int y, int color);
}
