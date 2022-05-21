package com.example.myapplication.ui.profile;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.myapplication.R;

public class Register extends Fragment {

    Button login,register;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View root = inflater.inflate(R.layout.fragment_register, container, false);

        login=root.findViewById(R.id.bt_login);
        register=root.findViewById(R.id.bt_register);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ProfileFragment pf=new ProfileFragment();
                ft.replace(R.id.register, pf);
                ft.commit();

                login.setVisibility(View.GONE);
                register.setVisibility(View.GONE);
            }
        });
        return root;
    }
}