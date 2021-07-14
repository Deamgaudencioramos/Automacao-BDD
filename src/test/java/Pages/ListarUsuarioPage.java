package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Steps.BaseStep;

public class ListarUsuarioPage {
	WebDriver driver;
	// locators
	By btn_formulario = By.xpath("//a[contains(text(),'Formulário')]");
	By btn_criausuario = By.xpath("//a[contains(text(),'Lista de Usuários')]");
	By txt_listadeUsuario = By.xpath("//h5[contains(text(),'Lista de Usuários!!')]");
	

	public ListarUsuarioPage(WebDriver driver) {
		this.driver = driver;
	}

	public void acessarListadeUsuario() {

		BaseStep.driver.findElement(btn_formulario).click();
		BaseStep.driver.findElement(btn_criausuario).click();
	}

	public void validarListadeUsuario() {

		String txt = BaseStep.driver.findElement(txt_listadeUsuario).getText();
		Assert.assertEquals(txt, "Lista de Usuários!!");
	}

}
