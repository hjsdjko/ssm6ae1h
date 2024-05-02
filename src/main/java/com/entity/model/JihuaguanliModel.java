package com.entity.model;

import com.entity.JihuaguanliEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 计划管理
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2021-04-27 14:01:51
 */
public class JihuaguanliModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 材料使用量
	 */
	
	private String cailiaoshiyongliang;
		
	/**
	 * 开始时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date kaishishijian;
		
	/**
	 * 结束时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date jieshushijian;
		
	/**
	 * 实施人员
	 */
	
	private String shishirenyuan;
		
	/**
	 * 姓名
	 */
	
	private String xingming;
				
	
	/**
	 * 设置：材料使用量
	 */
	 
	public void setCailiaoshiyongliang(String cailiaoshiyongliang) {
		this.cailiaoshiyongliang = cailiaoshiyongliang;
	}
	
	/**
	 * 获取：材料使用量
	 */
	public String getCailiaoshiyongliang() {
		return cailiaoshiyongliang;
	}
				
	
	/**
	 * 设置：开始时间
	 */
	 
	public void setKaishishijian(Date kaishishijian) {
		this.kaishishijian = kaishishijian;
	}
	
	/**
	 * 获取：开始时间
	 */
	public Date getKaishishijian() {
		return kaishishijian;
	}
				
	
	/**
	 * 设置：结束时间
	 */
	 
	public void setJieshushijian(Date jieshushijian) {
		this.jieshushijian = jieshushijian;
	}
	
	/**
	 * 获取：结束时间
	 */
	public Date getJieshushijian() {
		return jieshushijian;
	}
				
	
	/**
	 * 设置：实施人员
	 */
	 
	public void setShishirenyuan(String shishirenyuan) {
		this.shishirenyuan = shishirenyuan;
	}
	
	/**
	 * 获取：实施人员
	 */
	public String getShishirenyuan() {
		return shishirenyuan;
	}
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
			
}
