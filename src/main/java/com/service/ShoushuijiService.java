package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ShoushuijiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ShoushuijiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ShoushuijiView;


/**
 * 售水机
 *
 * @author 
 * @email 
 * @date 2024-02-26 20:54:40
 */
public interface ShoushuijiService extends IService<ShoushuijiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShoushuijiVO> selectListVO(Wrapper<ShoushuijiEntity> wrapper);
   	
   	ShoushuijiVO selectVO(@Param("ew") Wrapper<ShoushuijiEntity> wrapper);
   	
   	List<ShoushuijiView> selectListView(Wrapper<ShoushuijiEntity> wrapper);
   	
   	ShoushuijiView selectView(@Param("ew") Wrapper<ShoushuijiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShoushuijiEntity> wrapper);

   	

}

