/**
 * 
 */
package it.apasca.websocket.model;

import java.util.Date;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author B.Conetta
 *
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder=true)
public class User {
	@Id
	private String id;
	
	private String name;
	private Boolean isOnline;
	private Date creationDate;
	private Date lastUpdate;
	
}
