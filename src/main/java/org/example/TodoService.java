package org.example;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface TodoService {
    //Create any number of api calls here with the below syntax
    @GET("/todos/{id}")
    Call<Todo> getTodoById(@Path("id") String id);
}
