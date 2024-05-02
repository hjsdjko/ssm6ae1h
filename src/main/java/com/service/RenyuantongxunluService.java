package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.RenyuantongxunluEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.RenyuantongxunluVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.RenyuantongxunluView;


/**
 * 人员通讯录
 *
 * @author 
 * @email 
 * @date 2021-04-27 14:01:51
 */
public interface RenyuantongxunluService extends IService<RenyuantongxunluEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<RenyuantongxunluVO> selectListVO(Wrapper<RenyuantongxunluEntity> wrapper);
   	
   	RenyuantongxunluVO selectVO(@Param("ew") Wrapper<RenyuantongxunluEntity> wrapper);
   	
   	List<RenyuantongxunluView> selectListView(Wrapper<RenyuantongxunluEntity> wrapper);
   	
   	RenyuantongxunluView selectView(@Param("ew") Wrapper<RenyuantongxunluEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<RenyuantongxunluEntity> wrapper);
   	
}

