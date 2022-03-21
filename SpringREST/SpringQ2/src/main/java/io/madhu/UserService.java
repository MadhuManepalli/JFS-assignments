package io.madhu;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

@Service
public class UserService
{
	public String validate(String username,String Password)
	{
        if (username.equals("Madhu") && Password.equals("madhu"))
        {
            return "Valid User";
        }
        else
        {
        	return "Invalid User";
        }
    }

}
