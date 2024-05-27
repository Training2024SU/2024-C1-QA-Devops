Feature: Formulario de registro
  Yo como usuario sin registrar en la pagina buscalibre
  quiero llenar el formulario de registro
  para poder ingresar y obtener los beneficios de la página

#navegadores --> chrome y edge
  @RutaFeliz
  Scenario: Registro correcto
    Given que el usuario selecciona el navegador "chrome" e ingresa al sitio web
    When ingresa su informacion correctamente para crear su cuenta
    Then deberia ser redirigido a la pagina principal con la sesion iniciada