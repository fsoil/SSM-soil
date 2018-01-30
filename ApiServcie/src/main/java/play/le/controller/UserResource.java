package play.le.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import play.le.model.User;

/**
 * Created by fuzh2 on 2018/1/26.
 */

@Controller
@RequestMapping("/users")
public class UserResource {

    @RequestMapping("/user")
    @ResponseBody
    public User getUser() {
        User user = new User("hammer", 18);
        return user;
    }
}
