package com.example.fpl.Fragments;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.fpl.R;

public class PickerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private int gameweekCount;
    private Context context;


    public PickerAdapter(Context context, int gameweekCount ) {
        this.gameweekCount = gameweekCount;
        this.context = context;
    }



    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
       View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_pickerview, parent, false);
        return new PickerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {

        ((PickerViewHolder)holder).bind(position);
    }

    @Override
    public int getItemCount() {
        return gameweekCount;
    }


    private class PickerViewHolder extends RecyclerView.ViewHolder {

        private TextView tv;

        public PickerViewHolder(View view) {
            super(view);

            tv = view.findViewById(R.id.pickerText);

        }

        public void bind(int position) {
            tv.setText(String.valueOf(position+1));
        }
    }
}
