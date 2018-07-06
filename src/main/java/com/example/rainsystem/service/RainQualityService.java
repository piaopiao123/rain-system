package com.example.rainsystem.service;

import com.example.rainsystem.domain.RainQuality;

import java.util.List;

public interface RainQualityService {
    List<RainQuality> SelectAll();
    int Delete(Integer id);
}
