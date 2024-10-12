package com.entity.view;

import com.entity.ShangpinbuhuoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.utils.EncryptUtil;
 

/**
 * 商品补货
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-02-26 20:54:40
 */
@TableName("shangpinbuhuo")
public class ShangpinbuhuoView  extends ShangpinbuhuoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShangpinbuhuoView(){
	}
 
 	public ShangpinbuhuoView(ShangpinbuhuoEntity shangpinbuhuoEntity){
 	try {
			BeanUtils.copyProperties(this, shangpinbuhuoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
