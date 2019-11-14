/**
 * 
 */
package ar.com.endava.feign.service;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ar.com.endava.feign.model.Post;

/**
 * @author treynoso
 *
 */
@FeignClient(name="posts", url="https://jsonplaceholder.typicode.com")
//@FeignClient(name="posts", url="${externalServer.url}")
public interface PostClient {
 
    @RequestMapping(method = RequestMethod.GET, value = "/posts")
    List<Post> getAll();
	
}
