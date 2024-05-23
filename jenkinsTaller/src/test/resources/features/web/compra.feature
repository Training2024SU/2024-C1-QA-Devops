Feature: Compra en pagina
  Yo como usuario de la pagina de BuscaLibre
  Quiero poder agregar productos a mi carrito y comprarlos
  Para adquirir los productos que necesito

    #navegadores --> chrome y edge

  Scenario: Compra completa
    Given que el usuario selecciona el navegador "chrome" y se registra en el sitio web
    When agrega los siguientes productos al carrito
      | cien anos de soledad |
      | finanzas personales  |
      | calculo stewart      |
      | caperucita roja      |
    And confirma los productos llenando los formularios requeridos para el envio
 #   Then deberia visualizar un mensaje confirmando la orden de compra
