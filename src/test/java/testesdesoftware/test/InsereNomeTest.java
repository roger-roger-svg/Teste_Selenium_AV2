package testesdesoftware.test;


import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class InsereNomeTest {

    private WebDriver driver;

    @Before
    public void setUp() {
      
        System.setProperty("webdriver.chrome.driver", "src/test/java/resources/chromedriver.exe");
        
        driver = new ChromeDriver();
    }

    @Test
    public void TC006e0003_preencherCampoNoModal() {
       
        driver.get("file:///C:/Users/36124872022.1n/Desktop/sistema/produtos.html");
      
        WebElement botaoAdicionar = driver.findElement(By.id("btn-adicionar"));
       
        // Teste de botao de adcionar produto 
        botaoAdicionar.click();
        botaoAdicionar.click();
       
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        // Teste de inserir os dados e salvar
        WebElement campoNome = driver.findElement(By.id("nome"));
        WebElement campoCodigo = driver.findElement(By.id("codigo"));
        WebElement campoQuantidade = driver.findElement(By.id("quantidade"));
        WebElement campoValor = driver.findElement(By.id("valor"));
        WebElement campoData = driver.findElement(By.id("data"));
        

        campoNome.sendKeys("Roger Cunha");
        campoCodigo.sendKeys("01");
        campoQuantidade.sendKeys("50");
        campoValor.sendKeys("10");
        campoData.sendKeys("10/10/2002");
        botaoAdicionar.click();
        WebElement botaoSalvar = driver.findElement(By.id("btn-salvar"));
        botaoSalvar.click();
     
        
        
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
