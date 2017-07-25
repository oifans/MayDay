package lb.mayday.util;

import android.content.Context;
import android.content.Intent;

import lb.mayday.ui.concert.ConcertDetailActivity;

/**
 * 所有打开活动
 * Created by Administrator on 2017/7/25/025.
 */

public class OpenActivity {
    /**
     * 打开演唱会详细
     * @param context
     * @param cid 演唱会id
     */
    public static void showConcertDetail(Context context,String cid){
        Intent intent= new Intent(context, ConcertDetailActivity.class);
        intent.putExtra("cid", cid);
        context.startActivity(intent);
    }
}
