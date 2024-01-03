package com.ohgiraffers.kimbaekjung.management.service;

import com.ohgiraffers.kimbaekjung.management.dto.manageDTO;
import com.ohgiraffers.kimbaekjung.management.model.ManageDAO;
import com.ohgiraffers.kimbaekjung.school.dto.NotificationDTO;
import com.ohgiraffers.kimbaekjung.school.dto.SchoolDTO;
import com.ohgiraffers.kimbaekjung.school.model.NotificationDAO;
import com.ohgiraffers.kimbaekjung.school.model.SchoolDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ManageService {


    @Autowired
    private ManageDAO manageDAO;



    public List<manageDTO> pickName() {
        List<manageDTO> picks = manageDAO.picks();

        return picks;
    }
}
