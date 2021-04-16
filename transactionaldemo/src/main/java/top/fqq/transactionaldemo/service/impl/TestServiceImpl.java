package top.fqq.transactionaldemo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import top.fqq.transactionaldemo.bean.Test;
import top.fqq.transactionaldemo.dao.TestDao;
import top.fqq.transactionaldemo.service.TestService;

/**
 * 描述
 *
 * @author fitch
 * @date 2021/4/15 16:24
 */
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestDao testDao;

    @Override
    @Transactional
    public Boolean add() {
        Test test =new Test();
        test.setId("2");
        testDao.add(test);
        test.setId("1");
        testDao.add(test);
        return null;
    }


}
