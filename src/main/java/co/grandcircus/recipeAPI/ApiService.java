package co.grandcircus.recipeAPI;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpHeaders;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import co.grandcircus.recipeAPI.entities.SearchResponse;

@Component
public class ApiService {

	private RestTemplate restTemplate;
	{
		ClientHttpRequestInterceptor interceptor = (request, body, execution) -> {
			request.getHeaders().add(HttpHeaders.USER_AGENT, "Spring");
			return execution.execute(request, body);
		};
		restTemplate = new RestTemplateBuilder().additionalInterceptors(interceptor).build();
	}

	public SearchResponse search(String criteria) {

		String url = "https://api.edamam.com/search" + "?&app_id=648e9787" + "&app_key=c89390753239eaff50f4d02bdc22eb63"
				+ "&q=" + criteria;
		return restTemplate.getForObject(url, SearchResponse.class);
	}
}
