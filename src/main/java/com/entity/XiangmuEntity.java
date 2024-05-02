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
 * 项目
 * 数据库通用操作实体类（普通增删改查）
 * @author 
 * @email 
 * @date 2021-04-27 14:01:51
 */
@TableName("xiangmu")
public class XiangmuEntity<T> implements Serializable {
	private static final long serialVersionUID = 1L;


	public XiangmuEntity() {
		
	}
	
	public XiangmuEntity(T t) {
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
	 * 施工单位
	 */
					
	private String shigongdanwei;
	
	/**
	 * 用地面积
	 */
					
	private String yongdimianji;
	
	/**
	 * 项目类型
	 */
					
	private String xiangmuleixing;
	
	/**
	 * 项目经理
	 */
					
	private String xiangmujingli;
	
	/**
	 * 项目开始时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date xiangmukaishishijian;
	
	/**
	 * 项目结束时间
	 */
				
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd")
	@DateTimeFormat 		
	private Date xiangmujieshushijian;
	
	
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
	 * 设置：施工单位
	 */
	public void setShigongdanwei(String shigongdanwei) {
		this.shigongdanwei = shigongdanwei;
	}
	/**
	 * 获取：施工单位
	 */
	public String getShigongdanwei() {
		return shigongdanwei;
	}
	/**
	 * 设置：用地面积
	 */
	public void setYongdimianji(String yongdimianji) {
		this.yongdimianji = yongdimianji;
	}
	/**
	 * 获取：用地面积
	 */
	public String getYongdimianji() {
		return yongdimianji;
	}
	/**
	 * 设置：项目类型
	 */
	public void setXiangmuleixing(String xiangmuleixing) {
		this.xiangmuleixing = xiangmuleixing;
	}
	/**
	 * 获取：项目类型
	 */
	public String getXiangmuleixing() {
		return xiangmuleixing;
	}
	/**
	 * 设置：项目经理
	 */
	public void setXiangmujingli(String xiangmujingli) {
		this.xiangmujingli = xiangmujingli;
	}
	/**
	 * 获取：项目经理
	 */
	public String getXiangmujingli() {
		return xiangmujingli;
	}
	/**
	 * 设置：项目开始时间
	 */
	public void setXiangmukaishishijian(Date xiangmukaishishijian) {
		this.xiangmukaishishijian = xiangmukaishishijian;
	}
	/**
	 * 获取：项目开始时间
	 */
	public Date getXiangmukaishishijian() {
		return xiangmukaishishijian;
	}
	/**
	 * 设置：项目结束时间
	 */
	public void setXiangmujieshushijian(Date xiangmujieshushijian) {
		this.xiangmujieshushijian = xiangmujieshushijian;
	}
	/**
	 * 获取：项目结束时间
	 */
	public Date getXiangmujieshushijian() {
		return xiangmujieshushijian;
	}

}
