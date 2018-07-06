package com.example.rainsystem.service.impl;

import com.example.rainsystem.domain.RainQuality;
import com.example.rainsystem.repository.RainQualityMapper;
import com.example.rainsystem.service.RainQualityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RainQualityServiceImpl implements RainQualityService {
    @Autowired
    private RainQualityMapper rainQualityMapper;

    @Override
    public List<RainQuality> SelectAll() {
        return rainQualityMapper.SelectAll();
    }

    @Override
    public int Delete(Integer id) {
        return rainQualityMapper.Delete(id);
    }
}
