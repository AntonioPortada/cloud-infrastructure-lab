# v2-docker-networking

En está siguiente versión voy a agregar varios sitios para que nginx se encargue de redireccionar a cada uno. Ejemplo: '/app', '/bienvenida', cada uno tendrá una respuesta diferente.

También se verá el networking de docker usando el nombre de servicio de cada contenedor.

Una vez tengo los archivos `default.conf` y las carpetas app y bienvenida con sus respectivos `index.html`, ejecutamos con el siguiente comando:

```bash
docker-compose up
```

Después visitando las páginas '/app' y '/bienvenida' tendrémos la respuesta de cada index.


