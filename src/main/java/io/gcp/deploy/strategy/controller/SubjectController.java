package io.gcp.deploy.strategy.controller;

import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SubjectController {

	@RequestMapping("/subjects")
	public List<String> getSubjects() {
		List<String> al = new ArrayList<>();
		al.add("Hindi");
		al.add("Punjabi");
		al.add("Korean");
		return al;
	}
}
