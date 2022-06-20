package com.gashanin.fedor.service.abstracts;

import com.gashanin.fedor.model.ValCurs;
import com.gashanin.fedor.model.Valute;

public interface ValuteService<T> {

    ValCurs getValCurs(String dateValCurs);

    Valute getValute(ValCurs valCurs, String currency);

    Valute getValuteRate(String currency, String dateValCurs);

}
