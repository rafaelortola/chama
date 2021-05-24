$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("../ChamaProjectTest/src/test/Features/CadastrarUsuario.feature");
formatter.feature({
  "name": "Cadastrar Novo Usuário",
  "description": "",
  "keyword": "Funcionalidade"
});
formatter.scenario({
  "name": "Cadastrar novo usuário",
  "description": "",
  "keyword": "Cenário",
  "tags": [
    {
      "name": "@cadastro"
    },
    {
      "name": "@regressivo"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "informe um email válido",
  "keyword": "Dado "
});
formatter.match({
  "location": "Steps.cadastrarUsuario()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "seleciono um titulo \"Mr.\"",
  "keyword": "E "
});
formatter.match({
  "location": "Steps.selecionarTitulo(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informo um nome",
  "keyword": "E "
});
formatter.match({
  "location": "Steps.informarNome()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informo um sobrenome",
  "keyword": "E "
});
formatter.match({
  "location": "Steps.informarSobrenome()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informo uma senha",
  "keyword": "E "
});
formatter.match({
  "location": "Steps.informarSenha()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informo uma data de nascimento",
  "keyword": "E "
});
formatter.match({
  "location": "Steps.informarDataNascimento()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informo um endereço",
  "keyword": "E "
});
formatter.match({
  "location": "Steps.informarEndereco()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informo uma cidade",
  "keyword": "E "
});
formatter.match({
  "location": "Steps.informarCidade()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informo um estado",
  "keyword": "E "
});
formatter.match({
  "location": "Steps.informarEstado()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informo um código postal",
  "keyword": "E "
});
formatter.match({
  "location": "Steps.informarCodigoPostal()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informo um telefone",
  "keyword": "E "
});
formatter.match({
  "location": "Steps.informarTelefone()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "submeto o cadastro",
  "keyword": "Quando "
});
formatter.match({
  "location": "Steps.submeterCadastro()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "sou cadastrado com sucesso",
  "keyword": "Então "
});
formatter.match({
  "location": "Steps.validaCadastro()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.uri("../ChamaProjectTest/src/test/Features/Login.feature");
formatter.feature({
  "name": "Realizar login",
  "description": "",
  "keyword": "Funcionalidade"
});
formatter.scenario({
  "name": "Login Sucesso",
  "description": "",
  "keyword": "Cenário",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@regressivo"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "que eu informe um email válido",
  "keyword": "Dado "
});
formatter.match({
  "location": "Steps.emailValido()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informe uma senha válida",
  "keyword": "E "
});
formatter.match({
  "location": "Steps.senhaValida()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "faço o login",
  "keyword": "Quando "
});
formatter.match({
  "location": "Steps.logar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "sou cadastrado com sucesso",
  "keyword": "Então "
});
formatter.match({
  "location": "Steps.validaCadastro()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Login inexistente",
  "description": "",
  "keyword": "Cenário",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@regressivo"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "que eu informe um email inexistente",
  "keyword": "Dado "
});
formatter.match({
  "location": "Steps.emailInexistente()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informe uma senha válida",
  "keyword": "E "
});
formatter.match({
  "location": "Steps.senhaValida()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "faço o login",
  "keyword": "Quando "
});
formatter.match({
  "location": "Steps.logar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "não sou autenticado",
  "keyword": "Então "
});
formatter.match({
  "location": "Steps.emailInvalidoNaoLogado()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Login inválido",
  "description": "",
  "keyword": "Cenário",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@regressivo"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "que eu informe um email inválido",
  "keyword": "Dado "
});
formatter.match({
  "location": "Steps.emailInvalido()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informe uma senha válida",
  "keyword": "E "
});
formatter.match({
  "location": "Steps.senhaValida()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "faço o login",
  "keyword": "Quando "
});
formatter.match({
  "location": "Steps.logar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "não sou autenticado",
  "keyword": "Então "
});
formatter.match({
  "location": "Steps.emailInvalidoNaoLogado()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.scenario({
  "name": "Login em branco",
  "description": "",
  "keyword": "Cenário",
  "tags": [
    {
      "name": "@login"
    },
    {
      "name": "@regressivo"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "que eu informe um email em branco",
  "keyword": "Dado "
});
formatter.match({
  "location": "Steps.emailEmBranco()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "informe uma senha válida",
  "keyword": "E "
});
formatter.match({
  "location": "Steps.senhaValida()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "faço o login",
  "keyword": "Quando "
});
formatter.match({
  "location": "Steps.logar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "não sou autenticado",
  "keyword": "Então "
});
formatter.match({
  "location": "Steps.emailInvalidoNaoLogado()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});