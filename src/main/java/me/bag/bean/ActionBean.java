package me.bag.bean;

public class ActionBean {
	String bagId;
	String aId;
	String bagName;
	String userId;//
	String positonCoordinate;//位置坐标
	String actionName;//活动主题
	String timeStamp;//时间戳
	public String getBagId() {
		return bagId;
	}
	
	public String getaId() {
		return aId;
	}

	public void setaId(String aId) {
		this.aId = aId;
	}

	public String getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}
	public void setBagId(String bagId) {
		this.bagId = bagId;
	}
	public String getBagName() {
		return bagName;
	}
	public void setBagName(String bagName) {
		this.bagName = bagName;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPositonCoordinate() {
		return positonCoordinate;
	}
	public void setPositonCoordinate(String positonCoordinate) {
		this.positonCoordinate = positonCoordinate;
	}
	public String getActionName() {
		return actionName;
	}
	public void setActionName(String actionName) {
		this.actionName = actionName;
	}
	
}
