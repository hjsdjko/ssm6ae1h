package com.entity.vo;

import com.entity.XiangmuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
 

/**
 * 项目
 * 手机端接口返回实体辅助类 
 * （主要作用去除一些不必要的字段）
 * @author 
 * @email 
 * @date 2021-04-27 14:01:51
 */
public class XiangmuVO  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
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
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date xiangmukaishishijian;
		
	/**
	 * 项目结束时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date xiangmujieshushijian;
				
	
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
