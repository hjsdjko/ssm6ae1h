package com.dao;

import com.entity.JihuaguanliEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.JihuaguanliVO;
import com.entity.view.JihuaguanliView;


/**
 * 计划管理
 * 
 * @author 
 * @email 
 * @date 2021-04-27 14:01:51
 */
public interface JihuaguanliDao extends BaseMapper<JihuaguanliEntity> {
	
	List<JihuaguanliVO> selectListVO(@Param("ew") Wrapper<JihuaguanliEntity> wrapper);
	
	JihuaguanliVO selectVO(@Param("ew") Wrapper<JihuaguanliEntity> wrapper);
	
	List<JihuaguanliView> selectListView(@Param("ew") Wrapper<JihuaguanliEntity> wrapper);

	List<JihuaguanliView> selectListView(Pagination page,@Param("ew") Wrapper<JihuaguanliEntity> wrapper);
	
	JihuaguanliView selectView(@Param("ew") Wrapper<JihuaguanliEntity> wrapper);
	
}
