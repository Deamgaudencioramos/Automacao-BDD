package Pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Steps.BaseStep;

public class BuscarElementoPage {

	WebDriver driver;
	By btn_buscadeelemento = By.xpath("//a[contains(text(),'Busca de elementos')]");
	By btn_linkmenu = By.linkText("Links");
	
	

	public BuscarElementoPage(WebDriver driver) {
		this.driver = driver;
	}

	public void acessarBuscadeElemento() {
		BaseStep.driver.findElement(btn_buscadeelemento).click();
	}

	public void acessarLink() {
		BaseStep.driver.findElement(btn_linkmenu).click();
	}

	/*public void clicarLink() {
		BaseStep.driver.findElement(btn_link).click();
	}

	/*public void validaMensagem() {
		String texto = BaseStep.driver.findElement(txt_link).getText();
		Assert.assertEquals(texto, "");

	}*/

}
