/**
 * 
 */
package ar.com.endava.feign;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import ar.com.endava.feign.model.Post;
import ar.com.endava.feign.service.PostClient;

/**
 * @author treynoso
 *
 */
@RestController
public class DemoTestController {
	
	@Autowired
	PostClient postClient;
	
	@GetMapping(path = "/post")
	public List<Post> getAllPostFromClient(){
		return postClient.getAll();
	}

}
