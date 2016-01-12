package management.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import management.bean.rest.RqLogin;
import management.model.ILoginModel;

@RestController
public class HomeController {

	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

	@Autowired
	private ILoginModel loginModel;

	@RequestMapping(value = "/", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody Boolean home() {
		RqLogin request = new RqLogin();
		request.setPassword("pippo");
		request.setUser("pippo");
		logger.info("Welcome home!");
		Boolean response = loginModel.controlloLogin(request);
		return response;
	}

}
