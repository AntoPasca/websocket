/**
 * 
 */
package it.apasca.websocket.service;

import it.apasca.websocket.model.ChatMessage;
import it.apasca.websocket.model.User;

/**
 * @author B.Conetta
 *
 */
public interface ChatMessageService {
	/*
	 * Salva un messaggio sul db
	 * @Return: id del record
	 */
	public String save(ChatMessage chatMessage);

	/*
	 * aggiungi un utente sul db
	 * @Return: id del record
	 */
	public String addUser(User user) throws Exception;
	
	/*
	 * aggiorna utente sul db
	 * @Return: utente aggiornato
	 */
	public User updateUser(String id, User user) throws Exception;
	
	/*
	 * elimina un utente dal db
	 * @Return: void
	 */
	public void removeUser(String id) throws Exception;
	
}
