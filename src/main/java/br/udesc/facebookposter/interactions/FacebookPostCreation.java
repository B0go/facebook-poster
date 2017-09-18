package br.udesc.facebookposter.interactions;

import org.springframework.stereotype.Service;

import br.udesc.facebookposter.dtos.CreatedPostDto;
import br.udesc.facebookposter.dtos.PostDto;

@Service
public class FacebookPostCreation {

	public CreatedPostDto postToFacebook(String accessToken, PostDto post){
		return FacebookClient.build().post( accessToken, post.getMessage() );
	}
}
