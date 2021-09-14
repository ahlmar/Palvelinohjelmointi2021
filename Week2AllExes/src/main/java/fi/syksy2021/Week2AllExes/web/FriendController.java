package fi.syksy2021.Week2AllExes.web;

import java.util.ArrayList;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class FriendController {

	ArrayList<String> friends = new ArrayList<String>();
	
	@GetMapping("/friends")
	public String insertData(@RequestParam(name="friend", required = false) String friend, Model model) {

		if (friend != null && friend.length() >= 3) {
			friends.add(friend);
		}

		model.addAttribute("friends", friends);
		return "friendInfo";

	}
}
