package com.newcrud.entity;

import com.alibaba.excel.annotation.ExcelIgnore;
import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

import java.util.Date;
@Data
public class DemoData {
    @ExcelProperty(value = "字符串标题")
    private String name;
    @ExcelProperty(value = "日期标题")
    private Date date;
    @ExcelProperty(value = "数字标题")
    private Double doubleData;
    /**
     * 忽略这个字段
     * */
    @ExcelIgnore
    private String ignore;
}
