package com.example.checkapartament_app.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.checkapartament_app.R;
import com.example.checkapartament_app.databinding.FragmentSecondBinding;
import com.example.checkapartament_app.model.Departamento;

public class SecondFragment extends Fragment {

    private FragmentSecondBinding binding;

    @Override
    public View onCreateView( LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        Departamento d = (Departamento) getArguments().getSerializable("item");

        binding = FragmentSecondBinding.inflate(inflater, container, false);

        binding.lblProyecto.setText(d.getProyecto());
        binding.lblDireccion.setText(d.getDireccion());
        binding.lblNumero.setText(String.valueOf(d.getNroDepartamento()));


        binding.checkBox.setChecked(d.getTerminacionL().get(0).getEstado());
        binding.checkBox2.setChecked(d.getTerminacionL().get(1).getEstado());
        binding.checkBox3.setChecked(d.getTerminacionL().get(2).getEstado());
        binding.checkBox5.setChecked(d.getTerminacionL().get(3).getEstado());


        binding.btnGuardar.setOnClickListener(v -> {
            d.getTerminacionL().get(0).setEstado(binding.checkBox.isChecked());
            d.getTerminacionL().get(1).setEstado(binding.checkBox2.isChecked());
            d.getTerminacionL().get(2).setEstado(binding.checkBox3.isChecked());
            d.getTerminacionL().get(3).setEstado(binding.checkBox5.isChecked());
            d.setEstadoGeneral(2);
            int total = d.calcular();

            binding.lblTotal.setText(String.valueOf(total));

        });



        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        /*binding.buttonSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NavHostFragment.findNavController(SecondFragment.this)
                        .navigate(R.id.action_SecondFragment_to_FirstFragment);
            }
        });*/
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}