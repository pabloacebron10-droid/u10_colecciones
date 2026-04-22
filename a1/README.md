# 📌 Actividad: Método Genérico `guardar` en Java

## 🧩 Descripción

En esta actividad se implementa un método genérico estático llamado `guardar`, capaz de trabajar con diferentes tipos de datos utilizando **genéricos en Java**.  

El objetivo principal es comprender cómo crear métodos reutilizables que operen sobre arrays sin depender de un tipo específico.

---

## 🎯 Objetivos

- Implementar un método genérico estático.  
- Manipular arrays dinámicamente.  
- Aplicar el uso de `Arrays.copyOf`.  
- Reutilizar código con distintos tipos de datos (`String` e `Integer`).  

---

## ⚙️ Requisitos de la actividad

1. Crear un método genérico estático llamado `guardar` que:
   - Reciba:
     - Un elemento (`T elemento`)
     - Un array (`T[] array`)
   - Inserte el elemento al final del array.
   - Devuelva un nuevo array con el elemento añadido.

2. En el método `main`:
   - Crear un array de tipo `String`.
   - Crear un array de tipo `Integer`.
   - Insertar **dos elementos en cada array** utilizando el método `guardar`.

3. Utilizar el método:

```java
Arrays.copyOf(array, newLength)
