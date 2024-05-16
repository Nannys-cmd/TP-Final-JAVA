# TP Final JAVA - Daniela Bastias

## Pautas

1. **Resolver el Cuestionario Teórico**
    - Debes completar el cuestionario que cubre todos los aspectos teóricos vistos en clase.
    - El cuestionario estará disponible a través de un formulario de Google Forms, al cual tendrán acceso una vez que lo indiquen los profesores.

2. **Crear un Programa**
    - Debes desarrollar un programa que cumpla con los requerimientos solicitados.
    - Tienes una semana para completar el programa.
    - La entrega se realizará mediante el enlace al repositorio de GitHub.

## Descripción del Proyecto

La policía de Tres de Febrero necesita un sistema para administrar las armas de sus oficiales.

### Requerimientos del Sistema

- **Asignación de Armas a Policías**
  - Un arma solo puede pertenecer a un policía. Los datos necesarios del policía son: nombre, apellido y legajo.
  - Utiliza un constructor para asignar todos los atributos al crear un objeto.

- **Atributos de las Armas**
  - Las armas tienen los siguientes atributos: cantidad de municiones, alcance aproximado en metros, marca, calibre y estado ("NUEVA", "EN MANTENIMIENTO", "EN USO").
  - Existen dos tipos de armas: cortas y largas.
  - **Armas Cortas**: Indica si es automática o no.
  - **Armas Largas**: Indica si tiene el sello del RENAR, una descripción justificando su uso y el nivel del arma (1 a 5).

### Funcionalidades del Sistema

- **Condiciones de Uso**
  - Determinar si cualquier arma está en condiciones para ser usada en un enfrentamiento. Debe estar en estado "EN USO" y tener un calibre >= 9.
  
- **Comparación de Armas Largas**
  - Comparar dos armas largas. Un arma larga es mayor a otra si tiene un nivel superior.

- **Funcionalidad de Armas Cortas**
  - Determinar si un arma corta puede disparar a más de 200 metros.

### UML de Ayuda

- [Diagrama UML de ayuda](https://ibb.co/XxBWRqF)
