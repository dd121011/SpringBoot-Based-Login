package me.bag.dao;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import me.bag.bean.Bag;
import me.bag.util.BeanToList;
import me.bag.util.ReadFileUtil;
import me.bag.util.WriteFileUtil;

public class BagDao {

	public static void main(String[] args) {
		Bag bag = BagDao.getBagData("001");
		if(bag.getId()!=null&&bag.getId().equals("")==false) {
			System.out.println(bag.getId()+"---"+bag.getName());
			System.out.println(BeanToList.getBeantoString(bag));
		}else {
			System.out.println("no");
		}
	}
	
	public static List<String> saveBagData(Bag bag){
//		List<String> bagList = new ArrayList();
//		String[] idInfos = idInfo.split("---");
		System.out.println(bag.getId());
		System.out.println(bag.getName());
		String bagStr = BeanToList.getBeantoString(bag);
		List<String> bagList =ReadFileUtil.readline("bag.txt");
		bagList.add(bagStr);
		try {
			WriteFileUtil.writetxt(bagList, "bag.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return bagList;
	}
	
	public static Bag getBagData(String target){
		System.out.println("target--->>>"+target);
		Bag bag = new Bag();
		List<String> bagList =ReadFileUtil.readline("bag.txt");
		for(int i =0;i<bagList.size();i++) {
			Bag tempBagBean = BeanToList.getStrToBean(bagList.get(i));
			if(tempBagBean.getId().equals(target)) {
				return tempBagBean;
			}
		}
		return bag;
	}
	public static List<Bag> getBagList(){
		System.out.println("target--->>>");
		Bag bag = new Bag();
		List<String> bagListTemp =ReadFileUtil.readline("bag.txt");
		List<Bag> bagLsit = new ArrayList<Bag>();
		for(int i =0;i<bagListTemp.size();i++) {
			Bag tempBagBean = BeanToList.getStrToBean(bagListTemp.get(i));
			bagLsit.add(tempBagBean);
		}
		return bagLsit;
	}

}
