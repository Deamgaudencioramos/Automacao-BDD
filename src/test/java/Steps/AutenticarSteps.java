package Steps;
import org.openqa.selenium.WebDriver;

import Pages.AutenticarPage;
import io.cucumber.java.pt.*;


public class AutenticarSteps {

	WebDriver driver;
	AutenticarPage page;

	@Dado("que seleciono o menu outros")
	public void que_seleciono_o_menu_outros() {
		// Inicia o navegador com a url da aplicação
		BaseStep.Inicilize();
		page = new AutenticarPage(driver);
		page.acessarOutro();

	}

	@E("seleciono a opcao basic auth")
	public void seleciono_a_opcao_basic_auth() {
		page.acessarBasicauth();

	}

	@Quando("informo minhas credenciais")
	public void informo_minhas_credenciais() throws InterruptedException{
		page.informarCredenciais();
		

	}

	@Entao("o sistema deve autenticar minhas credenciais")
	public void o_sistema_deve_autenticar_minhas_credenciais() {
		page.validarAutenticacao();
	}

}
