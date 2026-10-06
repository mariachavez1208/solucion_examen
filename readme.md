CAMBIOS REALIZADOS

Al pasar de la versión original a la versión mejorada se realizaron varios cambios para corregir los errores y lograr que el programa funcionara correctamente.

Primero, se corrigieron algunos problemas con TipoIngrediente, ya que en algunas partes estaba escrito de forma diferente, por ejemplo TipoIngredeinte. Esto hacía que Java no reconociera el tipo, porque los nombres deben estar escritos exactamente igual.

En la clase Ingredientes se agregó una variable para contar cuántos ingredientes se han agregado, ya que el máximo es de 5 y antes no había forma de saber cuántos espacios estaban ocupados. También se mejoró el método hayEspacio() para comprobar si todavía se pueden agregar ingredientes y se agregó la función necesaria para guardarlos en el arreglo.

En la clase Pizza se agregó la variable ingredientes, porque originalmente existía el método getIngredientes(), pero no había ninguna variable con ese nombre para devolver. También se completaron los métodos agregarIngrediente() para que realmente guarden los ingredientes seleccionados. De esta forma, cada pizza puede tener su propia base, salsa e ingredientes.

En la clase Orden se agregó una pizza, ya que originalmente solo se guardaba el nombre del cliente, el método de pago y el número de orden. Sin este cambio no había forma de saber qué pizza pertenecía a cada orden. También se completaron los métodos para mostrar la información de la orden y realizar el pago.

En la clase Cocina se agregó un contador para saber cuántas órdenes hay guardadas. También se mejoró el método hayEspacio() para comprobar si todavía hay espacio dentro del máximo de 10 órdenes y se agregó un método para guardar nuevas órdenes en la cocina.

Por último, se modificó el Main para poder probar mejor el programa. Ahora el usuario puede ingresar sus datos y escoger la base, salsa, ingredientes y método de pago, en lugar de tener una pizza creada automáticamente.

En general, los principales problemas de la primera versión eran nombres mal escritos, variables que no existían, métodos que estaban vacíos y algunas relaciones que faltaban entre las clases. En la versión mejorada se corrigieron estos detalles para que todas las clases pudieran trabajar juntas y el programa funcionara correctamente.