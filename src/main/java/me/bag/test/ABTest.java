package me.bag.test;

import me.bag.bean.ActionBean;
import me.bag.dao.ActionDao;

public class ABTest {

	public static void main(String[] args) {
		ActionBean ab = new ActionBean();
		ab.setBagId("test02");
		ab.setActionName("打卡");
		ActionDao.saveActionData(ab);
	}

}
