package com.example.mohamed.splash.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.mohamed.splash.R;

public class ServiceProviderAdapter extends RecyclerView.Adapter<ServiceProviderAdapter.Holder> {
 Context context;

 public ServiceProviderAdapter(Context mContext){
     context=mContext;
 }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view= LayoutInflater.from(context).inflate(R.layout.service_provider_list_item,viewGroup,false);



        return new Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int i) {

    }

    @Override
    public int getItemCount() {
        return 4;
    }


    public class Holder  extends RecyclerView.ViewHolder{
        public Holder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
