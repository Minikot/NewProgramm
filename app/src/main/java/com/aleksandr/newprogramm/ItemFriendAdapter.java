package com.aleksandr.newprogramm;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Aleksandr on 08.09.17.
 */

public class ItemFriendAdapter extends RecyclerView.Adapter<ItemFriendAdapter.ViewHolder> {

    private ArrayList<Friends> friends = new ArrayList<>();

    public ItemFriendAdapter(ArrayList<Friends> friends) {
        this.friends = friends;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.adapter_item_friends, parent, false);
        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.bindTo(friends.get(holder.getAdapterPosition()));
    }

    @Override
    public int getItemCount() {
        return friends.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvName;
        View container;

        public ViewHolder(View itemView) {
            super(itemView);
            tvName = (TextView) itemView.findViewById(R.id.tv_name);
            container = itemView;
        }

        public void bindTo(Friends friends) {
            tvName.setText(friends.getName());

//            itemView.setOnClickListener(new View.OnClickListener() {   Так тоже можна. Удалив при этом container = itemView; и View container;
            container.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(v.getContext(), FriendActivity.class);
                    intent.putExtra(FriendActivity.EXTRA_FRIEND, getAdapterPosition());
                    v.getContext().startActivity(intent);
                }
            });
        }

    }
}
