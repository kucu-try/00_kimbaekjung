package com.ohgiraffers.kimbaekjung.school.model;


import com.ohgiraffers.kimbaekjung.school.dto.SchoolDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SchoolDAO {
    List<SchoolDTO> oneName();


}