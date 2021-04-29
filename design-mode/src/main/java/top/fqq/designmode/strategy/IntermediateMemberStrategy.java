package top.fqq.designmode.strategy;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 * 描述 中级会员
 *
 * @author fitch
 * @date 2021/4/16 9:10
 */
@Slf4j
@Component
public class IntermediateMemberStrategy implements MemberStrategy {
    @Override
    public double calcPrice(double booksPrice) {
        log.info("原价：￥{}，中级会员享受会员价：￥{}",booksPrice,booksPrice * 0.9);
        return booksPrice * 0.9;
    }
}
