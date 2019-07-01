package it.apasca.websocket.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import it.apasca.websocket.model.ChatMessage;
@Repository
public interface ChatMessageDao extends MongoRepository<ChatMessage, String> {

}
