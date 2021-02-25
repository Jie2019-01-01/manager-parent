package com.bjsxt.service.impl;

import com.bjsxt.mapper.ManagerMapper;
import com.bjsxt.pojo.Manager;
import com.bjsxt.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ManagerServiceImpl implements ManagerService {
    @Autowired
    private ManagerMapper managerMapper;

    @Override
    public List<Manager> managerList(Manager manager) {
        return managerMapper.managerList(manager);
    }
}
