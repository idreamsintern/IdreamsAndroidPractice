package com.example.idreams.practice.RecyclerView;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.idreams.practice.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by idreams on 2015/7/28.
 */
public class MyRecyclerViewAdapter extends
        RecyclerView.Adapter<MyRecyclerViewAdapter.ViewHolder> {
    // Provide a direct reference to each of the views within a data item
    // Used to cache the views within the item layout for fast access
    public static class ViewHolder extends RecyclerView.ViewHolder {
        // Your holder should contain a member variable
        // for any view that will be set as you render a row
        public TextView tvName;
        public TextView tvHometown;
        // We also create a constructor that accepts the entire item row
        // and does the view lookups to find each subview
        public ViewHolder(View itemView) {
            super(itemView);
            this.tvName = (TextView) itemView.findViewById(R.id.tvName);
            this.tvHometown = (TextView) itemView.findViewById(R.id.tvHometown);
        }
    }

    // ... view holder defined above...

    // Store a member variable for the users
    private ArrayList<User> users;
    // Store the context for later use
    private Context context;

    // Pass in the context and users array into the constructor
    public MyRecyclerViewAdapter(Context context, ArrayList<User> users) {
        this.users = users;
        this.context = context;
    }
    // Usually involves inflating a layout from XML and returning the holder
    @Override
    public MyRecyclerViewAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        // Inflate the custom layout
        View itemView = LayoutInflater.from(context).
                inflate(R.layout.item_user, parent, false);
        // Return a new holder instance
        return new MyRecyclerViewAdapter.ViewHolder(itemView);
    }

    // Involves populating data into the item through holder
    @Override
    public void onBindViewHolder(MyRecyclerViewAdapter.ViewHolder holder, int position) {
        // Get the data model based on position
        User user = users.get(position);
        // Set item views based on the data model
        holder.tvName.setText(user.name);
        holder.tvHometown.setText(user.hometown);
    }

    // Return the total count of items
    @Override
    public int getItemCount() {
        return users.size();
    }

    public void addItem(User user) {
        users.add(user);
    }
    public void clear() {
        users.clear();
        notifyDataSetChanged();
    }
    public void addAll(List<User> list) {
        users.addAll(list);
        notifyDataSetChanged();
    }

}
