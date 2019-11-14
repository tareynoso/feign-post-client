package ar.com.endava.feign;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import ar.com.endava.feign.model.Post;
import ar.com.endava.feign.service.PostClient;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class DemoApplicationTests {

	@Autowired
	private PostClient postClient;

	@Test
	@DisplayName("Should be equal")
	void shouldBeEqual() {
		final List<Post> posts = postClient.getAll();
		assertNotNull(posts);
    }
	 

}
