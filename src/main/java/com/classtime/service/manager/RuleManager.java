package com.classtime.service.manager;

import com.classtime.service.model.Rule;

import java.util.List;

/**
 * Created by zhaobk on 2015-09-15.
 */
public interface RuleManager extends BaseObjectManager<Rule, Long> {
    List<Rule> selectAll();
}
