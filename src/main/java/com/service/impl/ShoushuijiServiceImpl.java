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


import com.dao.ShoushuijiDao;
import com.entity.ShoushuijiEntity;
import com.service.ShoushuijiService;
import com.entity.vo.ShoushuijiVO;
import com.entity.view.ShoushuijiView;

@Service("shoushuijiService")
public class ShoushuijiServiceImpl extends ServiceImpl<ShoushuijiDao, ShoushuijiEntity> implements ShoushuijiService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ShoushuijiEntity> page = this.selectPage(
                new Query<ShoushuijiEntity>(params).getPage(),
                new EntityWrapper<ShoushuijiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ShoushuijiEntity> wrapper) {
		  Page<ShoushuijiView> page =new Query<ShoushuijiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}

    
    @Override
	public List<ShoushuijiVO> selectListVO(Wrapper<ShoushuijiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ShoushuijiVO selectVO(Wrapper<ShoushuijiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ShoushuijiView> selectListView(Wrapper<ShoushuijiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ShoushuijiView selectView(Wrapper<ShoushuijiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
