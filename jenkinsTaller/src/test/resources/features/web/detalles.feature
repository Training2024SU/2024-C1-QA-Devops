Feature: Detalles de libros
  YO como usuario de la tienda online de la librería Buscalibre
  QUIERO ver la información detallada de un libro
  PARA decidir si comprarlo más adelante

  Background: Browsing the web
#    Given El usuario navega en internet usando el navegador "edge"
    Given El usuario navega en internet usando el navegador "chrome"

  Scenario: Ver detalles de libro
    Given El usuario se encuentra en la página principal
    When selecciona cualquier libro
    Then debería ver la información detallada de éste
