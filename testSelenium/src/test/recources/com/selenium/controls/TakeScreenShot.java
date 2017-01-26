package com.selenium.controls;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
//import com.sun.jna.platform.FileUtils;


public class TakeScreenShot {
	public static void ScreenShot()
    {
        String pathToFile = RandomNumberGenerator.GenerateRandomNumber();    
        File file = new File(pathToFile);
        File screenShot = ((TakesScreenshot)TestContextDriver.GetWebDriver()).getScreenshotAs(OutputType.FILE);

        try {
			FileUtils.copyFile(screenShot, file);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
}

