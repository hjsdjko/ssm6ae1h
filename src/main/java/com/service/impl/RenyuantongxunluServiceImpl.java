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


import com.dao.RenyuantongxunluDao;
import com.entity.RenyuantongxunluEntity;
import com.service.RenyuantongxunluService;
import com.entity.vo.RenyuantongxunluVO;
import com.entity.view.RenyuantongxunluView;

@Service("renyuantongxunluService")
public class RenyuantongxunluServiceImpl extends ServiceImpl<RenyuantongxunluDao, RenyuantongxunluEntity> implements RenyuantongxunluService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<RenyuantongxunluEntity> page = this.selectPage(
                new Query<RenyuantongxunluEntity>(params).getPage(),
                new EntityWrapper<RenyuantongxunluEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<RenyuantongxunluEntity> wrapper) {
		  Page<RenyuantongxunluView> page =new Query<RenyuantongxunluView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<RenyuantongxunluVO> selectListVO(Wrapper<RenyuantongxunluEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public RenyuantongxunluVO selectVO(Wrapper<RenyuantongxunluEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<RenyuantongxunluView> selectListView(Wrapper<RenyuantongxunluEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public RenyuantongxunluView selectView(Wrapper<RenyuantongxunluEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
