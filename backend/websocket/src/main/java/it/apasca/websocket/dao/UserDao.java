/**
 * 
 */
package it.apasca.websocket.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import it.apasca.websocket.model.User;

/**
 * @author B.Conetta
 *
 */
@Repository
public interface UserDao  extends MongoRepository<User, String>{

}
