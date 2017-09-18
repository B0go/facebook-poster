package br.udesc.facebookposter.interactions;

import br.udesc.facebookposter.dtos.CreatedPostDto;

import feign.Feign;
import feign.Param;
import feign.RequestLine;
import feign.gson.GsonDecoder;
import feign.gson.GsonEncoder;

public interface FacebookClient {

	@RequestLine("POST /v2.10/me/feed?access_token={accessToken}&message={message}")
	CreatedPostDto post(@Param("accessToken") String accessToken, @Param("message") String message);

	static FacebookClient build() {
		return Feign.builder()
				.encoder( new GsonEncoder() )
				.decoder( new GsonDecoder() )
				.target( FacebookClient.class, "https://graph.facebook.com" );
	}
}
