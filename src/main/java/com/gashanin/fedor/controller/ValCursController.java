package com.gashanin.fedor.controller;

import com.gashanin.fedor.model.ValCurs;
import com.gashanin.fedor.model.Valute;
import com.gashanin.fedor.service.impl.ValuteServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/valcurs")
public class ValCursController {

    private final ValuteServiceImpl valuteService;

    @GetMapping("/get/{currency}")
    public ResponseEntity<Valute> getCurs(@PathVariable("currency") String currency,
                                                @RequestParam( value="date", required = false) String year) {
        Valute valute = valuteService.getValuteCource(currency, year);
        return ResponseEntity.ok().body(valute);
    }
}
