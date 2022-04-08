package com.sherlock.mapper;

import com.sherlock.pojo.User12;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

//整合Mybatis method 2
public class UserMapperImpl2 extends SqlSessionDaoSupport implements UserMapper {
    //获取sqlSessionTemplate
//    private SqlSessionTemplate sqlSessionTemplate;
//    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
//        this.sqlSessionTemplate = sqlSessionTemplate;
//    }

    @Override
    public List<User12> selectUser() {
        SqlSession sqlSessionTemplate = getSqlSession();
        UserMapper mapper = sqlSessionTemplate.getMapper(UserMapper.class);
        return mapper.selectUser();
    }
}
