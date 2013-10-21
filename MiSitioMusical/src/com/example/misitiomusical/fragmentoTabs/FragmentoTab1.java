package com.example.misitiomusical.fragmentoTabs;

import com.example.misitiomusical.R;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class FragmentoTab1 extends Fragment{
    @Override
    public View onCreateView(LayoutInflater inflater,
            ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_tab_1, container, false);
    }

}
