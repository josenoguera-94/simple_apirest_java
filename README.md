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

## **Endpoints**

### **GET**

**Traer todos los usuarios**
- `http://localhost:8080/api/users/`

**Traer un usuario por id**
- `http://localhost:8080/api/users/<id>`

**Traer por filtro con parámetros(ejemplo: por 'prioridad')**
- `http://localhost:8080/api/users/query?prioridad=<int>`

### **POST**
**Crear usuario**
```
 
endpoint: http://localhost:8080/api/users/

- json body

{
  "nombre": "Juan",
  "email": "juanito@haka.com",
  "prioridad": 2
}
```
**Actualizar usuario**

El método PUT es como es POST pero con el id que quiere actualizar, solo cambia los valores de los otros campos
```
endpoint: http://localhost:8080/api/users/

- json body

{
  "id": 2
  "nombre": "Juan",
  "email": "juanito@haka.com",
  "prioridad": 2
}
```

Lo mismo se puede hacer con POST
```
endpoint: http://localhost:8080/api/users/

- json body

{
  "id": 2
  "nombre": "Juan",
  "email": "juanito@haka.com",
  "prioridad": 2
}
```

### **PUT**

### **DELETE**
**Eliminar usuario**
```
Endpoint: http://localhost:8080/api/users/<id>

- Response

OK: User deleted with id: <id>
ERROR: could not delete user with id: <id>
```







