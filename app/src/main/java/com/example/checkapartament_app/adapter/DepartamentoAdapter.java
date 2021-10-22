package com.example.checkapartament_app.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.checkapartament_app.R;
import com.example.checkapartament_app.databinding.ItemLayoutBinding;
import com.example.checkapartament_app.model.Departamento;

import java.util.ArrayList;

public class DepartamentoAdapter extends RecyclerView.Adapter<DepartamentoAdapter.CustomViewHolder>{

    //De momento le apso un listado, hasta q entienda como sacar la data de otro lado
    ArrayList<Departamento> listado;
    private OnClickListener listener;

    public DepartamentoAdapter(ArrayList<Departamento> departamentoL) {
        this.listado = departamentoL;
    }

    @NonNull
    @Override
    public CustomViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent,false);
        return new CustomViewHolder(v,listener);
    }

    @Override
    public void onBindViewHolder(@NonNull CustomViewHolder holder, int position) {
        holder.bindData(listado.get(position));
    }

    @Override
    public int getItemCount() {
        return listado.size();
    }

    class CustomViewHolder extends RecyclerView.ViewHolder{

        OnClickListener listener;
        ItemLayoutBinding b;


        public CustomViewHolder(@NonNull View itemView, OnClickListener listener) {
            super(itemView);
            b = ItemLayoutBinding.bind(itemView);
            this.listener = listener;
        }

        public void bindData(Departamento dep){
            b.lblNombre.setText(dep.getProyecto());
            b.lblNro.setText(String.valueOf(dep.getNroDepartamento()));
            b.lblDir.setText(dep.getDireccion());

            itemView.setOnClickListener(v -> {
                listener.onProductoClick(dep);
            });
        }
    }

    public interface OnClickListener{
        void onProductoClick(Departamento d);
    }

    public void setListener(OnClickListener listener) {
        this.listener = listener;
    }
}
