package chintan.rathod.recyclerviewsample;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class ItemHolder extends RecyclerView.ViewHolder {
    public TextView txtDescription;

    public ItemHolder(View view) {
        super(view);
        txtDescription = (TextView) view.findViewById(R.id.txtDescription);
    }
}