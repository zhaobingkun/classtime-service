package com.classtime.service.dao;

import com.classtime.service.model.Rule;

import java.util.List;

public interface RuleMapper extends BaseObjectMapper<Rule, Long> {
    List<Rule> selectAll();
}