package com.tryL10.mapper;

import com.sherlock.mapper.UserMapperImpl2;
import com.tryL10.pojo.User14;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class UserMapperSqlSessionDaoImpl extends SqlSessionDaoSupport implements UserMapper {

    //还是要在 trtL10aplicationContext.xml 注入
    @Override
    public List<User14> selectUser14() {
        SqlSession sqlSessionTemplate = getSqlSession();
        UserMapper mapper = sqlSessionTemplate.getMapper(UserMapper.class);
        return mapper.selectUser14();
    }
}
