/**
 * 
 */
package it.apasca.websocket.service;

import java.util.Date;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import it.apasca.websocket.dao.ChatMessageDao;
import it.apasca.websocket.dao.UserDao;
import it.apasca.websocket.model.ChatMessage;
import it.apasca.websocket.model.User;

/**
 * @author B.Conetta
 *
 */
@Service
public class ChatMessageServiceImpl implements ChatMessageService {
	
	@Autowired
	private ChatMessageDao chatMessageDao;
	@Autowired
	private UserDao userdao;

	@Override
	public String save(ChatMessage chatMessage) {
		chatMessage.setTimestamp(new Date());
		chatMessage = chatMessageDao.save(chatMessage);
		return chatMessage.getId();
	}

	@Override
	public String addUser(User user) throws Exception {
		User exampleUser = new User();
		if (user == null || user.getName().isEmpty()) {
			throw new IllegalArgumentException("could not save invalid user");
		}
		if(userdao.exists(Example.of(exampleUser))) {
			throw new IllegalArgumentException("user ".concat(user.getName()).concat(" already exist"));
		}
		user.setCreationDate(new Date());
		user = userdao.save(user);
		return user.getId();
	}

	@Override
	public User updateUser(String id, User user) throws Exception {
		Optional<User> userOpt = userdao.findById(id);
		if (!userOpt.isPresent()) {
			throw new Exception("user con id ".concat(user.getId()).concat(" not found"));
		}
		user.setLastUpdate(new Date());
		return userdao.save(user);
	}

	@Override
	public void removeUser(String id) throws Exception {
		userdao.deleteById(id);
	}

}
