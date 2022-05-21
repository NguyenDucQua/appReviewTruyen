package com.example.myapplication.ui.profile;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myapplication.MainActivity;
import com.example.myapplication.R;
import com.example.myapplication.ui.notifications.NotificationsViewModel;

import java.util.HashMap;
import java.util.Map;

public class ProfileFragment extends Fragment {
    private ProfileViewModel ProfileViewModel;
    Button login,register;//khoi tao nut dn
    EditText username,password;// khởi tạo thanh nhập username và password

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        ProfileViewModel = ViewModelProviders.of(this).get(ProfileViewModel.class);
        final View root = inflater.inflate(R.layout.fragment_profile, container, false);
        final TextView textView = root.findViewById(R.id.text_profile);
        ProfileViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });


        login=root.findViewById(R.id.bt_login);
        register=root.findViewById(R.id.bt_register);

        username=root.findViewById(R.id.username);
        password=root.findViewById(R.id.password);
        login.setOnClickListener(new View.OnClickListener() {
        String user=username.getText().toString();
        String pass=password.getText().toString();
            @Override
            public void onClick(View view) {
                int usersize = username.getText().length();
                int passsize = password.getText().length();
                if(usersize > 0 && passsize > 0) {

                    String user = username.getText().toString();
                    String pass = password.getText().toString();
                    if(user.equals("quan") && pass.equals("quan123")){
                        FragmentManager fm = getFragmentManager();
                        FragmentTransaction ft = fm.beginTransaction();
                        Login lg=new Login();
                        ft.replace(R.id.fragment_login, lg);
                        ft.commit();
                        login.setVisibility(View.GONE);
                        register.setVisibility(View.GONE);
                    }
                }
                else{
                    Toast.makeText(getActivity(),"Vui lòng nhập đầy đủ thông tin",Toast.LENGTH_SHORT).show();
                }
            }
        });
        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                Register rg=new Register();
                ft.replace(R.id.fragment_login, rg);
                ft.commit();
                login.setVisibility(View.GONE);
                register.setVisibility(View.GONE);
            }
        });

        return root;
    }


}
