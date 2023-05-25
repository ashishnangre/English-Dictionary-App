package com.example.mydictionary;

import com.example.mydictionary.Models.ApiResponse;

public interface OnFetchDataListener {
    void onFetchData(ApiResponse apiResponse, String message);
    void onError(String message);
}
