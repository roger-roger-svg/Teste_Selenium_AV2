package testesdesoftware.test;


import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;




public class IconeTesteX {
	private WebDriver driver;

	@Before
	public void setUp() {
	  
	    System.setProperty("webdriver.chrome.driver", "src/test/java/resources/chromedriver.exe");
	    
	    driver = new ChromeDriver();
	}
	
	@Test
	public void TC005_SaircomX() {
	       
		
        driver.get("file:///C:/Users/36124872022.1n/Desktop/sistema/produtos.html");
       
        
        WebElement botaoAdicionar = driver.findElement(By.id("btn-adicionar"));
        botaoAdicionar.click();
        botaoAdicionar.click();
        
        WebElement iconeFechar = driver.findElement(By.className("close"));
        iconeFechar.click();
	}
}
