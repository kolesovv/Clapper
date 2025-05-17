package com.github.kolesovv.clapper;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class ReviewAdapter extends RecyclerView.Adapter<ReviewAdapter.ViewHolderReview> {

    public static final String TYPE_POSITIVE = "Позитивный";
    public static final String TYPE_NEGATIVE = "Отрицательный";
    private List<Review> reviews = new ArrayList<>();

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolderReview onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.review_item,
                parent,
                false
        );
        return new ViewHolderReview(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolderReview holder, int position) {

        Review review = reviews.get(position);

        String type = review.getType();
        int colorId = ContextCompat.getColor(holder.itemView.getContext(), R.color.coral);
        switch (type) {
            case TYPE_POSITIVE:
                colorId = ContextCompat.getColor(holder.itemView.getContext(), R.color.green);
                break;
            case TYPE_NEGATIVE:
                colorId = ContextCompat.getColor(holder.itemView.getContext(), R.color.carmine);
                break;
        }
        holder.linearLayoutReviewContainer.setBackgroundColor(colorId);
        holder.textViewAuthorName.setText(review.getAuthor());
        holder.textViewType.setText(type);
        holder.textViewReview.setText(review.getReview());
    }

    @Override
    public int getItemCount() {
        return reviews.size();
    }

    public class ViewHolderReview extends RecyclerView.ViewHolder {

        private final TextView textViewAuthorName;
        private final TextView textViewType;
        private final TextView textViewReview;
        private final LinearLayout linearLayoutReviewContainer;

        public ViewHolderReview(@NonNull View itemView) {
            super(itemView);
            textViewAuthorName = itemView.findViewById(R.id.textViewAuthorName);
            textViewType = itemView.findViewById(R.id.textViewType);
            textViewReview = itemView.findViewById(R.id.textViewReview);
            linearLayoutReviewContainer = itemView.findViewById(R.id.linearLayoutReviewContainer);
        }
    }
}
