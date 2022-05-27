package com.example.g8s21navigetor.ui.divides;

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

public class DividirFragment extends Fragment implements View.OnClickListener {
    EditText txtnum1, txtnum2;
    Button btncalcular;
    TextView lblresult;
    private DividirViewModel mViewModel;

    public static DividirFragment newInstance() {
        return new DividirFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.dividir_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(DividirViewModel.class);
        // TODO: Use the ViewModel
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(DividirViewModel.class);
        txtnum1 = view.findViewById(R.id.txtnum1D);
        txtnum2 = view.findViewById(R.id.txtnum2D);
        btncalcular = view.findViewById(R.id.btncalcularD);
        lblresult = view.findViewById(R.id.lblresultD);
        btncalcular.setOnClickListener(this);
        lblresult.setText(String.valueOf(mViewModel.getResultD()));
    }
    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btncalcularD:
                int num1 = Integer.parseInt(txtnum1.getText().toString());
                int num2 = Integer.parseInt(txtnum2.getText().toString());
                if (num2!=0){
                    int result = num1/num2;
                    mViewModel.setResultD(result);
                    lblresult.setText(String.valueOf(mViewModel.getResultD()));
                } else {

                }
                break;
        }
    }
}