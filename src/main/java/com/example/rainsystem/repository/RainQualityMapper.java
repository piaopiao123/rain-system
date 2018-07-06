package com.example.rainsystem.repository;

import com.example.rainsystem.domain.RainQuality;
import org.apache.ibatis.annotations.Mapper;


import java.util.List;

@Mapper
public interface RainQualityMapper {
    List<RainQuality> SelectAll();
    int Delete(Integer id);

}
