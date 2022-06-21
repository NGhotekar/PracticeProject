package Utility;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {
public static void takeScreenshot(WebDriver driver,String name)throws IOException {
	
	DateTimeFormatter dt = DateTimeFormatter.ofPattern("yyyy-MMM-dd HH-mm-SS");
	LocalDateTime time = LocalDateTime.now();
	String t = dt.format(time);
	
	File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	File destination = new File("F:\\zmanual\\screenshots\\"+name+ t+".jpeg");
	FileHandler.copy(source, destination);
	
}
}
