

Feature: Login 
  
  Scenario Outline: Test login
    Given Acesso a pagina de login 
    When  Entrar com <usuario> e <senha>
    And   Clicar no botão submit 
    Then  Login realizado com sucesso

    Examples: 
      | usuario | senha | 
      | 123     | 123   | 
 