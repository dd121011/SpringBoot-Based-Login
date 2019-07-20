package me.tianle.login.controller;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import me.bag.bean.ActionBean;
import me.bag.bean.TargetPeople;
import me.bag.dao.ActionDao;
import me.bag.dao.UserDao;
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
	  return new ModelAndView("add");
  }
	@RequestMapping(value = "/addPeople", method = RequestMethod.POST)
	public ModelAndView add(@ModelAttribute TargetPeople people) {
		System.out.println("add a people");
		  System.out.println(people.getId());
		  System.out.println(people.getUserName());
		  System.out.println(people.getBak());
		  System.out.println(people.getUserName());
		  System.out.println(people.getHotPot());
		 
		 
			
			UserDao.saveBagData(people);
		  System.out.println("add a people fnished");
		  return new ModelAndView("addSuccess");
	}
	@RequestMapping(value = "/getpeopleList", method = RequestMethod.POST)
	public ModelAndView getpeopleList(Model model) {
		System.out.println("getpeopleList----");
		 
		List<TargetPeople> userList = UserDao.getUserList();
		  System.out.println("getpeopleList fnished:"+userList.size());
		  model.addAttribute("userList",userList);
		  return new ModelAndView("userList");
	}
	@RequestMapping(value = "/getMAList", method = RequestMethod.POST)
	public ModelAndView getMAList(Model model) {
		System.out.println("getMAList----");
		 
		List<TargetPeople> maliciousList = UserDao.getUserList();
		  System.out.println("getMAList fnished:"+maliciousList.size());
		  model.addAttribute("maliciousList",maliciousList);
		  return new ModelAndView("maliciousList");
	}
	
  

   
}
