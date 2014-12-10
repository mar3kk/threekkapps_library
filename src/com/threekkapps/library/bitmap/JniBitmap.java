package com.threekkapps.library.bitmap;


import android.graphics.Bitmap;


public class JniBitmap {

	
	static {
		System.loadLibrary("jnibitmap");
	}
	/**
	 * Flood fill algorithm. Fills with specified color starting from specified
	 * x,y coordinates. 
	 * @param bitmap Bitmap to apply the flood fill algorith
	 * @param x x coordinate where the algorithm starts
	 * @param y y coordinate where the algorithm starts
	 * @param color Color of fill in ARGB format
	 * @param tolerance tolerance of the color range (0 is the exact color)
	 **/
	public static native void floodFill(Bitmap bitmap, int x, int y, int color,int tolerance);
}
