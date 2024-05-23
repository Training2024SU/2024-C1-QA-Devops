Feature:  pruebas de servicio soap
  yo como usuario del sistema
  quiero probar un servicio de tipo soap
  para obtener informacion del pais segun su codigo iso

  @codigoIso
  Scenario: prueba nombre  del pais segun codigo iso
    Given que el es usuario quiere ingresar el codigo "<ISO>"
    When hace la peticion de tipo soap con el recurso "<Recurso>"
    Then deberia obtener un statuscode 200
    And deberia obtener el nombre del pais