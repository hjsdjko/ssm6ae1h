package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;


/**
 * 项目信息
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-27 14:01:51
 */
@TableName("xiangmuxinxi")
public class XiangmuxinxiEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public XiangmuxinxiEntity() {
		
	}
	
	public XiangmuxinxiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * 主键id
	 */
	@TableId
	private Long id;
	/**
	 * 项目名称
	 */
					
	private String xiangmumingcheng;
	
	/**
	 * 安全措施
	 */
					
	private String anquancuoshi;
	
	/**
	 * 结构材料
	 */
					
	private String jiegoucailiao;
	
	/**
	 * 用量
	 */
					
	private String yongliang;
	
	/**
	 * 工程进度
	 */
					
	private Integer gongchengjindu;
	
	
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
	private Date addtime;

	public Date getAddtime() {
		return addtime;
	}
	public void setAddtime(Date addtime) {
		this.addtime = addtime;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 设置：项目名称
	 */
	public void setXiangmumingcheng(String xiangmumingcheng) {
		this.xiangmumingcheng = xiangmumingcheng;
	}
	/**
	 * 获取：项目名称
	 */
	public String getXiangmumingcheng() {
		return xiangmumingcheng;
	}
	/**
	 * 设置：安全措施
	 */
	public void setAnquancuoshi(String anquancuoshi) {
		this.anquancuoshi = anquancuoshi;
	}
	/**
	 * 获取：安全措施
	 */
	public String getAnquancuoshi() {
		return anquancuoshi;
	}
	/**
	 * 设置：结构材料
	 */
	public void setJiegoucailiao(String jiegoucailiao) {
		this.jiegoucailiao = jiegoucailiao;
	}
	/**
	 * 获取：结构材料
	 */
	public String getJiegoucailiao() {
		return jiegoucailiao;
	}
	/**
	 * 设置：用量
	 */
	public void setYongliang(String yongliang) {
		this.yongliang = yongliang;
	}
	/**
	 * 获取：用量
	 */
	public String getYongliang() {
		return yongliang;
	}
	/**
	 * 设置：工程进度
	 */
	public void setGongchengjindu(Integer gongchengjindu) {
		this.gongchengjindu = gongchengjindu;
	}
	/**
	 * 获取：工程进度
	 */
	public Integer getGongchengjindu() {
		return gongchengjindu;
	}

}
