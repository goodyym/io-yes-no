package com.good.impl;

import com.good.mapper.GoodPermissionMapper;
import com.good.mapper.GoodRoleMapper;
import com.good.model.GoodPermission;
import com.good.service.GoodPermissionService;
import com.good.service.GoodRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.management.relation.Role;
import java.util.List;

/**
 * Created by Administrator
 * Date:2016/1/2
 */

@Service
public class GoodPermissionServiceImpl implements GoodPermissionService{

    @Autowired
    private GoodPermissionMapper goodPermissionMapper;

    public List<GoodPermission> getPermissionByRole(int roleId) {
        return goodPermissionMapper.getPermissionByRole(GoodPermission.tableName, roleId);
    }
}
