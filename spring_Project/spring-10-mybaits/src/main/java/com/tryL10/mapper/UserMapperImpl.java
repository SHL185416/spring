package com.tryL10.mapper;

import com.tryL10.pojo.User14;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

public class UserMapperImpl implements UserMapper {
    private SqlSessionTemplate sessionTemplate;

    public void setSessionTemplate(SqlSessionTemplate sessionTemplate) {
        this.sessionTemplate = sessionTemplate;
    }

    @Override
    public List<User14> selectUser14() {
        UserMapper mapper = sessionTemplate.getMapper(UserMapper.class);
        return mapper.selectUser14();
    }
}
