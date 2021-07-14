package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


import Steps.BaseStep;

public class AutenticarPage {

	WebDriver driver;

	// locators da pagina de autenticar
	By btn_outros = By.xpath("//a[contains(text(),'Outros')]");
	By btn_basic_aut = By.xpath("//a[contains(text(),'Basic Auth(user:admin, password: admin)')]");
	By txt_autenticacao = By.xpath("//h5[contains(text(),'Você se autenticou com sucesso!!')]");

	public AutenticarPage(WebDriver driver) {

		this.driver = driver;
	}

	public void acessarOutro() {

		BaseStep.driver.findElement(btn_outros).click();

	}

	public void acessarBasicauth() {

		BaseStep.driver.findElement(btn_basic_aut).click();
	}
	
	public void informarCredenciais() throws InterruptedException {
			
		//autenticação via url
		BaseStep.driver.get("https://admin:admin@automacaocombatista.herokuapp.com/basicauth/home");
		Thread.sleep(2000);
	}

	public void validarAutenticacao() {
		String texto = BaseStep.driver.findElement(txt_autenticacao).getText();
		org.junit.Assert.assertEquals(texto, "Você se autenticou com sucesso!!");
	}
}
