package com.chenteng.jpa.service;

import com.chenteng.jpa.entity.*;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


public interface UserService {

    MyPageImpl<User> list(UserVo userVo);

    boolean del(int id);

    boolean add(User user);

    List<Depart> listdeparts();

    List<Favourite> listFavourites();
}
