package com.example.administrator.myapplication;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class LightAdapter extends BaseAdapter {
    private List<Light> list;
    public void setList(List<Light> list) {
        this.list = list;
    }
    private Context context;
    private  LayoutInflater layoutInflater;

    public LightAdapter(Context context) {
        this.context = context;
        layoutInflater = LayoutInflater.from(context);
    }


    @Override   //데이터의 수
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override   //해당 위치의 데이터를 보여주는 convertview를 만듬
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null) {
            //inflation
            convertView = layoutInflater.inflate(R.layout.light_item, null);
        }

        //data setting
        Light light = list.get(position);

        ImageView lightImage = (ImageView) convertView.findViewById(R.id.lightimage);
        lightImage.setImageResource(light.getImage());

        TextView lightTitle = (TextView) convertView.findViewById(R.id.lighttitle);
        lightTitle.setText(light.getTitle());

        TextView lightContent = (TextView) convertView.findViewById(R.id.lightcontent);
        lightContent.setText(light.getContent());

        return convertView;
    }
}
