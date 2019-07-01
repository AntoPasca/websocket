/**
 * 
 */
package it.apasca.websocket.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.apasca.websocket.dao.ChatMessageDao;
import it.apasca.websocket.model.ChatMessage;

/**
 * @author B.Conetta
 *
 */
@Service
public class ChatMessageServiceImpl implements ChatMessageService {
	
	@Autowired
	private ChatMessageDao chatMessageDao;

	@Override
	public String save(ChatMessage chatMessage) {
		chatMessage = chatMessageDao.save(chatMessage);
		return chatMessage.getId();
	}

}
