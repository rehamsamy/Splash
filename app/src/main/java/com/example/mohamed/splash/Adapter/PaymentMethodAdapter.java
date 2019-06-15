package com.example.mohamed.splash.Adapter;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.provider.ContactsContract;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.v7.widget.RecyclerView;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.PopupWindow;

import com.example.mohamed.splash.R;
import com.example.mohamed.splash.sidemenuActivity.PaymentMethodActivity2;

public class PaymentMethodAdapter extends RecyclerView.Adapter<PaymentMethodAdapter.Holder> {

    Context context;
    OnItemClick mOnItemClick;

    View view;

    public interface OnItemClick{
        void onClick(int position);
    }
    public PaymentMethodAdapter(Context mcontext, OnItemClick onItemClick){

        context=mcontext;
        mOnItemClick=onItemClick;
    }
    @NonNull
    @Override
    public PaymentMethodAdapter.Holder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        view= LayoutInflater.from(context).inflate(R.layout.payment_list_item,viewGroup,false);

        return new PaymentMethodAdapter.Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        holder.imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              context.startActivity(new Intent(context, PaymentMethodActivity2.class));
            }
        });
        mOnItemClick.onClick(position);

    }


    @Override
    public int getItemCount() {
        return 2;
    }

    public class Holder  extends RecyclerView.ViewHolder{
        ImageView imageView;
        public Holder(@NonNull View itemView) {
            super(itemView);
           imageView=(ImageView) itemView.findViewById(R.id.edit_payment_button);



        }
    }


}
