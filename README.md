
<p align="center">
  <img src="https://github.com/davidkaralz/challenge_conversorMonedas/assets/42081629/a52d593c-ba26-4c10-b3e5-0d7ac8048d3f" alt="portada">
</p>


<h1 align = "center"> Bienvenidos al conversor de monedas Karalz </h1>



<h2>Mi primer challenge</h2>
<p>
  Este es mi primer challenge en Alura, este challenge consiste en un sencillo pero muy útil conversor de monedas, si principal motivo es poner en práctica el conocimiento adquirido sobre el consumo de una API.
</p>

# Índice
* Bienvenidos al conversor de monedas Karalz
* Descripción del proyecto
* Estado del proyecto
* Uso del conversor de monedas
* Autor

# Descripción del proyecto

El reto consiste en crear una aplicación en crear una aplicación que convierta un monto de dinero determinado por el cliente, de una divisa a otro, es decir; de convertir cierta cantidad de dinero de pesos Colombianos a dólares. En esta aplicación realizamos la conversión de pesos colombianos, pesos argentinos y reales de Brasil a dólares y también de manera viceversa.
 El desarrollo de esta aplicación se realizó en el lenguaje de programación Java orientado a objetos; donde aplicamos conocimientos como la creación de objetos, métodos y variables, usamos también listas para entender y guardar datos importantes, y por ultimo pero primordial en nuestra aplicación fue el consumo de una API en este caso la API  __exchangerate-api.__ 
    
<h3 align = "center"> Como se desarrolló la aplicación </h3>
    Luego de iniciar el IDE, primero cree mi proyecto de manera local al cual le puse como nombre "challenge_conversorMonedas", al contar con mi proyecto creado y basándome del último video presentado en el curso donde hacen una aplicación para consumir una api de star wars, que admito es una secuela de películas que también em gusta mucho. Creo mis primeras dos clases que fueron "principal" y "Moneda", la clase principal al inicio de la dejo quieta y me enfoco en moneda que será la encargada tomar los datos de la API y convertirlos; son pocas líneas que se encargan de esto, como podemos verlo a continuación:
    
  
<p align="center">
  <img src="https://github.com/davidkaralz/challenge_conversorMonedas/assets/42081629/ff539aaa-a28f-4c16-be1a-ef1489673c9d" alt="Moneda">
</p>

Ya pasamos a crear una nueva clase con el nombre "SolictudMoneda", en esta clase cargamos el codigo encargado de realizar por decirlo así el consumo de la API, ya que en esta clase haremos la comunicación entre nuestra aplicación y la base de datos de la api; ¿En qué consiste esta comunicación?, simple: por medio del protocolo HTTP realizaremos un conexión entre la aplicación y la base de datos, este protocolo cuanta con unos métodos que por los cuales nosotros como clientes realizaremos peticiones o sea preguntas sobre los datos que tienen la api y nuestra aplicación como cliente obtendrá una respuesta, hay que tener en cuenta que esta respuesta la obtenemos de tipo __json__, para nuestra aplicación es posible leerla pero no es posible hacer uso de ella, por este motivo con la ayuda de la librería __Gson__ podremos hacer una conversión a la nuestra clase Moneda", clase que ya creamos anteriormente con las características que necesitamos para continuar con nuestra aplicación, a continuación podemos observar la maravilla de codigo que se encarga de este proceso:

<p align="center">
  <img src="https://github.com/davidkaralz/challenge_conversorMonedas/assets/42081629/ec97fcf8-8aad-42b9-856c-868ed88a95f1" alt="solicitudMoneda">
</p>
  
Como último paso fue unir todo en la clase __Principal__ y realizar la presentación e interactividad para el usuario final, aqui es donde aplicamos conceptos básicos como "Scanner", "System.out.println", "while" y por ultimo un "if", este es una opción de solución al codigo, al leer, consultar y ver codigo de mis compañeros, me di cuenta que hay casi un sinfín de formas de hacer el mimos proceso con diferente lógica y el mismo resultado, este codigo fue el que para mí tenía más sentido, el cual muestro a continuación:

<p align="center">
  <img src="https://github.com/davidkaralz/challenge_conversorMonedas/assets/42081629/32ca153b-a178-403d-b6c8-0d12534c49a5" alt="Principal">
</p>

Pueden notar que no está el codigo completo en la imagen, hay que tener presente que es algo extenso, pero no hay problema, cuando abran el codigo lo podrán visualizar completamente, ssto es solo una imagen guía 

# Estado del proyecto

Quiero empezar diciendo que al proyecto le falta __mucho__ por mejorar, está en la etapa de desarrollo, quiero más adelante sacer el tiempo y agregarle más funcionalidades que me faltaron como, por ejemplo:
* Agregar la opción de elegir la moneda base, que no solo sea USD si no cualquier moneda
* Consumir mejor la API en el sentido de que no solo este limitado a pesos colombianos, pesos argentinos y reales de Brasil 
* También agregar y mejorar los errores

y muchas cosas más, sonara como excusa pero por tiempo no lo logre en este challenge; pero con los conocimientos básicos adquiridos sé que lo puedo lograr, también reconozco mis debilidades y sé que tendré que dedicarle más tiempo a los __errores_ ya que aún se me dificulta entender bien su manejo.

# Uso del conversor de monedas

El uso de la aplicación es muy sencillo, al correr el codigo, este te dará un mensaje de bienvenida y te presentará 7 opciones como se ve a continuación:

<p align="center">
  <img src="https://github.com/davidkaralz/challenge_conversorMonedas/assets/42081629/01773c0d-93f0-4abc-9c9f-bb0963e61fc9" alt="menu">
</p>

después de las opciones te pedirá que digites la opción que deseas usar.
Cuando digites el numero de la opción que deseas te pedirá que digites el monto que deseas convertir y por último te mostrará un mensaje con el monto en la moneda final que seleccionaste 

<p align="center">
  <img src="https://github.com/davidkaralz/challenge_conversorMonedas/assets/42081629/14fdc752-1ad9-4284-8a1a-18a926f97f74" alt="menu">
</p>

Como vemos en el ejercicio anterior la aplicación continuara funcionando hasta que el usuario seleccione la opción de salir de la aplicación que en este caso es la opción __7__ al seleccionarla, mostrará tu última acción y el mensaje de despedida.

<p align="center">
  <img src="https://github.com/davidkaralz/challenge_conversorMonedas/assets/42081629/ec0a829c-fa39-4c73-b34a-3149e4e14631" alt="menu">
</p>

Y así concluye mi aplicación
Muchas gracias por la enseñanza y la oportunidad 

# Autor

__Hernan David Karalz__


