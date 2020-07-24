package com.chenteng.jpa.service;

import com.chenteng.jpa.entity.*;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class UserServiceFailBack implements UserService {

    @Override
    public MyPageImpl<User> list(UserVo userVo) {
        System.out.println(" 对不起，熔断了。。。。");
        return  null;
    }

    @Override
    public boolean del(int id) {
        return false;
    }

    @Override
    public boolean add(User user) {
        return false;
    }

    @Override
    public List<Depart> listdeparts() {
        return new ArrayList<Depart>();
    }

    @Override
    public List<Favourite> listFavourites() {
        return new ArrayList<Favourite>();
    }
}
