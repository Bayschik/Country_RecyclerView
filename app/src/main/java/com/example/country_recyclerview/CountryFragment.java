package com.example.country_recyclerview;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class CountryFragment extends Fragment {
    private RecyclerView rvCountry;
    private ArrayList<String> countryList = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_country, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        rvCountry = requireActivity().findViewById(R.id.rv_country);
        loadData();
        CountryAdapter countryAdapter = new CountryAdapter(countryList);
        rvCountry.setAdapter(countryAdapter);
    }

    private void loadData() {
        countryList.add("KYRGYZSTAN");
        countryList.add("CHINA");
        countryList.add("SWITZERLAND");
        countryList.add("RUSSIA");
        countryList.add("KAZAKHSTAN");
        countryList.add("UZBEKISTAN");
        countryList.add("USA");
        countryList.add("OAE");
        countryList.add("QATAR");
        countryList.add("UKRAINE");
        countryList.add("CANADA");
        countryList.add("MEXICO");
        countryList.add("PORTUGAL");
        countryList.add("GREAT BRITAIN");
        countryList.add("ARGENTINA");
        countryList.add("BRAZIL");
        countryList.add("BELGIUM");
        countryList.add("SPAIN");
        countryList.add("ITALY");
        countryList.add("NETHERLANDS");
        countryList.add("AUSTRALIA");
        countryList.add("KOREA");
        countryList.add("INDIA");
        countryList.add("PAKISTAN");
        countryList.add("URUGUAY");
        countryList.add("FRANCE");
    }
}