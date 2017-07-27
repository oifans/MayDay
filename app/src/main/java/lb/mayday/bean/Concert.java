package lb.mayday.bean;

import cn.bmob.v3.BmobObject;
import cn.bmob.v3.datatype.BmobDate;
import cn.bmob.v3.datatype.BmobFile;

/**
 * Created by LB on 2017/7/20.
 * 演唱会(活动)实体类
 */

public class Concert extends BmobObject {
    //演唱会类型
    public static final int TYPE_CONCERT = 1;

    //活动名字
    private String name;
    //地址
    private String address;
    //参与人数
    private Integer num;
    //是否已经结束
    private Boolean isEnd;
    //封面图
    private BmobFile pic;
    //活动日期
    private BmobDate date;
    //活动类型
    private Integer type;
    //活动介绍内容
    private String content;

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public Boolean getEnd() {
        return isEnd;
    }

    public void setEnd(Boolean end) {
        isEnd = end;
    }

    public BmobFile getPic() {
        return pic;
    }

    public void setPic(BmobFile pic) {
        this.pic = pic;
    }

    public BmobDate getDate() {
        return date;
    }

    public void setDate(BmobDate date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }


}
