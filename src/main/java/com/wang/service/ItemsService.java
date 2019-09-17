package com.wang.service;

import com.wang.vo.ItemVo;

public interface ItemsService {
	ItemVo queryItemsByPictureId(Integer id);
	ItemVo queryItemsByItemId(Integer id);
}
