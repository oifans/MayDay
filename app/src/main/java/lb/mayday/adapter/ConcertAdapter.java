package lb.mayday.adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.List;

import lb.mayday.R;
import lb.mayday.bean.Concert;
import lb.mayday.util.OpenActivity;

/**
 * Created by LB on 2017/7/20.
 * 演唱会列表Adapter
 */

public class ConcertAdapter extends RecyclerView.Adapter <ConcertAdapter.MyViewHolder>{
    private List<Concert> mDatas;
    private Context mContext;

    public ConcertAdapter(List<Concert> mDatas, Context mContext) {
        this.mDatas = mDatas;
        this.mContext = mContext;
    }

    public void setmDatas(List<Concert> mDatas) {
        this.mDatas = mDatas;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(mContext).inflate(R.layout.item_concert, parent, false);
        MyViewHolder holder = new MyViewHolder(itemView);
        return holder;
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        final Concert curConcert = mDatas.get(position);
        holder.mTvName.setText(curConcert.getName());
        holder.mTvAddress.setText(curConcert.getAddress());
        holder.mTvNum.setText(curConcert.getNum().toString()+"人要去");
        holder.mTvTime.setText(curConcert.getDate().getDate());
        //如果活动已经结束则变化背景色
        if(curConcert.getEnd()) {
            holder.mRlItem.setBackgroundColor(mContext.getResources().getColor(R.color.itemEnd));
        }

        //holder Item点击
        holder.mRlItem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Toast.makeText(mContext,curConcert.getName(),Toast.LENGTH_SHORT).show();
                OpenActivity.showConcertDetail(mContext,curConcert);
            }
        });
    }


    @Override
    public int getItemCount() {
        return mDatas.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {
        ImageView mIv;
        TextView mTvName;
        TextView mTvAddress;
        TextView mTvTime;
        TextView mTvNum;
        RelativeLayout mRlItem;
        public MyViewHolder(View itemView) {
            super(itemView);
            mIv = (ImageView) itemView.findViewById(R.id.iv_image);
            mTvName = (TextView) itemView.findViewById(R.id.tv_name);
            mTvAddress = (TextView) itemView.findViewById(R.id.tv_address);
            mTvTime = (TextView) itemView.findViewById(R.id.tv_time);
            mTvNum = (TextView) itemView.findViewById(R.id.tv_people);
            mRlItem = (RelativeLayout) itemView;
        }
    }

}
