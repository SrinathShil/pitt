package com.blog.mvc.data.services;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@PropertySource("classpath:config.properties")
public class RestCaller {
	@Autowired
RestTemplate template;
	@Value("${as.base_url}")	
	String BASE_URL;
	
public String getOnlyXML(){
		
		/*String BASE_URL="http://localhost:8181/cxf/chapter5/recipeThree";
		System.out.println("asass");
		HttpHeaders headers=new HttpHeaders();
		headers.setContentType(MediaType.APPLICATION_XML);
		HttpEntity<String> entity=new HttpEntity<String>(headers);
		
		ResponseEntity<String> data=template.exchange(BASE_URL,HttpMethod.GET ,entity ,String.class);
		System.out.println(data.getBody());
		System.out.println("asass");
		
		return data.getBody();*/
	BASE_URL="http://localhost:8181/cxf/c5/resp";
	/*System.out.println(BASE_URL);
	HttpHeaders headers = new HttpHeaders();
	headers.setAccept(Arrays.asList(MediaType.APPLICATION_XML));
	HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
    System.out.println("try");
	ResponseEntity<String> response = template.exchange(BASE_URL, HttpMethod.GET, entity, String.class);
	String responseBody = response.getBody();
    System.out.println("try");
	System.out.println(responseBody);
	return responseBody;*/
	
    
    RestTemplate restTemplate = new RestTemplate();
    String result = restTemplate.getForObject(BASE_URL, String.class);
    System.out.println(result);
    return result;
	}

public String getOnlyXML1(){
	
	/*String BASE_URL="http://localhost:8181/cxf/chapter5/recipeThree";
	System.out.println("asass");
	HttpHeaders headers=new HttpHeaders();
	headers.setContentType(MediaType.APPLICATION_XML);
	HttpEntity<String> entity=new HttpEntity<String>(headers);
	
	ResponseEntity<String> data=template.exchange(BASE_URL,HttpMethod.GET ,entity ,String.class);
	System.out.println(data.getBody());
	System.out.println("asass");
	
	return data.getBody();*/
BASE_URL="http://localhost:8181/cxf/helloapp/hello/greet";
/*System.out.println(BASE_URL);
HttpHeaders headers = new HttpHeaders();
headers.setAccept(Arrays.asList(MediaType.APPLICATION_XML));
HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
System.out.println("try");
ResponseEntity<String> response = template.exchange(BASE_URL, HttpMethod.GET, entity, String.class);
String responseBody = response.getBody();
System.out.println("try");
System.out.println(responseBody);
return responseBody;*/


RestTemplate restTemplate = new RestTemplate();
String result = restTemplate.getForObject(BASE_URL, String.class);
System.out.println(result);
return result;
}
}
