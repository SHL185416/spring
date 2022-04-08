package com.sherlock.mapper;

import com.sherlock.pojo.User111;
import org.apache.ibatis.session.SqlSession;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

//为了接管Mybatis的功能


//UserMapperImpl与UserMapper.xml实现的功能一致

//UserMapper.xml的功能通过sqlSession实现
//UserMapperImpl.class通过sqlSessionTemplate实现

//sqlSession与sqlSessionTemple相似
public class UserMapperImpl extends SqlSessionDaoSupport implements UserMapper {

//    private SqlSessionTemplate sqlSessionTemplate;
//
//    public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
//        this.sqlSessionTemplate = sqlSessionTemplate;
//    }

    @Override
    public List<User111> selectUser() {
        SqlSession sqlSessionTemplate = getSqlSession();
        UserMapper mapper = sqlSessionTemplate.getMapper(UserMapper.class);
        return mapper.selectUser();
    }

    //返回1为数据库操作成功
    //返回0为数据库操作失败
    @Override
    public int addUser(User111 user111) {
        SqlSession sqlSessionTemplate = getSqlSession();
        UserMapper mapper = sqlSessionTemplate.getMapper(UserMapper.class);
        return mapper.addUser(user111);
    }

    //返回1为数据库操作成功
    @Override
    public int deleteUser(int id) {
        SqlSession sqlSessionTemplate = getSqlSession();
        UserMapper mapper = sqlSessionTemplate.getMapper(UserMapper.class);
        return mapper.deleteUser(id);
    }
}
