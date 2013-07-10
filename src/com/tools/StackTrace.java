package com.tools;

import com.android.external.Log;

public class StackTrace {
	private static final String TAG = "StackTrace";
	
	private StackTrace() {
		
	}
	
	public static final void printStackTrace() {
		StackTraceElement[] stackElements = new Throwable().getStackTrace();
		if (stackElements != null) {
			for (StackTraceElement st : stackElements) {
				Log.i(TAG, st.toString());
			}
		}
	}
}
