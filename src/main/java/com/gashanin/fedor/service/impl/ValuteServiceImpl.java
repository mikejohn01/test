package com.gashanin.fedor.service.impl;

import com.gashanin.fedor.model.ValCurs;
import com.gashanin.fedor.model.Valute;
import com.gashanin.fedor.service.abstracts.ValCursApi;
import com.gashanin.fedor.service.abstracts.ValuteService;
import lombok.NoArgsConstructor;
import okhttp3.OkHttpClient;
import org.springframework.stereotype.Service;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.jaxb.JaxbConverterFactory;
import retrofit2.converter.simplexml.SimpleXmlConverterFactory;

import java.util.HashMap;

@NoArgsConstructor
@Service
public class ValuteServiceImpl  {

    private final static String API_BASE_URL = "http://www.cbr.ru/scripts/XML_daily.asp/";

    public ValCurs getValCurs() {
//        ValCurs valCurs = null;
        OkHttpClient.Builder httpClient = new OkHttpClient.Builder();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(API_BASE_URL)
                .addConverterFactory(SimpleXmlConverterFactory.create())
//                .addConverterFactory(JaxbConverterFactory.create())
                .client(httpClient.build())
                .build();

        ValCursApi service = retrofit.create(ValCursApi.class);
        Call<ValCurs> callSync = service.getValCurs();
        try {
            System.out.println("Вошлий в трай");
            Response<ValCurs> response = callSync.execute();
            System.out.println("Response в message - " + response.message());
            System.out.println("Response в errorBody - " + response.errorBody());
            System.out.println("Response в headers - " + response.headers());
            System.out.println("Response в body - " + response.body());
            System.out.println("Response в code - " + response.code());
            ValCurs valCurs = response.body();
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        System.out.println();
        return new ValCurs();
    }
}
