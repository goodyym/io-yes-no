package com.good.mapper;

import com.good.model.Page;
import com.good.model.TestPageModel;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.io.ResolverUtil;
import org.apache.ibatis.session.RowBounds;

import java.util.List;
import java.util.Map;

/**
 *@description
 *
 *@return yaming
 *@date 2016/2/29 17:20
 *@since V1.0
 *
 */
public interface ListPageMapper {
    int pageCount(@Param("params") Map<String, Object> params);

    List<TestPageModel> getListPage(@Param("tableName") String tableName , @Param("params") Map<String, Object> params,RowBounds rowBounds);
}
