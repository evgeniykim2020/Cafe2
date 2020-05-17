package com.example.cafe2.ui.gallery;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.cafe2.R;

public class MenuFragment extends Fragment {


    private MenuViewModel galleryViewModel;
    private Button button1, button2, button3;
    private RelativeLayout relativeLayout1, relativeLayout2, relativeLayout3;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {



        galleryViewModel =
                ViewModelProviders.of(this).get(MenuViewModel.class);
        final View root = inflater.inflate(R.layout.fragment_menu, container, false);
        final TextView textView = root.findViewById(R.id.text_gallery);
        galleryViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });

        button1 = (Button) root.findViewById(R.id.button1);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                relativeLayout1 = (RelativeLayout) root.findViewById(R.id.chinese_frame);
                relativeLayout1.setVisibility(View.VISIBLE);
                relativeLayout2 = (RelativeLayout) root.findViewById(R.id.european_frame);
                relativeLayout2.setVisibility(View.INVISIBLE);
                relativeLayout3 = root.findViewById(R.id.kazakh_frame);
                relativeLayout3.setVisibility(View.INVISIBLE);
            }
        });

        button2 = (Button) root.findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                relativeLayout2 = (RelativeLayout) root.findViewById(R.id.european_frame);
                relativeLayout2.setVisibility(View.VISIBLE);
                relativeLayout1 = (RelativeLayout) root.findViewById(R.id.chinese_frame);
                relativeLayout1.setVisibility(View.INVISIBLE);
                relativeLayout3 = root.findViewById(R.id.kazakh_frame);
                relativeLayout3.setVisibility(View.INVISIBLE);
            }
        });

        button3 = (Button) root.findViewById(R.id.button3);
        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                relativeLayout2 = (RelativeLayout) root.findViewById(R.id.european_frame);
                relativeLayout2.setVisibility(View.INVISIBLE);
                relativeLayout1 = (RelativeLayout) root.findViewById(R.id.chinese_frame);
                relativeLayout1.setVisibility(View.INVISIBLE);
                relativeLayout3 = root.findViewById(R.id.kazakh_frame);
                relativeLayout3.setVisibility(View.VISIBLE);
            }
        });





        return root;



    }







}


