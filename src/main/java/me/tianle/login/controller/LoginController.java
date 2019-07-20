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

import me.bag.bean.Bag;
import me.bag.dao.BagDao;
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
	@RequestMapping(value = "/addBag", method = RequestMethod.POST)
	public ModelAndView add(@ModelAttribute Bag bag) {
		System.out.println("add a bag");
		  System.out.println(bag.getId());
		  System.out.println(bag.getName());
		  System.out.println(bag.getBagBrand());
			
			BagDao.saveBagData(bag);
		  System.out.println("add a bag fnished");
		  return new ModelAndView("addSuccess");
	}
	@RequestMapping(value = "/getbagList", method = RequestMethod.POST)
	public ModelAndView getbagList(Model model) {
		System.out.println("getbagList----");
		 
		List<Bag> bagList = BagDao.getBagList();
		  System.out.println("getbagList fnished:"+bagList.size());
		  model.addAttribute(bagList);
		  return new ModelAndView("bagList");
	}
//  @RequestMapping(value = "/add", method = RequestMethod.POST)
//  public ModelAndView add(@ModelAttribute User user) {
//	  System.out.println(user.getName());
//	  user.setName("dong");
//	  user.setPassword("123");
//	  return new ModelAndView("add");
//  }
  

   
}
