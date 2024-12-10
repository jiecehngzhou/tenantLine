package cn.jiecheng.tenantline.config;

import cn.jiecheng.tenantline.util.TenantContext;
import com.baomidou.mybatisplus.extension.plugins.handler.TenantLineHandler;
import net.sf.jsqlparser.expression.Expression;
import net.sf.jsqlparser.expression.StringValue;

public class MyTenantLineHandler implements TenantLineHandler {
    @Override

    public Expression getTenantId() {
        String tenantId = TenantContext.getCurrentTenant();
        if(tenantId == null) {
            throw new NullPointerException();
        }
        return new StringValue(tenantId);
    }

    @Override
    public String getTenantIdColumn() {
        //这里对应的是数据库的列名
        return "tenant_id";
    }

    @Override
    public boolean ignoreTable(String tableName) {
        //如果那些表不需要做租户隔离的，在这里配置
        return false;
    }
}