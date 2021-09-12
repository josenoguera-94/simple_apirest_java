# SIMPLE API REST EN JAVA

**Instalar dependencias**
- mysql
- JPA (para mapear los datos)

**Correr la app por consola**
`mvnw.cmd spring-boot:run`

**Flujo de ejecución**
  1. Controlador
  2. Servicio: logíca de la app
  3. Repository: conexiones a la DB
  4. Modelo: para saber que info va a traer

**Json body de esta api**
```
  {
    "nombre": "Juan",
    "email": "juanito@haka.com",
    "prioridad": 2
  }
```