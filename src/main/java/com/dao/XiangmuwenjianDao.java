package com.dao;

import com.entity.XiangmuwenjianEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XiangmuwenjianVO;
import com.entity.view.XiangmuwenjianView;


/**
 * 项目文件
 * 
 * @author 
 * @email 
 * @date 2021-04-27 14:01:51
 */
public interface XiangmuwenjianDao extends BaseMapper<XiangmuwenjianEntity> {
	
	List<XiangmuwenjianVO> selectListVO(@Param("ew") Wrapper<XiangmuwenjianEntity> wrapper);
	
	XiangmuwenjianVO selectVO(@Param("ew") Wrapper<XiangmuwenjianEntity> wrapper);
	
	List<XiangmuwenjianView> selectListView(@Param("ew") Wrapper<XiangmuwenjianEntity> wrapper);

	List<XiangmuwenjianView> selectListView(Pagination page,@Param("ew") Wrapper<XiangmuwenjianEntity> wrapper);
	
	XiangmuwenjianView selectView(@Param("ew") Wrapper<XiangmuwenjianEntity> wrapper);
	
}
