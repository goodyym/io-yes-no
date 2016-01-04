package com.good.impl;

import com.good.mapper.GoodRoleMapper;
import com.good.model.GoodRole;
import com.good.service.GoodRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator
 * Date:2016/1/2
 */

@Service
public class GoodRoleServiceImpl implements GoodRoleService{

    @Autowired
    private GoodRoleMapper goodRoleMapper;

    public List<GoodRole> getRoleByUser(int userId) {
        return goodRoleMapper.getRoleByUser(GoodRole.tableName, userId);
    }
}
