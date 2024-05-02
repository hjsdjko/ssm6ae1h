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


import com.dao.JihuaguanliDao;
import com.entity.JihuaguanliEntity;
import com.service.JihuaguanliService;
import com.entity.vo.JihuaguanliVO;
import com.entity.view.JihuaguanliView;

@Service("jihuaguanliService")
public class JihuaguanliServiceImpl extends ServiceImpl<JihuaguanliDao, JihuaguanliEntity> implements JihuaguanliService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<JihuaguanliEntity> page = this.selectPage(
                new Query<JihuaguanliEntity>(params).getPage(),
                new EntityWrapper<JihuaguanliEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<JihuaguanliEntity> wrapper) {
		  Page<JihuaguanliView> page =new Query<JihuaguanliView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<JihuaguanliVO> selectListVO(Wrapper<JihuaguanliEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public JihuaguanliVO selectVO(Wrapper<JihuaguanliEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<JihuaguanliView> selectListView(Wrapper<JihuaguanliEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public JihuaguanliView selectView(Wrapper<JihuaguanliEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
