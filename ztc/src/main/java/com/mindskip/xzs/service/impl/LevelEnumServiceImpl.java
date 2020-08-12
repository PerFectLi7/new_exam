package com.mindskip.xzs.service.impl;

import com.mindskip.xzs.domain.LevelEnum;
import com.mindskip.xzs.repository.LevelEnumMapper;
import com.mindskip.xzs.service.LevelEnumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LevelEnumServiceImpl extends BaseServiceImpl<LevelEnum> implements LevelEnumService {

    private final static String CACHE_NAME = "LevelEnum";
    private final LevelEnumMapper levelMapper;
    private final ApplicationEventPublisher eventPublisher;

    @Autowired
    public LevelEnumServiceImpl(LevelEnumMapper levelMapper, ApplicationEventPublisher eventPublisher) {
        super(levelMapper);
        this.levelMapper = levelMapper;
        this.eventPublisher = eventPublisher;
    }

    @Override
    public List<LevelEnum> getAllLevelEnum() {
        return levelMapper.getAllLevelEnum();
    }

    @Override
    public int deleteById(Integer id) {
        return levelMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(LevelEnum record) {
        return levelMapper.insert(record);
    }

    @Override
    public int insertByFilter(LevelEnum record) {
        return levelMapper.insertSelective(record);
    }

    @Override
    public LevelEnum selectById(Integer id) {
        return levelMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByIdFilter(LevelEnum record) {
        return levelMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateById(LevelEnum record) {
        return levelMapper.updateByPrimaryKey(record);
    }
}
