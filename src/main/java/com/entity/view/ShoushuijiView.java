package com.entity.view;

import com.entity.ShoushuijiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 售水机
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-02-26 20:54:40
 */
@TableName("shoushuiji")
public class ShoushuijiView  extends ShoushuijiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShoushuijiView(){
	}
 
 	public ShoushuijiView(ShoushuijiEntity shoushuijiEntity){
 	try {
			BeanUtils.copyProperties(this, shoushuijiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
