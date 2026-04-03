# Serie de laboratorio de infraestructura en la nube

Laboratorios prácticos progresivos para aprender y documentar conceptos de infraestructura en la nube utilizando prácticas de Nginx, Docker y DevOps.

Este repositorio se construye de forma incremental. Cada versión introduce un nuevo concepto de infraestructura.

---

## 🎯 Objetivo

El objetivo de este proyecto es:

- Aprender infraestructura en la nube paso a paso
- Documentar experimentos prácticos reales
- Construir un portafolio progresivo de DevOps
- Crear plantillas de infraestructura reutilizables
- Mantener una referencia de conocimiento personal

---

## 📈 Progresión

- [x] v1 — Reverse Proxy + HTTP  
- [x] v2 — Docker + Múltiples Servicios  
- [ ] v3 — Angular + Spring Boot Containers  
- [ ] v4 — Deploy en AWS (EC2)  
- [ ] v5 — Integración con Amazon DynamoDB  
- [ ] v6 — HTTPS + Certificados SSL  
- [ ] v7 — CI/CD Pipeline  
- [ ] v8 — Zero Downtime / Blue-Green Deploy  

---

## 🧩 Evolución de la arquitectura

### v1
Cliente → Nginx → Servicio

### v2
Cliente → Nginx → Múltiples Servicios Docker

### v3 (Planeado)
Cliente → Nginx → Angular → Backend API

### v4 (Planeado)
Internet → EC2 → Nginx → Contenedores

### v5 (Planeado)
Internet → EC2 → Backend → DynamoDB

---

## 🧠 Aprendizajes clave

- Configuración de reverse proxy
- Redes Docker
- Arquitectura multi-contenedor
- Descubrimiento de servicios
- Enrutamiento Nginx
- Containerización de frontend y backend
- Deploy en AWS
- Integración con servicios gestionados
- Configuración HTTPS
- Automatización CI/CD

---

## 🔖 Versiones

### v1 — Reverse Proxy + HTTP
Configuración básica de proxy inverso nginx usando docker.

Carpeta: `/v1-reverse-proxy`

---

### v2 — Docker + Múltiples Servicios
Arquitectura multi-servicio conectada a través de red Docker.

Carpeta: `/v2-docker-networking`

---

### v3 — Angular + Spring Boot Containers (Planeado)
- Frontend Angular containerizado
- Backend Spring Boot containerizado
- Docker multi-stage builds
- Comunicación entre servicios

---

### v4 — Deploy en AWS (Planeado)
- Instancia EC2
- Ejecución de docker-compose en cloud
- Configuración de security groups

---

### v5 — Integración con Amazon DynamoDB (Planeado)
- Backend conectado a DynamoDB
- Uso de credenciales AWS
- Persistencia cloud nativa

---

### v6 — HTTPS + Certificados SSL (Planeado)
- Configuración HTTPS en Nginx
- Certificados SSL
- Redirección HTTP → HTTPS

---

### v7 — CI/CD Pipeline (Planeado)
- Build automático
- Deploy automático
- Pipeline reproducible

---

### v8 — Zero Downtime / Blue-Green Deploy (Planeado)
- Estrategia Blue/Green
- Balanceo de carga
- Deploy sin interrupciones

---

## 📌 Notas

Este repositorio se actualiza continuamente como parte de una ruta personal de aprendizaje de infraestructura en la nube.  
Cada versión agrega un nuevo concepto y mejora la arquitectura progresivamente.