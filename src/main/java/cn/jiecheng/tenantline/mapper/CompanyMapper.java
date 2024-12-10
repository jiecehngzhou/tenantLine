package cn.jiecheng.tenantline.mapper;

import cn.jiecheng.tenantline.po.Company;
import com.baomidou.mybatisplus.annotation.InterceptorIgnore;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;


public interface CompanyMapper extends BaseMapper<Company> {

    void updateById2(Company company);

    @InterceptorIgnore(tenantLine = "true")
    List<Map<String,Object>> getCompanyList2(@Param("tenantId") String tenantId);
}




