package com.ohgiraffers.kimbaekjung.school.model;

import com.ohgiraffers.kimbaekjung.school.dto.NotificationDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface NotificationDAO {
    List<NotificationDTO> titles();
}
