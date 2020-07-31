package com.hellohasan.Student_Manager.database;

public interface QueryResponse<T> {
    void onSuccess(T data);
    void onFailure(String message);
}