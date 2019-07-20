package me.bag.dao;

import java.util.ArrayList;
import java.util.List;

import me.bag.bean.TargetPeople;
import me.bag.util.BeanToList;
import me.bag.util.ReadFileUtil;

public class MaliActiojnDao {

	
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
