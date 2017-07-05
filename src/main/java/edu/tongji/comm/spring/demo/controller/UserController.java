package edu.tongji.comm.spring.demo.controller;

import edu.tongji.comm.spring.demo.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by chen on 2017/7/4.
 */

@Controller
public class UserController {

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public ModelAndView user() {
        return new ModelAndView("user", "command", new User());
    }

    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public String addUser(@ModelAttribute User user, ModelMap model) {
        model.addAttribute("name", user.getUsername());
        model.addAttribute("age", user.getAge());
        model.addAttribute("id", user.getId());
        return "result";
    }

}
