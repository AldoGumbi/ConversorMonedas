# Conversor de Monedas

Este proyecto es una aplicación de consola en Java  para el Challenge de Alura de la ruta Backend que permite realizar conversiones de diferentes monedas utilizando una API de tasas de cambio.

## Estructura del Proyecto

El proyecto está compuesto por los siguientes archivos que puedes encontrar en la carpeta de src:

1. **Moneda.java**: Define un registro para representar los datos de la moneda obtenida de la API.
2. **ConsultaApi.java**: Realiza la consulta a la API de tasas de cambio.
3. **Cambio.java**: Realiza la operación matemática para la conversión de monedas.
4. **Conversion.java**: Gestiona la lógica de conversión y el registro del historial de conversiones.
5. **Principal.java**: Punto de entrada de la aplicación con un menú interactivo para el usuario.


## Funcionamiento del programa

    
    ----- Conversor de monedas -----
    1._ De dolar a peso mexicano [USD - MXN]
    2._ De dolar a euro [USD - EUR]
    3._ De peso mexicano a dolar [MXN - USD]
    4._ De peso mexicano a euro [MXN - EUR]
    5._ De euro a peso mexicano [EUR - MXN]
    6._ De euro a dolar [EUR - USD] 
    7._ Escribe tus monedas
    	(Solo si conoces el codigo de moneda)
    8._ Salir
	
    Ingrese una opcion:

Nos pedira ingresar una de las opciones en pantalla, las cuales las opciones contiene conversiones de las monedas más usadas como lo es el dolar y el euro con la moneda nacional de México.

    Ingrese una opcion:
    1
    
     ----- [USD -> MXN]  -----
    Ingresa la cantidad para convertir:
    20
    ( 20.0 * 16.7659 )
    	 El resultado es: 335.32MXN.
    


La pantalla nos solicitará ingresar la cantidad  de la moneda que deseamos convertir y nos mostrará la operación aritmetica para obtener el total en la moneda de cambio.

Además como funcionalidad extra, la opcion `7._ Escribe tus monedas` realiza las operaciones con las monedas que se deseen siempre y cuando se conozca **el codigo de moneda ISO 4217.** como se muestra en el siguiente ejemplo:

     ----- Conversor de monedas -----
    1._ De dolar a peso mexicano [USD - MXN]
    2._ De dolar a euro [USD - EUR]
    3._ De peso mexicano a dolar [MXN - USD]
    4._ De peso mexicano a euro [MXN - EUR]
    5._ De euro a peso mexicano [EUR - MXN]
    6._ De euro a dolar [EUR - USD] 
    7._ Escribe tus monedas
    	(Solo si conoces el codigo de moneda)
    8._ Salir
    Ingrese una opcion:
        7
    
         ----- Escribe tus monedas  -----
        Ingresa la moneda base:
        JPY
        Ingresa la moneda a cambiar:
        MXN
        Ingresa la cantidad para convertir:
        75200.25
        ( 75200.25 * 0.1067 )
        	 El resultado es: 8023.87MXN.
    ``

Por otro lado, la opción `8._ Salir`, antes de finalizar el programa, una lista de las conversiones, imprimiendo en pantalla la fecha y hora en que se realizo la conversion, como la cantidad en moneda base y el resultado de la conversion en la modena de cambio.

    ----- Conversor de monedas -----
    1._ De dolar a peso mexicano [USD - MXN]
    2._ De dolar a euro [USD - EUR]
    3._ De peso mexicano a dolar [MXN - USD]
    4._ De peso mexicano a euro [MXN - EUR]
    5._ De euro a peso mexicano [EUR - MXN]
    6._ De euro a dolar [EUR - USD] 
    7._ Escribe tus monedas
    	(Solo si conoces el codigo de moneda)
    8._ Salir
    
    Ingrese una opcion:
    8
    
    ------ Historial de Conversiones ------
    2024-05-28T19:05:19.307260
    [20.0 USD] = [335.32 MXN]
    
    
    2024-05-28T19:12:41.991047
    [75200.3 JPY] = [8023.87 MXN]
    
    
    Finalizo el programa

## Soluciones a errores
Para finalizar, se logro cubrir los puntos debiles del programa, manejando posibles errores como insertar una letra en donde pide un numero, opciones del menu que no sean validas, y posibles erroes al escribir incorrectamente el codigo de moneda o escribir un codigo que no sea valido.

    ----- Conversor de monedas -----
    1._ De dolar a peso mexicano [USD - MXN]
    2._ De dolar a euro [USD - EUR]
    3._ De peso mexicano a dolar [MXN - USD]
    4._ De peso mexicano a euro [MXN - EUR]
    5._ De euro a peso mexicano [EUR - MXN]
    6._ De euro a dolar [EUR - USD] 
    7._ Escribe tus monedas
    	(Solo si conoces el codigo de moneda)
    8._ Salir
    
    Ingrese una opcion:
    9
    Opcion no valida, intente de nuevo.
    
    ----- Conversor de monedas -----
    1._ De dolar a peso mexicano [USD - MXN]
    2._ De dolar a euro [USD - EUR]
    3._ De peso mexicano a dolar [MXN - USD]
    4._ De peso mexicano a euro [MXN - EUR]
    5._ De euro a peso mexicano [EUR - MXN]
    6._ De euro a dolar [EUR - USD] 
    7._ Escribe tus monedas
    	(Solo si conoces el codigo de moneda)
    8._ Salir
    
    Ingrese una opcion:
    Uno
    [!] Opcion no valida: For input string: "Uno"
    
    ----- Conversor de monedas -----
    1._ De dolar a peso mexicano [USD - MXN]
    2._ De dolar a euro [USD - EUR]
    3._ De peso mexicano a dolar [MXN - USD]
    4._ De peso mexicano a euro [MXN - EUR]
    5._ De euro a peso mexicano [EUR - MXN]
    6._ De euro a dolar [EUR - USD] 
    7._ Escribe tus monedas
    	(Solo si conoces el codigo de moneda)
    8._ Salir
    
    Ingrese una opcion:
    7
    
     ----- Escribe tus monedas  -----
    Ingresa la moneda base:
    mexicano
    Ingresa la moneda a cambiar:
    japones
    [!]Error: No se encontraron las monedas
    
    ----- Conversor de monedas -----
    1._ De dolar a peso mexicano [USD - MXN]
    2._ De dolar a euro [USD - EUR]
    3._ De peso mexicano a dolar [MXN - USD]
    4._ De peso mexicano a euro [MXN - EUR]
    5._ De euro a peso mexicano [EUR - MXN]
    6._ De euro a dolar [EUR - USD] 
    7._ Escribe tus monedas
    	(Solo si conoces el codigo de moneda)
    8._ Salir
    
    Ingrese una opcion:
    8
    
    ------ Historial de Conversiones ------
    2024-05-28T19:20:21.429671
    [!] Monedas no encontradas
    
    
    Finalizo el programa
