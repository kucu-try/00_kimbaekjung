package com.ohgiraffers.kimbaekjung.school.service;

import com.ohgiraffers.kimbaekjung.school.dto.NotificationDTO;
import com.ohgiraffers.kimbaekjung.school.dto.SchoolDTO;
import com.ohgiraffers.kimbaekjung.school.dto.manageDTO;
import com.ohgiraffers.kimbaekjung.school.model.ManageDAO;
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

    @Autowired
    private ManageDAO manageDAO;

    public List<SchoolDTO> oneName() {
        List<SchoolDTO> nameOne= schoolDAO.oneName();

        return nameOne;
    }


    public List<NotificationDTO> titles() {
        List<NotificationDTO> titles = notificationDAO.titles();

        return titles;
    }

    public List<manageDTO> pickName() {
        List<manageDTO> picks = manageDAO.picks();

        return picks;
    }
}
