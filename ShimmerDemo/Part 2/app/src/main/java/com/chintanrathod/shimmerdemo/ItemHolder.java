package com.chintanrathod.shimmerdemo;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import com.facebook.shimmer.ShimmerFrameLayout;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by Chintan Rathod. (www.chintanrathod.com)
 */
public class ItemHolder extends RecyclerView.ViewHolder {

    public TextView txtCelebName, txtCelebMovie;
    public CircleImageView profileImage;
    public ShimmerFrameLayout shimmerFrameLayout;

    public ItemHolder(View view) {
        super(view);
        shimmerFrameLayout = (ShimmerFrameLayout) view.findViewById(R.id.fl_shimmer);
        txtCelebName = (TextView) view.findViewById(R.id.txtCelebName);
        txtCelebMovie = (TextView) view.findViewById(R.id.txtCelebMovie);
        profileImage = (CircleImageView) view.findViewById(R.id.profileImage);
    }
}