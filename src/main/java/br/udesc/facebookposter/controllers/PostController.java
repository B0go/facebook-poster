package br.udesc.facebookposter.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.udesc.facebookposter.dtos.CreatedPostDto;
import br.udesc.facebookposter.dtos.PostDto;
import br.udesc.facebookposter.interactions.FacebookPostCreation;

@RestController
@RequestMapping(produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
public class PostController {

	@Autowired
	private FacebookPostCreation facebookPostCreation;

	@RequestMapping(method= RequestMethod.POST, value = "/users/{userId}/posts")
	public CreatedPostDto postToFacebook(@RequestHeader(value="X-Auth") String accessToken, @RequestBody PostDto postDto){
		return facebookPostCreation.postToFacebook( accessToken, postDto );
	}
}
