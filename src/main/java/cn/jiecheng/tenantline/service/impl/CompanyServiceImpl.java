package cn.jiecheng.tenantline.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.jiecheng.tenantline.po.Company;
import cn.jiecheng.tenantline.service.CompanyService;
import cn.jiecheng.tenantline.mapper.CompanyMapper;
import org.springframework.stereotype.Service;


@Service
public class CompanyServiceImpl extends ServiceImpl<CompanyMapper, Company>
    implements CompanyService{

}




