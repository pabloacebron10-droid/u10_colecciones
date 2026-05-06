# 📘 Actividad 10: Gestión de socios y conversiones

## 📌 Enunciado

- Crear una clase `Socio` con atributos: `dni` y `nombre`.
- Implementar:
  - `Comparable` (orden natural por DNI)
  - `equals()` (socios iguales si tienen el mismo DNI)
  - `toString()`
- En `main`:
  - Crear un conjunto eficiente para insertar objetos `Socio`.
  - Insertar 4 socios (2 con el mismo DNI) y comprobar duplicados.
- Conversiones:
  1. Convertir el conjunto a uno ordenado por DNI y mostrarlo.
  2. Convertir a lista ordenada y obtener el socio en posición 1.

---

## 🧠 Teoría de la solución

- Para inserciones rápidas se usa **`HashSet`**, que evita duplicados usando `equals()` (en este caso, el DNI).
- Al insertar socios con el mismo DNI, **no se duplican**, ya que se consideran iguales.

- Para ordenar:
  - Se utiliza **`TreeSet`**, que ordena automáticamente según `Comparable` (por DNI).

- Para acceder por posición:
  - Se convierte el conjunto ordenado en una **`List`**, ya que los `Set` no permiten acceso por índice.
  - Desde la lista, se puede obtener directamente el elemento deseado (`index 1` → segundo socio).

---
