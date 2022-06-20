package com.gashanin.fedor.service.abstracts;

import com.gashanin.fedor.model.Valute;
import java.util.HashMap;

public interface ValuteService {

    HashMap<String, Valute> getValCurs(String dateValCurs);

}
