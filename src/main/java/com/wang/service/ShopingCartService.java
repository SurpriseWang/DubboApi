package com.wang.service;

import com.wang.vo.ItemVo;

/**
 * @author SurpriseWang
 * @date 2019年9月12日上午8:43:08
 */
public interface ShopingCartService {
	public String queryShopingCart(String value);

	public String insertItemInShopingCart(String callback, String value, Integer id, ItemVo itemVo);

	public String deleteItemInShopingCart(String value,Integer[] itemId);

	public Integer buyChosenItemInShopingCart(String value,Integer[] itemId);
}
