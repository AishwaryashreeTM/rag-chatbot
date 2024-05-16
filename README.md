# rag-chatbot

This project implements a basic RAG (Retrieval-Augmented Generation) model AI chatbot using Java for the backend, and HTML/CSS/JS for the frontend. The chatbot provides functionalities for uploading documents or text for training the RAG model and interacting with users through a basic chat interface.

## Features

- **Upload Documents or Text:** Users can upload documents or text to train the RAG model. Text is converted into chunks and embeddings, which are then stored in a vector database.
- **Chat Interface:** Users can interact with the chatbot through a simple chat interface. The chatbot uses prompt engineering to generate responses from a language model.

## Backend (Java)

The backend is implemented in Java and uses Spring Boot for building RESTful APIs. It consists of the following components:

- **FileUploadController:** Handles API endpoints for uploading documents or text.
- **ChatController:** Handles API endpoint for user queries and generates responses.

## Frontend (HTML/CSS/JS)

The frontend provides a basic user interface for interacting with the chatbot. It includes HTML, CSS, and JavaScript files for:

- **File Upload Page:** Allows users to upload documents or text for training the RAG model.
- **Chat Interface:** Provides a chat interface where users can send messages and receive responses from the chatbot.

## Getting Started

To run the project locally, follow these steps:

1. Clone the repository to your local machine.
2. Navigate to the project directory.
3. Run the backend Java application.
4. Open the frontend HTML files in a web browser.

## Dependencies

- Java 11
- Spring Boot 2.6.3
- HTML/CSS/JS
- JUnit 4.13.2 (for testing)
- Mockito 3.12.4 (for testing)

## Contributing

Contributions to the project are welcome! If you find any issues or have suggestions for improvements, feel free to open an issue or submit a pull request.

