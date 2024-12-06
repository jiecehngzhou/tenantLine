package cn.jiecheng.tenantline.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import cn.jiecheng.tenantline.po.Staff;
import cn.jiecheng.tenantline.service.StaffService;
import cn.jiecheng.tenantline.mapper.StaffMapper;
import org.springframework.stereotype.Service;


@Service
public class StaffServiceImpl extends ServiceImpl<StaffMapper, Staff>
    implements StaffService{

}




