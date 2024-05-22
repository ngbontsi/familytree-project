# Spring Boot and React Dashboard Application

This project consists of a Spring Boot back-end and a React front-end. The back-end manages a database of persons and provides RESTful APIs to perform CRUD operations. The front-end is a simple dashboard that allows users to interact with the back-end through a user-friendly interface.

## Prerequisites

- Docker Desktop (with Kubernetes enabled)
- Node.js and npm
- kubectl

## Project Structure

├── backend
│ ├── src
│ ├── Dockerfile
│ └── pom.xml
├── frontend
│ ├── src
│ ├── Dockerfile
│ └── package.json
├── backend-deployment.yaml
└── frontend-deployment.yaml


## Getting Started

### Step 1: Set Up the Backend

1. Navigate to the backend directory:

    ```bash
    cd backend
    ```

2. Build the Docker image for the back-end:

    ```bash
    docker build -t your-dockerhub-username/your-backend .
    ```

3. Push the Docker image to Docker Hub:

    ```bash
    docker push your-dockerhub-username/your-backend
    ```

### Step 2: Set Up the Frontend

1. Navigate to the frontend directory:

    ```bash
    cd frontend
    ```

2. Install dependencies:

    ```bash
    npm install
    ```

3. Build the Docker image for the front-end:

    ```bash
    docker build -t your-dockerhub-username/your-frontend .
    ```

4. Push the Docker image to Docker Hub:

    ```bash
    docker push your-dockerhub-username/your-frontend
    ```

### Step 3: Deploy to Kubernetes

1. Apply the backend deployment and service:

    ```bash
    kubectl apply -f ../backend-deployment.yaml
    ```

2. Apply the frontend deployment and service:

    ```bash
    kubectl apply -f ../frontend-deployment.yaml
    ```

3. Check the status of your services:

    ```bash
    kubectl get services
    ```

4. Note the external IP addresses for both the frontend and backend services.

### Step 4: Access the Application

1. Open your browser and navigate to the external IP address of the frontend service.

## CRUD Operations

### Create a Person

1. Click the "Add Person" button on the dashboard.
2. Fill in the form with the person's details.
3. Click "Submit".

### Read (View) Persons

1. The dashboard will automatically fetch and display all persons from the back-end.

### Update a Person

1. Click the "Edit" button next to a person's entry.
2. Modify the details in the form.
3. Click "Submit".

### Delete a Person

1. Click the "Delete" button next to a person's entry.

## Development

### Running Locally

#### Backend

1. Navigate to the backend directory and run:

    ```bash
    mvn spring-boot:run
    ```

2. Ensure the backend is running on `http://localhost:8080`.

#### Frontend

1. Navigate to the frontend directory and run:

    ```bash
    npm start
    ```

2. Open your browser and navigate to `http://localhost:3000`.

### Updating Kubernetes Deployments

1. If you make changes to your code, rebuild the Docker images and push them to Docker Hub.
2. Update the Kubernetes deployments:

    ```bash
    kubectl rollout restart deployment backend
    kubectl rollout restart deployment frontend
    ```

## Additional Notes

- Ensure CORS is configured on the backend to allow requests from the frontend.
- This setup is intended for local development and testing. For production deployments, consider using a more robust setup with persistent storage, logging, monitoring, and security best practices.

## Contributing

Contributions are welcome! Please open an issue or submit a pull request with your changes.

## License

This project is licensed under the MIT License.


