package chintan.rathod.recyclerviewsample;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by Chintan Rathod. (www.chintanrathod.com)
 */
public class ItemHolder extends RecyclerView.ViewHolder {

    public TextView txtCelebName, txtCelebMovie;
    public CircleImageView profileImage;

    public ItemHolder(View view) {
        super(view);
        txtCelebName = (TextView) view.findViewById(R.id.txtCelebName);
        txtCelebMovie = (TextView) view.findViewById(R.id.txtCelebMovie);
        profileImage = (CircleImageView) view.findViewById(R.id.profileImage);
    }
}