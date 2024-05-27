Feature: Inicio de sesion
  Yo como usuario registrado de la pagina buscaLibre
  quiero porder ingresar mis credenciales registradas
  para poder ingresar y obtener los beneficios de la pagina

#navegadores --> chrome y edge
  @RutaFeliz
  Scenario: Login correcto
    Given que el usuario selecciona el navegador "chrome" e ingresa al sitio web
    When ingresa sus credenciales de usuario registrado correctamente
    Then deberia ser redirigido a la pagina principal con la sesion iniciada
