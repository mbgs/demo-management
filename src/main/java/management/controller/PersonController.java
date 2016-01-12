package management.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import management.dao.PersonDao;
import management.model.Person;

@Controller
@RequestMapping("/person")
public class PersonController {

	private static final Logger logger = LoggerFactory.getLogger(PersonController.class);

	@Autowired
	private PersonDao personDao;

	@RequestMapping(method = RequestMethod.GET, value = "/list")
	public @ResponseBody List<Person> listPeople() {
		logger.debug("Received request to list persons");
		List<Person> people = personDao.getPeople();
		logger.debug("Person Listing count = " + people.size());
		return people;

	}

	// @RequestMapping(method = RequestMethod.GET, value = "/edit")
	// public @ResponseBody String editPerson(@RequestParam(value = "id",
	// required = false) Long id) {
	// logger.debug("Received request to edit person id : " + id);
	// ModelAndView mav = new ModelAndView();
	// mav.setViewName("edit");
	// Person person = null;
	// if (id == null) {
	// person = new Person();
	// } else {
	// person = personDao.find(id);
	// }
	// mav.addObject("person", person);
	// return "edit-complete";
	//
	// }

	// @RequestMapping(method = RequestMethod.POST, value = "edit")
	// public @ResponseBody String savePerson(@ModelAttribute Person person) {
	// logger.debug("Received postback on person " + person);
	// personDao.save(person);
	// return "redirect:list";
	//
	// }

}
