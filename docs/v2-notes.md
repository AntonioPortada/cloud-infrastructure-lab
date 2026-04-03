# v2-docker-networking

En está siguiente versión voy a agregar varios sitios para que nginx se encargue de redireccionar a cada uno. Ejemplo: '/app', '/bienvenida', cada uno tendrá una respuesta diferente.

También se verá el networking de docker usando el nombre de servicio de cada contenedor.

Una vez tengo los archivos `default.conf` y las carpetas app y bienvenida con sus respectivos `index.html`, ejecutamos con el siguiente comando:

```bash
docker-compose up
```

Después visitando las páginas '/app' y '/bienvenida' tendrémos la respuesta de cada index.


### Nota

Hay que tener en cuenta que cuando se ejecutan por separado los contenedores, la forma de comunicarse es diferente, dado que simulan estar en diferentes redes y por nombre no se encuentran.

La siguiente es la forma correcta de buscar otro contenedor. El archivo `'default.conf'` se vería de la siguiente manera.

```
location /app {
  proxy_pass http://host.docker.internal:80
}
``` 

Es importante mencionar que si no use el `'-d'` al final del comando de `docker-compose`, la terminal seguira mostrando el log de los servicios. 

Para aplicar cambios realizados al contenedor de nginx con la terminal mostrando el log, usaré el siguiente comando: 

```bash
docker-compose exec nginx nginx -s reload
```