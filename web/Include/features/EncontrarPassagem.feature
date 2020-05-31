
Feature: Encontrar Passagem
  

  Scenario Outline: Test encontrar passagem
    Given Esta na pagina de Flights Finder
    When Selecionar ida e volta
    And escolher a <quantidade> de passageiros
    And escolher de <onde esta partindo>
    And escolher o M <mes de partida>
    And escolher o D <dia da partida>
    And escolher para <onde vai>
    And escolher o m <mes da volta>
    And escolher o d <dia da volta>
    And escolher a classe de servico
    And escolher a <CIA> aerea
    Then clicar no botao continue 

    Examples: 
      | quantidade  | onde esta partindo | mes de partida  | dia da partida | onde vai | mes da volta | dia da volta | CIA |
      | 1           |     London         | 5               |    15          | New York | 7            | 11           | Blue Skies Airlines|
     