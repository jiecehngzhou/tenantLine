package cn.jiecheng.tenantline.service.impl;

import cn.jiecheng.tenantline.util.TenantContext;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.jiecheng.tenantline.po.Company;
import cn.jiecheng.tenantline.service.CompanyService;
import cn.jiecheng.tenantline.mapper.CompanyMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;


@Service
public class CompanyServiceImpl extends ServiceImpl<CompanyMapper, Company>
    implements CompanyService{

    @Resource
    CompanyMapper companyMapper;

    @Override
    public void updateById2(Company company) {
        companyMapper.updateById2(company);
    }

    @Override
    public List<Map<String,Object>> getCompanyList2() {
        return companyMapper.getCompanyList2(TenantContext.getCurrentTenant());
    }
}




