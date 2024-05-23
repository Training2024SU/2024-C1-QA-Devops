Feature:  pruebas de servicio soap
  yo como usuario del sistema
  quiero probar un servicio de tipo soap
  para obtener informacion del pais segun su codigo iso

  @codigoIso
  Scenario Outline: prueba nombre  del pais segun codigo iso
    Given que el es usuario quiere ingresar el codigo "<ISO>" con "http://webservices.oorsprong.org"
    When realiza la peticion de tipo soap con el recurso "/websamples.countryinfo/CountryInfoService.wso"
    Then deberia obtener un statuscode 200
    And deberia obtener el nombre "<nombre>" del pais
    Examples:
      | ISO | nombre |
      | FR  | France |