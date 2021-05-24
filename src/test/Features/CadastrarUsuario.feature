# language: pt
Funcionalidade: Cadastrar Novo Usuário

  @cadastro @regressivo
  Cenário: Cadastrar novo usuário
    Dado informe um email válido
    E seleciono um titulo "Mr."
    E informo um nome
    E informo um sobrenome
    E informo uma senha
    E informo uma data de nascimento
    E informo um endereço
    E informo uma cidade
    E informo um estado
    E informo um código postal
    E informo um telefone
    Quando submeto o cadastro
    Então sou cadastrado com sucesso