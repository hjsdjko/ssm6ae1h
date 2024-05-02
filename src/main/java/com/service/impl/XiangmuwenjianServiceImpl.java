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


import com.dao.XiangmuwenjianDao;
import com.entity.XiangmuwenjianEntity;
import com.service.XiangmuwenjianService;
import com.entity.vo.XiangmuwenjianVO;
import com.entity.view.XiangmuwenjianView;

@Service("xiangmuwenjianService")
public class XiangmuwenjianServiceImpl extends ServiceImpl<XiangmuwenjianDao, XiangmuwenjianEntity> implements XiangmuwenjianService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XiangmuwenjianEntity> page = this.selectPage(
                new Query<XiangmuwenjianEntity>(params).getPage(),
                new EntityWrapper<XiangmuwenjianEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XiangmuwenjianEntity> wrapper) {
		  Page<XiangmuwenjianView> page =new Query<XiangmuwenjianView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XiangmuwenjianVO> selectListVO(Wrapper<XiangmuwenjianEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XiangmuwenjianVO selectVO(Wrapper<XiangmuwenjianEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XiangmuwenjianView> selectListView(Wrapper<XiangmuwenjianEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XiangmuwenjianView selectView(Wrapper<XiangmuwenjianEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
