package com.example.trabajofinalinterfaces;

import android.content.ClipData;
import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import static android.content.ContentValues.TAG;

public class ItemAdapter extends BaseAdapter {
    Context context;
    ItemPerrito pList[];
    int fList[];
    LayoutInflater inflter;

    public ItemAdapter(Context applicationContext, ItemPerrito[] _pList, int[] fList) {
        this.context = context;
        this.pList = _pList;
        this.fList = fList;
        inflter = (LayoutInflater.from(applicationContext));
    }

    @Override
    public int getCount() {
        return pList.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(final int i, View view, ViewGroup viewGroup) {
        view = inflter.inflate(R.layout.activity_listview, null);
        TextView titulo = (TextView) view.findViewById(R.id.textViewTitulo);

        ImageView icon = (ImageView) view.findViewById(R.id.icon);
        titulo.setText(pList[i].getTitulo());
        icon.setImageResource(fList[i]);
        //Button Button= (Button) convertView .findViewById(R.id.BUTTON1_ID);

        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.i(TAG,"Fila:"+i);
            } });



        return view;
    }

}
