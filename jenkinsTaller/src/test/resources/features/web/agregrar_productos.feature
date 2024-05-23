Feature: Agregar productos al carrito
  YO como usuario de la tienda online de la librería Buscalibre
  QUIERO agregar varios productos al carrito
  PARA poder comprarlos

  Background: Browsing the web
#    Given El usuario navega en internet usando el navegador "edge"
    Given El usuario navega en internet usando el navegador "chrome"


  @agregarcarrito
  Scenario: Búsqueda por categoría
    Given El usuario se encuentra en la página principal
    When agrega los siguientes productos al carrito
      | cien anos de soledad |
      | finanzas personales  |
      | calculo stewart      |
      | caperucita roja      |
    And se dirije al carrito
    Then deberia ver los libros registrados
