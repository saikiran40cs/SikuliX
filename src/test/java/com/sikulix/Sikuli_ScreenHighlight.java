package com.sikulix;

import org.sikuli.basics.Debug;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Screen;

public class Sikuli_ScreenHighlight {

	/**
	 * @author saikiran.nataraja
	 * @param args
	 * @throws FindFailed
	 */
	public static void main(String[] args)throws FindFailed {
	    Debug.setDebugLevel(3);
	    Screen s = new Screen();
	    s.find(s.userCapture().getFile()).highlight(2);
	}

}
