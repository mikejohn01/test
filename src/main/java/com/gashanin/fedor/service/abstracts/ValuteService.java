package com.gashanin.fedor.service.abstracts;

import com.gashanin.fedor.model.ValCurs;
import com.gashanin.fedor.model.Valute;
import retrofit2.Response;

import java.util.HashMap;
import java.util.List;

public interface ValuteService<T> {

    ValCurs getValCurs(String dateValCurs);

    Valute getValute(ValCurs valCurs, String currency);

    Valute getValuteCource(String currency, String dateValCurs);

}
