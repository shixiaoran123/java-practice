package com.innox.test;

public class Car {
	private double suDu;
	private int youMen;
	private String zhuangTai;

	public double getSuDu() {
		return suDu;
	}

	public void setSuDu(double suDu) {
		this.suDu = suDu;
	}

	public int getYouMen() {
		return youMen;
	}

	public void setYouMen(int youMen) {
		this.youMen = youMen;
	}

	public String getZhuangTai() {
		return zhuangTai;
	}

	public void setZhuangTai(String zhuangTai) {
		this.zhuangTai = zhuangTai;
	}

	public Car(double suDu, int youMen, String zhuangTai) {
		this.suDu = suDu;
		this.youMen = youMen;
		this.zhuangTai = zhuangTai;
	}

	public void 启动() {
		this.zhuangTai = "运行中";
		System.out.println("当前运行状态:" + zhuangTai);
	}

	public void 停止() {
		this.zhuangTai = "停止中";
		System.out.println("当前运行状态:" + zhuangTai);
	}

	public void 加速() {
		System.out.println("速度增加25%");
		this.youMen++;
		this.suDu = this.suDu + this.youMen * 0.25;
	}

	public void 刹车() {
		System.out.println("速度减少25%");
		this.youMen--;
		if (0 < this.youMen) {
			this.suDu = this.suDu - this.youMen * 0.25;
		} else {
			this.suDu = 0;
		}
	}
}