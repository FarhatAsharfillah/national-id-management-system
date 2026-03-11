package com.example.demo.mapper;

import com.example.demo.model.dto.KtpDto;
import com.example.demo.model.entity.Ktp;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public interface KtpMapper {
    KtpMapper MAPPER = Mappers.getMapper(KtpMapper.class);

    KtpDto toKtpDtoData(Ktp ktp);
}
