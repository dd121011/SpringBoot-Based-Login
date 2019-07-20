package me.tianle.login.controller;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import me.tianle.login.bean.User;

@RestController
public class LoginController {

    Set<User> set = new HashSet<>();
    Map<String, String> userMap = new HashMap<>();

    @RequestMapping("/")
    public ModelAndView index() {
        return new ModelAndView("index");
    }

    @RequestMapping(value = "/reg", method = RequestMethod.POST)
    public String reg(@ModelAttribute User user) {
        String name = user.getName();
        String password = user.getPassword();
        set.add(user);
        if (userMap.containsKey(name)) {
            return "0";
        } else {
            userMap.put(name, password);
            return "1";
        }
    }

//    @RequestMapping(value = "/login", method = RequestMethod.POST)
//    public String login(@ModelAttribute User user) {
//
//        String name = user.getName();
//        String password = user.getPassword();
//        if (!userMap.containsKey(name)) {
//            return "0";
//        } else if (userMap.get(name).equals(password)) {
//            return "1";
//        } else {
//            return "2";
//        }
//    }
  @RequestMapping(value = "/login", method = RequestMethod.POST)
  public ModelAndView login(@ModelAttribute User user) {
	  System.out.println(user.getName());
	  user.setName("dong");
	  user.setPassword("123");
	  return new ModelAndView("hello");
  }
  
//  @RequestMapping(value = "/login", method = RequestMethod.POST)
//  public ModelAndView login(@ModelAttribute User user,Model model) {
//	  System.out.println(user.getName());
//	  user.setName("dong");
//	  user.setPassword("123");
//	  List<User> pList = new ArrayList();
//	  User u1 = new User("zhang", "zhangsan");
//	  User u2 = new User("wang", "wangwu");
//	  User u3 = new User("li", "lisi");
//	  pList.add(u1);
//	  pList.add(u2);
//	  pList.add(u3);
//	  model.addAttribute(pList);
//	  return new ModelAndView("hello");
//  }
   
}
