package Steps;

import java.util.Map;

import org.openqa.selenium.WebDriver;

import Pages.CriarUsuarioPage;
import io.cucumber.java.pt.*;

public class CriarUsuarioSteps {

	CriarUsuarioPage page;
	WebDriver driver;

	@Dado("que estou na pagina inicial do sistema")
	public void que_estou_na_pagina_inicial_do_sistema() {
		//Inicia o navegador com a url da aplicação
		BaseStep.Inicilize();
	}

	@E("acesso o menu de criar usuario")
	public void acesso_o_menu_de_criar_usuario() {

		page = new CriarUsuarioPage(driver);
		page.acessarFormulario();
	}

	@Quando("^preencho os dados solicitados$")
	public void preencho_os_dados_solicitados(io.cucumber.datatable.DataTable dataTable) {
		Map<String, String> dados = dataTable.asMap(String.class, String.class);

		page.preencherNome(dados.get("nome"));
		page.preencherUltimonome(dados.get("ultimonome"));
		page.preencherEmail(dados.get("Email"));
		page.preencherEndereco(dados.get("Endereco"));
		page.preencherUniversidade(dados.get("Universidade"));
		page.preencherProfissao(dados.get("Profissao"));
		page.preencherGenero(dados.get("Genero"));
		page.preencherIdade(dados.get("Idade"));

	}

	@E("submeto o formulario")
	public void submeto_o_formulario() throws InterruptedException {
		page.criarUsuario();
	}

	@Entao("verifico se a mensagem Usuario Criado com sucesso foi exibida na tela")
	public void verifico_se_a_mensagem_Usuario_Criado_com_sucesso_foi_exibida_na_tela() {
		page.validarMensagem();

	}
}
