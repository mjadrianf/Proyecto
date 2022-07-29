@smokeTest
Feature: Test cases del Contact Us Page

  Scenario Outline: Validar el envio exitoso del Formulario
    Given Yo acceso al formulario de Contact Us
    When Ingreso el nombre de <FirstName>
    And Ingreso el apellido de <LastName>
    And Ingreso el comentario de <Comment>
    And Ingreso el email de <EmailAddress>
    And Hago Click en el boton submit
    Then Yo espero que se prensente un mensaje de exito
    Examples:
      | FirstName  | LastName  | Comment                | EmailAddress    |
      | "Maria" | "Adrian" | "comentario de prueba" | "mj@mj.cl" |
      | "Maria" | "AdrianF" | "comentario de pruebaM" | "mj1@mj.cl" |
      | "Maria" | "AdrianM" | "comentario de pruebaD" | "mj1@mj.cl" |

  Scenario Outline: Validar el mensaje erroneo al enviar el Formulario
    Given Yo acceso al formulario de Contact Us
    When Ingreso el nombre de <FirstName>
    And Ingreso el apellido de <LastName>
    And Ingreso el comentario de <Comment>
    And Ingreso el email de <EmailAddress>
    And Hago Click en el boton submit
    Then Yo espero que se prensente un mensaje de error
    Examples:
      | FirstName  | LastName  | Comment                | EmailAddress  |
      | "Maria" | "Adrian" | "comentario de prueba" | "mjmjcl1" |
      | "Maria" | "Adrian" | "comentario de prueba" | "mjmjcl2" |
      | "Maria" | "Adrian" | "comentario de prueba" | "mjmjcl3" |
