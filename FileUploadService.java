package com.example.ragchatbot.service;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class FileUploadService {

    public void processText(String text) {
        // Convert text into chunks and generate embeddings
        // Store embeddings in the vector database
    }

    public void processFile(MultipartFile file) {
        // Convert file into text, then into chunks
        // Generate embeddings for each chunk
        // Store embeddings in the vector database
    }
}
