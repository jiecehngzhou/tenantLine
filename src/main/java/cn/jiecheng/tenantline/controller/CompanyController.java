package cn.jiecheng.tenantline.controller;

import cn.jiecheng.tenantline.po.Company;
import cn.jiecheng.tenantline.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/company")
@RestController
public class CompanyController {

    @Autowired
    CompanyService companyService;

    @GetMapping("getCompanyList")
    public ResponseEntity<List<Company>> getCompanyList(){
        return ResponseEntity.ok(companyService.list());
    }
}
