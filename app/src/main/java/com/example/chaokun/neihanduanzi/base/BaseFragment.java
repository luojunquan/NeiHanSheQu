package com.example.chaokun.neihanduanzi.base;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;




public class BaseFragment extends Fragment implements ConstantString {
    public Context context;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context=getActivity();

    }

    @Override
    public void onDestroy() {
        super.onDestroy();

    }


}
