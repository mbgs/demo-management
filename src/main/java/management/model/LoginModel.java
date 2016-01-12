package management.model;

import org.springframework.stereotype.Component;

import management.bean.rest.RqLogin;

@Component
public class LoginModel implements ILoginModel {

	public Boolean controlloLogin(RqLogin request) {

		if (request.getUser() != "pippo")
			return false;
		if (request.getPassword() != "pippo")
			return false;
		return true;
	}

}
