package play.le.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import play.le.common.logger.ApiLogger;
import play.le.model.User;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by fuzh2 on 2018/1/30.
 */
@Controller
public class PageResource {

    @RequestMapping("/")
    public String showIndex() {
        ApiLogger.debug("访问首页请求到来...");
        return "index";
    }

    @RequestMapping("/pages")
    @ResponseBody
    public List<User> getUsers() {
        User hammer = new User("hammer", 19);
        User nance = new User("nance", 19);
        User wd = new User("wd", 19);
        ArrayList<User> users = new ArrayList<>(3);
        users.add(hammer);
        users.add(wd);
        users.add(nance);
        return users;
    }
}
