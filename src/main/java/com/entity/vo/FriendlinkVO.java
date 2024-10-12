package com.entity.vo;

import com.entity.FriendlinkEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
 

/**
 * 友情链接
 * @author 
 * @email 
 * @date 2024-02-26 20:54:40
 */
public class FriendlinkVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 图片
	 */
	
	private String picture;
		
	/**
	 * 链接
	 */
	
	private String url;
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setPicture(String picture) {
		this.picture = picture;
	}
	
	/**
	 * 获取：图片
	 */
	public String getPicture() {
		return picture;
	}
				
	
	/**
	 * 设置：链接
	 */
	 
	public void setUrl(String url) {
		this.url = url;
	}
	
	/**
	 * 获取：链接
	 */
	public String getUrl() {
		return url;
	}
			
}
