package com.zcoox.ddd.cqrs.service;

/**
 * 命令处理base接口
 */
public interface Command<T> {

    /**
     * 执行
     *
     * @param commandModel
     * @return
     */
    Object execute(T commandModel);

}
