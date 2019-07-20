package me.bag.dao;

import java.io.IOException;
import java.util.List;

import me.bag.bean.ActionBean;
import me.bag.util.ActionBeantoListUtil;
import me.bag.util.ReadFileUtil;
import me.bag.util.WriteFileUtil;

public class ActionDao {
	public static List<String> saveActionData(ActionBean ab){
//		List<String> bagList = new ArrayList();
//		String[] idInfos = idInfo.split("---");
		System.out.println(ab.getBagId());
		System.out.println(ab.getActionName());
		String bagStr = ActionBeantoListUtil.getActionBeantoString(ab);
		List<String> bagList =ReadFileUtil.readline("ActionBean.txt");
		bagList.add(bagStr);
		try {
			WriteFileUtil.writetxt(bagList, "ActionBean.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return bagList;
	}
	
	public static ActionBean getActionData(String target){
		System.out.println("target--->>>"+target);
		ActionBean ab = new ActionBean();
		List<String> abList =ReadFileUtil.readline("bag.txt");
		for(int i =0;i<abList.size();i++) {
			ActionBean tempBean = ActionBeantoListUtil.getStrToBean(abList.get(i));
			if(tempBean.getBagId().equals(target)) {
				return tempBean;
			}
			if(tempBean.getaId().equals(target)) {
				return tempBean;
			}
			if(tempBean.getBagName().equals(target)) {
				return tempBean;
			}
		}
		return ab;
	}
}
