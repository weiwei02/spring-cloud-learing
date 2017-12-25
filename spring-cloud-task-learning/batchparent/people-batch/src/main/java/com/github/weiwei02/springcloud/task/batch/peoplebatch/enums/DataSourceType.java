package com.github.weiwei02.springcloud.task.batch.peoplebatch.enums;


/**
 * Created by jack-cooper on 2017/1/18.
 */
public enum DataSourceType {
    TASK("cloudTask", "任务库"),
    TASK_DEMO("cloudTaskDemo", "任务对象");
    private String type;
    private String name;

    DataSourceType(String type, String name) {
        this.type = type;
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
