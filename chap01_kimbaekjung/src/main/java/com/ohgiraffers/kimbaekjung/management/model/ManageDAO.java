package com.ohgiraffers.kimbaekjung.management.model;

import com.ohgiraffers.kimbaekjung.management.dto.manageDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ManageDAO {
    List<manageDTO> picks();
}
