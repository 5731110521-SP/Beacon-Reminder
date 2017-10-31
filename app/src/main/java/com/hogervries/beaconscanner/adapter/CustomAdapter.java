package com.hogervries.beaconscanner.adapter;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.hogervries.beaconscanner.R;

import java.util.List;

/**
 * Created by Palida on 01-Nov-17.
 */

public class CustomAdapter extends BaseAdapter {
    Context mContext;
    //String[] strName;
    //String[] des;
    //int[] resId;
    private List<String> name;
    private List<Integer> pic;

    public CustomAdapter(Context context, List<String> name, List<Integer> pic) {
        this.mContext= context;
        this.name = name;
        this.pic = pic;
    }

    public int getCount() {
        return name.size();
    }

    public Object getItem(int position) {
        return null;
    }

    public long getItemId(int position) {
        return 0;
    }

    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater mInflater =
                (LayoutInflater)mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if(view == null)
            view = mInflater.inflate(R.layout.singlerow, parent, false);

        TextView textView = (TextView)view.findViewById(R.id.name);
        textView.setText(name.get(position));

        ImageView imageView = (ImageView)view.findViewById(R.id.pic);
        imageView.setBackgroundResource(pic.get(position));

        LinearLayout layout = (LinearLayout)view.findViewById(R.id.layout);
        if(position%2==0)
            layout.setBackgroundColor(mContext.getResources().getColor(R.color.one));
        else
            layout.setBackgroundColor(mContext.getResources().getColor(R.color.two));

        return view;
    }
}
