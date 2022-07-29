Feature: Validaciones en Pago en Linea

  Scenario: Validacion del texto correcto en boton Submit
    Given Ingreso a la Pagina de pago en Linea
    When Ingreso el numero de Cliente correcto "12002990"
    Then Validar que el boton tiene texto "Ingresar"

    Scenario: Validacion  de texto no correccto en boton Submit
      Given Ingreso a la Pagina de pago en Linea
      When Ingreso el numero de Cliente correcto "12002990"
      Then Validar que el boton tiene texto incorrecto "Buscar informacion"

  Scenario: Validacion  de despliegue de informacion correcta del listado de pagos
    Given Ingreso a la Pagina de pago en Linea
    When Ingreso el numero de Cliente correcto "12002990"
    And Hacer click en boton "Ingresar"
    Then Validar el correcto despliegue del Listado de Pago

  Scenario: Validacion  de despliegue de notificacion correcta al ingresar cliente invalido
    Given Ingreso a la Pagina de pago en Linea
    When Ingreso el numero de Cliente correcto "1200290091"
    And Hacer click en boton "Ingresar"
    Then Validar de la notificacion del ingreso incorrecto del cliente


