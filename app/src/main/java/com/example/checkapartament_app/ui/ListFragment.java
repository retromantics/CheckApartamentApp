package com.example.checkapartament_app.ui;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.checkapartament_app.R;
import com.example.checkapartament_app.adapter.DepartamentoAdapter;
import com.example.checkapartament_app.databinding.FragmentListBinding;
import com.example.checkapartament_app.model.Departamento;
import com.example.checkapartament_app.repository.DepartamentoRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class ListFragment extends Fragment {

    private FragmentListBinding binding;
    List<Departamento> lista = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {


        binding = FragmentListBinding.inflate(inflater, container, false);

        DepartamentoRepository repo = new DepartamentoRepository(getActivity().getApplication());

        ExecutorService ex = Executors.newSingleThreadExecutor();
        Handler h = new Handler(Looper.getMainLooper());

        ex.execute(()->{

            //2.Creo el adapter y le paso la lsita
            DepartamentoAdapter adapter = new DepartamentoAdapter((ArrayList<Departamento>) lista);

            h.post(()->{
                lista = repo.list();
                //3.lleno el rv
                binding.rvListado.setLayoutManager(new LinearLayoutManager(inflater.getContext()));
                binding.rvListado.setAdapter(adapter);
                adapter.setListener(item->{
                    NavHostFragment.findNavController(ListFragment.this)
                            .navigate(R.id.action_FirstFragment_to_SecondFragment);
                });
            });
        });




        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}