package com.flyfish.service.impl;

import com.flyfish.mapper.ClassesMapper;
import com.flyfish.pojo.Classes;
import com.flyfish.service.ClassesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @autohr flyfish
 * @date: 2023/2/25 23:38
 * @description:
 */
@Service
public class ClassesServiceImpl implements ClassesService {
    @Autowired
    private ClassesMapper classesMapper;

    @Override
    public List<Classes> getAll() {
        return classesMapper.getAllClass();
    }
}
