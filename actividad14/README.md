# JFo 6.3 - Actividad 14

## Simula toma de fotografías con visibilidad

Omite visibilidad cero y termina si se rompe la cámara.

Recorre el array `visibility`; las posiciones se numeran desde 1. Al llegar a la posición `brokenAt` la cámara se rompe: muestra `Cámara rota en posición N` y termina con `break`. Si la visibilidad es 0, salta la posición con `continue`; si no, muestra `Foto tomada en posición N`.

## Objetivo

- Leer el código base y corregirlo o completarlo.
- Ejecutar el programa y comprobar el resultado.
- Ejecutar los tests JUnit para confirmar la autocorrección.
- Hacer `git add`, `git commit` y `git push`.

## Salida esperada

```text
Foto tomada en posición 1
Foto tomada en posición 3
Foto tomada en posición 4
Cámara rota en posición 6
```

## Instrucciones para Eclipse

1. Importa este proyecto como proyecto Maven.
2. Abre `src/main/java/modulo6_3_actividad14/Actividad14.java`.
3. Corrige o completa el código.
4. Ejecuta `Run As > Java Application`.
5. Ejecuta `Actividad14Test.java` con `Run As > JUnit Test`.
6. Haz commit y push cuando la actividad funcione.

## GitHub Actions

- Sube tu trabajo a **tu rama** (no a `main`): el workflow `Autocorrección` compila y ejecuta los tests de cada actividad que hayas modificado.
- En la pestaña **Actions** del repositorio verás ✅ si la actividad está aprobada o ❌ si hay errores de compilación o tests que fallan.
