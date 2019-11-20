package com.example.trabajofinalinterfaces.ui.home;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.example.trabajofinalinterfaces.ItemPerrito;
import com.example.trabajofinalinterfaces.R;

import static android.content.ContentValues.TAG;

public class HomeViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    Context context;
    ItemPerrito pList[];
    int fList[];
    LayoutInflater inflter;

    public HomeViewModel() {


        mText = new MutableLiveData<>();
        mText.setValue("");
    }

    public LiveData<String> getText() {
        return mText;
    }

    public HomeViewModel(Context applicationContext, ItemPerrito[] _pList, int[] fList) {
        this.context = context;
        this.pList = _pList;
        this.fList = fList;
        inflter = (LayoutInflater.from(applicationContext));
    }


    public int getCount() {
        return pList.length;
    }


    public Object getItem(int i) {
        return null;
    }


    public long getItemId(int i) {
        return 0;
    }


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