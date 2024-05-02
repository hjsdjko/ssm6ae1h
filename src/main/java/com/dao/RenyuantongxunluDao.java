package com.dao;

import com.entity.RenyuantongxunluEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.RenyuantongxunluVO;
import com.entity.view.RenyuantongxunluView;


/**
 * 人员通讯录
 * 
 * @author 
 * @email 
 * @date 2021-04-27 14:01:51
 */
public interface RenyuantongxunluDao extends BaseMapper<RenyuantongxunluEntity> {
	
	List<RenyuantongxunluVO> selectListVO(@Param("ew") Wrapper<RenyuantongxunluEntity> wrapper);
	
	RenyuantongxunluVO selectVO(@Param("ew") Wrapper<RenyuantongxunluEntity> wrapper);
	
	List<RenyuantongxunluView> selectListView(@Param("ew") Wrapper<RenyuantongxunluEntity> wrapper);

	List<RenyuantongxunluView> selectListView(Pagination page,@Param("ew") Wrapper<RenyuantongxunluEntity> wrapper);
	
	RenyuantongxunluView selectView(@Param("ew") Wrapper<RenyuantongxunluEntity> wrapper);
	
}
