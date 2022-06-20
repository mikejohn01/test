package com.gashanin.fedor.controller;

import com.gashanin.fedor.model.ValCurs;
import com.gashanin.fedor.service.impl.ValuteServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/valcurs")
public class ValCursController {

    private final ValuteServiceImpl valuteService;

    @GetMapping("/get/{currency}")
    public ResponseEntity<ValCurs> getCurs(@PathVariable("currency") String currency,
                                           @RequestParam( value="year", required = false) String year) {
        System.out.println("Вошли в контроллер");
        ValCurs valCurs = valuteService.getValCurs(year);
        System.out.println("valCurs -" + valCurs);
        return ResponseEntity.ok().body(valCurs);
    }
}
