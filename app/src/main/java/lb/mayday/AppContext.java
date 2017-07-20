package lb.mayday;

import android.app.Application;

import cn.bmob.v3.Bmob;

/**
 * Created by LB on 2017/7/20.
 */

public class AppContext extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Bmob.initialize(this,Constants.BmobAppId);
    }
}
