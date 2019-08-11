package co.grandcircus.recipeAPI;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpHeaders;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
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

	public SearchResponse search(String keyword, Integer calories, String preference) {

		String url = "https://api.edamam.com/search" + "?&app_id=648e9787&app_key=c89390753239eaff50f4d02bdc22eb63"
				+ (StringUtils.isEmpty(keyword) ? "" : "&q=" + keyword)
				+ (StringUtils.isEmpty(calories) ? "" : "&calories=" + calories)
				+ (StringUtils.isEmpty(preference) ? "" : "&diet=" + preference);
		SearchResponse searchResponse = null;
		try {
			searchResponse = restTemplate.getForObject(url, SearchResponse.class);
		} catch (Exception ex) {
			System.err.println(ex.getMessage());
		}
		return searchResponse;
	}
}
