package pop_ups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class ToExploreRobotClass {

	public static void main(String[] args) throws AWTException, InterruptedException {
		
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ALT);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_TAB);
		Thread.sleep(1000);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_DOWN);
		
		robot.keyRelease(KeyEvent.VK_ALT);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_DOWN);
		
		robot.keyPress(KeyEvent.VK_S);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_U);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_M);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_A);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_N);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_T);
		Thread.sleep(1000);
		robot.keyPress(KeyEvent.VK_H);
		
		robot.keyRelease(KeyEvent.VK_S);
		robot.keyRelease(KeyEvent.VK_U);
		robot.keyRelease(KeyEvent.VK_M);
		robot.keyRelease(KeyEvent.VK_A);
		robot.keyRelease(KeyEvent.VK_N);
		robot.keyRelease(KeyEvent.VK_T);
		robot.keyRelease(KeyEvent.VK_H);		
		
//		Robot robot = new Robot();
//		robot.keyPress(KeyEvent.VK_WINDOWS);
//		Thread.sleep(1000);
//		robot.keyPress(KeyEvent.VK_TAB);
//		Thread.sleep(1000);
//		robot.keyPress(KeyEvent.VK_TAB);
//		Thread.sleep(1000);
//		
//		robot.keyRelease(KeyEvent.VK_WINDOWS);
//		robot.keyRelease(KeyEvent.VK_TAB);
		
		
//		Robot robot = new Robot();
//		robot.keyPress(KeyEvent.VK_ALT);
//		Thread.sleep(1000);
//		robot.keyPress(KeyEvent.VK_TAB);
//		Thread.sleep(1000);
//		robot.keyPress(KeyEvent.VK_TAB);
//		Thread.sleep(1000);
//		robot.keyPress(KeyEvent.VK_TAB);
//		Thread.sleep(1000);
//		robot.keyPress(KeyEvent.VK_ENTER);
//		
//		robot.keyRelease(KeyEvent.VK_ALT);
//		robot.keyRelease(KeyEvent.VK_TAB);
//		robot.keyRelease(KeyEvent.VK_ENTER);
		
	}

}
