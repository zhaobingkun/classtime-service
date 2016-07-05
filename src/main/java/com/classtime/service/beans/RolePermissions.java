/**
 *
 */
package com.classtime.service.beans;


import com.classtime.service.model.BaseObject;
import com.classtime.service.model.PermsResource;

import java.util.ArrayList;
import java.util.List;

/**
 * @每个角色拥有的perms
 */
public class RolePermissions extends BaseObject {
    /**
     *
     */
    private static final long serialVersionUID = 7966492309134216535L;
    private Menu type;// 资源分类
    private List<PermsResource> permsResources = new ArrayList<PermsResource>();

    public Menu getType() {
        return type;
    }

    public void setType(Menu type) {
        this.type = type;
    }

    public List<PermsResource> getPermsResources() {
        return permsResources;
    }

    public void setPermsResources(List<PermsResource> permsResources) {
        this.permsResources = permsResources;
    }

    public enum Menu {
        A_XTGL("系统管理") {},
        DATA_ANALYSIS("数据统计") {},
        DATA_COLLECTION("短信宝典") {};

        private String value;

        private Menu(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }
}
