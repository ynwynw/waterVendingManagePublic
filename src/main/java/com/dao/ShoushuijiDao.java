package com.dao;

import com.entity.ShoushuijiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShoushuijiVO;
import com.entity.view.ShoushuijiView;


/**
 * 售水机
 * 
 * @author 
 * @email 
 * @date 2024-02-26 20:54:40
 */
public interface ShoushuijiDao extends BaseMapper<ShoushuijiEntity> {
	
	List<ShoushuijiVO> selectListVO(@Param("ew") Wrapper<ShoushuijiEntity> wrapper);
	
	ShoushuijiVO selectVO(@Param("ew") Wrapper<ShoushuijiEntity> wrapper);
	
	List<ShoushuijiView> selectListView(@Param("ew") Wrapper<ShoushuijiEntity> wrapper);

	List<ShoushuijiView> selectListView(Pagination page,@Param("ew") Wrapper<ShoushuijiEntity> wrapper);

	
	ShoushuijiView selectView(@Param("ew") Wrapper<ShoushuijiEntity> wrapper);
	

}
