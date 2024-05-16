package com.example.ragchatbot.model;

public class TextChunk {

    private String text;
    private int chunkId;

    public TextChunk(String text, int chunkId) {
        this.text = text;
        this.chunkId = chunkId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getChunkId() {
        return chunkId;
    }

    public void setChunkId(int chunkId) {
        this.chunkId = chunkId;
    }

    // Optionally, you can override the toString method to provide a string representation of the object
    @Override
    public String toString() {
        return "TextChunk{" +
                "text='" + text + '\'' +
                ", chunkId=" + chunkId +
                '}';
    }

    public void setEmbedding(Embedding embedding) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setEmbedding'");
    }
}
