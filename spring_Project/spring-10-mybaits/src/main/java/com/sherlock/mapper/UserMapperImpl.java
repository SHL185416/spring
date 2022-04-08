package com.sherlock.mapper;

import com.sherlock.pojo.User12;
import org.mybatis.spring.SqlSessionTemplate;

import java.util.List;

//为了接管Mybatis的功能


//UserMapperImpl 调用 UserMapper.xml中实现的功能

//UserMapper.xml的功能通过sqlSession实现
//UserMapperImpl.class通过sqlSessionTemplate实现

//sqlSession与sqlSessionTemple相似
public class UserMapperImpl implements UserMapper {
    private SqlSessionTemplate sqlSessionTemplate;

    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
        this.sqlSessionTemplate = sqlSessionTemplate;
    }

    @Override
    public List<User12> selectUser() {

        UserMapper mapper = sqlSessionTemplate.getMapper(UserMapper.class);
        return mapper.selectUser();
    }
}
