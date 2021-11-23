package com.example.payment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class PaymentAdapter extends RecyclerView.Adapter<PaymentAdapter.PaymentCardViewHolder>{

    private ArrayList<Payment> paymentInfo;

    public PaymentAdapter(ArrayList<Payment> paymentInfo) {
        this.paymentInfo = paymentInfo;
    }

    @NonNull
    @Override
    public PaymentCardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view =  LayoutInflater.from(parent.getContext()).inflate(R.layout.card_payment_history_record,parent,false);
        PaymentCardViewHolder pcvh = new PaymentCardViewHolder(view);
        return pcvh;
    }

    @Override
    public void onBindViewHolder(@NonNull PaymentCardViewHolder holder, int position) {

        Payment currentPayment = paymentInfo.get(position);

        holder.title.setText(currentPayment.getTitle());
        holder.amount.setText(currentPayment.getAmount());
        holder.datetime.setText(currentPayment.getDataTime());
        holder.refundStatus.setText(currentPayment.getRefundStatus());

    }

    @Override
    public int getItemCount() {
        return paymentInfo.size();
    }

    public class PaymentCardViewHolder extends RecyclerView.ViewHolder{

        TextView title,amount,datetime,refundStatus;

        public PaymentCardViewHolder(@NonNull View itemView) {
            super(itemView);

            title = itemView.findViewById(R.id.payment_history_record_title);
            amount = itemView.findViewById(R.id.payment_history_record_amount);
            datetime = itemView.findViewById(R.id.payment_history_record_datetime);
            refundStatus = itemView.findViewById(R.id.payment_history_record_refund_status);
        }
    }
}
