Feature: Conversion de temperatura


  @celsiusAFahrenheit
  Scenario Outline: conversion de celsius a fahrenheit
    Given que el es usuario quiere convertir <celsius> celsius a fahrenheit en "https://www.w3schools.com:443"
    When realiza la peticion de tipo soap con el recurso "/xml/tempconvert.asmx"
    Then deberia obtener un statuscode 200
    And deberia obtener el el valor "<fahrenheit>" en grados fahrenheit
    Examples:
      | celsius | fahrenheit |
      | 27      | 80.6       |
      | 32      | 89.6       |
      | -2      | 28.4       |
      | -105    | -157       |



