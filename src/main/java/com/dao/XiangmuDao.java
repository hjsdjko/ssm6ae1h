package com.dao;

import com.entity.XiangmuEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XiangmuVO;
import com.entity.view.XiangmuView;


/**
 * 项目
 * 
 * @author 
 * @email 
 * @date 2021-04-27 14:01:51
 */
public interface XiangmuDao extends BaseMapper<XiangmuEntity> {
	
	List<XiangmuVO> selectListVO(@Param("ew") Wrapper<XiangmuEntity> wrapper);
	
	XiangmuVO selectVO(@Param("ew") Wrapper<XiangmuEntity> wrapper);
	
	List<XiangmuView> selectListView(@Param("ew") Wrapper<XiangmuEntity> wrapper);

	List<XiangmuView> selectListView(Pagination page,@Param("ew") Wrapper<XiangmuEntity> wrapper);
	
	XiangmuView selectView(@Param("ew") Wrapper<XiangmuEntity> wrapper);
	
}
