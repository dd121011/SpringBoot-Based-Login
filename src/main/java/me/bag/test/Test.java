package me.bag.test;

import java.io.IOException;
import java.util.List;

import me.bag.bean.Bag;
import me.bag.util.ReadFileUtil;
import me.bag.util.WriteFileUtil;

public class Test {

	public static void main(String[] args) {
		Bag bag = new Bag();
		bag.setId("1");
		bag.setName("no1");
		bag.setPositonCoordinate("39.55-116.24");//北京坐标
		List<String> bagList =ReadFileUtil.readline("bag.txt");
		for(int i =0;i<bagList.size();i++) {
			System.out.println(bagList.get(i));
		}
		String bagTest ="2---no2---shanghai---";
		bagList.add(bagTest);
		try {
			WriteFileUtil.writetxt(bagList, "bag.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
