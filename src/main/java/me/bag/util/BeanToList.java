package me.bag.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import me.bag.bean.Bag;

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
}