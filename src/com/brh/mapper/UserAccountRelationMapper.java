package com.brh.mapper;

import com.brh.p2p.admin.entity.UserAccountRelation;
import com.brh.p2p.admin.entity.UserAccountRelationExample;
import com.brh.p2p.admin.entity.UserAccountRelationKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserAccountRelationMapper {
    int countByExample(UserAccountRelationExample example);

    int deleteByExample(UserAccountRelationExample example);

    int deleteByPrimaryKey(UserAccountRelationKey key);

    int insert(UserAccountRelation record);

    int insertSelective(UserAccountRelation record);

    List<UserAccountRelation> selectByExample(UserAccountRelationExample example);

    UserAccountRelation selectByPrimaryKey(UserAccountRelationKey key);

    int updateByExampleSelective(@Param("record") UserAccountRelation record, @Param("example") UserAccountRelationExample example);

    int updateByExample(@Param("record") UserAccountRelation record, @Param("example") UserAccountRelationExample example);

    int updateByPrimaryKeySelective(UserAccountRelation record);

    int updateByPrimaryKey(UserAccountRelation record);
}