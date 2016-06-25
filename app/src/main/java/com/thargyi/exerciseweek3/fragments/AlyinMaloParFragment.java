package com.thargyi.exerciseweek3.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.thargyi.exerciseweek3.R;

/**
 * Created by Dell on 23-Jun-16.
 */
public class AlyinMaloParFragment extends Fragment {

    public AlyinMaloParFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_alyin_malo_par, container, false);
    }
}

