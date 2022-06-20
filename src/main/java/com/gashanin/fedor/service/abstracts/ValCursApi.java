package com.gashanin.fedor.service.abstracts;

import com.gashanin.fedor.model.ValCurs;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ValCursApi {
    @GET(".")
    Call<ValCurs> getValCurs(
            @Query("date_req") String date
    );
}
