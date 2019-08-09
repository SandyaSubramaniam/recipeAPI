package co.grandcircus.recipeAPI;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.recipeAPI.entities.Hit;

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
		List<Hit> hits = apiService.search(criteria);
		System.out.println("search response page");
		System.out.println(hits);
		return new ModelAndView("searchResponse", "response", hits);
	}
}
