package Steps;
import org.openqa.selenium.WebDriver;
import Pages.ListarUsuarioPage;
import io.cucumber.java.pt.*;

public class ListarUsuarioSteps {

	WebDriver driver;
	ListarUsuarioPage page;

	@Dado("que estou na tela inicial do sistema")
	public void que_estou_na_tela_inicial_do_sistema() {
		//Inicia o navegador com a url da aplicação
		BaseStep.Inicilize();
	}

	@Quando("acesso o menu lista de usuarios")
	public void acesso_o_menu_lista_de_usuarios() {
		page = new ListarUsuarioPage(driver);
		page.acessarListadeUsuario();
	}

	@Entao("o sistema deve retornar uma lista de usuarios")
	public void o_sistema_deve_retornar_uma_lista_de_usuarios() {
		page.validarListadeUsuario();
	}

}
