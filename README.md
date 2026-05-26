# Ejr_Nro_8_Bicicleteria
Ejercicio Numero 8: Bicicleteria "Oro Verde"
# Patron Estructural Elegido: Composite
# Consigna
La bicicletería Oro Verde lo contrata para diseñar y desarrollar su sistema de control de
precios. Dado que la bicicletería tiene un servicio de armado de bicicletas, donde permite
que dado un conjunto de partes armar una bicicleta personalizada, cuyo precio es la suma
del precio de las partes. A la vez, la bicicletería vende partes, las cuales tienen un
número, una descripción y un precio. Las bicicletas armadas tienen un número y una
descripción y el precio está dado por la suma de las partes. Por último, la bicicletería tiene
ofertas las cuales son un conjunto de partes y/o bicicletas y su precio está dado por la
suma de los elementos que lo componen, menos un 20%.
# Cómo implementarlo
Asegúrate de que el modelo central de tu aplicación pueda representarse como una estructura de árbol. Intenta dividirlo en elementos simples y contenedores. Recuerda que los contenedores deben ser capaces de contener tanto elementos simples como otros contenedores.

Declara la interfaz componente con una lista de métodos que tengan sentido para componentes simples y complejos.

Crea una clase hoja para representar elementos simples. Un programa puede tener varias clases hoja diferentes.

Crea una clase contenedora para representar elementos complejos. Incluye un campo matriz en esta clase para almacenar referencias a subelementos. La matriz debe poder almacenar hojas y contenedores, así que asegúrate de declararla con el tipo de la interfaz componente.

Al implementar los métodos de la interfaz componente, recuerda que un contenedor debe delegar la mayor parte del trabajo a los subelementos.

Por último, define los métodos para añadir y eliminar elementos hijos dentro del contenedor.

Ten en cuenta que estas operaciones se pueden declarar en la interfaz componente. Esto violaría el Principio de segregación de la interfaz porque los métodos de la clase hoja estarían vacíos. No obstante, el cliente podrá tratar a todos los elementos de la misma manera, incluso al componer el árbol.

