Feature: DemoWeb Application Cart Demo

  Scenario Outline: Product Add To Cart Successful
  
    Given User Should Navigate To The Application
    And User Click On The Login Link Text
    And User Login As "<username>" and "<password>"
    When User Search The "<product>"
    Then The Card Badge Should Be Updated

    Examples: 
      | username                    | password    | product    |
      | bharishkumar.1999@gmail.com | Harish@1999 | laptop    |
      | swamisurya20@gmail.com      | Sk@20101996 | Health Book |
