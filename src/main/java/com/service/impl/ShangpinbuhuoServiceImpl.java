package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ShangpinbuhuoDao;
import com.entity.ShangpinbuhuoEntity;
import com.service.ShangpinbuhuoService;
import com.entity.vo.ShangpinbuhuoVO;
import com.entity.view.ShangpinbuhuoView;

@Service("shangpinbuhuoService")
public class ShangpinbuhuoServiceImpl extends ServiceImpl<ShangpinbuhuoDao, ShangpinbuhuoEntity> implements ShangpinbuhuoService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShangpinbuhuoEntity> page = this.selectPage(
                new Query<ShangpinbuhuoEntity>(params).getPage(),
                new EntityWrapper<ShangpinbuhuoEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShangpinbuhuoEntity> wrapper) {
		  Page<ShangpinbuhuoView> page =new Query<ShangpinbuhuoView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<ShangpinbuhuoVO> selectListVO(Wrapper<ShangpinbuhuoEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShangpinbuhuoVO selectVO(Wrapper<ShangpinbuhuoEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShangpinbuhuoView> selectListView(Wrapper<ShangpinbuhuoEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShangpinbuhuoView selectView(Wrapper<ShangpinbuhuoEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

    @Override
    public List<Map<String, Object>> selectValue(Map<String, Object> params, Wrapper<ShangpinbuhuoEntity> wrapper) {
        return baseMapper.selectValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params, Wrapper<ShangpinbuhuoEntity> wrapper) {
        return baseMapper.selectTimeStatValue(params, wrapper);
    }

    @Override
    public List<Map<String, Object>> selectGroup(Map<String, Object> params, Wrapper<ShangpinbuhuoEntity> wrapper) {
        return baseMapper.selectGroup(params, wrapper);
    }




}
