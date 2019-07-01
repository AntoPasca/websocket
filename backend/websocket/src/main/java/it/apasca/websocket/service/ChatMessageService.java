/**
 * 
 */
package it.apasca.websocket.service;

import it.apasca.websocket.model.ChatMessage;

/**
 * @author B.Conetta
 *
 */
public interface ChatMessageService {
	/*
	 * Salva un messaggio sul db
	 * 
	 */
	public String save(ChatMessage chatMessage);

}
