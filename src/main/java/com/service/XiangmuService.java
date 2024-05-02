package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XiangmuEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XiangmuVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XiangmuView;


/**
 * 项目
 *
 * @author 
 * @email 
 * @date 2021-04-27 14:01:51
 */
public interface XiangmuService extends IService<XiangmuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XiangmuVO> selectListVO(Wrapper<XiangmuEntity> wrapper);
   	
   	XiangmuVO selectVO(@Param("ew") Wrapper<XiangmuEntity> wrapper);
   	
   	List<XiangmuView> selectListView(Wrapper<XiangmuEntity> wrapper);
   	
   	XiangmuView selectView(@Param("ew") Wrapper<XiangmuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XiangmuEntity> wrapper);
   	
}

