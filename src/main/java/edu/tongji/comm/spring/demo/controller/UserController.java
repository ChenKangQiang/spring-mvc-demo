package edu.tongji.comm.spring.demo.controller;

import edu.tongji.comm.spring.demo.domain.User;
import edu.tongji.comm.spring.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by chen on 2017/7/4.
 */

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public ModelAndView user() {
        // modelName必须是command，因为使用了标签库
        return new ModelAndView("user", "command", new User());
    }

    @RequestMapping(value = "/user/{id}", method = RequestMethod.GET)
    public ModelAndView getUser(@PathVariable int id) {
        User user = userService.selectUser(id);
        return new ModelAndView("user", "command", user);
    }

    @RequestMapping(value = "/addUser", method = RequestMethod.POST)
    public String addUser(@ModelAttribute User user, ModelMap model) {
        model.addAttribute("name", user.getUsername());
        model.addAttribute("age", user.getAge());
        model.addAttribute("id", user.getId());
        model.addAttribute("email", user.getEmail());
        return "result";
    }

}
