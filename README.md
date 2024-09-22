# Proyecto de Gestión de Personas, Domicilios, Libros y Autores con Spring Boot

Este proyecto consiste en la creación de un sistema de gestión de personas, domicilios, localidades, libros y autores utilizando **Spring Boot**. Cada entidad del modelo de datos cuenta con su correspondiente controlador REST, servicio y repositorio para manejar las operaciones CRUD (Create, Read, Update, Delete) y las relaciones entre ellas.

## Descripción del Modelo de Datos

### Clases:

- **Persona**: 
  - Atributos: `id`, `nombre`, `apellido`, `dni`
  - Relaciones:
    - Tiene una relación uno a uno con **Domicilio**.
    - Tiene una relación uno a muchos con **Libro**.
  
- **Domicilio**:
  - Atributos: `id`, `calle`, `numero`
  - Relaciones:
    - Tiene una relación uno a uno con **Persona**.
    - Tiene una relación muchos a uno con **Localidad**.

- **Localidad**:
  - Atributos: `id`, `denominacion`
  - Relaciones:
    - Tiene una relación uno a muchos con **Domicilio**.

- **Libro**:
  - Atributos: `id`, `titulo`, `fecha`, `genero`, `paginas`, `autor`
  - Relaciones:
    - Tiene una relación muchos a uno con **Persona** (el dueño del libro).
    - Tiene una relación muchos a uno con **Autor**.

- **Autor**:
  - Atributos: `id`, `nombre`, `apellido`, `biografia`
  - Relaciones:
    - Tiene una relación uno a muchos con **Libro**.

## Estructura del Proyecto

Cada entidad del modelo cuenta con las siguientes capas:

1. **Repositorio**: Interface que extiende `JpaRepository`, la cual maneja la persistencia y permite interactuar con la base de datos.
2. **Servicio**: Capa de lógica de negocio que contiene los métodos necesarios para realizar las operaciones de negocio sobre las entidades.
3. **Controlador REST**: Exposición de los servicios a través de endpoints RESTful que permiten realizar operaciones CRUD sobre las entidades.

Cada controlador está mapeado a su respectiva entidad.

## Configuración

1. **Spring Boot**: Este proyecto utiliza Spring Boot para la gestión de dependencias, estructura del proyecto y creación automática de la base de datos a partir del modelo de entidades.
2. **Base de Datos**: Se puede configurar una base de datos como **H2**.
3. **JPA y Hibernate**: El proyecto utiliza JPA para el mapeo objeto-relacional y Hibernate como la implementación por defecto. Las relaciones entre las entidades están definidas utilizando anotaciones como @OneToOne, @OneToMany y @ManyToOne.

 ## Ejecución 
 Para ejecutarlo puedes descargar el archivo en formato .zip y extraerlo en alguna carpeta para luego abrirlo con el Intelligent IDEA y ejecutarlo usando con base de datos H2.

 ## Enpoints
 Se puede acceder a los endpoints a través de Postman o cualquier cliente HTTP.
