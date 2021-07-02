package com.supriya.bankingsystem.adapter;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.supriya.bankingsystem.R;

public class ViewHolder extends RecyclerView.ViewHolder {

    public TextView mName;
    public TextView mPhonenumber;
    public TextView mBalance;
    TextView mRupee;
    TextView mRupeeslash;
    public TextView mName1;
    public TextView mName2;
    public TextView mDate;
    public TextView mTransc_status;
    ImageView mArrow;
    View mView;

    public ViewHolder(@NonNull View itemView) {
        super(itemView);
        mView = itemView;

        mName = itemView.findViewById(R.id.CustName);
        mPhonenumber = itemView.findViewById(R.id.AccNum);
        mBalance = itemView.findViewById(R.id.AccBal);
        mRupee = itemView.findViewById(R.id.rupee);
        mRupeeslash = itemView.findViewById(R.id.rupeeslash);

        mName1 = itemView.findViewById(R.id.name1);
        mName2 = itemView.findViewById(R.id.name2);
        mDate = itemView.findViewById(R.id.date);
        mArrow = itemView.findViewById(R.id.arrow);
        mTransc_status = itemView.findViewById(R.id.transaction_status);

        itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mClickListener.onItemClick(view, getAdapterPosition());
            }
        });

    }
    private ViewHolder.ClickListener mClickListener;
    public interface  ClickListener{
        void onItemClick(View view, int position);
    }

    public void setOnClickListener(ViewHolder.ClickListener clickListener){
        mClickListener = clickListener;
    }
}
