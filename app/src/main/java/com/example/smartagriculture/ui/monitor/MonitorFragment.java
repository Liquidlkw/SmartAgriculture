package com.example.smartagriculture.ui.monitor;

import android.database.DatabaseUtils;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import com.example.smartagriculture.R;
import com.example.smartagriculture.databinding.FragmentMonitorBinding;

public class MonitorFragment extends Fragment {

    private MonitorViewModel monitorViewModel;
    private FragmentMonitorBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        monitorViewModel = new ViewModelProvider(this).get(MonitorViewModel.class);
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_monitor,container,false);
        binding.setViewModel(monitorViewModel);
        return binding.getRoot();
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }
}