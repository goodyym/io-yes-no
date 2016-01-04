package com.good.mapper;

import com.good.common.StaticName;
import com.good.model.GoodPermission;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by Administrator
 * Date:2016/1/2
 */
public interface GoodPermissionMapper extends StaticName {
     List<GoodPermission> getPermissionByRole(@Param(MAPPER_TABLE_NAME)String tableName,@Param("id")int roleId);
}
