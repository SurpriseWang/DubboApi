package com.wang.vo;

import java.io.Serializable;

import com.wang.pojo.Item;
import com.wang.pojo.Picture;

/**
 * @author SurpriseWang
 * @date 2019年9月10日下午8:30:37
 */
public class ShopingCartVo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Item item;
	private Picture picture;
	private Integer number;

	public ShopingCartVo(Item item, Picture picture, Integer number) {
		super();
		this.item = item;
		this.picture = picture;
		this.number = number;
	}

	public ShopingCartVo() {
		super();
	}

	@Override
	public String toString() {
		return "ShopingCartVo [item=" + item + ", picture=" + picture + ", number=" + number + "]";
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public Picture getPicture() {
		return picture;
	}

	public void setPicture(Picture picture) {
		this.picture = picture;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

}
