# 📦 11. Gestión de stock de repuestos

## 📌 Enunciado

Se debe implementar un sistema de gestión de almacén para una tienda de repuestos de automóviles.

El sistema almacenará productos utilizando una estructura de tipo **clave-valor**, donde:

- **Clave:** Código del producto (por ejemplo: `"BUJ-001"`)
- **Valor:** Unidades en stock (por ejemplo: `50`)

El sistema debe garantizar que los productos estén siempre **ordenados alfabéticamente por el código del producto**.

---

## ⚙️ Funcionalidad requerida

Se debe implementar un menú interactivo con las siguientes opciones:

### ➕ Alta de producto

- Solicita el código del producto.
- Solicita el stock inicial.
- Añade el producto al sistema.
- Si el código ya existe, debe mostrarse un mensaje de advertencia y no sobrescribir el valor existente.

---

### ➖ Baja de producto

- Solicita el código del producto.
- Elimina el producto del sistema si existe.

---

### 🔄 Actualizar stock

- Solicita el código del producto.
- Solicita el nuevo valor de stock.
- Sustituye el valor anterior por el nuevo.

---

### 📋 Listar existencias

- Muestra todos los productos almacenados.
- Se debe mostrar cada código junto con sus unidades en stock.
- Los productos deben aparecer **ordenados alfabéticamente por el código**.

---

### 🚪 Salir

- Finaliza la ejecución del programa.

---

## 📊 Requisitos del sistema

- Los productos se almacenan en una estructura de tipo clave-valor.
- No se permiten códigos duplicados.
- El listado siempre debe mantenerse ordenado por clave.
- Las operaciones deben reflejarse inmediatamente en la estructura de datos.

---
