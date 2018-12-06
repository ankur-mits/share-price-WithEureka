package com.rsystems.shareprice;

public class SharePrice {
	private int shareLowPrice;
	private int shareHighPrice;
	private int port;
	
	
	
	public SharePrice() {
		super();
	}
	
	public SharePrice(int shareLowPrice, int shareHighPrice) {
		super();
		this.shareLowPrice = shareLowPrice;
		this.shareHighPrice = shareHighPrice;
	}
	
	public SharePrice(int shareLowPrice, int shareHighPrice, int port) {
		super();
		this.shareLowPrice = shareLowPrice;
		this.shareHighPrice = shareHighPrice;
		this.port = port;
	}

	public int getShareLowPrice() {
		return shareLowPrice;
	}

	public void setShareLowPrice(int shareLowPrice) {
		this.shareLowPrice = shareLowPrice;
	}

	public int getShareHighPrice() {
		return shareHighPrice;
	}

	public void setShareHighPrice(int shareHighPrice) {
		this.shareHighPrice = shareHighPrice;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}
	
	
}
