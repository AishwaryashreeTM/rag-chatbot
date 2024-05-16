package com.example.ragchatbot.repository;

import javax.websocket.Decoder.Text;

// TextRepository.java


import org.springframework.stereotype.Repository;

@Repository
public interface TextRepository extends JpaRepository<Text, Long> {

    // Additional custom query methods can be defined here if needed

}
