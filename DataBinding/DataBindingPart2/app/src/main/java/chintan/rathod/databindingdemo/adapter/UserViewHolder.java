package chintan.rathod.databindingdemo.adapter;

import android.databinding.DataBindingUtil;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import chintan.rathod.databindingdemo.Model.User;
import chintan.rathod.databindingdemo.databinding.UserItemBinding;

public class UserViewHolder extends RecyclerView.ViewHolder {
    private UserItemBinding binding;
 
    public UserViewHolder(View itemView) {
        super(itemView);
        binding = DataBindingUtil.bind(itemView);
    }
 
    public void bind(User user) {
        binding.setUser(user);
    }
 
}