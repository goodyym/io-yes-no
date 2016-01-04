package com.good.mapper;

import com.good.common.StaticName;
import com.good.model.GoodRole;
import org.apache.ibatis.annotations.Param;

import javax.management.relation.Role;
import java.util.List;

/**
 * Created by Administrator
 * Date:2016/1/2
 */
public interface GoodRoleMapper  extends StaticName {
     List<GoodRole> getRoleByUser(@Param(MAPPER_TABLE_NAME)String tableName,@Param("id")int userId);
}
