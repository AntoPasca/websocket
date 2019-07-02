package it.apasca.websocket.model;

import java.util.Date;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter 
@NoArgsConstructor 
@AllArgsConstructor 
@Builder(toBuilder=true)
public class ChatMessage {
	@Id
	private String id;
    private MessageType type;
    private String content;
    private String sender;
    private Date timestamp;
    
    public enum MessageType {
        CHAT,
        JOIN,
        LEAVE
    }
}
