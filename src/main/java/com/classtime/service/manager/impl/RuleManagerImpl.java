package com.classtime.service.manager.impl;

import com.classtime.service.dao.RuleMapper;
import com.classtime.service.manager.RuleManager;
import com.classtime.service.model.Rule;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.slf4j.Logger;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zhaobk on 2015-09-15.
 */
@Service
public class RuleManagerImpl implements RuleManager {
    protected static Logger logger = LoggerFactory.getLogger(RuleManagerImpl.class);
    @Autowired
    private RuleMapper ruleMapper;

    @Override
    public List<Rule> selectAll() {
        return ruleMapper.selectAll();
    }

    @Override
    public int deleteByPrimaryKey(Long id) {
        int result = ruleMapper.deleteByPrimaryKey(id);
        logger.debug("deleteByPrimaryKey Rule into  db result is: {} {}", result);
        return result;
    }

    @Override
    public int insert(Rule record) {
        int result = ruleMapper.insert(record);
        logger.debug("insert Rule into  db result is: {} {}", result, record.toString());
        return result;
    }


    @Override
    public int insertSelective(Rule record) {
        int result = ruleMapper.insertSelective(record);
        logger.debug("insertSelective Rule into  db result is: {} {}", result, record.toString());
        return result;
    }

    @Override
    public Rule selectByPrimaryKey(Long id) {
        Rule result = ruleMapper.selectByPrimaryKey(id);
        return result;
    }

    @Override
    public int updateByPrimaryKeySelective(Rule record) {
        int result = ruleMapper.updateByPrimaryKeySelective(record);
        logger.debug("insert updateByPrimaryKeySelective into  db result is: {} {}", result, record.toString());
        return result;
    }

    @Override
    public int updateByPrimaryKey(Rule record) {
        int result = ruleMapper.updateByPrimaryKey(record);
        logger.debug("insert updateByPrimaryKey into  db result is: {} {}", result, record.toString());
        return result;
    }

}
