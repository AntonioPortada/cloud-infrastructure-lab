# v1-reverse-proxy - https
Ejercicios de configuración para el servidor nginx 

Voy a usar docker para hacer más rápido y fácil el ejercicio, usando la versión más actual de la imagen. Eventualmente llevaré la práctica a AWS en el servicio de EC2 primero con docker. Con el siguiente comando el servidor nginx estará listo.

``` bash
docker run --rm -p 80:80 -p 443:443 --name nginx nginx:stable-alpine3.23
```
- El flag `'--rm'` elimina el contener al cerrar el proceso o detener el contenedor.

Al abrir el navegador en `'localhost'` verás la bienvenida de nginx.

## Archivos de configuración
Las carpetas principales de configuracion están en `'/etc/nginx/conf.d'` los sitios que nginx va a proveer. Y `'/usr/share/nginx'` la respuesta a esos sitios, el html que va a devolver. Un ejemplo es la bienvenida de nginx.
Para los ejercicios voy a mapear estás carpetas a los paths para tener persistencia de las configuraciones.

En la raiz del proyecto voy a crear las siguientes carpetas `'backend'` y `'nginx'`, dentro de backend estará el archivo `'index.html'` y en la carpeta nginx estará `'default.conf'`. Estas carpetas van a ser para  diferentes contenedores mostrando el routing con `'proxy_pass'`

Después volvemos a ejecutar el contenedor con el volumen asignado a esa ruta y validamos que siga funcionando.

``` bash
docker run --rm -p 80:80 -p 443:443 \
-v ./v1-reverse-proxy/nginx/default.conf:/etc/nginx/conf.d/default.conf \
--network server-http \
--name nginx nginx:stable-alpine3.23
```

Agregamos el segundo contenedor para redireccionar y aplicar el proxy reverso. Primero validamos que este funcionando

``` bash
docker run --rm -p 81:80 -p 444:443 \
-v ./v1-reverse-proxy/backend:/usr/share/nginx/html \
--network server-http \
--name nginx nginx:stable-alpine3.23
```

Por último agregamos una red que fue previamente creada para interactuar entre servidores.

``` bash
docker network create server-http
```

Antes de la etiqueta '--name' en nuestro comando de docker agregamos lo siguiente:

``` bash
docker --network server-http
```