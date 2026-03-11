package com.example.demo.service;

import com.example.demo.model.dto.KtpDto;
import com.example.demo.model.dto.KtpRequest;

import java.util.List;

public interface KtpService {
    KtpDto addKtp(KtpRequest request);
    List<KtpDto> getAllKtp();
    KtpDto getKtpById(Integer id);
    KtpDto updateKtp(Integer id, KtpRequest request);
    void deleteKtp(Integer id);
}
