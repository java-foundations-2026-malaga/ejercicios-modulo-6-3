# JFo 6.3 - Uso de las sentencias break y continue

Esta carpeta contiene 15 actividades autocorregibles.

## Actividades

01. Corrige un break fuera de un bucle
02. Corrige una suma que incluye el centinela
03. Corrige un continue que provoca bucle infinito
04. Corrige un programa que debería omitir el número 4
05. Corrige un programa que debería detenerse en 7
06. Suma hasta introducir 0
07. Suma hasta introducir 999
08. Imprime números del 0 al 9 excepto el 4
09. Suma del 1 al 99 omitiendo múltiplos de 10
10. Cuenta caracteres w en una cadena
11. Imprime solo números impares hasta 7
12. Busca el primer número negativo
13. Filtra notas inválidas
14. Simula toma de fotografías con visibilidad
15. Añade comentarios explicativos a un buscador de divisores

Cada subcarpeta `actividadNN` es un proyecto Maven independiente con tests JUnit 5 y workflow de GitHub Actions.

## Cómo entregar las actividades

La rama `main` está protegida: contiene los enunciados originales y no se puede modificar.
Cada alumno trabaja en **su propia rama**, con su nombre.

1. Clona el repositorio:
   `git clone https://github.com/java-foundations-2026-malaga/REPOSITORIO.git`
2. Crea tu rama con tu nombre y apellido, en minúsculas y sin tildes ni espacios (por ejemplo `juan-perez`):
   `git checkout -b juan-perez`
   (En Eclipse: botón derecho sobre el proyecto > `Team > Switch To > New Branch...`).
3. Importa en Eclipse la carpeta `actividadNN` que vayas a hacer (`File > Import... > Maven > Existing Maven Projects`), resuélvela y comprueba los tests con `Run As > JUnit Test`.
4. Haz commit y sube **tu rama**:
   `git add .` → `git commit -m "Actividad NN"` → `git push -u origin juan-perez`
   (En Eclipse: `Git Staging` > `Commit and Push...`).
5. En la pestaña **Actions** del repositorio verás el resultado de la autocorrección de cada actividad que hayas modificado: ✅ aprobada o ❌ con los errores.

Si al hacer push te aparece un error sobre `main`, es que estás en la rama equivocada: cambia a tu rama con `git checkout juan-perez`.
