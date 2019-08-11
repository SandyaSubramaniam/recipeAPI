package co.grandcircus.recipeAPI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.ObjectUtils;
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
	public ModelAndView showSearchResponse(@RequestParam("label") String label) {

		return new ModelAndView("searchResponse");
	}

	@PostMapping("/search-response")
	public ModelAndView submitSearchResponse(@RequestParam("label") String keyword,
			@RequestParam(value = "calories", required = false) Integer calories,
			@RequestParam(value = "diet", defaultValue = "") String preference) {

		ModelAndView mv = new ModelAndView("searchResponse");
		SearchResponse response = apiService.search(keyword, calories, preference);
		System.out.println(response);
		if (response != null && !ObjectUtils.isEmpty(response.getHits())) {
			mv.addObject("response", response);
		} else {
			mv.addObject("error", "Sorry, no recipes available for this selection.");
		}
		return mv;
	}

	@RequestMapping("/details")
	public ModelAndView showDetails(@RequestParam("label") String label) {

		return new ModelAndView("details");
	}
}
