package WhatappS_mass;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.Scanner;

public class Whatapp_massage {

    public static void main(String args[]) throws InterruptedException, AWTException {
        // TODO code application logic here
        System.out.println("enter you massage :");
        Scanner sc = new Scanner(System.in);
        String msg = sc.nextLine();
        System.out.println("hom  many time to print:");
        int size = sc.nextInt();

        StringSelection stringselecion = new StringSelection(msg);
        Clipboard clipbord = Toolkit.getDefaultToolkit().getSystemClipboard();
        clipbord.setContents(stringselecion, null);
        Thread.sleep(8000);
        Robot robot = new Robot();
        for (int i = 1; i <= size; i++) {
            robot.keyPress(KeyEvent.VK_CONTROL);
            robot.keyPress(KeyEvent.VK_V);
            robot.keyRelease(KeyEvent.VK_CONTROL);
            robot.keyRelease(KeyEvent.VK_V);
            robot.keyPress(KeyEvent.VK_ENTER);
            robot.keyRelease(KeyEvent.VK_ENTER);
            Thread.sleep(100);

        }
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.keyRelease(KeyEvent.VK_ENTER);
    }
}
