package com.good.mapper;

import com.good.common.StaticName;
import com.good.model.GoodUser;
import org.apache.ibatis.annotations.Param;

/**
 * LoginMapper
 *
 * @Description: uuuuuuuuuuuuuuuuu
 * @Author: tretert
 * @Time:1
 */
public interface UserLoginMapper extends StaticName {

    GoodUser getUserByName(@Param(MAPPER_TABLE_NAME)String tableName,@Param("username")String username);
}
