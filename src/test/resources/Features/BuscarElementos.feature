#language: pt
#Author: your.email@your.domain.com
Funcionalidade: Buscar elemento

  Esquema do Cenario: Verificar se a funcionalidade buscar elemento estar retornando a mensagem correta
    Dado que estou na tela incial do sistema
    E seleciono a busca de elementos por link
    Quando clicar no <link>
    Entao o sistema deve retornar a <mensagem>

    Exemplos: 
      | link                             |  | mensagem                |
      | Ok 200 - Sucess                  |  | Success!!               |
      | Erro 400 - Bad Request           |  | Bad Request!!           |
      | Erro 404 - Page not found        |  | Page Not Found!!        |
      | Erro 500 - Internal Server Error |  | Internal Server Error!! |
