package com.hwua.serviceImpl;

import com.hwua.dao.TypeDao;
import com.hwua.entity.Type;
import com.hwua.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TypeServiceImpl implements TypeService {
    @Autowired
    TypeDao typeDao;
    @Override
    public List<Type> selectAllType() {
        List<Type> list = typeDao.selectAllType();
        return list;
    }

    @Override
    public List<Type> selectAllBigType() {
        List<Type> list = typeDao.selectAllBigType();
        return list;
    }

    @Override
    public List<Type> selectAllSmallTypeByBigType(int type_big) {
        List<Type> list = typeDao.selectAllSmallTypeByBigType(type_big);
        return list;
    }
}
