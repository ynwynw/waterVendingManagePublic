package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShangpinbuhuoEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShangpinbuhuoVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShangpinbuhuoView;


/**
 * 商品补货
 *
 * @author 
 * @email 
 * @date 2024-02-26 20:54:40
 */
public interface ShangpinbuhuoService extends IService<ShangpinbuhuoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShangpinbuhuoVO> selectListVO(Wrapper<ShangpinbuhuoEntity> wrapper);
   	
   	ShangpinbuhuoVO selectVO(@Param("ew") Wrapper<ShangpinbuhuoEntity> wrapper);
   	
   	List<ShangpinbuhuoView> selectListView(Wrapper<ShangpinbuhuoEntity> wrapper);
   	
   	ShangpinbuhuoView selectView(@Param("ew") Wrapper<ShangpinbuhuoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShangpinbuhuoEntity> wrapper);

   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<ShangpinbuhuoEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<ShangpinbuhuoEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<ShangpinbuhuoEntity> wrapper);



}

