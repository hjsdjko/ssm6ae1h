package com.entity.view;

import com.entity.JihuaguanliEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 计划管理
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-27 14:01:51
 */
@TableName("jihuaguanli")
public class JihuaguanliView  extends JihuaguanliEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public JihuaguanliView(){
	}
 
 	public JihuaguanliView(JihuaguanliEntity jihuaguanliEntity){
 	try {
			BeanUtils.copyProperties(this, jihuaguanliEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
