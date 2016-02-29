package com.good.impl;

import com.good.mapper.ListPageMapper;
import com.good.model.Page;
import com.good.model.TestPageModel;
import com.good.service.ListPageService;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 *@description
 *
 *@return yaming
 *@date 2016/2/29 17:18
 *@since V1.0
 *
 */

@Service
public class ListPageServiceImpl implements ListPageService{

    @Autowired
    ListPageMapper listPageMapper;

    public Page<TestPageModel> getListPage(Map<String, Object> params, Page<TestPageModel> page) {

        int pageCount = listPageMapper.pageCount(params);

        RowBounds rowbounds = new RowBounds(page.getOffset(),page.getLimit());
        List<TestPageModel> listPage = listPageMapper.getListPage(TestPageModel.tableName,params,rowbounds);

        page.setPageResult(listPage);
        page.setDataCount(pageCount);
        return page;
    }
}
