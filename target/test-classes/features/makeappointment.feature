#language:es
Necesidad del negocio: Generar una cita
  Yo como usuario
  Quiero generar una cita medica
  Para poder atenderme

  Antecedentes: Ingresar a la aplicación CURA
    Dado que el usuario se loguea con su usuario y contraseña

  Escenario: Generar una cita medica
    Y usuario genera la cita seleccionando los datos correspondientes
    Entonces valido que se genero la cita correctamente




