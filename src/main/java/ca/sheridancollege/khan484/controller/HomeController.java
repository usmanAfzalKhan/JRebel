package ca.sheridancollege.khan484.controller;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import ca.sheridancollege.khan484.beans.Player;

@Controller
public class HomeController {

	static ArrayList<Player> players = new ArrayList();

	@GetMapping("/") // localhost:8080
	public String gohomePage() {
		return "rootpage.html";
	}

	@GetMapping("/add")
	public String loadAddPlayer(Model model) {
		model.addAttribute("player", new Player());
		return "addplayer.html";
	}

	@PostMapping("/add")
	public String savePlayer(@ModelAttribute Player player, Model model) {
		// System.out.println(player);
		// model.addAttribute("Player", new Player());
		players.add(player);

		return "redirect:/add";

	}

	@GetMapping("/view")
	public String viewPlayer(Model model) {
		model.addAttribute("myplayers", players);
		return "viewplayer.html";
	}
}
