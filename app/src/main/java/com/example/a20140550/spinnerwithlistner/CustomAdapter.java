package com.example.a20140550.spinnerwithlistner;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by 20140550 on 3/9/2019.
 */

public class CustomAdapter extends BaseAdapter {
    private String[] countryName;
    private String[] population;
    int[] flags;

    public CustomAdapter(Context context,int[] flags,String[] countryName, String[] population  ) {
        this.countryName = countryName;
        this.population = population;
        this.flags = flags;
        this.context = context;
    }

    Context context;
    @Override
    public int getCount() {
        return countryName.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup parent) {
        if(view==null)
        {
          LayoutInflater layoutInflater= (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view=  layoutInflater.inflate(R.layout.sample_view,null,false);

        }
        ImageView imageView= (ImageView) view.findViewById(R.id.imageViewID);
        imageView.setImageResource(flags[i]);

        TextView country= (TextView) view.findViewById(R.id.countryNameTextID);
        country.setText(countryName[i]);

        TextView people= (TextView) view.findViewById(R.id.populationTextID);
        people.setText(population[i]);

        return view;
    }
}
