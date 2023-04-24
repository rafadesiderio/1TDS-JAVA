package br.com.fiap.services;

import java.io.IOException;

import org.apache.http.HttpEntity;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;

import com.google.gson.Gson;

import br.com.fiap.models.Planeta;

public class StarWarsService {
	
public Planeta getPlaneta(String p) throws ClientProtocolException, IOException {
		
		Planeta planeta =null;
		
		HttpGet request = new HttpGet("https://swapi.dev/api/planets/" + p);
		
		CloseableHttpClient httpClient = HttpClientBuilder.create()
				.disableRedirectHandling().build();
		
		CloseableHttpResponse response = httpClient.execute(request);
		
		HttpEntity entity = response.getEntity();
		
		if (entity != null) {
			String result = EntityUtils.toString(entity);
			
			Gson gson = new Gson();
			
			planeta = gson.fromJson(result, Planeta.class);
		}	
		
		return planeta;
	}
}
