package com.gashanin.fedor.controller;

import com.gashanin.fedor.model.Valute;
import com.gashanin.fedor.service.impl.ValuteServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Api(tags = "Currency", description = "Получение курсов валют")
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/valcurs")
public class ValCursController {

    private final ValuteServiceImpl valuteService;

    @ApiOperation("Get currency course")
    @GetMapping("/get/{currency}")
    public ResponseEntity<Valute> getCurs(@PathVariable("currency") String currency,
                                                @RequestParam( value="date", required = false) String year) {
        Valute valute = valuteService.getValuteRate(currency, year);
        return ResponseEntity.ok().body(valute);
    }
}
