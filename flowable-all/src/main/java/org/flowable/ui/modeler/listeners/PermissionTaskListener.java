package org.flowable.ui.modeler.listeners;

import com.summer.tools.common.utils.JsonUtil;
import lombok.extern.slf4j.Slf4j;
import org.flowable.engine.delegate.TaskListener;
import org.flowable.task.service.delegate.DelegateTask;

import java.util.Map;

@Slf4j
public class PermissionTaskListener implements TaskListener {

    @Override
    public void notify(DelegateTask delegateTask) {
        if ("employee".equals(delegateTask.getCategory())) {
            Map<String, Object> vars = delegateTask.getVariables();
            log.info(JsonUtil.stringify(vars));
        } else {
            log.info("非员工不能发起报销流程");
        }
    }
}
