package com.ammy.recylerview.adapters;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.ammy.recylerview.R;

/**
 * Created by amandeepsingh on 8/8/16.
 */
public class HorizontalAdapter extends RecyclerView.Adapter<HorizontalAdapter.HorizonHolder> {

//    int[] drawables = {R.drawable.one, R.drawable.two, R.drawable.three, R.drawable.four, R.drawable.one, R.drawable.two, R.drawable.three};
    private int[] drawables = {R.drawable.ic_face, R.drawable.ic_face, R.drawable.ic_face, R.drawable.ic_face, R.drawable.ic_face};

    @Override
    public HorizonHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());

        View contactView = inflater.inflate(R.layout.view_item, parent, false);
        return new HorizonHolder(contactView);
    }

    @Override
    public void onBindViewHolder(HorizonHolder holder, int position) {

        holder.imageview.setImageResource(drawables[position]);
    }

    @Override
    public int getItemCount() {
        return drawables.length;
    }

    class HorizonHolder extends RecyclerView.ViewHolder {

        ImageView imageview;

        public HorizonHolder(View itemView) {
            super(itemView);
            imageview = (ImageView) itemView.findViewById(R.id.iv_item);
        }
    }

}
