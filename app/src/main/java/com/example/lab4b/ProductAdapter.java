package com.example.lab4b;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.List;

public class ProductAdapter extends BaseAdapter {
    private Context context;
    private List<Product> products;
    private int layout;

    public ProductAdapter(Context context, List<Product> products, int layout) {
        this.context = context;
        this.products = products;
        this.layout = layout;
    }

    @Override
    public int getCount() {
        return products.size();
    }

    @Override
    public Object getItem(int i) {
        return products.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        if(view==null){
            view= LayoutInflater.from(viewGroup.getContext()).inflate(layout, viewGroup, false);
        }
        ImageView img=(ImageView) view.findViewById(R.id.img);
        TextView tvName=(TextView) view.findViewById(R.id.name);
        RatingBar ratingBar=(RatingBar) view.findViewById(R.id.ratingBar);
        TextView tvSumVote=(TextView) view.findViewById(R.id.sumVote);
        TextView tvPrice=(TextView) view.findViewById(R.id.price);
        TextView tvDiscount=(TextView) view.findViewById(R.id.discount);

        img.setImageResource(products.get(i).getImg());
        tvName.setText(products.get(i).getName());
        ratingBar.setRating(products.get(i).getRating());
        tvSumVote.setText(products.get(i).getSumVote());
        tvPrice.setText(Double.toString(products.get(i).getPrice()));
        tvDiscount.setText(products.get(i).getDiscount());
        return view;
    }
}
