# language: es
  Característica: Añadir items al carrito de compras
  Regla: Los items del añadidos desde el catalogo al carrito de compras, deben aparecer en el
  Escenario: Juan añade algunos items a su carrito
    Dado Juan se ha logueado en la aplicacion
    Y Juan se encuentra mirando el catalogo
    Cuando Juan agrega los siguientes items al carrito:
    |Sauce Labs Backpack|
    |Sauce Labs Fleece Jacket|
    |Test.allTheThings() T-Shirt (Red)|
#    Entonces el conteo de items del carrito de compras deberia ser de 2
#    Y los items deberian aparecer en el carrito