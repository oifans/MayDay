package lb.mayday.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import cn.bmob.v3.datatype.BmobDate;

/**
 * Created by LB on 2017/7/20.
 * 时间工具类
 */

public class TimeUtil {
    public static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日hh时mm分");

    /**
     * 将字符串日期转换为Date对象
     *
     * @param strDate
     * @return
     */
    public static Date StringToDate(String strDate) {
        try {
            return dateFormat.parse(strDate);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 将字符串日期转换为BmobDate对象
     * @param strDate
     * @return
     */
    public static BmobDate StringToBmobDate(String strDate) {
        try {
            return new BmobDate(dateFormat.parse(strDate));
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }
}
