# Docker Setup Documentation

This document outlines the steps for deploying the application using Docker and Docker Compose.

## Prerequisites
- Ensure you have [Docker](https://docs.docker.com/get-docker/) installed.
- Ensure you have [Docker Compose](https://docs.docker.com/compose/install/) installed.

## Setting Up Docker

1. **Clone the repository**:
   ```bash
   git clone https://github.com/divyesh303/loan-application-backend.git
   cd loan-application-backend
   ```

2. **Create a `docker-compose.yml` file** in the root of the project with the following content:
   ```yaml
   version: '3.8'

   services:
     app:
       image: loan-application-backend:latest
       build:
         context: .
         dockerfile: Dockerfile
       ports:
         - "8080:8080"
       environment:
         - DATABASE_URL=mongodb://mongo:27017/loan_app
       depends_on:
         - mongo

     mongo:
       image: mongo:latest
       ports:
         - "27017:27017"
       volumes:
         - mongo_data:/data/db

   volumes:
     mongo_data:
   ```

3. **Build and start the services**:
   ```bash
   docker-compose up --build
   ```

4. **Access the application**:
   Open your web browser and navigate to `http://localhost:8080`.

## Stopping Services
To stop the running services, use:
```bash
docker-compose down
```

## Conclusion
With this setup, you should be able to deploy the loan application service locally using Docker and Docker Compose. 

For further configurations and optimizations, please refer to the respective service documentation.