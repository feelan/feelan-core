/* 
* 文件名：Description.java 
* 
* 版本信息： 
* 日期：2012-2-5 
* Copyright  Corporation 2012 
* 版权所有 
* 
*/
package net.feelan.core.common;

import java.util.Date;

/** 
* 类名称：DateRange 
* 类描述： 日期范围或日期区间对象
* 
* 创建人：Feelan
* 创建时间：2012-10-11 上午11:30:59 
* @version 
* 
*/
public class DateRange {

    private Date lower;
    private Date upper;

    public DateRange() {
    }

    public DateRange(Date lower, Date upper) {
        this.lower = lower;
        this.upper = upper;
    }

    public Date getLower() {
        return lower;
    }

    public void setLower(Date lower) {
        this.lower = lower;
    }

    public Date getUpper() {
        return upper;
    }

    public void setUpper(Date upper) {
        this.upper = upper;
    }
}
