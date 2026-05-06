# 📘 Actividad 9: Conjuntos en Java

## 📌 Enunciado

- Crear una `List<Integer>` con 30 números aleatorios entre 1 y 100 (puede haber repetidos).
- Mostrar la lista.
- Eliminar duplicados usando:
  - `HashSet`
  - `TreeSet`
  - `LinkedHashSet`
- Mostrar cada conjunto resultante y explicar su orden.

---

## 🧠 Solución

En Java, los `Set` no permiten elementos duplicados, por lo que son ideales para eliminar repetidos de una lista.

- **HashSet**: elimina duplicados pero **no mantiene ningún orden** (basado en hash).
- **TreeSet**: elimina duplicados y **ordena automáticamente** los elementos (orden natural).
- **LinkedHashSet**: elimina duplicados y **mantiene el orden de inserción**.

Cada implementación ofrece un comportamiento distinto según la necesidad: rendimiento, ordenación o preservación del orden original.

---
