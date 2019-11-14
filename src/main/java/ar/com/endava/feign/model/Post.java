/**
 * 
 */
package ar.com.endava.feign.model;

import java.io.Serializable;

import lombok.Data;

/**
 * @author treynoso
 *
 */
@Data
public class Post implements Serializable{
 
	/**  */
	private static final long serialVersionUID = -3063496151898317256L;

	private Integer userId;
 
	private Integer id;
 
	private String title;
 
	private String body;
	
	
	
	
	
}