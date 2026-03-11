package com.example.demo.controller;

import com.example.demo.model.dto.KtpDto;
import com.example.demo.model.dto.KtpRequest;
import com.example.demo.service.KtpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
public class KtpController {

    @Autowired
    private KtpService ktpService;

    // POST /ktp : Menambah data KTP baru
    @PostMapping(
            path = "/ktp",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<Map<String, Object>> addKtp(@RequestBody KtpRequest request) {
        KtpDto result = ktpService.addKtp(request);
        return ResponseEntity.status(HttpStatus.CREATED).body(Map.of(
                "status", "success",
                "data", result
        ));
    }

    // GET /ktp : Mengambil seluruh data KTP
    @GetMapping(
            path = "/ktp",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<Map<String, Object>> getAllKtp() {
        List<KtpDto> result = ktpService.getAllKtp();
        return ResponseEntity.status(HttpStatus.OK).body(Map.of(
                "status", "success",
                "data", result
        ));
    }

    // GET /ktp/{id} : Mengambil data KTP berdasarkan id
    @GetMapping(
            path = "/ktp/{id}",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<Map<String, Object>> getKtpById(@PathVariable("id") Integer id) {
        KtpDto result = ktpService.getKtpById(id);
        return ResponseEntity.status(HttpStatus.OK).body(Map.of(
                "status", "success",
                "data", result
        ));
    }

    // PUT /ktp/{id} : Memperbarui data KTP berdasarkan id
    @PutMapping(
            path = "/ktp/{id}",
            consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<Map<String, Object>> updateKtp(
            @PathVariable("id") Integer id,
            @RequestBody KtpRequest request) {
        KtpDto result = ktpService.updateKtp(id, request);
        return ResponseEntity.status(HttpStatus.OK).body(Map.of(
                "status", "success",
                "data", result
        ));
    }

    // DELETE /ktp/{id} : Menghapus data KTP berdasarkan id
    @DeleteMapping(
            path = "/ktp/{id}",
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<Map<String, Object>> deleteKtp(@PathVariable("id") Integer id) {
        ktpService.deleteKtp(id);
        return ResponseEntity.status(HttpStatus.OK).body(Map.of(
                "status", "success",
                "message", "Data KTP dengan id " + id + " berhasil dihapus"
        ));
    }
}