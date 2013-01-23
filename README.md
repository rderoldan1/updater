### Resumen
Este proyecto es desarrollado con el fin de agilizar el proceso de actualización de servidores, 
una de las tareas que desarrolló durante 6 meses de práctica, el proceso consiste en ingresar a
cada servidor aplicar las actualizaciones, reiniciar los servidores, verificar por medio de un PING 
cuando encendia el servidor nuevamente y por ultimo ingresar al servidor para validar su correcto 
funcionamiento.
El problema es cuando este proceso se repite 60 veces una vez al mes, y además cuando solo
lo puede hacer de 12pm a 1pm (Hora del almuerzo), por esto en un principio hice un pequeño script 
en ruby el cual leía de un archivo de texto una lista de nombres DNS de los servidores y abría una 
terminal de escritorio remoto ( Un hilo de ejecución por terminal) y tenia la opcion de reiniciar los 
servidores remotamente. Esto me permitió pasar de 5 servidores por día a un promedio de 20 por día, 
además me demoraba entre 20 y 30 minutos menos.
Ahora que entra un nuevo practicante, hice este nuevo proyecto que simplemente es reescribir ese 
simple script de ruby (50 lineas) a Java (n mil líneas :S ) para hacer que tenga una interface mas 
amigable y sea más fácil de utilizar para quien no tiene mucho conocimiento en ejecución de scripts
desde consola o simplemente le da pereza instalar ruby en sus máquinas Windows
### Mejoras y Errores
  Reportelas en este [link]( https://github.com/rderoldan1/updater/issues)

### Como usarlo
  Consulte este [link](https://github.com/rderoldan1/updater/wiki) (proximamente !!)
  
### Desea contribuir?

  Realize un `fork` del proyecto, haga los cambios y propongalos con un `pull request`
  
Ruben Espinosa, 2013  
