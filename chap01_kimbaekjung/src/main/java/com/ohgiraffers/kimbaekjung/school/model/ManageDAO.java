package com.ohgiraffers.kimbaekjung.school.model;

import com.ohgiraffers.kimbaekjung.school.dto.manageDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface ManageDAO {
    List<manageDTO> picks();
}
