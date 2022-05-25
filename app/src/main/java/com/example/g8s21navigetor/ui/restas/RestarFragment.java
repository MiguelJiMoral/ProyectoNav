package com.example.g8s21navigetor.ui.restas;

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

public class RestarFragment extends Fragment implements View.OnClickListener{
    EditText txtnum1, txtnum2;
    Button btncalcularR;
    TextView lblResultR;

    private RestarViewModel mViewModel;

    public static RestarFragment newInstance() {
        return new RestarFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.restar_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(RestarViewModel.class);
        // TODO: Use the ViewModel
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState){
        super.onViewCreated(view, savedInstanceState);
        txtnum1 = view.findViewById(R.id.txtRnum1);
        txtnum2 = view.findViewById(R.id.txtRnum2);
        btncalcularR = view.findViewById(R.id.btncalculaR);
        lblResultR = view.findViewById(R.id.lblresultR);

        btncalcularR.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btncalculaR:
                int num1 = Integer.parseInt(txtnum1.getText().toString());
                int num2 = Integer.parseInt(txtnum2.getText().toString());
                int result = num1 - num2;
                lblResultR.setText(String.valueOf(result));
                break;
        }
    }
}