Feature: Búsqueda de libros
  YO como usuario de la tienda online de la librería Buscalibre
  QUIERO buscar los libros que me interesan
  PARA poder ver su información

  Background: Browsing the web
#    Given El usuario navega en internet usando el navegador "edge"
    Given El usuario navega en internet usando el navegador "chrome"

  Scenario: Búsqueda por categoría
    Given El usuario se encuentra en la página principal
#    When selecciona una categoría cualquiera
#    Then debería ver productos relacionados a esa categoría

  Scenario: Búsqueda por termino
    Given El usuario se encuentra en la página principal
#    When realiza una búsqueda por texto
#    Then debería ver productos relevantes en los resultados de la búsqueda