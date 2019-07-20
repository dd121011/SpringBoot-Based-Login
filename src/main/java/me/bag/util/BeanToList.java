package me.bag.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import me.bag.bean.Bag;
import me.bag.bean.TargetPeople;

public class BeanToList {

	public static void main(String[] args) {
		Bag bag = new Bag();
		bag.setId("007");
		bag.setName("testName");
		
		BeanToList.getBeanToList(bag);
	}
	public static List<String> getBeanToList(Bag bag){
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
	public static List<String> addBeanToList(Bag bag){
		List<String> bagList = new ArrayList();
		StringBuffer tempsb =new StringBuffer();
//		String[] idInfos = idInfo.split("---");
		
		
		return bagList;
	}
	public static String getBeantoString(Bag bag) {
		String temp = null;
		StringBuffer bagsb =new StringBuffer();
		bagsb.append(bag.getId()==null?"\"\"":bag.getId()).append("---");
		bagsb.append(bag.getName()==null?"\"\"":bag.getName()).append("---");
		bagsb.append(bag.getBagType()==null?"\"\"":bag.getBagType()).append("---");
		bagsb.append(bag.getBagBrand()==null?"\"\"":bag.getBagBrand()).append("---");
		bagsb.append(bag.getProducer()==null?"\"\"":bag.getProducer()).append("---");
		bagsb.append(bag.getProducerInfo()==null?"\"\"":bag.getProducerInfo()).append("---");
		bagsb.append(bag.getProdutInfo()==null?"\"\"":bag.getProdutInfo()).append("---");
		bagsb.append(bag.getPositonCoordinate()==null?"\"\"":bag.getPositonCoordinate()).append("---");
		bagsb.append(bag.getUserId()==null?"\"\"":bag.getUserId()).append("---");
		bagsb.append(bag.getBirthDate()==null?"\"\"":bag.getBirthDate()).append("---");
		bagsb.append(bag.getBuyPrice()==null?"\"\"":bag.getBuyPrice()).append("---");
		bagsb.append(bag.getEmergencyId()==null?"\"\"":bag.getEmergencyId()).append("---");
		bagsb.append(bag.getIpfsAddress()==null?"\"\"":bag.getIpfsAddress()).append("---");
		
		
//		System.out.println(bagsb.toString());
		temp = bagsb.toString();
		return temp;
	}
	public static Bag getStrToBean(String bagStr) {
		String[] bagInfo = bagStr.split("---");
		Bag bag = new Bag();
		bag.setId(bagInfo[0]);
		bag.setName(bagInfo[1]);
		bag.setBagType(bagInfo[2]);
		bag.setBagBrand(bagInfo[3]);
		bag.setProducer(bagInfo[4]);
		bag.setProducerInfo(bagInfo[5]);
		bag.setProdutInfo(bagInfo[6]);
		bag.setPositonCoordinate(bagInfo[7]);
		bag.setUserId(bagInfo[8]);
		bag.setBirthDate(bagInfo[9]);
		bag.setBuyPrice(bagInfo[10]);
		bag.setEmergencyId(bagInfo[11]);
		bag.setIpfsAddress(bagInfo[12]);
		return bag;
	}
	public static String getUserBeantoString(TargetPeople people) {
		String temp = null;
		StringBuffer bagsb =new StringBuffer();
		bagsb.append(people.getId()==null || people.getId().equals("")?"\"\"":people.getId()).append("---");
		bagsb.append(people.getUserId()==null || people.getUserId().equals("")?"\"\"":people.getUserId()).append("---");
		bagsb.append(people.getUserChainId()==null || people.getUserChainId().equals("")?"\"\"":people.getUserChainId()).append("---");
		bagsb.append(people.getUserName()==null ||people.getUserName().equals("")?"\"\"":people.getUserName()).append("---");
		bagsb.append(people.getIdNO()==null || people.getIdNO().equals("")?"\"\"":people.getIdNO()).append("---");
		bagsb.append(people.getMaliciousIndex()==null||people.getMaliciousIndex().equals("")?"\"\"":people.getMaliciousIndex()).append("---");
		bagsb.append(people.getHotPot()==null||people.getHotPot().equals("")?"\"\"":people.getHotPot()).append("---");
		bagsb.append(people.getHotPotIndex()==null||people.getHotPotIndex().equals("")?"\"\"":people.getHotPotIndex()).append("---");
		bagsb.append(people.getCoustomerOrExpress()==null||people.getCoustomerOrExpress().equals("")?"\"\"":people.getCoustomerOrExpress()).append("---");
		bagsb.append(people.getBak()==null || people.getBak().equals("") ?"\"\"":people.getBak()).append("---");
		System.out.println("peoplebak :"+ people.getBak());

		
		
		
		System.out.println(bagsb.toString());
		temp = bagsb.toString();
		return temp;
	}
	public static TargetPeople getStrToTargetPeopleBean(String userStr) {
		System.out.println("getStrToTargetPeopleBean"+userStr);
		String[] bagInfo = userStr.split("---");
		System.out.println(bagInfo.length);
		System.out.println(bagInfo);
		TargetPeople user = new TargetPeople();
		
		user.setId(bagInfo[0]);
		user.setUserId(bagInfo[1]);
		user.setUserChainId(bagInfo[2]);
		user.setUserName(bagInfo[3]);
		user.setIdNO(bagInfo[4]);
		user.setMaliciousIndex(bagInfo[5]);
		user.setHotPot(bagInfo[6]);
		user.setHotPotIndex(bagInfo[7]);
		user.setCoustomerOrExpress(bagInfo[8]);
		user.setBak(bagInfo[9]);
		
		
		
		return user;
	}
}