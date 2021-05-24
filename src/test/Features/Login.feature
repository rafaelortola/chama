# language: pt
Funcionalidade: Realizar login

  @login @regressivo
  Cenário: Login Sucesso
    Dado que eu informe um email válido
    E informe uma senha válida
    Quando faço o login
    Então sou cadastrado com sucesso


  @login @regressivo
  Cenário: Login inexistente
    Dado que eu informe um email inexistente
    E informe uma senha válida
    Quando faço o login
    Então não sou autenticado

  @login @regressivo
  Cenário: Login inválido
    Dado que eu informe um email inválido
    E informe uma senha válida
    Quando faço o login
    Então não sou autenticado

  @login @regressivo
  Cenário: Login em branco
    Dado que eu informe um email em branco
    E informe uma senha válida
    Quando faço o login
    Então não sou autenticado


