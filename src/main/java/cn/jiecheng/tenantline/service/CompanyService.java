package cn.jiecheng.tenantline.service;

import cn.jiecheng.tenantline.po.Company;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;
import java.util.Map;


public interface CompanyService extends IService<Company> {

    void updateById2(Company company);

    List<Map<String,Object>> getCompanyList2();
}
