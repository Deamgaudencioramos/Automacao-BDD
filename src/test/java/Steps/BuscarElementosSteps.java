package Steps;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import Pages.BuscarElementoPage;
import io.cucumber.java.pt.*;

public class BuscarElementosSteps {

	WebDriver driver;
	BuscarElementoPage page;

	@Dado("que estou na tela incial do sistema")
	public void que_estou_na_tela_incial_do_sistema() {
		BaseStep.Inicilize();
		page = new BuscarElementoPage(driver);
	}

	@E("seleciono a busca de elementos por link")
	public void seleciono_a_busca_de_elementos_por_link() {

		page.acessarBuscadeElemento();
		page.acessarLink();

	}

	@Quando("^clicar no (.*)")
	public void clicar_no_link(String link) {

		//page.clicarLink();
		 BaseStep.driver.findElement(By.linkText(link)).click();

	}

	@Entao("^o sistema deve retornar a (.*)")
	public void o_sistema_deve_retornar_a_mensagem_correta(String msg) {

		String txt = BaseStep.driver.findElement(By.xpath("//h5[contains(text(),'" + msg + "')]")).getText();
		Assert.assertEquals(txt, msg);

	}

}
