package com.pccw.mapper;

import com.pccw.pojo.TbInformation;
import com.pccw.pojo.TbInformationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbInformationMapper {
    int countByExample(TbInformationExample example);

    int deleteByExample(TbInformationExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbInformation record);

    int insertSelective(TbInformation record);

    List<TbInformation> selectByExample(TbInformationExample example);

    TbInformation selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbInformation record, @Param("example") TbInformationExample example);

    int updateByExample(@Param("record") TbInformation record, @Param("example") TbInformationExample example);

    int updateByPrimaryKeySelective(TbInformation record);

    int updateByPrimaryKey(TbInformation record);
}