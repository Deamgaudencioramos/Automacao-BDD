package Pages;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Steps.BaseStep;

public class CriarUsuarioPage  {

	WebDriver driver;
	
	By btn_formulario = By.xpath("//a[contains(text(),'Formulário')]");
	By btn_criausuario = By.xpath("//a[contains(text(),'Criar Usuários')]");
	
	By txt_nome = By.id("user_name");
	By txt_ultimonome = By.id("user_lastname");
	By txt_email = By.id("user_email");
	By txt_endereco = By.id("user_address");
	By txt_universidade = By.id("user_university");
	By txt_profissao = By.id("user_profile");
	By txt_genero = By.id("user_gender");
	By txt_idade = By.id("user_age");
	By btn_criar = By.name("commit");
	
	
	public CriarUsuarioPage(WebDriver driver) {
		this.driver = driver;
	}
	
		
	public void acessarFormulario()
	{
		BaseStep.driver.findElement(btn_formulario).click();
		BaseStep.driver.findElement(btn_criausuario).click();
	}
	
	public void preencherNome(String nome) {
		BaseStep.driver.findElement(txt_nome).sendKeys(nome);
			
	}
	
	public void preencherUltimonome(String ultimonome) {
		BaseStep.driver.findElement(txt_ultimonome).sendKeys(ultimonome);
}
	
	public void preencherEmail(String email) {
		BaseStep.driver.findElement(txt_email).sendKeys(email);
	}

	public void preencherEndereco(String endereco) {
		BaseStep.driver.findElement(txt_endereco).sendKeys(endereco);
	}

	public void preencherUniversidade(String universidade) {
		BaseStep.driver.findElement(txt_universidade).sendKeys(universidade);
	}

	
	public void preencherProfissao(String profissao) {
		BaseStep.driver.findElement(txt_profissao).sendKeys(profissao);
	}
	
	public void preencherGenero(String genero) {
		BaseStep.driver.findElement(txt_genero).sendKeys(genero);
	}

	public void preencherIdade(String idade) {
		BaseStep.driver.findElement(txt_idade).sendKeys(idade);
	}
	
	public void validarMensagem() {
		
		 String txt = BaseStep.driver.findElement(By.xpath("//p[@id='notice']")).getText();
		 Assert.assertEquals(txt, "Usuário Criado com sucesso");
	}

	public void criarUsuario() throws InterruptedException {
		BaseStep.driver.findElement(btn_criar).click();
	Thread.sleep(5000);
}
}