![Duoc UC](https://www.duoc.cl/wp-content/uploads/2022/09/logo-0.png)
# 🧠 Semana 3 – Desarrollo Orientado a Objetos I

## 👤 Autor del proyecto
- **Nombre completo:** Vanessa Reyes González
- **Sección:** 004A
- **Carrera:** Analista Programador Computacional
- **Sede:** Virtual

---

## 📘 Descripción general del sistema
Sistema orientado a objetos en Java desarrollado para la agencia de turismo ficticia Llanquihue Tour (Región de Los Lagos). El proyecto modela a las personas vinculadas a la organización, aplicando encapsulamiento, composición y herencia, como base para una futura digitalización de sus procesos.

---

## 🧱 Estructura general del proyecto

```plaintext
📁 src/
├── app/         # Main.java, clase principal con el método main
├── model/       # Clases de dominio: Persona, Direccion, Empleado
````

---

## Clases implementadas
- **Persona**: clase base, representa los datos generales de cualquier persona vinculada a la agencia (nombre, apellidos, RUT, edad, dirección, contacto).
- **Direccion**: clase en relación de composición con `Persona` (una `Persona` tiene una `Direccion`).
- **Empleado**: clase que hereda de `Persona` (`extends`), agregando los atributos propios de un trabajador de la agencia (cargo, sueldo).

---

## ⚙️ Instrucciones para clonar y ejecutar el proyecto

1. Clona el repositorio desde GitHub:

```bash
git clone https://github.com/Vane-Reyes/Vanessa_Reyes_Sistema-Personas-LlanquihueTour_Semana3.git
```

2. Abre el proyecto en IntelliJ IDEA.

3. Ejecuta el archivo `Main.java`, ubicado en el paquete `app`.

4. La consola mostrará los datos de las personas y empleados creados.


---


**Repositorio GitHub:** https://github.com/Vane-Reyes/Vanessa_Reyes_Sistema-Personas-LlanquihueTour_Semana3.git

**Fecha de entrega:** 09/11/2026

---

© Duoc UC | Escuela de Informática y Telecomunicaciones | Actividad Sumativa Semana 3



