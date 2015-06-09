package com.example.adobillustratordesign;

import android.content.Context;
import android.graphics.Typeface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.List;

public class AITextAdapter extends BaseAdapter {

    private Context context;
    private LayoutInflater inflater;
    private List<String> textlist;
    

    static class CellHolder {
        TextView text_view;
    }

    public AITextAdapter(Context context, List<String> textlist) {
        this.context = context;
        this.inflater = LayoutInflater.from(context);
        this.textlist = textlist;        
    }

    @Override
    public int getCount() {
        return textlist.size();
    }

    @Override
    public Object getItem(int arg0) {
        return textlist.get(arg0);
    }

    @Override
    public long getItemId(int arg0) {
        return arg0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup arg2) {
        CellHolder cell = null;
        if (convertView == null) {
            cell = new CellHolder();
            convertView = inflater.inflate(R.layout.text_cell, null);
            cell.text_view = (TextView) convertView.findViewById(R.id.text_cell);
            convertView.setTag(cell);
        }
        else {
            cell = (CellHolder) convertView.getTag();
        }
        
        Typeface tf1= Typeface.createFromAsset(context.getAssets(),"fonts/Roboto-Regular.ttf");
        Typeface tf2= Typeface.createFromAsset(context.getAssets(),"fonts/SourceSansPro-Bold.ttf");
        Typeface tf3= Typeface.createFromAsset(context.getAssets(),"fonts/SourceSansPro-Regular.ttf");
        Typeface tf4= Typeface.createFromAsset(context.getAssets(),"fonts/SourceSansPro-Semibold.ttf");
        
        final String model = textlist.get(position);  
        cell.text_view.setText(textlist.get(position));        
        cell.text_view.setTypeface(tf2);

        cell.text_view.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                
            }
        });
        return convertView;
    }

    static class ViewHolder {
        TextView txt;
    }
}
