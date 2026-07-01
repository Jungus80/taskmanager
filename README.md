# Task Manager App — Jetpack Compose + Room Database

Aplicación Android de gestión de tareas desarrollada con Jetpack Compose y Room Database.

## Integrantes

- Jabneel González
- Manuel Guillén

## Información Académica

| | |
|---|---|
| **Universidad** | Universidad Tecnológica de Panamá (UTP) |
| **Carrera** | Ingeniería de Software |
| **Profesor** | Jorge Cisneros |
| **Grupo** | 1SF241 |

## Descripción

Aplicación CRUD que permite:

- Agregar nuevas tareas
- Visualizar la lista de tareas registradas
- Editar tareas existentes
- Eliminar tareas
- Marcar tareas como completadas

## Tecnologías

- **Lenguaje:** Kotlin
- **UI:** Jetpack Compose + Material3
- **Base de datos:** Room Database
- **Arquitectura:** MVVM (ViewModel + StateFlow)
- **Navegación:** Navigation Compose

## Estructura del Proyecto

```
app/src/main/java/com/example/roomdatabase_crud/
├── MainActivity.kt
├── TaskViewModel.kt
├── data/
│   ├── Task.kt           # Entidad Room
│   ├── TaskDao.kt        # Operaciones CRUD
│   ├── TaskDatabase.kt   # Configuración de la base de datos
│   └── TaskRepository.kt # Gestión del acceso a datos
├── navigation/
│   └── NavGraph.kt
└── ui/
    ├── TaskListScreen.kt    # Pantalla principal
    └── AddEditTaskScreen.kt # Formulario agregar/editar
```
