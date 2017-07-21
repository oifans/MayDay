package lb.mayday.ui.concert;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import cn.bmob.v3.BmobQuery;
import cn.bmob.v3.exception.BmobException;
import cn.bmob.v3.listener.FindListener;
import lb.mayday.R;
import lb.mayday.adapter.ConcertAdapter;
import lb.mayday.bean.Concert;

/**
 * 演唱会Fragment
 */
public class   ConcertFragment extends Fragment {

    private RecyclerView mRvConcert;
    private Context mContext;
    private ConcertAdapter adpater;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mContext = getActivity();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_concert, container, false);

        mRvConcert = (RecyclerView)rootView.findViewById(R.id.rv_concert);
        mRvConcert.setLayoutManager(new LinearLayoutManager(mContext));

        //载入演唱会数据
        BmobQuery<Concert> query = new BmobQuery<Concert>();
        //根据举办时间排序
        query.order("-date");
        query.findObjects(new FindListener<Concert>() {
            @Override
            public void done(List<Concert> list, BmobException e) {
                if(e==null){
                    adpater = new ConcertAdapter(list,mContext);
                    mRvConcert.setAdapter(adpater);
                }else {
                    adpater=null;
                    e.printStackTrace();
                }
            }
        });
        return rootView;
    }
}
