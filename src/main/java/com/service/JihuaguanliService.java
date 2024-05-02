package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.JihuaguanliEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.JihuaguanliVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.JihuaguanliView;


/**
 * 计划管理
 *
 * @author 
 * @email 
 * @date 2021-04-27 14:01:51
 */
public interface JihuaguanliService extends IService<JihuaguanliEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<JihuaguanliVO> selectListVO(Wrapper<JihuaguanliEntity> wrapper);
   	
   	JihuaguanliVO selectVO(@Param("ew") Wrapper<JihuaguanliEntity> wrapper);
   	
   	List<JihuaguanliView> selectListView(Wrapper<JihuaguanliEntity> wrapper);
   	
   	JihuaguanliView selectView(@Param("ew") Wrapper<JihuaguanliEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<JihuaguanliEntity> wrapper);
   	
}

