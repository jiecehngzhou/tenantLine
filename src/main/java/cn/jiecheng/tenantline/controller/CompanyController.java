package cn.jiecheng.tenantline.controller;

import cn.jiecheng.tenantline.po.Company;
import cn.jiecheng.tenantline.service.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RequestMapping("/company")
@RestController
public class CompanyController {

    @Autowired
    CompanyService companyService;

    @GetMapping("getCompanyList")
    public ResponseEntity<List<Company>> getCompanyList(){
        return ResponseEntity.ok(companyService.list());
    }

    @GetMapping("getCompanyList2")
    public ResponseEntity<List<Map<String,Object>>> getCompanyList2(){
        return ResponseEntity.ok(companyService.getCompanyList2());
    }

    @DeleteMapping("updateCompany")
    public ResponseEntity<Void> updateCompany(@RequestBody Company company){
        companyService.updateById(company);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("updateCompany2")
    public ResponseEntity<Void> updateCompany2(@RequestBody Company company){
        companyService.updateById2(company);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
