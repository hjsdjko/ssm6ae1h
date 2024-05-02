package com.entity.view;

import com.entity.RenyuantongxunluEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 人员通讯录
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2021-04-27 14:01:51
 */
@TableName("renyuantongxunlu")
public class RenyuantongxunluView  extends RenyuantongxunluEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public RenyuantongxunluView(){
	}
 
 	public RenyuantongxunluView(RenyuantongxunluEntity renyuantongxunluEntity){
 	try {
			BeanUtils.copyProperties(this, renyuantongxunluEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
