package com.lijizhi.studydemo.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.lijizhi.studydemo.R;
import com.lijizhi.studydemo.entity.GirlData;
import com.lijizhi.studydemo.utils.PicassoUtils;

import java.util.List;

import static android.support.v7.appcompat.R.attr.height;

/*  项目名 StudyDemo
  *  包名  com.lijizhi.studydemo.adapter
  *  文件名: GridAdapter
  *  创建者 : LJZ
  *  创建时间:2017/8/14 0014 上午 5:16
  *  描述     妹纸适配器
*/
public class GridAdapter extends BaseAdapter {

    private Context mContext;
    private List<GirlData> mList;
    private LayoutInflater inflater;
    private GirlData data;
    private WindowManager wm;
    //屏幕宽
    private int width;

    public GridAdapter(Context mContext, List<GirlData> mList) {
        this.mContext = mContext;
        this.mList = mList;
        inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        wm = (WindowManager) mContext.getSystemService(Context.WINDOW_SERVICE);
        width = wm.getDefaultDisplay().getWidth();
    }

    @Override
    public int getCount() {
        return mList.size();
    }

    @Override
    public Object getItem(int position) {
        return mList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder = null;
        if(convertView == null){
            viewHolder = new ViewHolder();
            convertView = inflater.inflate(R.layout.girl_item,null);
            viewHolder.imageView = (ImageView) convertView.findViewById(R.id.imageview);
            convertView.setTag(viewHolder);
        }else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        data = mList.get(position);
        //解析图片
        String url = data.getImgUrl();

        PicassoUtils.loadImageViewSize(mContext,url,width/2,900,viewHolder.imageView);

        return convertView;
    }

    class ViewHolder{
        private ImageView imageView;
    }
}
