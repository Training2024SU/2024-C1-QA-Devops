Feature: Conversion de temperatura


  @celsiusAFahrenheit
  Scenario: conversion de celsius a fahrenheit
    Given que el es usuario quiere convertir 27 celsius a fahrenheit en "https://www.w3schools.com:443"
    When realiza la peticion de tipo soap con el recurso "/xml/tempconvert.asmx"
    Then deberia obtener un statuscode 200
    And deberia obtener el el valor "80.6" en grados fahrenheit


