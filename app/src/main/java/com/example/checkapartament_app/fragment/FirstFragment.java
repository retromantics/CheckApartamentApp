package com.example.checkapartament_app.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.checkapartament_app.R;
import com.example.checkapartament_app.adapter.DepartamentoAdapter;
import com.example.checkapartament_app.databinding.FragmentFirstBinding;
import com.example.checkapartament_app.model.Departamento;

import java.util.ArrayList;


public class FirstFragment extends Fragment {

    private FragmentFirstBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        //Mi parte
        //1.Traigo la lista y lleno el array
        ArrayList<Departamento> DepL = (ArrayList<Departamento>) getArguments().getSerializable("lista");


        //2.Creo el adapter y le paso la lsita
        DepartamentoAdapter adapter = new DepartamentoAdapter(DepL);

        //3.lleno el rv
        binding = FragmentFirstBinding.inflate(inflater, container, false);
        binding.rvListado.setLayoutManager(new LinearLayoutManager(inflater.getContext()));
        binding.rvListado.setAdapter(adapter);

        adapter.setListener(item->{
            //recibe la vista y navega hacia el otro fragment mediante la el action
            Bundle bundle = new Bundle();
            bundle.putSerializable("item",item);
            NavHostFragment.findNavController(FirstFragment.this)
                    .navigate(R.id.action_FirstFragment_to_SecondFragment,bundle);
        });
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        /*binding.buttonFirst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(FirstFragment.this)
                        .navigate(R.id.action_FirstFragment_to_SecondFragment);
            }
        });*/
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}