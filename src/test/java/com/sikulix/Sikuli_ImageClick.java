package com.sikulix;

import org.sikuli.basics.Debug;
import org.sikuli.script.FindFailed;
import org.sikuli.script.KeyModifier;
import org.sikuli.script.Screen;

public class Sikuli_ImageClick {

	/**
	 * @author saikiran.nataraja
	 * @param args
	 */
	public static void main(String[] args) {
		Debug.setDebugLevel(3);
		Screen s = new Screen(); //Create an instance variable for screen
		try{
			s.delayClick(3000); // delay the click for 3000 milliseconds
			//s.click("src/test/resources/images/close.png");
			s.wait("src/test/resources/images/close.png"); //Close the open file which matches with close.png
			s.click();
			s.delayType(3000);
			s.type("r",KeyModifier.WIN); //Type windows+r button
			s.write("notepad#ENTER."); //Open Notepad
//			s.write("hello world#ENTER.");
		}
		catch(FindFailed e){
			e.printStackTrace();
		}
	}

}
