# Loan Application Backend

## Setup Instructions

1. **Clone the Repository**  
   Clone the repository to your local machine using the following command:
   ```bash
   git clone https://github.com/divyesh303/loan-application-backend.git
   cd loan-application-backend
   ```

2. **Install Dependencies**  
   Navigate to the project directory and install the necessary dependencies. If you are using Node.js, you can run:
   ```bash
   npm install
   ```

3. **Configure Environment Variables**  
   Create a `.env` file in the root of the project and provide the required environment variables. You can use `.env.example` as a reference.

4. **Start the Application**  
   Run the application using the following command:
   ```bash
   npm start
   ```
   The application should now be running on `http://localhost:3000`.

## API Examples

### 1. Create a Loan Application

**Endpoint:**  `/api/loans`

**Method:**  `POST`

**Request Body:**  
```json
{
    "borrowerName": "John Doe",
    "amount": 50000,
    "term": 36,
    "interestRate": 5.5
}
```

**Response:**  
- **201 Created**  
```json
{
    "id": "12345",
    "status": "Application Created"
}
```

### 2. Get Loan Application Status

**Endpoint:**  `/api/loans/{id}`

**Method:**  `GET`

**Response:**  
- **200 OK**  
```json
{
    "id": "12345",
    "status": "Under Review"
}
```

### 3. Update Loan Application

**Endpoint:**  `/api/loans/{id}`

**Method:**  `PUT`

**Request Body:**  
```json
{
    "status": "Approved"
}
```

**Response:**  
- **200 OK**  
```json
{
    "status": "Application Updated"
}
```

### 4. Delete Loan Application

**Endpoint:**  `/api/loans/{id}`

**Method:**  `DELETE`

**Response:**  
- **204 No Content**  

## Conclusion

This README provides a basic overview of setting up the Loan Application Backend and examples of how to interact with its API.
