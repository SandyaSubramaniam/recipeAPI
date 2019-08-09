package co.grandcircus.recipeAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.recipeAPI.entities.SearchResponse;

@Controller
public class RecipeAPIController {

	@Autowired
	ApiService apiService;

	@RequestMapping("/")
	public ModelAndView showHome() {

		return new ModelAndView("redirect:/search");
	}

	@RequestMapping("/search")
	public ModelAndView showSearch() {

		return new ModelAndView("search");
	}

	@RequestMapping("/search-response")
	public ModelAndView showSearchResponse(@RequestParam("label") String criteria) {

		System.out.println("GETsearch response page");
		System.out.println(criteria);
		return new ModelAndView("searchResponse");
	}

	@PostMapping("/search-response")
	public ModelAndView submitSearchResponse(@RequestParam("label") String criteria) {

		System.out.println("POSTsearch response page");
		SearchResponse searchResponse = apiService.search(criteria);
		System.out.println("search response page");
		System.out.println(searchResponse);
		return new ModelAndView("searchResponse", "response", searchResponse);
	}
}
