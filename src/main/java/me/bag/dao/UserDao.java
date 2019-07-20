package me.bag.dao;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import me.bag.bean.TargetPeople;
import me.bag.util.BeanToList;
import me.bag.util.ReadFileUtil;
import me.bag.util.WriteFileUtil;

public class UserDao {
	
	public static List<String> saveBagData(TargetPeople people){
		System.out.println(people.getUserId());
		System.out.println(people.getUserName());
		String bagStr = BeanToList.getUserBeantoString(people);
		List<String> userList =ReadFileUtil.readline("User.txt");
		userList.add(bagStr);
		try {
			WriteFileUtil.writetxt(userList, "User.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return userList;
	}
	
	public static List<TargetPeople> getUserList(){
		System.out.println("target--->>>");
		
		List<String> bagListTemp =ReadFileUtil.readline("User.txt");
		List<TargetPeople> userList = new ArrayList<TargetPeople>();
		for(int i =0;i<bagListTemp.size();i++) {
			TargetPeople tempBagBean = BeanToList.getStrToTargetPeopleBean(bagListTemp.get(i));
			userList.add(tempBagBean);
		}
		return userList;
	}
}
