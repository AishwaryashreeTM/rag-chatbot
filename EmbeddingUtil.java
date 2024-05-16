package com.example.ragchatbot.util;

import java.util.List;

import com.example.ragchatbot.model.Embedding;
import com.example.ragchatbot.model.TextChunk;

public class EmbeddingUtil {

    // This method generates embeddings for a list of text chunks
    public static List<TextChunk> generateEmbeddings(List<TextChunk> textChunks) {
        // Placeholder logic to generate embeddings for each text chunk
        // You would replace this with actual code to generate embeddings using an embedding model
        // For demonstration purposes, let's assume we generate random embeddings
        for (TextChunk textChunk : textChunks) {
            float[] randomEmbedding = generateRandomEmbedding();
            textChunk.setEmbedding(new Embedding(randomEmbedding));
        }
        return textChunks;
    }

    // Placeholder method to generate a random embedding vector
    private static float[] generateRandomEmbedding() {
        // Generate random values for the embedding vector
        // This is just for demonstration purposes; actual embedding generation would depend on your embedding model
        int embeddingSize = 300; // Assuming an embedding size of 300
        float[] embedding = new float[embeddingSize];
        for (int i = 0; i < embeddingSize; i++) {
            embedding[i] = (float) Math.random(); // Generate random value between 0 and 1
        }
        return embedding;
    }
}
