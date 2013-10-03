package ma.jackson.example;

import java.io.IOException;

import ma.jackson.example.domain.User;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public class Example {
	public static void main(String[] args) {
		String in = "{\"name\":\"achraf\",\"age\":\"29\",\"sexe\":\"M\"}";
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			User readValue = objectMapper.readValue(in, User.class);
			System.out.println(readValue);
		} catch (JsonParseException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
