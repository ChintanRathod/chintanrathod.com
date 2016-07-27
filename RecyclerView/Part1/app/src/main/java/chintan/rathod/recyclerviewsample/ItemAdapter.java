package chintan.rathod.recyclerviewsample;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by Rathod on 18-Jul-16.
 */
public class ItemAdapter extends RecyclerView.Adapter<ItemHolder> {

    private List<Item> itemList;

    public ItemAdapter(List<Item> itemList) {
        this.itemList = itemList;
    }

    @Override
    public ItemHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_layout, parent, false);

        return new ItemHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ItemHolder holder, int position) {
        Item item = itemList.get(position);
        holder.txtDescription.setText(item.getDescription());
    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }
}
