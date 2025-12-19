# CMCAC - Backend API (Auditorías y Consultorías)

API REST robusta desarrollada con **Java 17** y **Spring Boot 3** diseñada para la gestión y procesamiento de comisiones mensuales de auditorías. Este backend centraliza la lógica de negocio, integrándose con procedimientos almacenados en base de datos para realizar cálculos masivos y asegurar la consistencia financiera de los procesos.

## Tecnologías Utilizadas

* **Core:** [Java 17](https://www.oracle.com/java/technologies/javase/jdk17-archive-downloads.html) y [Spring Boot 3.5.6](https://spring.io/projects/spring-boot).
* **Persistencia:** Spring Data JPA / JDBC.
* **Base de Datos:** Oracle.
* **Seguridad:** Spring Security.
* **Monitoreo:** Spring Boot Actuator.
* **Productividad:** Lombok.

## Características Principales

* **Procesamiento de Comisiones:** Ejecución de procesos mensuales mediante la invocación de procedimientos almacenados (`SP_COMISIONES_MENSUALES`).
* **Gestión de Auditorías:** Endpoints especializados para manejar la lógica de consultorías y auditorías internas.
* **Seguridad:** Endpoints protegidos mediante configuración de seguridad personalizada.

## Instalación y Configuración

### Requisitos Previos

1. **JDK 17** instalado.
2. **Maven** para la gestión de dependencias.
3. Acceso a una instancia de base de datos **Oracle** (para ejecución en producción).

### Ejecución

1. Clonar el repositorio.
2. Configurar las credenciales de base de datos en `src/main/resources/application.properties`.
3. Instalar dependencias y compilar:
```bash
mvn clean install

```


4. Ejecutar la aplicación:
```bash
mvn spring-boot:run

```



## API Endpoints (Principales)

### Procesos (`/api/procesos`)

| Método | Endpoint | Descripción |
| --- | --- | --- |
| `POST` | `/comisiones-mensuales` | Ejecuta el proceso de comisiones vía JSON (Ej: `{"mesProceso": "202106", "montoMinimo": 300000}`). |
| `POST` | `/comisiones-mensuales/run` | Ejecuta el proceso mediante parámetros de consulta (`mes` y `monto`). |

## Estructura del Proyecto

* `com.cmc.cmc.Controller`: Controladores REST que exponen la lógica a través de HTTP.
* `com.cmc.cmc.Service`: Interfaces y lógica de negocio.
* `com.cmc.cmc.Model.dto`: Objetos de transferencia de datos para peticiones y respuestas.
* `com.cmc.cmc.config`: Configuraciones globales de seguridad y CORS.

---
