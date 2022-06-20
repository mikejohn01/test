package com.gashanin.fedor.controller;

import com.gashanin.fedor.model.ValCurs;
import com.gashanin.fedor.service.impl.ValuteServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/valcurs")
public class ValCursController {

    @Autowired
    private ValuteServiceImpl valuteService;

    @GetMapping("/get")
    public ResponseEntity<ValCurs> getCurs() {
        System.out.println("Вошли в контроллер");
        ValCurs valCurs = valuteService.getValCurs();
        System.out.println("valCurs -" + valCurs);
        return ResponseEntity.ok().body(valCurs);
    }
}
