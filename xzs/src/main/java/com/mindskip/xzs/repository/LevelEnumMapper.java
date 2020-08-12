package com.mindskip.xzs.repository;

import com.mindskip.xzs.domain.LevelEnum;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LevelEnumMapper extends BaseMapper<LevelEnum>{


    public List<LevelEnum> getAllLevelEnum();

}
