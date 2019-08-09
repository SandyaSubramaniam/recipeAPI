package co.grandcircus.recipeAPI;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.http.HttpHeaders;
import org.springframework.http.client.ClientHttpRequestInterceptor;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import co.grandcircus.generatedpojos.SearchResponse;

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

	/*
	 * public List<Recipe> searchRecipes() {
	 * 
	 * // 1. Select the API endpoint URL String app_id = "648e9787"; String app_key
	 * = "c89390753239eaff50f4d02bdc22eb63"; String url =
	 * (StringUtils.isEmpty(criteria) ? "" : "https://api.edamam.com/search?q=" +
	 * app_id + app_key; // 2. Get the entire response from the API. RecipeResponse
	 * response = restTemplate.getForObject(url, RecipeResponse.class); // 3.
	 * Optionally dig into the response and return only the part you need. return
	 * response. }
	 */
	public SearchResponse search(String criteria) {

		String url = "https://api.edamam.com/search" + "?&app_id=648e9787" + "&app_key=c89390753239eaff50f4d02bdc22eb63"
				+ "&q=" + criteria;
		return restTemplate.getForObject(url, SearchResponse.class);
	}
}
