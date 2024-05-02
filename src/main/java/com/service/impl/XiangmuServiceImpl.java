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


import com.dao.XiangmuDao;
import com.entity.XiangmuEntity;
import com.service.XiangmuService;
import com.entity.vo.XiangmuVO;
import com.entity.view.XiangmuView;

@Service("xiangmuService")
public class XiangmuServiceImpl extends ServiceImpl<XiangmuDao, XiangmuEntity> implements XiangmuService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XiangmuEntity> page = this.selectPage(
                new Query<XiangmuEntity>(params).getPage(),
                new EntityWrapper<XiangmuEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XiangmuEntity> wrapper) {
		  Page<XiangmuView> page =new Query<XiangmuView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XiangmuVO> selectListVO(Wrapper<XiangmuEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XiangmuVO selectVO(Wrapper<XiangmuEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XiangmuView> selectListView(Wrapper<XiangmuEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XiangmuView selectView(Wrapper<XiangmuEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
