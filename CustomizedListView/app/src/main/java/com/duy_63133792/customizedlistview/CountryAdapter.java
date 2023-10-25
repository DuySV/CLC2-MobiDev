package com.duy_63133792.customizedlistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.zip.Inflater;

public class CountryAdapter extends BaseAdapter {
    private ArrayList<Countruy> dsQuocGia;
    private Context context;
    private LayoutInflater inflater;//xml->java

    public CountryAdapter(ArrayList<Countruy> dsQuocGia, Context context) {
        this.dsQuocGia = dsQuocGia;
        this.context = context;
    }

    public CountryAdapter(Inflater inflater) {
        this.inflater = LayoutInflater.from(context);
    }

    class ControlHolder{
        ImageView coQG;
        TextView textViewName;
        TextView textViewPopulation;
    }
    @Override
    public int getCount() {
        return dsQuocGia.size();
    }

    @Override
    public Object getItem(int i) {
        return dsQuocGia.get(i);
    }

    @Override
    public long getItemId(int i) {
      return  0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ControlHolder itemControlsHolder;
        if (view==null){
            inflater.inflate(R.layout.item_layout_country,null);
        itemControlsHolder=new ControlHolder();
        itemControlsHolder.coQG=view.findViewById(R.id.imageView);
        itemControlsHolder.textViewName=view.findViewById(R.id.tvName);
        itemControlsHolder.textViewPopulation=view.findViewById(R.id.tvPopulation);
        view.setTag(itemControlsHolder);
        }
        else {
            itemControlsHolder=(ControlHolder)view.getTag();
        }
        Countruy nation1=dsQuocGia.get(i);
        itemControlsHolder.textViewName.setText(nation1.getCountryName());
        itemControlsHolder.textViewPopulation.setText("Population:"+nation1.getPopulation());
        int resImageID=context.getResources().getIdentifier(
                nation1.getCountryFlag(),"mipmap",
                context.getPackageName());
        itemControlsHolder.coQG.setImageResource(resImageID);
        return view;
    }
}
