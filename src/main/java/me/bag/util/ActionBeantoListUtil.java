package me.bag.util;

import me.bag.bean.ActionBean;

public class ActionBeantoListUtil {

	public static void main(String[] args) {
		ActionBean ab = new ActionBean();
		ab.setActionName("test");
		ActionBeantoListUtil.getActionBeantoString(ab);
	}
	public static String getActionBeantoString(ActionBean action) {
		String temp = null;
		StringBuffer absb =new StringBuffer();
		absb.append(action.getBagId()==null?"\"\"":action.getBagId()).append("---");
		absb.append(action.getBagName()==null?"\"\"":action.getBagName()).append("---");
		absb.append(action.getUserId()==null?"\"\"":action.getUserId()).append("---");
		absb.append(action.getPositonCoordinate()==null?"\"\"":action.getPositonCoordinate()).append("---");
		absb.append(action.getActionName()==null?"\"\"":action.getActionName()).append("---");
		absb.append(action.getTimeStamp()==null?"\"\"":action.getTimeStamp()).append("---");

		System.out.println(absb.toString());
		temp = absb.toString();
		return temp;
	}
	public static ActionBean getStrToBean(String actionStr) {
		ActionBean ab = new ActionBean();
		String[] abInfo = actionStr.split("---");
		ab.setBagId(abInfo[0]);
		ab.setBagName(abInfo[1]);
		ab.setUserId(abInfo[2]);
		ab.setPositonCoordinate(abInfo[3]);
		ab.setActionName(abInfo[4]);
		ab.setTimeStamp(abInfo[5]);
		return ab;
	}
}
