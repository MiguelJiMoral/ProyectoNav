package com.example.g8s21navigetor.ui.multiplicas;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.g8s21navigetor.R;

public class MultiplicarFragment extends Fragment implements View.OnClickListener {
    EditText txtnum1, txtnum2;
    Button btncalcular;
    TextView lblresult;

    private MultiplicarViewModel mViewModel;

    public static MultiplicarFragment newInstance() {
        return new MultiplicarFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.multiplicar_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(MultiplicarViewModel.class);
        // TODO: Use the ViewModel
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        txtnum1 = view.findViewById(R.id.txtnum1M);
        txtnum2 = view.findViewById(R.id.txtnum2M);
        btncalcular = view.findViewById(R.id.btncalcularM);
        lblresult = view.findViewById(R.id.lblresultM);
        btncalcular.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btncalcularM:
                int num1 = Integer.parseInt(txtnum1.getText().toString());
                int num2 = Integer.parseInt(txtnum2.getText().toString());
                int result = num1 * num2;
                lblresult.setText(String.valueOf(result));
                break;
        }
    }
}