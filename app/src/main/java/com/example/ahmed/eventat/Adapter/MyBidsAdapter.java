package com.example.ahmed.eventat.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.example.ahmed.eventat.Model.MyBidModel;
import com.example.ahmed.eventat.R;


public class MyBidsAdapter extends RecyclerView.Adapter<MyBidsAdapter.MyViewHolder> {
    private Context mContext;
    private java.util.List<MyBidModel> List;


    public MyBidsAdapter(Context mContext, java.util.List<MyBidModel> words) {
        this.mContext = mContext;
        List = words;

    }

    @Override
    public MyBidsAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.my_bids_row, parent, false);

        return new MyBidsAdapter.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(final MyBidsAdapter.MyViewHolder holder, final int position) {
        final MyBidModel listItem = List.get(position);
      //  holder.cartIcon.setImageResource(R.drawable.cart_icon);
        holder.productImg.setImageResource(listItem.getProductImage());
        holder.productDescription.setText(listItem.getProductDescri());
        holder.productName.setText(listItem.getProductName());
        holder.productPrice.setText(listItem.getProductSellingPricce());
        holder.ratingBar.setRating(3);

    }

    @Override
    public int getItemCount() {
        return List.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder {

        private final Context context;
        private ImageView cartIcon;
        private TextView productName;
        private TextView productPrice;
        private TextView productDescription;
        private ImageView productImg;
        private RatingBar ratingBar;


        public MyViewHolder(View view) {
            super(view);
            context = itemView.getContext();

            cartIcon = (ImageView) itemView.findViewById(R.id.cart_icon);
            productName = (TextView) itemView.findViewById(R.id.product_name);
            productPrice = (TextView) itemView.findViewById(R.id.product_price);
            productDescription = (TextView) itemView.findViewById(R.id.product_description);
            productImg = (ImageView) itemView.findViewById(R.id.product_img);
            ratingBar = (RatingBar) itemView.findViewById(R.id.ratingBar);

        }
    }
}