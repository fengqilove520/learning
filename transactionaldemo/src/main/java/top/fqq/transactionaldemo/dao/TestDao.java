package top.fqq.transactionaldemo.dao;

import org.springframework.stereotype.Repository;
import top.fqq.transactionaldemo.bean.Test;

/**
 * 描述
 *
 * @author fitch
 * @date 2021/4/15 16:23
 */
@Repository
public interface TestDao {

     Boolean add(Test test);
}
