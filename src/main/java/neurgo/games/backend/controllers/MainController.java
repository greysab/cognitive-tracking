package neurgo.games.backend.controllers;

import neurgo.games.backend.resources.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

@Controller
public class MainController {
    @RequestMapping(path = "/")
    public ModelAndView thymeleafView(Map<String, Object> model) {
        User user = new User("bro_id", "bro", "bro@bro.com");
        model.put("user", user);
        ModelAndView modelAndView = new ModelAndView("index");
        modelAndView.addObject("user2",user);
        return modelAndView;
    }
}
