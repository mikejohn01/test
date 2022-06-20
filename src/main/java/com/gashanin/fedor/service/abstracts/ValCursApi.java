package com.gashanin.fedor.service.abstracts;

import com.gashanin.fedor.model.ValCurs;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ValCursApi {
    @GET(".")
    Call<ValCurs> getValCurs();
}
