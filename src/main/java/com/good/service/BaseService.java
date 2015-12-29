package com.good.service;

import java.util.List;

/**
 * Description: uuuuuuuuuuuuuuuuu
 * Author: tretert
 * Time:${TTME}
 */
public interface BaseService<T> {

    int save(T t);

    int delete(int id);

    int update(T t);

    List<T> getAll();

    T getById(int id);
}
