package com.example.ragchatbot.model;

public class Embedding {

    private float[] vector;

    public Embedding(float[] vector) {
        this.vector = vector;
    }

    public float[] getVector() {
        return vector;
    }

    public void setVector(float[] vector) {
        this.vector = vector;
    }

    // Optionally, you can override the toString method to provide a string representation of the object
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Embedding{ vector=[");
        for (int i = 0; i < vector.length; i++) {
            sb.append(vector[i]);
            if (i < vector.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("] }");
        return sb.toString();
    }
}
