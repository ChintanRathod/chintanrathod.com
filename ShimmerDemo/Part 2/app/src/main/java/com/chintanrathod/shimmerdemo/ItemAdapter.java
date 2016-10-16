package com.chintanrathod.shimmerdemo;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by Chintan Rathod. (www.chintanrathod.com)
 */
public class ItemAdapter extends RecyclerView.Adapter<ItemHolder> {

    private List<Celebrity> celebrityList;

    public ItemAdapter(List<Celebrity> celebrityList) {
        this.celebrityList = celebrityList;
    }

    @Override
    public ItemHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_layout, parent, false);

        return new ItemHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ItemHolder holder, int position) {
        Celebrity item = celebrityList.get(position);

        if(item.isShowShimmer()){
            holder.shimmerFrameLayout.startShimmerAnimation();
        }else {
            holder.shimmerFrameLayout.stopShimmerAnimation();
            holder.txtCelebName.setBackground(null);
            holder.txtCelebMovie.setBackground(null);

            holder.txtCelebName.setText(item.getName());
            holder.txtCelebMovie.setText(item.getFamousMovie());
            Picasso.with(holder.txtCelebName.getContext()).load(item.getProfilePhotoLocation()).into(holder.profileImage);
        }
    }

    @Override
    public int getItemCount() {
        return celebrityList.size();
    }
}
