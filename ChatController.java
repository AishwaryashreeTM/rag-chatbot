package com.example.ragchatbot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/chat")
public class ChatController {

    @Autowired
    private Retriever retriever;

    @Autowired
    private LanguageModel languageModel;

    @PostMapping("/query")
    public String processQuery(@RequestBody String query) {
        // Retrieve relevant passages from the knowledge base
        List<String> passages = retriever.retrieve(query);

        // Generate a response using the language model
        String response = languageModel.generateResponse(query, passages);

        return response;
    }

    public ResponseEntity<String> chat(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'chat'");
    }
}