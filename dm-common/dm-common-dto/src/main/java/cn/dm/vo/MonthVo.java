package cn.dm.vo;

import java.util.List;

/**
 * 按月份组装数据
 */
public class MonthVo {
    //当前日期（天）
    private Integer day;
    //当前日期的节目列表
    private List<ParentAndChildVo> itemList;

    public Integer getDay() {
        return day;
    }

    public void setDay(Integer day) {
        this.day = day;
    }

    public List<ParentAndChildVo> getItemList() {
        return itemList;
    }

    public void setItemList(List<ParentAndChildVo> itemList) {
        this.itemList = itemList;
    }
}
