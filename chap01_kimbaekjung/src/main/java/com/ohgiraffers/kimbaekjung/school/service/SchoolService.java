package com.ohgiraffers.kimbaekjung.school.service;

import com.ohgiraffers.kimbaekjung.school.dto.NotificationDTO;
import com.ohgiraffers.kimbaekjung.school.dto.SchoolDTO;
import com.ohgiraffers.kimbaekjung.school.model.NotificationDAO;
import com.ohgiraffers.kimbaekjung.school.model.SchoolDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolService {
    @Autowired
    private SchoolDAO schoolDAO;

    @Autowired
    private NotificationDAO notificationDAO;



    public List<SchoolDTO> oneName() {
        List<SchoolDTO> nameOne= schoolDAO.oneName();

        return nameOne;
    }


    public List<NotificationDTO> titles() {
        List<NotificationDTO> titles = notificationDAO.titles();

        return titles;
    }


}
