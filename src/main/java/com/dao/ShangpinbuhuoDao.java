package com.dao;

import com.entity.ShangpinbuhuoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ShangpinbuhuoVO;
import com.entity.view.ShangpinbuhuoView;


/**
 * 商品补货
 * 
 * @author 
 * @email 
 * @date 2024-02-26 20:54:40
 */
public interface ShangpinbuhuoDao extends BaseMapper<ShangpinbuhuoEntity> {
	
	List<ShangpinbuhuoVO> selectListVO(@Param("ew") Wrapper<ShangpinbuhuoEntity> wrapper);
	
	ShangpinbuhuoVO selectVO(@Param("ew") Wrapper<ShangpinbuhuoEntity> wrapper);
	
	List<ShangpinbuhuoView> selectListView(@Param("ew") Wrapper<ShangpinbuhuoEntity> wrapper);

	List<ShangpinbuhuoView> selectListView(Pagination page,@Param("ew") Wrapper<ShangpinbuhuoEntity> wrapper);

	
	ShangpinbuhuoView selectView(@Param("ew") Wrapper<ShangpinbuhuoEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ShangpinbuhuoEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ShangpinbuhuoEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ShangpinbuhuoEntity> wrapper);



}
