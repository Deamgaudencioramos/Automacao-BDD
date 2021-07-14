# language: pt
#Autor: deamgaudencio
Funcionalidade: Criar um usuario

  Esquema do Cenario: Criar um usuario com sucesso(fluxo basico)
    #Pr� condi��es iniciais
    Dado que estou na pagina inicial do sistema
    E acesso o menu de criar usuario
    #procedimento
    Quando preencho os dados solicitados
      | nome         | <nome>         |
      | ultimonome   | <ultimonome>   |
      | Email        | <Email>        |
      | Endereco     | <Endereco>     |
      | Universidade | <Universidade> |
      | Profissao    | <Profissao>    |
      | Genero       | <Genero>       |
      | Idade        | <Idade>        |
    E submeto o formulario
    #verifica��o
    Entao verifico se a mensagem Usuario Criado com sucesso foi exibida na tela

    Exemplos: 
      | nome   | ultimonome | Email                | Endereco           | Universidade | Profissao | Genero    | Idade |
      | Carlos | Ramos      | carlosjose@gmail.com | Rua jose francisco | UFPB         | QA        | Masculino |    25 |
      | jose   | silva      | josesilva@gmail.com  | Rua paulo claudino | UFCG         | QA        | Masculino |    55 |

