package com.example.recyclerview;

import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.solver.ArrayLinkedVariables;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import holder.Textname;

public class contactRecvAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder>{
    private ArrayList<contact> contacts=new ArrayList<>();


    public contactRecvAdapter(ArrayList<contact> contacts) {
        this.contacts=contacts;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.contact_view,parent,false);
        viewHolder holder=new viewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
      //  ArrayList title= contacts.get(position);

        contact current=contacts.get(position);
        holder.textname.set



    }

    @Override
    public int getItemCount() {
        return contacts.size();
    }



    public class viewHolder extends RecyclerView.ViewHolder{

         TextView textname;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
           textname=itemView.findViewById(R.id.txtName);
        }
    }
}
