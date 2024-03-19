package com.example.worldskillsbank;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListAdapter1 extends BaseAdapter {

    private final LayoutInflater LInflater;
    private final ArrayList<ListData1> list;
    public ListAdapter1(Context context, ArrayList<ListData1> data){

        list = data;
        LInflater = (LayoutInflater) context
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public ListData1 getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        ViewHolder holder;
        View view = convertView;

        if ( view == null){
            holder = new ViewHolder();
            view = LInflater.inflate(R.layout.listview, parent, false);
            holder.flag = view.findViewById(R.id.imageView);
            holder.abbreviation = view.findViewById(R.id.abbreviation);
            holder.textView5 = view.findViewById(R.id.textView5);
            holder.name = view.findViewById(R.id.name);
            holder.capital = view.findViewById(R.id.capital);
            view.setTag(holder);
        }

        holder = (ViewHolder) view.getTag();
        ListData1 dataFlags = getData(position);

        holder.flag.setImageResource(dataFlags.getFlagID());
        holder.textView5.setText(view.getResources().getString(dataFlags.getNameID()));
        holder.abbreviation.setText(view.getResources().getString(dataFlags.getAbbreviationID()));
        holder.name.setText(view.getResources().getString(dataFlags.getSellID()));
        holder.capital.setText(view.getResources().getString(dataFlags.getBuyID()));


        return view;
    }

    ListData1 getData(int position){
        return (getItem(position));
    }

    private static class ViewHolder {
        public TextView capital;
        private ImageView flag;
        private TextView name;
        private TextView abbreviation;
        private TextView textView5;
    }
}