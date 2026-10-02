# Estado de envíos a TMC

Actualizado: 2026-09-11 (America/New_York).

## Estado confirmado por Helsinki

- Parte 1: `Part01_01.Sandbox` a `Part01_37.GiftTax` están aceptados.
  Son los 37 ejercicios de la parte.
- Parte 2: `Part02_01.Squared` a
  `Part02_20.RepeatingBreakingAndRemembering` están aceptados.
- Estado remoto al cerrar la sesión: 57 ejercicios completados.
- Parte 2, ejercicios 21-34: pendientes. Los 14 fallan sus pruebas locales y
  no se enviaron.

## Correcciones necesarias durante el envío

- `Part01_01.Sandbox`: se envió al detectar que TMC todavía lo mostraba
  pendiente; Helsinki lo aceptó y concedió el punto `01-01`.
- `Part01_25.CheckYourIndentation`: se corrigió la sangría; Helsinki lo aceptó.
- `Part02_03.AbsoluteValue`: se cambió el cálculo de `double` a `int` para
  imprimir el valor absoluto con el formato requerido; Helsinki lo aceptó.
- `Part02_05.CarryOn`: se corrigieron la sangría y los espacios; Helsinki lo
  aceptó.

## Entorno de envío

- Soluciones fuente:
  `/home/walen/NetBeansProjects/mooc-java-programming-i`
- Copias oficiales descargadas por TMC:
  `/home/walen/TMCProjects/mooc-java-programming-i`
- Instalación aislada de TMCBeans:
  `/home/walen/.local/opt/tmcbeans-1.4.0`
- JDK compatible:
  `/home/walen/.local/opt/temurin-11`
- Perfil aislado:
  `/home/walen/.local/share/tmcbeans-mooc/userdir`

Los directorios `src/main` de la Parte 1 y de los ejercicios 01-20 de la Parte
2 se sincronizaron desde el repositorio hacia las copias oficiales. No se
reemplazaron los archivos de proyecto, las pruebas ni los metadatos de TMC.

## Siguiente paso

Corregir los ejercicios 21-34 de la Parte 2, ejecutar sus pruebas locales y
enviar únicamente los que pasen. La aceptación debe confirmarse con el estado
remoto de TMC; un resultado local por sí solo no cuenta como entrega.

## Seguridad

- No guardar credenciales ni tokens de TMC en el repositorio.
- No reenviar ejercicios ya aceptados salvo que sea necesario corregirlos.
- No marcar un ejercicio como enviado sin confirmación del servidor.
