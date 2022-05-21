package com.example.myapplication.ui.dashboard;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.widget.Toast;

import com.example.myapplication.R;
import com.example.myapplication.ui.profile.Login;

public class DashboardFragment extends Fragment  {
    TextView sp;
    Button op1,op2,op3,op4,a,b,c,d,e,f,g,h,max_min,min_max;
    ConstraintLayout fr_op1;
    LinearLayout type_view;
    private DashboardViewModel dashboardViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,ViewGroup container, Bundle savedInstanceState) {
        dashboardViewModel =ViewModelProviders.of(this).get(DashboardViewModel.class);
        View root = inflater.inflate(R.layout.fragment_dashboard, container, false);
        final TextView textView = root.findViewById(R.id.text_catagory);
        dashboardViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });

        sp=root.findViewById(R.id.sp);
        op1=root.findViewById(R.id.op1);
        op2=root.findViewById(R.id.op2);
        op3=root.findViewById(R.id.op3);
        op4=root.findViewById(R.id.op4);
        a=root.findViewById(R.id.a);
        b=root.findViewById(R.id.b);
        c=root.findViewById(R.id.c);
        d=root.findViewById(R.id.d);
        e=root.findViewById(R.id.e);
        f=root.findViewById(R.id.f);
        g=root.findViewById(R.id.g);
        h=root.findViewById(R.id.h);
        max_min=root.findViewById(R.id.max_min);
        min_max=root.findViewById(R.id.min_max);
        fr_op1=root.findViewById(R.id.type);
        type_view=root.findViewById(R.id.type_view);

        sp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                Detail d=new Detail();
                ft.replace(R.id.catagory, d);
                ft.commit();
            }
        });

        op1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"op1",Toast.LENGTH_SHORT).show();
                fr_op1.setVisibility(View.VISIBLE);
            }
        });
        op2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"op2",Toast.LENGTH_SHORT).show();

            }
        });
        op3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"op3",Toast.LENGTH_SHORT).show();
                type_view.setVisibility(View.VISIBLE);

            }
        });
        op4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"op4",Toast.LENGTH_SHORT).show();

            }
        });
        a.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"op4",Toast.LENGTH_SHORT).show();
                op1.setBackgroundResource(R.drawable.dragon);
                fr_op1.setVisibility(View.GONE);
            }
        });
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"op4",Toast.LENGTH_SHORT).show();
                op1.setBackgroundResource(R.drawable.cat);
                fr_op1.setVisibility(View.GONE);
            }
        });
        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"op4",Toast.LENGTH_SHORT).show();
                op1.setBackgroundResource(R.drawable.dog);
                fr_op1.setVisibility(View.GONE);
            }
        });
        d.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"op4",Toast.LENGTH_SHORT).show();
                op1.setBackgroundResource(R.drawable.spider);
                fr_op1.setVisibility(View.GONE);
            }
        });
        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"op4",Toast.LENGTH_SHORT).show();
                op1.setBackgroundResource(R.drawable.horse);
                fr_op1.setVisibility(View.GONE);
            }
        });
        f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"op4",Toast.LENGTH_SHORT).show();
                op1.setBackgroundResource(R.drawable.fish);
                fr_op1.setVisibility(View.GONE);
            }
        });
        g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"op4",Toast.LENGTH_SHORT).show();
                op1.setBackgroundResource(R.drawable.hippo);
                fr_op1.setVisibility(View.GONE);
            }
        });
        h.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getActivity(),"op4",Toast.LENGTH_SHORT).show();
                op1.setBackgroundResource(R.drawable.dragon);
                fr_op1.setVisibility(View.GONE);
            }
        });
        max_min.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                type_view.setVisibility(View.GONE);
            }
        });
        min_max.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                type_view.setVisibility(View.GONE);
            }
        });
        return root;
    }
}