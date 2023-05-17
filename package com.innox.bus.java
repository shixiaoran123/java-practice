package com.innox.test;

import java.util.ArrayList;
import java.util.List;

class Bus extends Car {
	private int leftPassengerCapacity;
	private int rightPassengerCapacity;
	private List<String> leftSeatsList;
	private List<String> rightSeatsList;

	public int getLeftPassengerCapacity() {
		return leftPassengerCapacity;
	}

	public int getRightassengerCapacity() {
		return rightPassengerCapacity;
	}

	public List<String> getLeftSeatsList() {
		return leftSeatsList;
	}

	public List<String> getRightSeatsList() {
		return rightSeatsList;
	}

	public Bus(double suDu, int youMen, String zhuangTai) {
		super(suDu, youMen, zhuangTai);
		this.leftPassengerCapacity = 3;
		this.rightPassengerCapacity = 5;

		this.leftSeatsList = new ArrayList<>();
		this.rightSeatsList = new ArrayList<>();
	}

	void boardPassenger(String passengerName) {
		if (isLeftSeatsAvaliable()) {
			leftSeatsList.add(passengerName);
			System.out.println("有一名乘客上车：" + passengerName);
		} else if (isRightSeatsAvaliable()) {
			rightSeatsList.add(passengerName);
			System.out.println("有一名乘客上车：" + passengerName);
		} else {
			System.out.println("已经满员，无法再上车");
		}
	}

	boolean isLeftSeatsAvaliable() {
		return leftSeatsList.size() < leftPassengerCapacity;
	}

	boolean isRightSeatsAvaliable() {
		return rightSeatsList.size() < rightPassengerCapacity;
	}

	private int sumAllSeats(int leftSeatsList, int rightSeatsList) {
		return leftSeatsList + rightSeatsList;
	}

	public void printAllPassengerCount() {
		// leftSeatsList.size();
		int all = sumAllSeats(leftSeatsList.size(), rightSeatsList.size());
		System.out.println(all);
	}

	public void disembarkPassenger(String passengerName) {

		if (isgetoff(passengerName)) {
			System.out
					.println("有一名乘客 " + passengerName + " 下车，当前载客量为：" + (leftSeatsList.size() + rightSeatsList.size()));
		} else if (rightSeatsList.remove(passengerName)) {
			System.out
					.println("有一名乘客 " + passengerName + " 下车，当前载客量为：" + (leftSeatsList.size() + rightSeatsList.size()));
		} else {
			System.out.println("没有找到该乘客");
		}

	}

	boolean isgetoff(String passengerName) {
		return leftSeatsList.remove(passengerName);
	}

	public void printPassenger() {
		System.out.println("左侧座位上的乘客：");
		for (int i = 0; i < leftSeatsList.size(); i++) {
			System.out.println("第" + (i + 1) + "个位置上的乘客是：" + leftSeatsList.get(i));
		}
		System.out.println("右侧座位上的乘客：");
		for (int i = 0; i < rightSeatsList.size(); i++) {
			System.out.println("第" + (i + 1) + "个位置上的乘客是：" + rightSeatsList.get(i));
		}
	}
}